/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Regiones.java
 *
 * Created on 5/11/2012, 05:42:52 PM
 */
package comovamos;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lalo
 */
public class Regiones extends javax.swing.JInternalFrame {
    DefaultTableModel tabla1= new DefaultTableModel ();
    private String codigopl;
    public static String sql;
       public static Connection con;
    public static PreparedStatement ps;
 public static ResultSet rs;
 public static ResultSet rs2;
}

    /** Creates new form Regiones */
    public Regiones() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textobuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        encuesta = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Aceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        region = new javax.swing.JTextField();
        zona = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        buscar = new javax.swing.JButton();

        textobuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textobuscarActionPerformed(evt);
            }
        });

        descripcion.setColumns(20);
        descripcion.setRows(5);
        jScrollPane2.setViewportView(descripcion);

        jLabel1.setText("Descripcion de la Entidad");

        jLabel5.setText("ID Encuesta");

        jLabel6.setText("Buscar por Entidad");

        jLabel2.setText("Entidad");

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("Dar de alta Zonas y regiones");

        jButton2.setText("Actualizar tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Region");

        Aceptar.setText("Agregar");
        Aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AceptarMouseClicked(evt);
            }
        });
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Encuesta", "Entidad", "Region", "Descripcion"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tablaMouseEntered(evt);
            }
        });
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tablaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        region.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionActionPerformed(evt);
            }
        });

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(encuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(region, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                                        .addComponent(zona, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))))
                                        .addGap(35, 35, 35))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                        .addGap(18, 18, 18))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(Aceptar)
                                .addGap(26, 26, 26)
                                .addComponent(jButton1)
                                .addGap(34, 34, 34)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(textobuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buscar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addGap(8, 8, 8)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(encuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(region, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(textobuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aceptar)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void textobuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textobuscarActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_textobuscarActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      /*  // boton nuevo
            String instruccion,url,usuario,pass;
            ResultSet res=null;
	url="jdbc:mysql://localhost:3306/prueba";
	usuario="root";
	pass="123456";
            try {
            Connection  conn = (Connection) DriverManager.getConnection(url,usuario,pass);
	Statement inst_sql = (Statement) conn.createStatement();
	instruccion =("select *from com_zonas ");
	res = inst_sql.executeQuery(instruccion);
        conn.close();
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Encuesta");
         modelo.addColumn("Region");
         modelo.addColumn("Entidad");
         modelo.addColumn("Descripcion");
         modelo.setColumnCount(4);
         modelo.setRowCount(10);  // registros de la tabla en mysql   MODIFICAR.!!
         res.getString("ZON_nomzona");  // valos de mysql


         tabla.setValueAt(res.getString("ZON_nomzona"), 0, 1);  // fila; columna,
           
          }catch (Exception ee) {
            JOptionPane.showMessageDialog(null, "Error " + ee.getMessage(), "", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }*/
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String instruccion;

        try {
           	Statement inst_sql = (Statement) con.createStatement();
	instruccion=("select * from com_region");
	inst_sql.executeUpdate(instruccion);
        con.close();

          }catch (Exception ee) {
            JOptionPane.showMessageDialog(null, "Error " + ee.getMessage(), "", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

private void AceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseClicked
        // TODO add your handling code here:
       // String var1 = this.region.getText();
       // String var2 = this.zona.getText();
}//GEN-LAST:event_AceptarMouseClicked

private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed

         try
        {
       String zon = zona.getText();
       String enc = encuesta.getText();
       String reg = region.getText();
       String desc = descripcion.getText();
            sql = "INSERT INTO com_region VALUES (?,?,?)";
              ps = (PreparedStatement) con.prepareStatement(sql);  
            ps =(PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, null);
            ps.setString(2, zon);
	    ps.setString(3, enc);
             ps.executeUpdate();
 
            sql = "INSERT INTO COM_Entidad VALUES (?,?,?,?)";
             ps = (PreparedStatement) con.prepareStatement(sql);  
             ps.setString(1, null);
            ps.setString(2, reg);
	    ps.setString(3, desc);
            ps.setString(4, null);

            ps.executeUpdate();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error en SQL "+e.getMessage());
        }




     if ((encuesta.getText().equals("")) ||(region.getText().equals("")) || (zona.getText().equals("")) || (descripcion.getText().equals("")) ){
            JOptionPane.showMessageDialog(null, "Para continiar, llena todos los campos");
        }
         else {
            String datos []= new String [4];
        datos[0] = this.encuesta.getText();
        this.encuesta.setText(null);
        datos[1] = this.region.getText();
        this.region.setText(null);
        datos[2] = this.zona.getText();
        this.zona.setText(null);    //limpiar caja de texto
         datos[3] = this.descripcion.getText();
        this.descripcion.setText(null);

        //Agregar
        tabla1.addRow(datos);
        this.region.grabFocus();  // limpiar despues de introgucido
         }
        
}//GEN-LAST:event_AceptarActionPerformed

private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
           // acciones de la tabla:
             // JOptionPane.showMessageDialog(null,"click tabla","Aviso",JOptionPane.PLAIN_MESSAGE);
}//GEN-LAST:event_tablaMouseClicked

private void tablaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseEntered
        // TODO add your handling code here:
}//GEN-LAST:event_tablaMouseEntered

private void tablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyPressed
            // TODO add your handling code here:
            JOptionPane.showMessageDialog(null,"click tabla","Aviso",JOptionPane.PLAIN_MESSAGE);
}//GEN-LAST:event_tablaKeyPressed

private void tablaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyTyped
            // TODO add your handling code here:
}//GEN-LAST:event_tablaKeyTyped

private void regionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_regionActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//eliminar
        String encu = encuesta.getText();
       String zon = zona.getText();
       String reg = region.getText();
       String instruccion;
	 if (JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar esta encuesta?", "Advertencia", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        try {
          //Almacenamos la información contenida en la celda apellido
          String sApe = (String)tabla.getValueAt(tabla.getSelectedRow(),tabla.getSelectedColumn());
          //Eliminamos la fila
          DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
          modelo.removeRow(tabla.getSelectedRow());
          //Realizamos una consulta para eliminar el apellido seleccionado
        
	Statement inst_sql = (Statement) con.createStatement();
	instruccion=("delete from com_region where REG_id = " + sApe);
	inst_sql.executeUpdate(instruccion);
        con.close();

          }catch (Exception ee) {
            JOptionPane.showMessageDialog(null, "Error " + ee.getMessage(), "", JOptionPane.INFORMATION_MESSAGE);
        }

        // Eliminar filas
        int fila;
        fila = this.tabla.getSelectedRow(); // seleccionamos una fila de la tabla
        if (fila >= 0){
            tabla1.removeRow(fila);    // eliminamos la fila
         }
        }
}//GEN-LAST:event_jButton1ActionPerformed

private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        String ele = textobuscar.getText();
    for (int i = 0; i < tabla.getRowCount(); i++) {
           if (tabla.getValueAt(i, 1).equals(ele)) {
                  tabla.changeSelection(i, 5, false, false);
                  break;
           }
    }

        // TODO add your handling code here:
        /* int frase;
        frase = this.tabla.getSelectedRow(); // seleccionamos una fila de la tabla
        if (frase >= 0){
            tabla1.removeRow(frase);    // eliminamos la fila
         }
 else{
    JOptionPane.showMessageDialog(null, "No seleccionaste ninguna fila");
 }*/
}//GEN-LAST:event_buscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton buscar;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JTextField encuesta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField region;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textobuscar;
    private javax.swing.JTextField zona;
    // End of variables declaration//GEN-END:variables
}
