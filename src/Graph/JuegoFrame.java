/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import javax.swing.JOptionPane;


/**
 *
 * @author Wilfredo
 */
public class JuegoFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public static int EVENTO_PINTAR_VERTICE = 1;
    public static int EVENTO_PINTAR_ARISTA = 2;
    public static int EVENTO_PINTAR_TRAMPA = 3;
    public static int EVENTO_ORDENAR = 4;
    public static int EVENTO_ELIMINAR_TUNEL = 5;
    public static int EVENTO_ELIMINAR_VERTICE = 6;

    public static int EVENTO_INICIO = 6;
    public static int EVENTO_SALIDA = 7;
    public static int EVENTO_INICIAR_JUEGO = 8;

    Lienzo lienzo;
    JuegoRaton juego;

    boolean esDibujarMapa;
    int eventoLienzo;

    boolean esJugar;

    public boolean esDragged;

    public int numClickArista;

    public JuegoFrame() {
        lienzo = new Lienzo();
        juego = new JuegoRaton();
        esDibujarMapa = false;
        esJugar = false;
        esDragged = false;
        numClickArista = 0;
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNuevoMapa = new javax.swing.JButton();
        btnJuego = new javax.swing.JButton();
        btnVertices = new javax.swing.JButton();
        btnAristas = new javax.swing.JButton();
        btnTrampas = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnIniciarJuego = new javax.swing.JButton();
        btnRutaSalida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        btnNuevoMapa.setText("Nuevo Mapa");
        btnNuevoMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoMapaActionPerformed(evt);
            }
        });

        btnJuego.setText("Jugar");
        btnJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuegoActionPerformed(evt);
            }
        });

        btnVertices.setText("Vertices");
        btnVertices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerticesActionPerformed(evt);
            }
        });

        btnAristas.setText("Aristas");
        btnAristas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAristasActionPerformed(evt);
            }
        });

        btnTrampas.setText("Trampas");
        btnTrampas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrampasActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar T.");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnSalida.setText("C. Salida");
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        btnInicio.setText("C. Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnIniciarJuego.setText("Iniciar");
        btnIniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarJuegoActionPerformed(evt);
            }
        });

        btnRutaSalida.setText("Ruta Salida");
        btnRutaSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutaSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevoMapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIniciarJuego, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVertices, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAristas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTrampas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRutaSalida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevoMapa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVertices)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAristas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTrampas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrdenar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addGap(102, 102, 102)
                .addComponent(btnJuego)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciarJuego)
                .addGap(40, 40, 40)
                .addComponent(btnRutaSalida)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 842, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        int x = evt.getX();
        if (x <= 120) {
            return;
        }
        x = x - 120;
