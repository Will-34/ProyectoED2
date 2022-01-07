package Graph;
import java.awt.*;

public class Main {

    public static void main(String[] args){
       Grafo G = new Grafo();
       System.out.println("G="+G);
       G.addVertice();
       G.addVertice();
       G.addVertice();
       
       G.addArista(0, 1);
       G.addArista(0, 2);
       G.addArista(2, 2);
       System.out.println("G="+G);
       
       JuegoFrame f = new JuegoFrame();
        f.setVisible(true);
        f.setSize(1500,950);
        f.setLocationRelativeTo(null);
        
       G.printListas();
       G.bfs(0);
    }
}
