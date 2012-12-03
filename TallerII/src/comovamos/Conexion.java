//Creado por: Marisol Padilla Bautista, Hector Sanchez Garrido y Fabiola Vasquez Ventura
package comovamos;

import java.sql.*;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private Connection conecta;
    private Statement sentencia;
    private ResultSet rsDatos;
    private PreparedStatement psPreparasentencia;
    private String Usuario1;
    private String Contraseña1;
    private Statement stm;
    private PreparedStatement pstm;

    public String getContraseña1() {
        return Contraseña1;
    }

    public String getUsuario1() {
        return Usuario1;
    }

    public void setContraseña1(String Contraseña1) {
        this.Contraseña1 = Contraseña1;
    }

    public void setUsuario1(String Usuario1) {
        this.Usuario1 = Usuario1;
    }




    public Conexion(String usuario, String contraseña) throws SQLException, ClassNotFoundException
    {
        
        try{
            this.Usuario1=usuario;
            this.Contraseña1=contraseña;
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://25.2.76.228:3306/comovamos";
            this.conecta=DriverManager.getConnection(url,this.Usuario1,this.Contraseña1);
            this.sentencia=this.conecta.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        } catch(ClassCastException ex){
            throw ex;
        }catch(SQLException ex1){
            throw ex1;
        }
    }


public ResultSet consulta(String sql) throws SQLException
{
    try{
        this.rsDatos=this.sentencia.executeQuery(sql);
          }catch (SQLException ex){
              throw ex;
          }
    return this.rsDatos;
}
public void ejecutar(String sql)throws SQLException
{
    try{
        this.sentencia.execute(sql);
    } catch (SQLException ex){
        throw ex;
    }
}
 /**Permite retornar la conexión*/
   public Connection getConnection(){
      return this.conecta;
   }

   //permite cerrar la conexion
   public void desconectar(){
      this.conecta = null;
   }
   
   //permite hacer consultas de solo lectura recibe la conección, los campos que se quieren ver o * para todos,
   //las tablas de las cuales se van a obtener resultados, y las condiciones si es que hay si no pasa vacía
   //ejemplo con.select(conecta,"*","tabla1,tabla2","where tabla1.id=tabla2.id")
  public ResultSet select(Conexion con,String campos,String tablas,String condicion){
      ResultSet res=null; 
      try {
            this.stm=con.getConnection().createStatement();
            this.pstm=con.getConnection().prepareStatement("select "+campos+" from "+tablas+" "+condicion);
            res=this.pstm.executeQuery();
            System.out.println("hata aquí bien");
        }
        catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
  }
  //regresa el id de la ultima insercion
  //ejemplo con.getuinsert(Conexion,"com_plantilla.PLA_id","com_plantilla");
  //regresa el el dela ultima inserción realizada a la tabla com_plantilla, 
  //este método solo funciona con tablas en las que el campo id es autoincrementable y las inserciones se hacen automáticas
  //es decir no se especifica un id, se pone 0 
   public ResultSet getuinsert(Conexion con,String col,String tabla){
   
   ResultSet res=null; 
      try {
            stm=con.getConnection().createStatement();
            pstm=con.getConnection().prepareStatement("SELECT MAX("+col+") AS id FROM "+tabla);
            res=pstm.executeQuery();
            
        }
        catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   return res;
   }
   
   ///permite hacer inserciones
   //ejemplo Con.insert(Conexion,"Tabla1","1,'Nombre','Estado',2281102020,'2012-12-02'");
   //Notese que los enteros no van entre '', los string y demas valores sí
   public int insert(Conexion con,String tabla,String valores){
   int r=-1;
  
       try{
           System.out.println(valores);
                   
           stm=con.getConnection().createStatement();
           pstm.clearParameters();
           pstm=con.getConnection().prepareStatement("Insert into "+tabla+" values ("+valores+")");
           r=pstm.executeUpdate();
           System.out.println("aca ");
        }catch(SQLException e){System.out.println("No se realizo la inserción "+e);}
       return r;
   }

}
