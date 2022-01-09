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
    public double distanciaRecta = 10;

    public int buscarVertice(JuegoRaton juego, int x, int y) {
        int cantVertice = juego.mapa.cantVertices();
        double radio = this.VerticeDiametro / 2;
        for (int v = 0; v < cantVertice; v++) {
            Coordenada pos = juego.mapa.getCoordenada(v);
            double aux1 = Math.pow(radio, 2) - Math.pow((x - pos.x), 2);
            if (aux1 >= 0) {
                double aux2 = Math.sqrt(aux1);
                double aux3 = pos.y - aux2;
                double aux4 = pos.y + aux2;
                if (y >= aux3 && y <= aux4) {
                    return v;
                }
            }
        }
        return -1;
    }

    public int[] buscarArista(JuegoRaton juego, int x, int y) {
        int[] vertices = new int[2];
        int cantVertice = juego.mapa.cantVertices();
        for (int v = 0; v < cantVertice; v++) {
            Coordenada pos = juego.mapa.getCoordenada(v);
            Lista verticesRelacionados = juego.mapa.getVertice(v);
            for (int j = 0; j < verticesRelacionados.length(); j++) {
                int u = verticesRelacionados.get(j);
                Coordenada pos2 = juego.mapa.getCoordenada(u);
                if (estaEnCuadrante(pos, pos2, x, y)) {
                    int eleA = pos2.y - pos.y;
                    int eleB = pos2.x - pos.x;
//                System.out.println("A: "+eleA +" B: "+eleB);
                    double aux1 = Math.sqrt(Math.pow(eleA, 2) + Math.pow(eleB, 2));
//                System.out.println("Aux1: "+aux1);
                    double tmp1 = eleB * (y - pos.y);
                    double tmp2 = eleA * (x - pos.x);
                    double aux2 = tmp1 - tmp2;
//                System.out.println("Aux2: "+aux2);
                    double distancia = Math.abs(aux2 / aux1);
//                System.out.println("pos1: "+pos.x+", "+pos.y);
//                System.out.println("pos2: "+pos2.x+", "+pos2.y);
//                System.out.println("distancia: "+distancia);
                    if (distancia < distanciaRecta) {
                        vertices[0] = v;
                        vertices[1] = u;
                        return vertices;
                    }
                }

            }
        }
        return null;
    }

    public boolean estaEnCuadrante(Coordenada pos1, Coordenada pos2, int x, int y) {
        int xi, xf, yi, yf;
        if (pos1.x > pos2.x) {
            xi = pos2.x;
            xf = pos1.x;
        } else {
            xi = pos1.x;
            xf = pos2.x;
        }

        if (pos1.y > pos2.y) {
            yi = pos2.y;
            yf = pos1.y;
        } else {
            yi = pos1.y;
            yf = pos2.y;
        }
        if (x >= xi && x <= xf && y >= yi && y <= yf) {
            return true;
        } else {
            return false;
        }
    }

    public void pintarMapa(JuegoRaton juego, Graphics g) {
        BufferedImage image = new BufferedImage(2000, 2000, BufferedImage.TYPE_INT_ARGB);
        Graphics ig = image.getGraphics();
        ig.fillRect(0, 0, 2000, 2000);
        //pintar las aristas
        int nVertices = juego.mapa.cantVertices();
        int vSel1 = -1;
        int vSel2 = -1;
        if (juego.aristaSeleccionada != null) {
            vSel1 = juego.aristaSeleccionada[0];
            vSel2 = juego.aristaSeleccionada[1];
        }
        for (int v = 0; v < nVertices; v++) {
            Coordenada pos = juego.mapa.getCoordenada(v);
            Lista verticesRelacionados = juego.mapa.getVertice(v);
            for (int j = 0; j < verticesRelacionados.length(); j++) {
//                System.out.println("pos get ele j: "+j);
                int u = verticesRelacionados.get(j);
                Coordenada pos2 = juego.mapa.getCoordenada(u);
                ig.setColor(Color.black);
//                System.out.println("pos get nodo j: "+j);
                if(verticesRelacionados.getNodo(j).getEsTrampa()){
                    ig.setColor(Color.red);
                }
                if ((v == vSel1 && u == vSel2) || (u == vSel1 && v == vSel2)) {
                    ig.setColor(Color.blue);
                }
                ig.drawLine(pos.x, pos.y, pos2.x, pos2.y);
            }
        }
        
        for (int v = 0; v < nVertices; v++) {
            Coordenada pos = juego.mapa.getCoordenada(v);
            ig.setColor(Color.black);
            if (juego.posVerticeSeleccionado == v) {
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
