package comovamos;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;
/*
 * Parte Elaborada por Oscar
 * Correspondiente a la Entidad (Catalogos) COM_Indicador, Elaborado con Clases
 * Funciones: Altas-Bajas-Actualizaciones-Busquedas
 * ~NO~ Borrar
 */
public class Indicador{
        public static Connection cn;
        public static String sql;
        public static PreparedStatement ps;
        public static ResultSet rs;
        public static ResultSet rs2;

        private static int IND_id;
        private static String IND_Nombre;
        private static String IND_Formula;
        private static String IND_Color;
        private static int IND_Padre;
    public Indicador(){
        cn = null;
        IND_id = 1;
        IND_Nombre = "";
        IND_Formula = "";
        IND_Color = "";
        IND_Padre = 1;
    }
    public Indicador(int IND_id, String IND_Nombre, String IND_indicadorcol, String IND_Formula, String IND_Color, int IND_Padre){
        this.IND_id = IND_id;
        this.IND_Nombre = IND_Nombre;
        this.IND_Formula = IND_Formula;
        this.IND_Color = IND_Color;
        this.IND_Padre = IND_Padre;
        this.cn = cn;
    }
    /*****GET*****/
    public static int getIND_id(){
        return IND_id;
    }
    public static String getIND_Nombre(){
        return IND_Nombre;
    }
    public static String getIND_Formula(){
        return IND_Formula;
    }
    public static String getIND_Color(){
        return IND_Color;
    }
    public static int getIND_Padre(){
        return IND_Padre;
    }
    /*****SET*****/
    public static void setIND_id(int IND_id){
        Indicador.IND_id = IND_id;
    }
    public static void setIND_Nombre(String IND_Nombre){
        Indicador.IND_Nombre = IND_Nombre;
    }
    public static void setIND_Formula(String IND_Formula){
        Indicador.IND_Formula = IND_Formula;
    }
    public static void setIND_Color(String IND_Color){
        Indicador.IND_Color = IND_Color;
    }
    public static void setIND_Padre(int IND_Padre){
        Indicador.IND_Padre = IND_Padre;
    }
    public boolean equals(Object obj){
        if (obj == null)    return false;
        if (getClass() != obj.getClass())   return false;
        Indicador otro = (Indicador) obj;
        //idMatr=Integer.parseInt(TxtidIndicador.getText());
        //return IND_id.equals(otro.getidIndicador());
        return otro.equals(otro.ToString());
    }
    public String ToString(){
        return "IND_id: "+IND_id+", IND_Nombre: "+IND_Nombre+", IND_Formula: "+IND_Formula+", IND_Color: "+IND_Color+", IND_Padre: "+IND_Padre;
    }
   public static void cargarDriver(){
        try{
             Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Error NO se puede Cargar el Driver: "+e.getMessage());
        }
    }
    public static void conexionBaseDatos(String Usuario, String Password){
        try{
            String url = "jdbc:mysql://localhost:3306/comovamos";
            String user = Usuario;
            String password = Password;
            cn = DriverManager.getConnection(url,user,password);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error NO se puede Establecer la Conexion General BD Como Vamos: "+e.getMessage());
        }
        //JOptionPane.showMessageDialog(null,"Conexion General Exitosa con BD Como Vamos");
    }
    public static void RegistrarIndicador(){
        try{
            sql = "INSERT INTO COM_Indicador VALUES (?,?,?,?,?)";
            ps = Indicador.cn.prepareStatement(sql);
            ps.setString(1, null);
            ps.setString(2, IND_Nombre);
	    ps.setString(3, IND_Formula);
            ps.setString(4, IND_Color);
            ps.setInt(5, IND_Padre);
            ps.executeUpdate();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error en SQL "+e.getMessage());
        }
    }
    public static void ModificarIndicador(String codmod){
        try{
            sql = "UPDATE COM_Indicador SET IND_Nombre = ?, IND_Formula = ?, IND_Color = ?, IND_Padre = ? where IND_id = ?";
            ps = Indicador.cn.prepareStatement(sql);
            ps.setString(1, IND_Nombre);
	    ps.setString(2, IND_Color);
            ps.setString(3, IND_Formula);
            ps.setInt(4, IND_Padre);
            ps.setString(5, codmod);
            ps.executeUpdate();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error en SQL "+e.getMessage());
        }
    }
    public static boolean BuscarIndicador(String codmod){
        try{
            sql = "SELECT * FROM COM_Indicador WHERE IND_id = " + codmod;
            ps = Indicador.cn.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                IND_id = rs.getInt(1);
                IND_Nombre = rs.getString(2);
                IND_Formula = rs.getString(3);
                IND_Color = rs.getString(4);
                IND_Padre = rs.getInt(5);
                return true;
            }
            else
                return false;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error en SQL "+e.getMessage());
            return false;
        }
    }
    public static boolean EliminaIndicador(String cod){
        try{
            sql = "DELETE FROM COM_Indicador WHERE IND_id = ?";
            ps = Indicador.cn.prepareStatement(sql);
            ps.setString(1, cod);
            int nro = ps.executeUpdate();
            if(nro > 0)
                return true;
            else
                return false;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error en SQL "+e.getMessage());
            return false;
        }
    }
    public static Object[][] Reportar(){
        try{
            sql = "SELECT * FROM COM_Indicador ";
            ps = Indicador.cn.prepareStatement(sql);
            rs = ps.executeQuery();

            sql="SELECT COUNT(*) FROM COM_Indicador ";
            ps=Indicador.cn.prepareStatement(sql);
            rs2=ps.executeQuery("SELECT COUNT(*) FROM COM_Indicador ");
            rs2.next();
            Object[][] tabla= new Object[rs2.getInt(1)][5];
            for (int i = 0;rs.next(); i++){
                tabla[i][0]=rs.getInt(1);
                tabla[i][1]=rs.getString(2);
                tabla[i][2]=rs.getString(3);
		tabla[i][3]=rs.getString(4);
                tabla[i][4]=rs.getInt(5);
            }
            return tabla;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error en SQL "+e.getMessage());
            return null;
        }
    }
}