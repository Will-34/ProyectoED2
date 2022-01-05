/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Graph.Grafo;

/**
 *
 * @author Wilfredo
 */
public class JuegoRaton {
    public Grafo mapa;
    public int raton = -1;
    
    public boolean finJuego;
    public boolean ratonVivo;
    
    // crear mapa
    public void addCueva(int x, int y){
        mapa.addVertice();
        mapa.setCoordenada(mapa.getUltimaPosVertices(), x, y);
        System.out.println("añadido: "+x+" - "+y);
    }
    
    public void moverVertice(int v, int x, int y){
        mapa.getCoordenada(v).x=x;
        mapa.getCoordenada(v).y=y;
    }
    
    public void addTunel( int u, int v ){
        mapa.addArista(u,v);
        
    }
    public void setTrampa( int u, int v ){
        mapa.setTrampaArista(u,v);
    }
    public void setEntrada( int v){
        mapa.setEntrada(v);
    }
    public void setSalida(int v){
        mapa.setSalida(v);
    }
    
    //
    
    // jugar
    
    public void iniciarRaton(int v){
        if(v==-1){
            raton = mapa.getEntrada();
        }else{
            raton = v;
        }
    }
    public void moverRaton(int posNuevoRaton){
        int posAntRaton = raton;
        if(true){ // existe trampa de posAntRaton,posNuevoRaton
            finJuego=true;
            ratonVivo=false;
        }else{
            raton = posNuevoRaton;
            if(true){ // posicion nueva del raton es salida
                finJuego=true;
                ratonVivo= true;
            }
        }
    }
    
    public void pintarMapa(){
        //pintar los vertices
        //pintar las aristas
    }
    public void pintarJuego(){
        //pintar los vertices
        //pintar las aristas
        //pintar raton
    }
    
}
