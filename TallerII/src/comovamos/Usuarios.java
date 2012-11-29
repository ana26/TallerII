package comovamos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JMenu;

public class Usuarios extends javax.swing.JFrame {
    public Usuarios() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        correoElectronico = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        respuesta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pregunta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        direccionCompleta = new javax.swing.JTextField();
        telefonoCelular = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        nombreCompleto = new javax.swing.JTextField();
        confirmaContrasena = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        perfiles = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        telefonoFijo = new javax.swing.JTextField();
        contrasena = new javax.swing.JTextField();
        nombreUsuario = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jLabel16.setText("a las");

        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("hora");

        jLabel7.setText("Teléfono fijo");

        jLabel14.setText("el");

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("fecha");

        correoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoElectronicoActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("Usuario");

        jLabel11.setText("Ingrese respuesta");

        jLabel12.setText("Registrado por ");

        jLabel2.setText("Nombre de usuario");

        jLabel1.setText("Perfil de usuario");

        jLabel9.setText("Correo electronico");

        respuesta.setText("Ingrese su respuesta");

        jLabel6.setText("Dirección completa");

        jLabel5.setText("Nombre completo");

        pregunta.setText("Ingrese su pregunta");

        jLabel4.setText("Confirmar contraseña");

        jLabel10.setText("Ingrese pregunta");

        jLabel18.setText("Usuario/Administrador");

        jLabel8.setText("Teléfono celular");

        perfiles.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione perfil", "Administrador", "Gerente", "Capturista Local", "Capturista Regional", "Experto" }));
        perfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilesActionPerformed(evt);
            }
        });

        jLabel3.setText("Contraseña");

        nombreUsuario.setName("nombreUsuario"); // NOI18N
        nombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreUsuarioActionPerformed(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comovamos/Iconos/Agregar.png"))); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comovamos/Iconos/Modificar.png"))); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comovamos/Iconos/Guardar.png"))); // NOI18N
        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comovamos/Iconos/Eliminar.png"))); // NOI18N
        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comovamos/Iconos/Salir.png"))); // NOI18N
        jMenuBar1.add(jMenu5);

        jInternalFrame1.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap(498, Short.MAX_VALUE)
                        .addComponent(jLabel18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(4, 4, 4)))
                            .addComponent(jLabel11))
                        .addGap(32, 32, 32)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(respuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                            .addComponent(pregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                            .addComponent(correoElectronico, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                            .addComponent(telefonoCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                            .addComponent(telefonoFijo, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                            .addComponent(direccionCompleta, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                            .addComponent(contrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                            .addComponent(nombreCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                            .addComponent(nombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                            .addComponent(perfiles, 0, 412, Short.MAX_VALUE)
                            .addComponent(confirmaContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))))
                .addGap(221, 221, 221))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addContainerGap(394, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perfiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(direccionCompleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(telefonoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(telefonoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(correoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(51, 51, 51)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreUsuarioActionPerformed

    private void correoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoElectronicoActionPerformed

    private void perfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilesActionPerformed
    //List<ComPerfiles> lista(){
    
    
    }      // TODO add your handling code here:
    }//GEN-LAST:event_perfilesActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField confirmaContrasena;
    private javax.swing.JTextField contrasena;
    private javax.swing.JTextField correoElectronico;
    private javax.swing.JTextField direccionCompleta;
    public javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField nombreCompleto;
    private javax.swing.JTextField nombreUsuario;
    private javax.swing.JComboBox perfiles;
    private javax.swing.JTextField pregunta;
    private javax.swing.JTextField respuesta;
    private javax.swing.JTextField telefonoCelular;
    private javax.swing.JTextField telefonoFijo;
    // End of variables declaration//GEN-END:variables
    public javax.swing.JTextField getConfirmaContrasena() {
        return confirmaContrasena;
    }
    public void setConfirmaContrasena(javax.swing.JTextField confirmaContrasena) {
        this.confirmaContrasena = confirmaContrasena;
    }
    public javax.swing.JTextField getContrasena() {
        return contrasena;
    }
    public void setContrasena(javax.swing.JTextField contrasena) {
        this.contrasena = contrasena;
    }
    public javax.swing.JTextField getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(javax.swing.JTextField correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public javax.swing.JTextField getDireccionCompleta() {
        return direccionCompleta;
    }
    public void setDireccionCompleta(javax.swing.JTextField direccionCompleta) {
        this.direccionCompleta = direccionCompleta;
    }
    public javax.swing.JTextField getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(javax.swing.JTextField nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public javax.swing.JTextField getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(javax.swing.JTextField nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public javax.swing.JComboBox getPerfiles() {
        return perfiles;
    }
    public javax.swing.JTextField getPregunta() {
        return pregunta;
    }
    public void setPregunta(javax.swing.JTextField pregunta) {
        this.pregunta = pregunta;
    }
    public javax.swing.JTextField getRespuesta() {
        return respuesta;
    }
    public void setRespuesta(javax.swing.JTextField respuesta) {
        this.respuesta = respuesta;
    }
    public javax.swing.JTextField getTelefonoCelular() {
        return telefonoCelular;
    }
    public void setTelefonoCelular(javax.swing.JTextField telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }
    public javax.swing.JTextField getTelefonoFijo() {
        return telefonoFijo;
    }
    public void setTelefonoFijo(javax.swing.JTextField telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public void verUsuario(){
        nuevoUsuario(false);
    }
    public void nuevoUsuario(boolean hab) {
        perfiles.setEnabled(!hab);
        nombreUsuario.setEnabled(!hab);
        contrasena.setEnabled(!hab);
        confirmaContrasena.setEnabled(!hab);
        nombreCompleto.setEnabled(!hab);
        direccionCompleta.setEnabled(!hab);
        telefonoFijo.setEnabled(!hab);
        telefonoCelular.setEnabled(!hab);
        correoElectronico.setEnabled(!hab);
        pregunta.setEnabled(!hab);
        respuesta.setEnabled(!hab);
    }
    
   
    
    
    }
}
}
