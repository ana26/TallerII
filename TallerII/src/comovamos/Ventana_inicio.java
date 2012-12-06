package comovamos;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.*;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana_inicio extends javax.swing.JFrame {
    String usuarioperfil;
    int idusuario;
    String perfil;

    public Ventana_inicio() {
        initComponents();
       
         this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        Panel_interno = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        Label_como = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        txt_contra = new javax.swing.JPasswordField();
        txt_usuario = new javax.swing.JTextField();
        Label_nombre = new javax.swing.JLabel();
        Label_cont = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jCheckBox1.setText("jCheckBox1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_interno.setPreferredSize(new java.awt.Dimension(685, 20));

        jInternalFrame1.setTitle("Iniciar Sesion");
        jInternalFrame1.setVisible(true);

        Label_como.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        Label_como.setText("¿Cómo vamos?");

        aceptar.setText("Entrar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        txt_contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraActionPerformed(evt);
            }
        });

        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });

        Label_nombre.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Label_nombre.setText("Nombre de usuario");

        Label_cont.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Label_cont.setText("Contraseña");

        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("¿Olvidó su contraseña?");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_nombre)
                    .addComponent(Label_cont))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(aceptar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_contra)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(132, 132, 132))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(246, 246, 246))
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Label_como)
                    .addContainerGap(448, Short.MAX_VALUE)))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_nombre)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_cont)
                    .addComponent(txt_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(33, 33, 33))
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(Label_como)
                    .addContainerGap(312, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout Panel_internoLayout = new javax.swing.GroupLayout(Panel_interno);
        Panel_interno.setLayout(Panel_internoLayout);
        Panel_internoLayout.setHorizontalGroup(
            Panel_internoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_internoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel_internoLayout.setVerticalGroup(
            Panel_internoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_internoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_interno, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_interno, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txt_contraActionPerformed

     private boolean validarUsuario(String usuario, String contra) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/comovamos","root","123456");
            Statement instruccion = conn.createStatement();
            ResultSet resultado = instruccion.executeQuery("select * from com_usuarios where USU_usuario = '"+usuario+"' and USU_contraseña = '"+contra+"';");
            if (resultado.first()){
                if(resultado.getString("USU_usuario").equals(usuario) && resultado.getString("USU_contraseña").equals(contra)) {
                  return true;
                }
                return false;
            }
            else
                return false;
        }
        catch(Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
     }
     
     //Metodo que recibe como parametro los datos de usuario y contraseña de quien esta ingresando al sistema
 //y regresa el id_usuario del usuario que esta ingrendo al sistema
    private int validarId_usuario(String usuario, String contra) {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/comovamos","root","123456");
            Statement instruccion = conn.createStatement();
            ResultSet resultado = instruccion.executeQuery("select * from com_usuarios where USU_usuario = '"+usuario+"' and USU_contraseña = '"+contra+"'");
            if (resultado.first()){
                if(resultado.getString("USU_usuario").equals(usuario) && resultado.getString("USU_contraseña").equals(contra)) {
                        
                         idusuario=resultado.getInt("USU_id");
                }
               return idusuario;
            }
       return idusuario;
          
                }       
        catch(Exception e1) {
       }
         return idusuario;
    }
    //este metodo recibe el id_usuario que le pasa el metodo ValidarId_usuario y lo compara con el id_usuario dela tabla
    //de la tabla de usuarios y luego hace un filtrado en la tabla de perfiles y regresa el nombre del perfil de quien esta 
    //ingresando al sistema.
    public String validarperfil( int idusuario){
          try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/comovamos","root","123456");
            Statement instruccion = conn.createStatement();
            ResultSet resultado = instruccion.executeQuery("SELECT com_perfiles.PERF_nombre FROM com_usuarios, com_perfiles WHERE com_usuarios.USU_Perfiles = com_perfiles.PERF_id AND com_usuarios.USU_id = '"+idusuario+"';");
            if (resultado.first()){
                 perfil=resultado.getString("PERF_nombre");
             
                     
             } 
               return perfil;
              }
             
             catch(Exception e1){
              return "no se encontro";
                 
             }                   
    } 
     
    
    
    
     
    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
               try {  
        
        if ( txt_contra.getText().length() > 0) {
              if(validarUsuario(txt_usuario.getText(),txt_contra.getText())){
                  
                     validarId_usuario(txt_usuario.getText(),txt_contra.getText());
                                String sol;  
                                sol=validarperfil(validarId_usuario(txt_usuario.getText(),txt_contra.getText())); 
                                System.out.println(sol+"----Usuario que se encuentra en el sistema");
                             
                                //
              
                             setVisible(false);
                             Menu_Principal f = new Menu_Principal(sol);
                             f.setVisible(true);
                         }  
             
                   else{
               JOptionPane.showMessageDialog(null,"el usuario no esta registrado" );
              }   
        }
            
        
        else
         if ( txt_contra.getText().length() < 1 && txt_usuario.getText().length() < 1){ 
        JOptionPane.showMessageDialog(null,"Ingresa tu datos" );}
 
        if ( txt_usuario.getText().length() < 1) { 
        JOptionPane.showMessageDialog(null,"Ingresa tu usuario" );}
        if ( txt_contra.getText().length() < 1) { 
        JOptionPane.showMessageDialog(null,"Ingresa tu contraseña" );}
        
     
                                
                                //Creado por Ana
                        /*   try{
                            FileOutputStream ob=new FileOutputStream("ob.obj");
                                 ObjectOutputStream sal=new ObjectOutputStream(ob);
                                 sal.writeUTF(txt_usuario.getText());
                                 sal.close();

                                 FileOutputStream ob2=new FileOutputStream("ob2.obj");
                                 ObjectOutputStream sal2=new ObjectOutputStream(ob2);
                                 sal2.writeUTF(txt_contra.getText());
                                 sal2.close();
                            }
                            catch(Exception ex){                                
                            }                          
                      */
        
    }
                catch(Exception ex){
                    
                }
               
               
        
   
}//GEN-LAST:event_aceptarActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txt_usuarioActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecContrase().setVisible(true);
            }
        });
    }//GEN-LAST:event_jLabel4MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_como;
    private javax.swing.JLabel Label_cont;
    private javax.swing.JLabel Label_nombre;
    private javax.swing.JPanel Panel_interno;
    private javax.swing.JButton aceptar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField txt_contra;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

}
