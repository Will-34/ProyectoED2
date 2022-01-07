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
public class JuegoPintar {
    public int VerticeDiametro =40;

    
    
     public void pintarVertice (int x, int y,Graphics c){ 
        //BufferedImage image = new BufferedImage(2000, 2000, BufferedImage.TYPE_INT_ARGB);
       // Graphics ig = image.getGraphics();
        //ig.fillRect(0, 0, 2000, 2000);
        c.setColor(Color.red);
        c.fillOval(x - this.VerticeDiametro / 2, y - this.VerticeDiametro / 2, VerticeDiametro, this.VerticeDiametro);
        c.setColor(Color.blue);
        //c.drawString("0",);
        c.drawString("0", x - this.VerticeDiametro / 2, y - this.VerticeDiametro / 2);
        
    
    }
}
