package comovamos;


import com.toedter.calendar.JDateChooser;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
//import org.jdesktop.application.Action;

/*
 * Fdatos.java
 *
 * Created on 09-nov-2012, 14:15:14
 */
/**
 *
 * @author Carlos Benjamín Chablé Mínkez
 */
public class Fdatos extends javax.swing.JFrame {
private Guardado guardar=new Guardado();
private String usuario;
private Conexion conec;
private String contraseña;
    /** Creates new form Fdatos */
    public Fdatos() {
        initComponents();
        guardar.setEnabled(false);
        setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lregion = new javax.swing.JComboBox();
        lentidades = new javax.swing.JComboBox();
        lencuestas = new javax.swing.JComboBox();
        lindicadores = new javax.swing.JComboBox();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        JFgrafica = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        finicio = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ffin = new com.toedter.calendar.JDateChooser();
        Grafica = new javax.swing.JButton();
        Exportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filtrado de datos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lregion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        lregion.setToolTipText("Seleccione una region, para ver la info de todas las regiones selccione la opcion en blanco y de clic al boton de aplicar"); // NOI18N
        lregion.setName("lregion"); // NOI18N
        lregion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lregionActionPerformed(evt);
            }
        });

        lentidades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        lentidades.setToolTipText("Seleccione una entidad, deje en blanco para ver la info de todas las entidades de la región seleccionada");
        lentidades.setName("lentidades"); // NOI18N
        lentidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lentidadesActionPerformed(evt);
            }
        });

        lencuestas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        lencuestas.setName("lencuestas"); // NOI18N
        lencuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lencuestasActionPerformed(evt);
            }
        });

        lindicadores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        lindicadores.setName("lindicadores"); // NOI18N

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setAutoscrolls(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comovamos/Iconos/Guardar.png"))); // NOI18N
        jButton1.setToolTipText("Aplicar");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setName("jButton1"); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        JFgrafica.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        JFgrafica.setTitle("Gráfica de Barras");
        JFgrafica.setMaximumSize(new java.awt.Dimension(600, 800));
        JFgrafica.setMinimumSize(new java.awt.Dimension(300, 400));
        JFgrafica.setName("jfgrafica"); // NOI18N
        JFgrafica.setVisible(true);

        javax.swing.GroupLayout JFgraficaLayout = new javax.swing.GroupLayout(JFgrafica.getContentPane());
        JFgrafica.getContentPane().setLayout(JFgraficaLayout);
        JFgraficaLayout.setHorizontalGroup(
            JFgraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1095, Short.MAX_VALUE)
        );
        JFgraficaLayout.setVerticalGroup(
            JFgraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );

        jLabel1.setText("Region:");
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText("Entidad:");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText("Encuesta:");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText("Indicador:");
        jLabel4.setName("jLabel4"); // NOI18N

        finicio.setName("finicio"); // NOI18N

        jLabel5.setText("Periodo:");
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setText("Seleccione los datos que quiere graficar");
        jLabel6.setName("jLabel6"); // NOI18N

        jLabel7.setText("Inicio:");
        jLabel7.setName("jLabel7"); // NOI18N

        jLabel8.setText("Fin:");
        jLabel8.setName("jLabel8"); // NOI18N

        ffin.setName("ffin"); // NOI18N

        Grafica.setText("Generar Graf.");
        Grafica.setName("Grafica"); // NOI18N
        Grafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficaActionPerformed(evt);
            }
        });

        Exportar.setText("Exportar");
        Exportar.setEnabled(false);
        Exportar.setName("Exportar"); // NOI18N
        Exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JFgrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lencuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lentidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lregion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lindicadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Exportar)
                                        .addComponent(jLabel6))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ffin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(finicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Grafica)))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1311, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JFgrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lregion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lentidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lencuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lindicadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(34, 34, 34)
                                .addComponent(finicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ffin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Grafica)
                            .addComponent(Exportar))
                        .addGap(61, 61, 61))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
// TODO add your handling code here:
    limpiar();
    try {
            //tabla.setEnabled(false);
            con=new Conexion("tallerii1202","paul123");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder al servidor de la Base de Datos, verifique que tiene conexion con acceso al servidor", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    llenarlregion();
    //llenarlentidades();        llenarlindicadores();
    lentidades.disable();lencuestas.disable();lindicadores.disable();
}//GEN-LAST:event_formWindowOpened

private void lregionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lregionActionPerformed
// TODO add your handling code here:
      
      if(lregion.getSelectedIndex()<1){lentidades.setSelectedIndex(-1);lencuestas.setSelectedIndex(-1);lindicadores.setSelectedIndex(-1);lentidades.disable();lencuestas.disable();lindicadores.disable();}
      if(lregion.getSelectedIndex()>0){lentidades.enable();llenarlentidades();}
}//GEN-LAST:event_lregionActionPerformed

