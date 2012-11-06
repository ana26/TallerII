
package ejecutables;


public class ejecutararchivo {

    public  static void ejecutararchivo2(){
        Runtime aplicacion=Runtime.getRuntime();
        try{
            aplicacion.exec("abrir.exe");
        }
        catch(Exception e){}
    }
public static void main(String []args){
    ejecutararchivo2();
}
}
