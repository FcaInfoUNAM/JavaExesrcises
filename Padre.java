package JavaExcesrcises;
/*******INSTRUCCIONES*******
 * Crea archivos para cada respectiva clase y en la clase Padre crea un método llamado test
 * un hijo y espiritu santo llame a la función pruebaPaternidad retornando el valor de la prueba
 * 
 * El hujo debe recibir por referencia (como parametro) el apellido del padre y de nombre Juan
 * El espíritu Santo debe recibir por referencia (como parametro) el apellido del padre y el nombre del hijo además del apellidoReal Lopez
 * 
 * 
 */
public class Padre {
    String apellido;
    public Padre(String apellido){
        this.apellido = apellido;
    }
   
}
public class Hijo extends Padre{
    String nombre;
    public Hijo(String nombre, String apellido){
        super(apellido);
        this.nombre=nombre;
    }
}
public class EspirituSanto extends Hijo {
    String apellidoReal;
    public EspirituSanto(String nombre, String apellido, String apellidoReal){
        super(nombre, apellido);
        this.apellidoReal = apellidoReal;
    }
    public Boolean pruebaParternidad(){
        return this.apellido == this.apellidoReal;
    }
    
}