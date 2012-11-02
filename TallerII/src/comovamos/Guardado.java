package comovamos;

import com.sun.org.apache.xpath.internal.operations.Bool;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.jfree.data.category.DefaultCategoryDataset;

public class Guardado extends javax.swing.JFrame {
    DefaultCategoryDataset mdatos= new DefaultCategoryDataset();
    public CGBarras grafica=new CGBarras("","","",mdatos);
    public Guardado() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jRadioButton1.setText("PDF");
        jRadioButton1.setName("Pdf"); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Imagen chica");
        jRadioButton2.setEnabled(false);
        jRadioButton2.setName("jRadioButton2"); // NOI18N
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Imagen Mediana");
        jRadioButton3.setEnabled(false);
        jRadioButton3.setName("jRadioButton3"); // NOI18N
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("Imagen grande");
        jRadioButton4.setEnabled(false);
        jRadioButton4.setName("jRadioButton4"); // NOI18N
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Elija el formato de salida, ya sea un pdf o una imagen en jpg o png según desee así como el tamaño de la imagen.");
        jLabel1.setName("jLabel1"); // NOI18N

        jButton1.setText("Exportar");
        jButton1.setName("Exportar"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton8.setText("Imagen JPG");
        jRadioButton8.setName("Jpg"); // NOI18N
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jRadioButton9.setText("Imagen PNG");
        jRadioButton9.setName("Png"); // NOI18N
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton8)
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton2)))
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(495, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton8)
                        .addGap(3, 3, 3)
                        .addComponent(jRadioButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public void Graficas(CGBarras grafica){
 this.grafica=grafica;   
}
private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
    this.jRadioButton8.setSelected(false);
    this.jRadioButton9.setSelected(false);
    this.jRadioButton2.setEnabled(false);
    this.jRadioButton3.setEnabled(false);
    this.jRadioButton4.setEnabled(false);
}//GEN-LAST:event_jRadioButton1ActionPerformed

private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
    this.jRadioButton1.setSelected(false);
    this.jRadioButton9.setSelected(false);
    this.jRadioButton2.setEnabled(true);
    this.jRadioButton3.setEnabled(true);
    this.jRadioButton4.setEnabled(true);
}//GEN-LAST:event_jRadioButton8ActionPerformed

private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed

    this.jRadioButton1.setSelected(false);
    this.jRadioButton8.setSelected(false);
    this.jRadioButton2.setEnabled(true);
    this.jRadioButton3.setEnabled(true);
    this.jRadioButton4.setEnabled(true);
}//GEN-LAST:event_jRadioButton9ActionPerformed

private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
    this.jRadioButton3.setSelected(false);
    this.jRadioButton4.setSelected(false);
}//GEN-LAST:event_jRadioButton2ActionPerformed

private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
    this.jRadioButton2.setSelected(false);
    this.jRadioButton4.setSelected(false);
}//GEN-LAST:event_jRadioButton3ActionPerformed

private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
    this.jRadioButton3.setSelected(false);
    this.jRadioButton2.setSelected(false);
}//GEN-LAST:event_jRadioButton4ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String alto="";
    String ancho="";
    String dato="";
    boolean valido=true;
    if(this.jRadioButton1.isSelected()){
        alto="320";
        ancho="500";
        dato="1";
    }else{
        if(this.jRadioButton8.isSelected()){
            dato="2";
            if(this.jRadioButton2.isSelected()){
                alto="480";
                ancho="640";
                
            }else{
                if(this.jRadioButton3.isSelected()){
                    alto="600";
                    ancho="800";
                }else{
                    if(this.jRadioButton4.isSelected()){
                        alto="768";
                        ancho="1024";
                    }else{
                        valido=false;
                        JOptionPane.showMessageDialog(null, "Elija un tamaño");
                    }
                }
            }
        }else{
            if(this.jRadioButton9.isSelected()){
                dato="3";
                if(this.jRadioButton2.isSelected()){
                    alto="480";
                    ancho="640";
            }else{
                if(this.jRadioButton3.isSelected()){
                    alto="600";
                    ancho="800";
                }else{
                    if(this.jRadioButton4.isSelected()){
                        alto="768";
                        ancho="1024";
                    }else{
                        JOptionPane.showMessageDialog(null, "Elija un tamaño");
                        valido=false;
                    }
                }
            }
            }else{
            JOptionPane.showMessageDialog(null, "Elija una de las opciones"); 
            valido=false;
            }
                
        }
    }
    if(valido==true){
    JFileChooser explorador = new JFileChooser("C:\\");
    explorador.setDialogTitle("Guardar gráfica...");
    int seleccion = explorador.showDialog(null, "Guardar");
    switch(seleccion) {
        case JFileChooser.APPROVE_OPTION:    
            grafica.exportargrafico(explorador.getSelectedFile().toString(), Integer.parseInt(alto), Integer.parseInt(ancho), dato);
        break;
        case JFileChooser.CANCEL_OPTION:
            //dio click en cancelar o cerro la ventana
        break;
        case JFileChooser.ERROR_OPTION:
            //llega aqui si sucede un error
        break;
    }    
    } 
    
}//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Guardado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guardado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guardado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guardado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guardado().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}
