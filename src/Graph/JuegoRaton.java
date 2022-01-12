/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.awt.Graphics;
import Graph.Grafo;
import java.util.LinkedList;

/**
 *
 * @author Wilfredo
 */
public class JuegoRaton {

    public Grafo mapa;

    //dibujo
    int posVerticeSeleccionado;
    int[] aristaSeleccionada;

    //juego
    public int raton = -1;
    public int cuevaInicio = -1; // partida, posicion inicial del raton
    public int cuevaSalida = -1; // salida // n salidas
    public boolean esFinJuego;
    public boolean esRatonVivo;
    
    public LinkedList<Integer> rutaSalida ;
    
    // crear mapa
    public JuegoRaton() {
        this.mapa = new Grafo();
        this.posVerticeSeleccionado = -1;
        this.rutaSalida = new LinkedList<Integer>();
    }

    public void addCueva(int x, int y) {

        mapa.addVertice();
        mapa.printListas();
        int z = mapa.getUltimaPosVertices();
        mapa.setCoordenada(z, x, y);
        System.out.println("añadido: " + x + " - " + y);
    }

    public void moverVertice(int v, int x, int y) {
        mapa.getCoordenada(v).x = x;
        mapa.getCoordenada(v).y = y;
    }

    public void addTunel(int u, int v) {
        mapa.addArista(u, v);
    }

    public void deleteTunel(int u, int v) {
        mapa.delArista(u, v);
    }

    public void setTrampa(int u, int v) {
        mapa.setTrampaArista(u, v);
    }

    public void setEntrada(int v) {
        mapa.setEntrada(v);
    }

    public void setSalida(int v) {
        mapa.setSalida(v);
    }

    public void iniciarRaton(int v) {
        if (v == -1) {
            raton = mapa.getEntrada();
        } else {
            raton = v;
        }
    }
    public boolean buscarRutaSalida() {
        
        mapa.dfsSinTrampa(raton);
        int[] padres = mapa.getPadres();
        
//        for (int i = 0; i < mapa.cantVertices(); i++) {
//            System.out.println(padres[i]+" padre de "+i);
//        }
        
        rutaSalida = new LinkedList<Integer>();
        boolean haySalida = buscarSalida1(padres,raton);
        if(haySalida){
            rutaSalida.add(raton);
        }
        
//        System.out.println("ruta de salida");        
//        for (int i = 0; i < rutaSalida.size(); i++) {
//            System.out.println("v("+rutaSalida.get(i)+")");
//        }
        
        return haySalida;
        
    }
    public boolean buscarSalida1(int[] padres, int v){
        LinkedList<Integer> hijos = getHijos(padres, v);
        for (int i = 0; i < hijos.size(); i++) {
            int u = hijos.get(i);
            if(u==cuevaSalida){
                rutaSalida.add(u);
                return true;
            }else{
                boolean haySalida = buscarSalida1(padres, u);
                if(haySalida){
                    rutaSalida.add(u);
                    return true;
                }
            }
        }
        return false;
    }
    
    public LinkedList<Integer> getHijos(int[]padres, int elev ){
        LinkedList<Integer> hijos = new LinkedList<>();
        for (int u = 0; u < mapa.cantVertices(); u++) {
            int padre = padres[u];
            if(padre==elev){
                hijos.push(u);
            }
        }
        return hijos;
    }

    public int moverRaton(int posNuevaRaton) {
        if(esFinJuego){
            return 4;
        }
        int posAntRaton = raton;
        Lista caminos = mapa.getVertice(posAntRaton);
        Nodo sigCueva = caminos.getNodoByElement(posNuevaRaton);
        if(sigCueva==null){
            return 2;
        }
        if(sigCueva.getEsTrampa()){
            esFinJuego = true;
            esRatonVivo = false;
            return 3;
        }
        raton = posNuevaRaton;
        
        if(posNuevaRaton==cuevaSalida){
            esFinJuego = true;
            esRatonVivo = true;
            return 9;
        }
        return 1;
    }

}
