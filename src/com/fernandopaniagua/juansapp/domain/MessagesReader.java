package com.fernandopaniagua.juansapp.domain;

import com.fernandopaniagua.juansapp.gui.JFrameMain;
import com.fernandopaniagua.juansapp.persistence.MessagesManager;
import java.sql.SQLException;
import java.util.ArrayList;


public class MessagesReader extends Thread {
    boolean isAlive = true;
    MessagesManager mm;
    JFrameMain jfm;

    public MessagesReader(MessagesManager mm, JFrameMain jfm) throws
        ClassNotFoundException, SQLException {
        this.mm = mm;
        this.jfm = jfm;
    }

    @Override
    public void run() {
        while (isAlive) {
            try {
                ArrayList<Message> alMessages = mm.getAllMessages();
                jfm.showMessages(alMessages);
                sleep(2000);
            } catch (SQLException ex) {
                isAlive=false;
                ex.printStackTrace();
                System.exit(-1);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
        }
    }
    
    public void kill(){
        isAlive=false;
    }
}