private void lencuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lencuestasActionPerformed
// TODO add your handling code here:
    if(lencuestas.getSelectedIndex()>0){lindicadores.enable();llenarlindicadores();}
}//GEN-LAST:event_lencuestasActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    String a,b,c,d,campos,tablas;
    tablas="com_plantilla C INNER JOIN com_region B  INNER JOIN com_entidad A INNER JOIN com_indicador D";
    campos="B.REG_nombreregion AS region,A.DZN_NombreEntidad AS Entidad,A.DZN_descripcion AS descripcion_entidad,C.PLA_NomPlantilla AS Encuesta,C.PLA_Descripcion AS descripcion_encuesta,C.PLA_Registro AS Perido,D.IND_Nombre AS Indicador";
    if(lregion.getSelectedIndex()<1|lentidades.getSelectedIndex()<1|lencuestas.getSelectedIndex()<1|lindicadores.getSelectedIndex()<1|finicio.getDate()==null|ffin.getDate()==null){
        //para mostrar todo p1=new VDatos(campos,tablas,"ON C.PLA_ENTIDAD=A.DZN_ID AND C.PLA_INDICADOR=D.IND_ID AND C.PLA_REGION=B.REG_ID");
       JOptionPane.showMessageDialog(null, "No se han llenado todos los campos requeridos para la consulta, por favor verifique que"
               + " todos los campos estan debidamente llenados e intente de nuevo ", "Error, campos vacíos", JOptionPane.ERROR_MESSAGE);
        
    }
    
      if(lregion.getSelectedIndex()>0&&lentidades.getSelectedIndex()>0&&lencuestas.getSelectedIndex()>0&&lindicadores.getSelectedIndex()>0&&finicio.getDate()!=null&&ffin.getDate()!=null){
                    a=lregion.getSelectedItem().toString();
                    b=lentidades.getSelectedItem().toString();
                    c=lencuestas.getSelectedItem().toString();
                    d=lindicadores.getSelectedItem().toString();
                    p1=new VDatos(campos,tablas,"ON C.PLA_ENTIDAD=A.DZN_ID AND C.PLA_INDICADOR=D.IND_ID AND C.PLA_REGION=B.REG_ID AND B.REG_NOMBREREGION='"+a+"' AND A.DZN_NOMBREENTIDAD='"+b+"' AND C.PLA_NOMPLANTILLA='"+c+"'and D.IND_NOMBRE='"+d+"' AND C.PLA_REGISTRO>='"+finicio.getDate().toLocaleString()+"' AND C.PLA_REGISTRO<='"+ffin.getDate().toLocaleString()+"'");
      /*Consulta usada SELECT B.REG_nombreregion AS region,A.DZN_NombreEntidad AS Entidad,A.DZN_descripcion AS descripcion_entidad,C.PLA_NomPlantilla AS Encuesta,C.PLA_Descripcion AS descripcion_encuesta,C.PLA_Registro AS Perido,D.IND_Nombre AS Indicador FROM com_plantilla C INNER JOIN com_region B  INNER JOIN com_entidad A INNER JOIN com_indicador D ON C.PLA_ENTIDAD=A.DZN_ID AND C.PLA_INDICADOR=D.IND_ID AND C.PLA_REGION=B.REG_ID 
        AND B.REG_NOMBREREGION="veracruz" AND A.DZN_NOMBREENTIDAD="xalapa" AND C.PLA_NOMPLANTILLA="plantilla1" AND D.IND_NOMBRE="indicador1" AND C.PLA_REGISTRO>="2012/11/01"*/
      }
    
    p1.show();
}//GEN-LAST:event_jButton1ActionPerformed

private void lentidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lentidadesActionPerformed
// TODO add your handling code here:
    if(lentidades.getSelectedIndex()<1){lindicadores.setSelectedIndex(-1);lindicadores.disable();}
    if(lentidades.getSelectedIndex()>0){lencuestas.enable();llenarlencuestas();}
}//GEN-LAST:event_lentidadesActionPerformed

