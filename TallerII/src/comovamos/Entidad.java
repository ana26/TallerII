package comovamos;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Entidad {
  public String usuario;
  public String contraseña;
  Conexion con;
   //public static Connection con;
  
  public Entidad () {
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
                                 sal2.close();

                             }
                             catch(Exception ex){

                             }
        try {
            Conexion con = new Conexion(usuario, contraseña);
        } catch (SQLException ex) {
            Logger.getLogger(Entidad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Entidad.class.getName()).log(Level.SEVERE, null, ex);
        }
  } 


      public void NuevaRegion(String region, int encu){
       try {
            PreparedStatement pstm = con.getConnection().prepareStatement("insert into " +
                    "com_region(Reg_id,Reg_nombreRegion, Reg_Encuesta) " +
                    " values(?,?,?)");
            pstm.setString(1, null);
            pstm.setString(2, region);
            pstm.setInt(3, encu);
            pstm.execute();
            pstm.close();
         }catch(SQLException e){
         System.out.println(e);
      }
       }
      public void NuevaEntidad (String entidad, String descrip){
       try {
            PreparedStatement pstm = con.getConnection().prepareStatement("insert into " +
                    "com_entidad(DZN_id,DZN_NombreEntidad, DZN_descripcion, DZN_Region) " +
                    " values(?,?,?,?)");
            pstm.setString(1, null);
            pstm.setString(2, entidad);
             pstm.setString(3, descrip);
            pstm.setString(4, null);
            pstm.execute();
            pstm.close();
         }catch(SQLException e){
         System.out.println(e);
      }


   }

     
   public void updateRegion(String id, String region, int encu){
       try {
            PreparedStatement pstm = con.getConnection().prepareStatement("update com_region " +
            "set Reg_nombreRegion = ? ," +
            "Reg_Encuesta = ? ," +
            "where Reg_id = ? ");
            pstm.setString(1, region);
            pstm.setInt(2, encu);
            pstm.setString(3, String.valueOf(id));
            pstm.execute();
            pstm.close();
         }catch(SQLException e){
         System.out.println(e);
      }
   }

  public void updateEntidad(String id, String entidad,String descrip, String region){
       try {
            PreparedStatement pstm = con.getConnection().prepareStatement("update com_entidad " +
            "set DZN_NombreEntidad = ? ," +
            "DZN_descripcion = ? ," +
            "DZN_Region = ? ," +
            "where DZN_id = ? ");
            pstm.setString(1, entidad);
            pstm.setString(2, descrip);
            pstm.setString(3, region);
            pstm.setString(4, String.valueOf(id));
            pstm.execute();
            pstm.close();
         }catch(SQLException e){
         System.out.println(e);
      }
   }
   public void deleteRegion(String cod){
            try {
                PreparedStatement pstm = con.getConnection().prepareStatement("delete from com_region where Reg_id = ?");
                pstm.setString(1, cod);
                pstm.execute();
                pstm.close();
            }catch(SQLException e){
            System.out.println(e);
            }
   }
    
 //obtenemos todos los datos de la tabla
  public Object [][] getDatos(){
      int registros = 0;
      //total de registros de la tabla :P
      try{         
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT count(1) as total FROM com_region ");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
      }
      
    Object[][] data = new String[registros][3];
       try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT " +
            " Reg_id, Reg_nombreRegion, Reg_Encuesta" +
            " FROM com_region" +
            " ORDER BY Reg_id ");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String estCodigo = res.getString("Reg_id");
            String estNombre = res.getString("Reg_nombreRegion");
            String estpaterno = res.getString("Reg_Encuesta");
            data[i][0] = estCodigo;            
            data[i][1] = estNombre;            
            data[i][2] = estpaterno;            
                    
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
 }
  
}
