/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author Wilfredo
 */
public class Lienzo {

    public int VerticeDiametro = 40;

//    public void buscarVertice(JuegoRaton juego,int x, int y){
//        int cantVertice = juego.mapa.cantVertices();
//        double radio =  this.VerticeDiametro/2;
//        for (int i = 0; i < cantVertice; i++) {
//            Coordenada pos = juego.mapa.getCoordenada(i);
//            double aux1 = Math.pow(radio, 2) - Math.pow((x-pos.x), 2);
//            System.out.println("coordenas: "+pos.x+" , "+pos.y);
//            System.out.println("aux1 : "+aux1);
//            if(aux1>=0){
//                double aux2 = Math.sqrt(aux1)+pos.y;
//                System.out.println("aux2: "+aux2);
//                if(y>=pos.y-radio && y<=pos.y+radio){
//                    juego.posVerticeSeleccionado=i;
//                    return;
//                }
//            }
//        }
//        juego.posVerticeSeleccionado=-1;
//    }
    public int buscarVertice(JuegoRaton juego,int x, int y){
        int cantVertice = juego.mapa.cantVertices();
        double radio =  this.VerticeDiametro/2;
        for (int i = 0; i < cantVertice; i++) {
            Coordenada pos = juego.mapa.getCoordenada(i);
            double aux1 = Math.pow(radio, 2) - Math.pow((x-pos.x), 2);
            if(aux1>=0){
                double aux2 = Math.sqrt(aux1)+pos.y;
                if(y>=pos.y-radio && y<=pos.y+radio){
                    return i;
                }
            }
        }
        return -1;
    }
    

    public void pintarMapa(JuegoRaton juego,Graphics g) {
        BufferedImage image = new BufferedImage(2000, 2000, BufferedImage.TYPE_INT_ARGB);
        Graphics ig = image.getGraphics();
        ig.fillRect(0, 0, 2000, 2000);
        //pintar las aristas
        int nVertices = juego.mapa.cantVertices();
        for (int i = 0; i < nVertices; i++) {
            Coordenada pos = juego.mapa.getCoordenada(i);
            ig.setColor(Color.black);
            Lista vertice = juego.mapa.getVertice(i);
            for (int j = 0; j < vertice.length(); j++) {
                int v = vertice.get(j);
               Coordenada pos2 = juego.mapa.getCoordenada(v);
               ig.drawLine(pos.x, pos.y, pos2.x, pos2.y);
            }
            
            
        }
        //pintar los vertices
        for (int i = 0; i < nVertices; i++) {
            Coordenada pos = juego.mapa.getCoordenada(i);
            ig.setColor(Color.red);
            if(juego.posVerticeSeleccionado==i){
                ig.setColor(Color.blue);
            }
            ig.fillOval(pos.x - this.VerticeDiametro / 2, pos.y - this.VerticeDiametro / 2, VerticeDiametro, this.VerticeDiametro);
            
        }
        
        g.drawImage(image, 120, 0, null);
        
    }

    public void pintarJuego() {
        //pintar los vertices
        //pintar las aristas
        //pintar raton
        //cambios para git
        //git add*
        //git commit -m "prueba"
        //git pull origin master
        //git push origin master
    }
}