private void GraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficaActionPerformed
// TODO add your handling code here:
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
        try {
            this.conec = new Conexion(this.usuario, this.contraseña);
        } catch (SQLException ex) {
            Logger.getLogger(Fdatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fdatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.conec.consulta("select * from ");
        } catch (SQLException ex) {
            Logger.getLogger(Fdatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Fila 1", "Columna 1");
        dataset.addValue(5.0, "Fila 1", "Columna 2");
        dataset.addValue(3.0, "Fila 1", "Columna 3");
        dataset.addValue(2.0, "Fila 2", "Columna 1");
        dataset.addValue(3.0, "Fila 2", "Columna 2");
        dataset.addValue(2.0, "Fila 2", "Columna 3");
        dataset.addValue(10.0,"Fila 3", "Columna 4");
        dataset.addValue(10.0,"Fila 3", "Columna 4");

        JFreeChart chart = ChartFactory.createBarChart(
                "Xalapa",
                "Categorías", //Categorías
                "Valores", // Valores
                dataset, // data
                PlotOrientation.VERTICAL, // OrientaciÃ³n
                true, // include legend
                true, // tooltips?
                true // URLs?
                );
        System.out.println(chart);
        ChartPanel chartPanel = new ChartPanel(chart, false);
        
        JFgrafica.setContentPane(chartPanel);
        JFgrafica.setVisible(true);        
        Exportar.setEnabled(true);
        
        guardar.Graficas(chart);
    
}//GEN-LAST:event_GraficaActionPerformed

private void ExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarActionPerformed
// TODO add your handling code here:
    guardar.setVisible(true);
    guardar.setEnabled(true);
    
    
    
}//GEN-LAST:event_ExportarActionPerformed
public void limpiar(){
    lregion.removeAllItems();
    lentidades.removeAllItems();
    lencuestas.removeAllItems();
    lindicadores.removeAllItems();
}
public int contarresultados(ResultSet r,String datos[]){//cuenta los resultados y los mete a un arreglo
    int x=0;    
    try {
            if(r.next()){
            r.first();
            
            while(r.next()){x=x+1;}
            }
            r.first();
        } catch (SQLException ex) {
            Logger.getLogger(Fdatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return x+1;
}
public void llenararreglo(String d[],ResultSet r){
        try {
            for(int n=0;n<d.length;n++){d[n]=r.getString(1);r.next();}
        } catch (SQLException ex) {
            Logger.getLogger(Fdatos.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public void llenarlista(String d[],JComboBox l){
for (int n=0;n<d.length;n++){l.addItem(d[n]);}
}
public void llenarlregion(){
    
    rs1=con.select(con, "Reg_nombreRegion", "com_region", "");
    dregiones=new String[contarresultados(rs1,dregiones)];
    llenararreglo(dregiones,rs1);//metemos los datos a un arreglo
    lregion.addItem(" ");
    llenarlista(dregiones,lregion);//metemos el arreglo a la lista
    
}

public void llenarlentidades(){//método que llena la lista de entidades
    lentidades.removeAllItems();
    rs2=con.select(con, "DZN_NombreEntidad", "com_entidad,com_region", "where com_entidad.DZN_Region=com_region.REG_id and com_region.REG_nombreRegion='"+lregion.getSelectedItem().toString()+"'");
    dentidades=new String[contarresultados(rs2,dentidades)];
    llenararreglo(dentidades,rs2);//metemos los datos a un 
    lentidades.addItem(" ");
    llenarlista(dentidades,lentidades);//metemos el arreglo a la lista
    
}
public void llenarlencuestas(){//método que llena la lista de encuestas
    lencuestas.removeAllItems();
    rs3=con.select(con, "A.PLA_nomplantilla", "com_plantilla A JOIN com_entidad B", "ON A.PLA_Entidad = B.DZN_id AND B.DZN_NombreEntidad='"+lentidades.getSelectedItem().toString()+"'");System.out.println("Aqui");
    dencuestas=new String[contarresultados(rs3,dencuestas)];
    llenararreglo(dencuestas,rs3);//metemos los datos a un arreglo
    lencuestas.addItem(" ");
    llenarlista(dencuestas,lencuestas);//metemos el arreglo a la lista
    
}
public void llenarlindicadores(){//método que llena la lista de indicadores
    lindicadores.removeAllItems();
    rs4=con.select(con, "com_indicador.IND_Nombre", "com_indicador JOIN com_plantilla", "WHERE com_indicador.IND_id=com_Plantilla.PLA_Indicador AND com_plantilla.PLA_nomPlantilla='"+lencuestas.getSelectedItem().toString()+"'");
    dindicadores=new String[contarresultados(rs4,dindicadores)];
    llenararreglo(dindicadores,rs4);//metemos los datos a un arreglo
    lindicadores.addItem(" ");
    llenarlista(dindicadores,lindicadores);//metemos el arreglo a la lista
    
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
            java.util.logging.Logger.getLogger(Fdatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fdatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fdatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fdatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Fdatos().setVisible(true);
            }
        });
    }

   
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exportar;
    private javax.swing.JButton Grafica;
    private javax.swing.JInternalFrame JFgrafica;
    private com.toedter.calendar.JDateChooser ffin;
    private com.toedter.calendar.JDateChooser finicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JComboBox lencuestas;
    private javax.swing.JComboBox lentidades;
    private javax.swing.JComboBox lindicadores;
    private javax.swing.JComboBox lregion;
    // End of variables declaration//GEN-END:variables
    Conexion con;
    ResultSet rs4,rs1,rs2,rs3;
    int l=0,m=0;
    boolean bindicadores=false;
    VDatos p1;
    String dregiones[],dentidades[],dencuestas[],dindicadores[];
    
}
