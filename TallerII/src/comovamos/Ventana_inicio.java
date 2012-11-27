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

    public Ventana_inicio() {
        initComponents();
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
        Label_como = new javax.swing.JLabel();
        Label_nombre = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        Label_cont = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_contra = new javax.swing.JPasswordField();
        Salir = new javax.swing.JButton();

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

        Label_como.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        Label_como.setText("¿Cómo vamos?");

        Label_nombre.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Label_nombre.setText("Nombre de usuario");

        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });

        Label_cont.setFont(new java.awt.Font("Verdana", 0, 14));
        Label_cont.setText("Contraseña");

        aceptar.setText("Entrar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("¿Olvidó su contraseña?");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        txt_contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_internoLayout = new javax.swing.GroupLayout(Panel_interno);
        Panel_interno.setLayout(Panel_internoLayout);
        Panel_internoLayout.setHorizontalGroup(
            Panel_internoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_internoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_internoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_internoLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(Label_como)
                        .addGap(105, 105, 105))
                    .addGroup(Panel_internoLayout.createSequentialGroup()
                        .addGroup(Panel_internoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_nombre)
                            .addComponent(Label_cont))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_internoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_contra, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(Panel_internoLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel4)
                        .addContainerGap())))
            .addGroup(Panel_internoLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(aceptar)
                .addGap(57, 57, 57)
                .addComponent(Salir)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        Panel_internoLayout.setVerticalGroup(
            Panel_internoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_internoLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(Label_como)
                .addGap(83, 83, 83)
                .addGroup(Panel_internoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_nombre)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_internoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_cont)
                    .addComponent(txt_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(66, 66, 66)
                .addGroup(Panel_internoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar)
                    .addComponent(Salir))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_interno, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_interno, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txt_contraActionPerformed

     private boolean validarUsuario(String usuario, String contra) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://148.226.81.254:3306/comovamos","tallerii1202","paul123");
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
    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
            //ActionListener eAceptar = new ActionListener() {
           // @Override
           //public void actionPerformed(ActionEvent e) {
                try{
                    if ( txt_contra.getText().length() > 0) {
                        if(validarUsuario(txt_usuario.getText(),txt_contra.getText())) {
                            setVisible(false);
                             
                             //Marisol no toques este código
                             //JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
                            try{
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
                              Menu_Principal f = new Menu_Principal();
                              f.setVisible(true);      
                              this.dispose();
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "El usuario y/o contraseña son incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                            txt_contra.setText("");
                            txt_contra.requestFocusInWindow();
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Favor de introducir la contraseña", "Error", JOptionPane.WARNING_MESSAGE);
                        txt_contra.requestFocusInWindow();
                    }
                }
                catch(Exception e1){
                }
       //     }
        //};
//}
        //aceptar.addActionListener(eAceptar);
}//GEN-LAST:event_aceptarActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txt_usuarioActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecContr().setVisible(true);
            }
        });
    }//GEN-LAST:event_jLabel4MouseClicked

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
    System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

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
    private javax.swing.JButton Salir;
    private javax.swing.JButton aceptar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField txt_contra;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

}
