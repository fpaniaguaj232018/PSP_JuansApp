/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernandopaniagua.juansapp.persistence;

import com.fernandopaniagua.juansapp.domain.Mensaje;
import java.util.ArrayList;

/**
 *
 * @author fernando.paniagua
 */
public class GestorMensajes {
    public ArrayList<Mensaje> getMensajes(){
        ArrayList<Mensaje> mensajes = new ArrayList();
        mensajes.add(new Mensaje(1,"fernando.paniagua@juanxxiii.net", "Hola"));
        mensajes.add(new Mensaje(1,"fernando.paniagua@juanxxiii.net", "¿Que tal estas?"));
        mensajes.add(new Mensaje(1,"gonzalo.detomas@juanxxiii.net", "Bien ¿y tu?"));
        return mensajes;
    }
}
