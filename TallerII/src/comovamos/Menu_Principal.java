/*
 * Menu_Principal.java
 *Creado por: Marisol Padilla Bautista, Hector Sanchez Garrido y Fabiola Vasquez Ventura
 * Created on 15/10/2012, 06:01:52 PM
 */

package comovamos;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


/**
 *
 * @author Faby
 */
public class Menu_Principal extends javax.swing.JFrame {
public String usuario;
public String contraseña;


    /** Creates new form Menu_Principal */
    public Menu_Principal() {
        super("Menu Principal - ¿Cómo vamos?");
        
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        initComponents();
        setSize(1280,770);
        setResizable(false);
         this.usuario="";
        this.contraseña="";
        try{
            FileInputStream ob=new FileInputStream("ob.obj");
            ObjectInputStream sal=new ObjectInputStream(ob);
            this.usuario=(String)sal.readUTF();
            sal.close();

            FileInputStream ob2=new FileInputStream("ob2.obj");
            ObjectInputStream sal2=new ObjectInputStream(ob2);
            this.contraseña=(String)sal2.readUTF();
            sal2.close();}
        catch(Exception e){
            
        }
      
    }

   // Aqui le paso la variable perfil que le envio en la ventana de inicio para el metodo de activar y desactivar menus
    //Marisol
    //***********************************
       public Menu_Principal(String perfil) {
        super("Menu Principal - ¿Cómo vamos?");
        System.out.print(perfil + "ventanaPrincipal");
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);


        initComponents();
        setSize(1280,770);
        setResizable(false);
         this.usuario="";
        this.contraseña="";
        try{
            FileInputStream ob=new FileInputStream("ob.obj");
            ObjectInputStream sal=new ObjectInputStream(ob);
            this.usuario=(String)sal.readUTF();
            sal.close();

            FileInputStream ob2=new FileInputStream("ob2.obj");
            ObjectInputStream sal2=new ObjectInputStream(ob2);
            this.contraseña=(String)sal2.readUTF();
            sal2.close();}
        catch(Exception e){
            
        }
        //Manda a llamar el metodo de Activar para desactivar o activar catalogos dependiendo del usuario que ingresa al sistema
        Activar( perfil);
    }
    
    
  

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    //Metodo para activar y desactivar botones dependiendo del tipo de usuario que ingrese al sistema
    //toma como valor a la variable perfil que fue calculada en la ventana_inicio
    public void Activar(String perfil){ 
         System.out.println(perfil+"----Usuario a activar");

            if ( perfil.equals("administrador")){
              
              
               //Aldo
               
               //Abraham
               Control_Plantilla.show(true);
               Captura_Plantilla.show(true);
               Captura_Resultados.show(false);
               Indicadores.show(true);
               Subentidades.show(true);
                //Carlos
               SubGraficas.show(true);
               //Delia
              Subusuario.show(true);
               //Aldo
               Captura_Plantilla.show(true);
               SubActividades.show(true);
               

            }
           if ( perfil.equals("capturista")){
               //Abraham
               Control_Plantilla.show(true);
               Captura_Plantilla.show(false);
               Captura_Resultados.show(true);
               Indicadores.show(false);
                //Carlos
               SubGraficas.show(false);
               //Delia
               Subusuario.disable();
               //Aldo
               Captura_Plantilla.disable();
               SubActividades.disable();

            }
           if ( perfil.equals("experto")){//abraham
               //Abraham
               Control_Plantilla.show(true);
               Captura_Plantilla.show(true);
               Captura_Resultados.show(false);
               Indicadores.show(true);
               Subentidades.show(false);
                //Carlos
               SubGraficas.show(false);
               //Delia
               Subusuario.disable();
               //Aldo
               Captura_Plantilla.disable();
               SubActividades.disable();
               
            }
           if ( perfil.equals("Grafico")){
               
            }
                  //Abraham
               Control_Plantilla.show(true);
               Captura_Plantilla.show(true);
               Captura_Resultados.show(false);
               Indicadores.show(true);
                //Carlos
               SubGraficas.show(true);
               //Delia
               Subusuario.disable();
               //Aldo
               Captura_Plantilla.disable();
               SubActividades.disable();      
   
        }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Subusuario = new javax.swing.JMenuItem();
        Subperfiles = new javax.swing.JMenuItem();
        SubActividades = new javax.swing.JMenuItem();
        Subentidades = new javax.swing.JMenuItem();
        SubGraficas = new javax.swing.JMenuItem();
        Control_Plantilla = new javax.swing.JMenu();
        Captura_Plantilla = new javax.swing.JMenuItem();
        Captura_Resultados = new javax.swing.JMenu();
        Indicadores = new javax.swing.JMenu();
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
        Subusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubusuarioActionPerformed(evt);
            }
        });
        jMenu1.add(Subusuario);

        Subperfiles.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        Subperfiles.setText("Perfiles");
        Subperfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubperfilesActionPerformed(evt);
            }
        });
        jMenu1.add(Subperfiles);

        SubActividades.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        SubActividades.setText("Actividades");
        SubActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubActividadesActionPerformed(evt);
            }
        });
        jMenu1.add(SubActividades);

        Subentidades.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Subentidades.setText("Entidades");
        Subentidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubentidadesActionPerformed(evt);
            }
        });
        jMenu1.add(Subentidades);

        SubGraficas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        SubGraficas.setText("Gráficas");
        SubGraficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubGraficasActionPerformed(evt);
            }
        });
        jMenu1.add(SubGraficas);
        SubGraficas.getAccessibleContext().setAccessibleName("Gáficas");

        Control_Plantilla.setText("Control_Plantilla_captur_y_experto");
        Control_Plantilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Control_PlantillaActionPerformed(evt);
            }
        });

        Captura_Plantilla.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        Captura_Plantilla.setText("Captura_Plantilla Experto");
        Captura_Plantilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Captura_PlantillaActionPerformed(evt);
            }
        });
        Control_Plantilla.add(Captura_Plantilla);

        Captura_Resultados.setText("Captura_Resultados Capturista");
        Captura_Resultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Captura_ResultadosActionPerformed(evt);
            }
        });
        Control_Plantilla.add(Captura_Resultados);

        Indicadores.setText("Indicadores Experto");
        Control_Plantilla.add(Indicadores);

        jMenu1.add(Control_Plantilla);

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

    private void Captura_PlantillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Captura_PlantillaActionPerformed
        frmDetaPregunta h2 = new frmDetaPregunta();
         mainPanel.add(h2);
         h2.setVisible(true);
         h2.setSize(new Dimension(1275, 700));
    }//GEN-LAST:event_Captura_PlantillaActionPerformed

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

private void SubGraficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubGraficasActionPerformed
// TODO add your handling code here:
    Fdatos graficas=new Fdatos();
    graficas.show();
}//GEN-LAST:event_SubGraficasActionPerformed

    private void SubusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubusuarioActionPerformed

    private void SubActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubActividadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubActividadesActionPerformed

    private void Control_PlantillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Control_PlantillaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Control_PlantillaActionPerformed

    private void Captura_ResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Captura_ResultadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Captura_ResultadosActionPerformed

    private void SubperfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubperfilesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubperfilesActionPerformed
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
    private javax.swing.JMenuItem Captura_Plantilla;
    private javax.swing.JMenu Captura_Resultados;
    private javax.swing.JMenu Control_Plantilla;
    private javax.swing.JMenu Indicadores;
    private javax.swing.JMenuItem SubActividades;
    private javax.swing.JMenuItem SubGraficas;
    private javax.swing.JMenuItem Subentidades;
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
