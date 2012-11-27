/*
 * Menu_Principal.java
 *Creado por: Marisol Padilla Bautista, Hector Sanchez Garrido y Fabiola Vasquez Ventura
 * Created on 15/10/2012, 06:01:52 PM
 */

package comovamos;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Faby
 */
public class Menu_Principal extends javax.swing.JFrame {


    /** Creates new form Menu_Principal */
    public Menu_Principal() {
        super("Menu Principal - ¿Cómo vamos?");
        
        /*setSize(new Dimension(800,1000));
        setResizable(false);
        Dimension tamFrame=this.getSize();
        Dimension tamPantalla=Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((tamPantalla.width - tamFrame.width)/2, (tamPantalla.height - tamFrame.height)/2);*/
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);




        initComponents();
        setSize(1280,770);
        setResizable(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Subusuario = new javax.swing.JMenuItem();
        Subencuestas = new javax.swing.JMenuItem();
        Subperfiles = new javax.swing.JMenuItem();
        SubActividades = new javax.swing.JMenuItem();
        Subentidades = new javax.swing.JMenuItem();
        SubIndicador = new javax.swing.JMenuItem();
        SubDetalleEncuesta = new javax.swing.JMenuItem();
        Subgraficas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setName("mainPanel"); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        jMenu3.setText("Archivo");

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Catalogos");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        Subusuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        Subusuario.setText("Usuarios");
        jMenu1.add(Subusuario);

        Subencuestas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Subencuestas.setText("Encuestas");
        Subencuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubencuestasActionPerformed(evt);
            }
        });
        jMenu1.add(Subencuestas);

        Subperfiles.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        Subperfiles.setText("Perfiles");
        jMenu1.add(Subperfiles);

        SubActividades.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        SubActividades.setText("Actividades");
        jMenu1.add(SubActividades);

        Subentidades.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Subentidades.setText("Entidades");
        Subentidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubentidadesActionPerformed(evt);
            }
        });
        jMenu1.add(Subentidades);

        SubIndicador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        SubIndicador.setText("Indicadores");
        SubIndicador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubIndicadorActionPerformed(evt);
            }
        });
        jMenu1.add(SubIndicador);

        SubDetalleEncuesta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        SubDetalleEncuesta.setText("DET_Encuestas");
        SubDetalleEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubDetalleEncuestaActionPerformed(evt);
            }
        });
        jMenu1.add(SubDetalleEncuesta);

        Subgraficas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        Subgraficas.setText("Gráficas");
        Subgraficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubgraficasActionPerformed(evt);
            }
        });
        jMenu1.add(Subgraficas);
        Subgraficas.getAccessibleContext().setAccessibleName("Gáficas");

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Herramientas");

        jMenuItem7.setText("Permisos");
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Ayuda");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

                System.exit(0);
        // Del menu Archivo, Salir, sale del menu principal

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void SubIndicadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubIndicadorActionPerformed
        /*****Oscar  -> NO Borrar por Favor***/
        frmIndicador h1 = new frmIndicador();
         mainPanel.add(h1);
         h1.setVisible(true);
         h1.setSize(new Dimension(1275, 700));
    }//GEN-LAST:event_SubIndicadorActionPerformed

    private void SubDetalleEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubDetalleEncuestaActionPerformed
        frmDetaPregunta h2 = new frmDetaPregunta();
         mainPanel.add(h2);
         h2.setVisible(true);
         h2.setSize(new Dimension(1275, 700));
    }//GEN-LAST:event_SubDetalleEncuestaActionPerformed

    private void SubencuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubencuestasActionPerformed
         frmPlantilla h2 = new frmPlantilla();
         mainPanel.add(h2);
         h2.setVisible(true);
         h2.setSize(new Dimension(1275, 700));
    }//GEN-LAST:event_SubencuestasActionPerformed

private void SubentidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubentidadesActionPerformed
   frmEntidad h4 = new frmEntidad();
         mainPanel.add(h4);
         h4.setVisible(true);
         h4.setSize(new Dimension(1275, 700));
    
    // TODO add your handling code here:
}//GEN-LAST:event_SubentidadesActionPerformed

private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
// TODO add your handling code here:
    verUsuarios listaUsuarios=new verUsuarios();
    listaUsuarios.show();
}//GEN-LAST:event_jMenu1ActionPerformed

private void SubgraficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubgraficasActionPerformed
// TODO add your handling code here:
    Fdatos graficas=new Fdatos();
    graficas.show();
}//GEN-LAST:event_SubgraficasActionPerformed
     /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem SubActividades;
    private javax.swing.JMenuItem SubDetalleEncuesta;
    private javax.swing.JMenuItem SubIndicador;
    private javax.swing.JMenuItem Subencuestas;
    private javax.swing.JMenuItem Subentidades;
    private javax.swing.JMenuItem Subgraficas;
    private javax.swing.JMenuItem Subperfiles;
    public javax.swing.JMenuItem Subusuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables

}
