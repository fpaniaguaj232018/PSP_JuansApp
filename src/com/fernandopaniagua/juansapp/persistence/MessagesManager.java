package com.fernandopaniagua.juansapp.persistence;

import com.fernandopaniagua.juansapp.domain.Message;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author FPANIAGUA
 */
public class MessagesManager extends DBManager {
    
    private ArrayList<Message> alMessages = null;
    
    public MessagesManager() throws ClassNotFoundException, SQLException {
        super();
    }
    
    public ArrayList<Message> getAllMessages() throws SQLException {
        if (conexion==null || conexion.isClosed()){
            establecerConexion();
        }
        alMessages = new ArrayList<>();
        Statement st = conexion.createStatement();
        String sql = "SELECT * FROM t_mensajes";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()) {
            alMessages.add(new Message(
                    rs.getInt("ID"), 
                    rs.getString("EMAIL"),
                    rs.getString("MENSAJE")));
	}
        rs.close();
        st.close();
        return alMessages;
    }
    
    public void sendMessage(Message m) throws SQLException {
        if (conexion==null || conexion.isClosed()){
            establecerConexion();
        }
        String sql = "INSERT INTO t_mensajes (EMAIL, MENSAJE) VALUES (?,?);";
	PreparedStatement ps = conexion.prepareStatement(sql);
	ps.setString(1, m.getEmisor());
	ps.setString(2, m.getTexto());
	ps.executeUpdate();
	ps.close();
    }
}
