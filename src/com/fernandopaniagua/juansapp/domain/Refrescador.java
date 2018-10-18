package com.fernandopaniagua.juansapp.domain;

import com.fernandopaniagua.juansapp.gui.JFrameMain;
import com.fernandopaniagua.juansapp.persistence.GestorMensajes;
import java.util.ArrayList;

public class Refrescador extends Thread {
    boolean isAlive = true;
    GestorMensajes gm;
    JFrameMain jfm;
    public Refrescador(JFrameMain jfm){
        gm=new GestorMensajes();
        this.jfm = jfm;
    }
    @Override
    public void run() {
        while(isAlive){
            ArrayList<Mensaje> mensajes = gm.getMensajes();
            this.jfm.refrescarMensajes(mensajes);
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