//        System.out.println("click x:" + x);
//        System.out.println("click y:" + evt.getY());

        int y = evt.getY();
        Graphics g = this.getGraphics();
        if (esDibujarMapa) {
            if (eventoLienzo == EVENTO_PINTAR_VERTICE) {
                juego.addCueva(x, y);

            } else if (eventoLienzo == EVENTO_PINTAR_ARISTA) {
                if (numClickArista == 0) {
                    juego.posVerticeSeleccionado = lienzo.buscarVertice(juego, x, y);
                    if (juego.posVerticeSeleccionado >= 0) {
                        numClickArista = 1;
                    }
                } else if (numClickArista == 1) {
                    int posVertice2 = lienzo.buscarVertice(juego, x, y);
                    if (posVertice2 >= 0) {
                        juego.addTunel(juego.posVerticeSeleccionado, posVertice2);
                        numClickArista = 0;
                        juego.posVerticeSeleccionado = -1;
                    }
                }

            } else if (eventoLienzo == EVENTO_PINTAR_TRAMPA) {
                int[] aristaTrampa = lienzo.buscarArista(juego, x, y);
                if (aristaTrampa != null) {
                    System.out.println("trampas: " + aristaTrampa[0] + " - " + aristaTrampa[1]);
                    juego.setTrampa(aristaTrampa[0], aristaTrampa[1]);
                }

            } else if (eventoLienzo == EVENTO_ORDENAR) {
                juego.posVerticeSeleccionado = lienzo.buscarVertice(juego, x, y);

            } else if (eventoLienzo == EVENTO_ELIMINAR_TUNEL) {
                int[] aristaEliminar = lienzo.buscarArista(juego, x, y);
                if (aristaEliminar != null) {
                    juego.deleteTunel(aristaEliminar[0], aristaEliminar[1]);
                }
            }
            lienzo.pintarMapa(juego, g);

        } else if (esJugar) {
            if (eventoLienzo == EVENTO_INICIO) {
                juego.cuevaInicio = lienzo.buscarVertice(juego, x, y);

            } else if (eventoLienzo == EVENTO_SALIDA) {
                juego.cuevaSalida = lienzo.buscarVertice(juego, x, y);
                
            } else if (eventoLienzo == EVENTO_INICIAR_JUEGO) { //MOVER AL RATON
                if(juego.raton>-1){
                    int posNuevaRaton = lienzo.buscarVertice(juego, x, y);
                    if(posNuevaRaton>-1){
                        int result = juego.moverRaton(posNuevaRaton);
                        if(result==2){
                            JOptionPane.showMessageDialog(this, "Movimiento Invalido");
                        }else if(result == 3){
                            JOptionPane.showMessageDialog(this, "Pisaste una trampa, PERDISTE");
                        }else if(result == 9){
                            JOptionPane.showMessageDialog(this, "GANASTEE!!");
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "El raton no se encuentra en la posicion de partida");
                }
                
            }
            
            lienzo.pintarJuego(juego, g);
        }


    }//GEN-LAST:event_formMouseClicked


    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        if (!esDibujarMapa) {
            return;
        }
        if (eventoLienzo == EVENTO_ORDENAR) {
            int x = evt.getX();
            if (x <= 120) {
                return;
            }
            x = x - 120;
            int y = evt.getY();
            Graphics g = this.getGraphics();
            if (!esDragged) {
                juego.posVerticeSeleccionado = lienzo.buscarVertice(juego, x, y);
                esDragged = true;
            }
            if (juego.posVerticeSeleccionado >= 0) {
                juego.moverVertice(juego.posVerticeSeleccionado, x, y);
                lienzo.pintarMapa(juego, g);
            }
        }


    }//GEN-LAST:event_formMouseDragged

    private void btnNuevoMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoMapaActionPerformed
        this.esDibujarMapa = true;
        this.esJugar = false;
        this.eventoLienzo = 0;
        juego.cuevaInicio=-1;
        juego.cuevaSalida=-1;
        juego.raton =-1;
        PintarBtnEventos();
        PintarBtnJuegoDibujo();
    }//GEN-LAST:event_btnNuevoMapaActionPerformed

    private void btnVerticesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerticesActionPerformed
        if (esDibujarMapa) {
            eventoLienzo = eventoLienzo != EVENTO_PINTAR_VERTICE ? EVENTO_PINTAR_VERTICE : 0;
            PintarBtnEventos();
        }
    }//GEN-LAST:event_btnVerticesActionPerformed

    private void btnAristasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAristasActionPerformed
        if (esDibujarMapa) {
            eventoLienzo = eventoLienzo != EVENTO_PINTAR_ARISTA ? EVENTO_PINTAR_ARISTA : 0;
            PintarBtnEventos();
        }
    }//GEN-LAST:event_btnAristasActionPerformed

    private void btnTrampasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrampasActionPerformed
        if (esDibujarMapa) {
            eventoLienzo = eventoLienzo != EVENTO_PINTAR_TRAMPA ? EVENTO_PINTAR_TRAMPA : 0;
            PintarBtnEventos();
        }
    }//GEN-LAST:event_btnTrampasActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (esDibujarMapa) {
            eventoLienzo = eventoLienzo != EVENTO_ELIMINAR_TUNEL ? EVENTO_ELIMINAR_TUNEL : 0;
            
            
            PintarBtnEventos();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
        esDragged = false;
    }//GEN-LAST:event_formMouseReleased

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        if (esDibujarMapa) {
            eventoLienzo = eventoLienzo != EVENTO_ORDENAR ? EVENTO_ORDENAR : 0;
            PintarBtnEventos();
        }
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuegoActionPerformed
        this.esDibujarMapa = false;
        this.esJugar = true;
        this.eventoLienzo = 0;
        PintarBtnEventos();
        PintarBtnJuegoDibujo();

    }//GEN-LAST:event_btnJuegoActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        if (esJugar) {
            eventoLienzo = eventoLienzo != EVENTO_SALIDA ? EVENTO_SALIDA : 0;
            PintarBtnEventos();
        }
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        if (esJugar) {
            eventoLienzo = eventoLienzo != EVENTO_INICIO ? EVENTO_INICIO : 0;
            PintarBtnEventos();
        }
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnIniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarJuegoActionPerformed
        if (esJugar) {
            if(juego.cuevaInicio>-1 && juego.cuevaSalida>-1){
                eventoLienzo = eventoLienzo != EVENTO_INICIAR_JUEGO ? EVENTO_INICIAR_JUEGO : 0;
                if(eventoLienzo== EVENTO_INICIAR_JUEGO){
                    juego.raton=juego.cuevaInicio;
                    juego.esFinJuego=false;
                    juego.esRatonVivo=true;
                    juego.rutaSalida=new LinkedList<>();
                }else{
                    juego.raton=-1;
                    juego.esFinJuego=true;
                    juego.esRatonVivo=false;
                    juego.rutaSalida=new LinkedList<>();
                }
                
                PintarBtnEventos();
            }else{
                JOptionPane.showMessageDialog(this, "No se selecciono una cueva de partida o cueva de salida");
            }
        }
    }//GEN-LAST:event_btnIniciarJuegoActionPerformed

    private void btnRutaSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutaSalidaActionPerformed
     
        if(juego.raton!= -1){
            if(juego.rutaSalida.size()==0){
                boolean haySalida = juego.buscarRutaSalida();
                if(haySalida){
                    lienzo.pintarJuego(juego, this.getGraphics());
                }else{
                    JOptionPane.showMessageDialog(this, "No existe salida");
                }
            }else{
                juego.rutaSalida=new LinkedList<Integer>();
                lienzo.pintarJuego(juego, this.getGraphics());
            }
        }else{
            JOptionPane.showMessageDialog(this, "Debe iniciar la partida");
        }
            

        
        
    }//GEN-LAST:event_btnRutaSalidaActionPerformed

    private void PintarBtnJuegoDibujo() {
        if (esDibujarMapa) {
            this.btnNuevoMapa.setBackground(Color.blue);
            this.btnNuevoMapa.setForeground(Color.white);
        } else {
            this.btnNuevoMapa.setBackground(Color.lightGray);
            this.btnNuevoMapa.setForeground(Color.black);
        }

        if (esJugar) {
            this.btnJuego.setBackground(Color.blue);
            this.btnJuego.setForeground(Color.white);
        } else {
            this.btnJuego.setBackground(Color.lightGray);
            this.btnJuego.setForeground(Color.black);
        }

    }

    private void PintarBtnEventos() {
        if (eventoLienzo == EVENTO_PINTAR_VERTICE) {
            this.btnVertices.setBackground(Color.blue);
            this.btnVertices.setForeground(Color.white);
        } else {
            this.btnVertices.setBackground(Color.lightGray);
            this.btnVertices.setForeground(Color.black);
        }

        if (eventoLienzo == EVENTO_PINTAR_ARISTA) {
            this.btnAristas.setBackground(Color.blue);
            this.btnAristas.setForeground(Color.white);
        } else {
            this.btnAristas.setBackground(Color.lightGray);
            this.btnAristas.setForeground(Color.black);
        }

        if (eventoLienzo == EVENTO_PINTAR_TRAMPA) {
            this.btnTrampas.setBackground(Color.blue);
            this.btnTrampas.setForeground(Color.white);
        } else {
            this.btnTrampas.setBackground(Color.lightGray);
            this.btnTrampas.setForeground(Color.black);
        }
        if (eventoLienzo == EVENTO_ORDENAR) {
            this.btnOrdenar.setBackground(Color.blue);
            this.btnOrdenar.setForeground(Color.white);
        } else {
            this.btnOrdenar.setBackground(Color.lightGray);
            this.btnOrdenar.setForeground(Color.black);
        }
        if (eventoLienzo == EVENTO_ELIMINAR_TUNEL) {
            this.btnEliminar.setBackground(Color.blue);
            this.btnEliminar.setForeground(Color.white);
        } else {
            this.btnEliminar.setBackground(Color.lightGray);
            this.btnEliminar.setForeground(Color.black);
        }

        if (eventoLienzo == EVENTO_INICIO) {
            this.btnInicio.setBackground(Color.blue);
            this.btnInicio.setForeground(Color.white);
        } else {
            this.btnInicio.setBackground(Color.lightGray);
            this.btnInicio.setForeground(Color.black);
        }
        if (eventoLienzo == EVENTO_SALIDA) {
            this.btnSalida.setBackground(Color.blue);
            this.btnSalida.setForeground(Color.white);
        } else {
            this.btnSalida.setBackground(Color.lightGray);
            this.btnSalida.setForeground(Color.black);
        }
        if (eventoLienzo == EVENTO_INICIAR_JUEGO) {
            this.btnIniciarJuego.setBackground(Color.blue);
            this.btnIniciarJuego.setForeground(Color.white);
            this.btnIniciarJuego.setText("Cancelar");
        } else {
            this.btnIniciarJuego.setBackground(Color.lightGray);
            this.btnIniciarJuego.setForeground(Color.black);
            this.btnIniciarJuego.setText("Iniciar");
        }
        if (esDibujarMapa) {
            lienzo.pintarMapa(juego, this.getGraphics());
        } else if (esJugar) {
            lienzo.pintarJuego(juego, this.getGraphics());
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JuegoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        JuegoFrame f = new JuegoFrame();
        f.setVisible(true);
        f.setSize(1500,950);
        f.setLocationRelativeTo(null);  

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JuegoFrame().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAristas;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIniciarJuego;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnJuego;
    private javax.swing.JButton btnNuevoMapa;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnRutaSalida;
    private javax.swing.JButton btnSalida;
    private javax.swing.JButton btnTrampas;
    private javax.swing.JButton btnVertices;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
