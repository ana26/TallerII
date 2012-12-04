package comovamos;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
public class frmEntidad extends javax.swing.JInternalFrame {
public String usuario;
public String contraseña;
    /** Creates new form frmEntidad */
    public frmEntidad() {
        initComponents();
        initComponents();
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtregion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtentidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdescrip = new javax.swing.JTextArea();
        txtencu = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        cmdRegistro1 = new javax.swing.JButton();
        cmdNuevo1 = new javax.swing.JButton();
        cmdEliminar1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cmdEliminar2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tablita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablitaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablita);

        jLabel6.setText("Region");

        jLabel5.setText("Entidad");

        jLabel8.setText("Descripcion:");

        txtdescrip.setColumns(20);
        txtdescrip.setRows(5);
        jScrollPane2.setViewportView(txtdescrip);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cmdRegistro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comovamos/Iconos/Guardar.png"))); // NOI18N
        cmdRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegistro1ActionPerformed(evt);
            }
        });

        cmdNuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comovamos/Iconos/Agregar.png"))); // NOI18N
        cmdNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevo1ActionPerformed(evt);
            }
        });

        cmdEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comovamos/Iconos/Eliminar.png"))); // NOI18N
        cmdEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminar1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comovamos/Iconos/Modificar.png"))); // NOI18N
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cmdEliminar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comovamos/Iconos/boton_buscar.png"))); // NOI18N
        cmdEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(cmdNuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdEliminar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdEliminar2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdNuevo1)))
        );

        jLabel7.setText("Encuesta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtencu, 0, 264, Short.MAX_VALUE)
                    .addComponent(txtregion, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(txtentidad, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtregion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtencu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void formWindowOpened(java.awt.event.WindowEvent evt) {
        updateTablita();
        nuevo();
    } 
    private void tablitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablitaMouseClicked
        // TODO add your handling code here:
        //Regiones C:
        filas = tablita.rowAtPoint(evt.getPoint());
        if (filas > -1){
            txtregion.setText(String.valueOf(tablita.getValueAt(filas, 2)));
            txtentidad.setText(String.valueOf(tablita.getValueAt(filas, 3)));
            txtdescrip.setText(String.valueOf(tablita.getValueAt(filas, 4)));
        }
}//GEN-LAST:event_tablitaMouseClicked

    private void cmdRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegistro1ActionPerformed
        // TODO add your handling code here:
        //Regiones  Agregar   C:
        String region = txtregion.getText();
        String var = (String) txtencu.getSelectedItem();
        int encu=Integer.parseInt(var);
        R.NuevaRegion(region,encu);
        updateTablita();
}//GEN-LAST:event_cmdRegistro1ActionPerformed

    private void cmdNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevo1ActionPerformed
        // TODO add your handling code here:
        // Regiones  C:
        nuevo();
}//GEN-LAST:event_cmdNuevo1ActionPerformed

    private void cmdEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminar1ActionPerformed
        // TODO add your handling code here:
        //Regiones  C:
        if (filas > -1){
            String codigo = String.valueOf(tablita.getValueAt(filas, 0));
            R.deleteRegion(codigo);
            updateTablita();
            filas=-1;
        }
}//GEN-LAST:event_cmdEliminar1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //Regiones  Update_Region   C:

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/dbcontactos", "root", "123456");
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM com_encuesta");
            txtencu.removeAllItems();
            while (rs.next()) {
                txtencu.addItem(rs.getString("id_encuesta"));

            }
            rs.close();
        } catch (Exception ex) {
        }
        if (filas > -1){
            String codigo = String.valueOf(tablita.getValueAt(filas, 0));
            String region = txtregion.getText();
            String var = (String) txtencu.getSelectedItem();
            int encu=Integer.parseInt(var);
            R.updateRegion(codigo, region, encu);
            updateTablita();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cmdEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminar2ActionPerformed
        // TODO add your handling code here:
        //buscar

        String ax="";
        String op="";//se crea una variable que recibira la opcion
        op=JOptionPane.showInputDialog("a. Buscar Id de Region.\n b. Buscar Id de Entidad\n c. Salir.");
        //se usa un cuadro de dialogo de tipo entrada el cual recibira la opcion

        if(op.equals("a")){//si se elige la opcion a se muestra el siguiente mensaje
            ax = JOptionPane.showInputDialog("Id de Region que decea buscar: ");

            for (int i = 0; i < tablita.getRowCount(); i++) {
                if (tablita.getValueAt(i, 0).equals(ax)) {
                    tablita.changeSelection(i, 5, false, false);
                    break;
                }
            }
        } else if(op.equals("b")){//si se elige la opcion b se muestra el siguiente mensaje
            String ax2 = JOptionPane.showInputDialog("Id de Region que decea buscar: ");
        } else{//si la opcion ingresada es diferente a las mostradas se muestra el siguiente mensaje
            JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
        }

        //String ax = JOptionPane.showInputDialog("Id de Region que decea buscar: ");
    }//GEN-LAST:event_cmdEliminar2ActionPerformed
        private void updateTablita(){
        String[] columNames = {"id","Encuesta","Region"};
        // se utiliza la funcion
        dtReg = R.getDatos();

        // se colocan los datos en la tabla
        DefaultTableModel datos = new DefaultTableModel(dtReg,columNames);
        tablita.setModel(datos);
        //ajustamos tamaño de la celda ID
        TableColumn columna = tablita.getColumn("id");
        columna.setPreferredWidth(50);
        columna.setMinWidth(10);
        columna.setMaxWidth(30);
    }

    private void nuevo(){

        txtregion.setText("");
        txtentidad.setText("");
        txtdescrip.setText("");
            }


        Entidad R= new Entidad();
    Object [][] dtReg;
    int filas = -1;

   /* public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEntidad().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdEliminar1;
    private javax.swing.JButton cmdEliminar2;
    private javax.swing.JButton cmdNuevo1;
    private javax.swing.JButton cmdRegistro1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablita;
    private javax.swing.JTextArea txtdescrip;
    private javax.swing.JComboBox txtencu;
    private javax.swing.JTextField txtentidad;
    private javax.swing.JTextField txtregion;
    // End of variables declaration//GEN-END:variables

}
