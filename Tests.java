package JavaExcesrcises;

public class Tests{

    public static void main(String[] args) {
        boolean success = true;
        String errorMsg = "";
        //Data Types
        DataTypes empryDataTypes = newDataTypes();
        DataTypes dataTypes = newDataTypes("String",5,3.2f,'B',true);

        if (! (empryDataTypes.cadena == "Hola Mundo"))
            success = false;
        if (! (empryDataTypes.caracter == 'A'))
            success = false;
        if (! (empryDataTypes.entero == 10))
            success = false;
        if (! (empryDataTypes.flotante == 5.9f))
            success = false;
        if (! (empryDataTypes.boleano))
            success = false;
        if (! (dataTypes.cadena == "String"))
            success = false;
        if (! (dataTypes.entero == 5))
            success = false;
        if (! (dataTypes.flotante == 3.2f))
            success = false;
        if (! (dataTypes.caracter == 'B'))
            success = false;
        if (! (dataTypes.boleano))
            success = false;
        if(success == false)
            errorMsg.concat(" DataTypes");
        //Colecciones
        Colecciones coleccion = new Colecciones();
        coleccion.inicializar();
        coleccion.obtenerHash();
        if(coleccion.transport.size()!=10){
            success =false;
            errorMsg.concat(" Colecciones");
        }
        //Herencia
        Padre papa = new Padre("Perez");
        if(papa.test()){
            success =false;
            errorMsg.concat(" Padre");
        }

        System.out.println(coleccion.transport.size());
        if (success)
            System.out.println(success);
        else
           System.out.println(errorMsg);    
    }
}