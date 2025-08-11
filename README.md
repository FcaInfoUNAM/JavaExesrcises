# Ejercicios de repaso para Programación Orientada a Objetos

Temas sencillos de coleciones de datos, herencia y polimorfismo

## INSTRUCCIONES  

Genera el código necesario para cumplir con las características de cada archivo en la carpeta "Exercises"

> [!CAUTION]
> **NO** modifiques el archivo Tests.java
### Colecciones.java
Crea el método obtenerHash: Debe regresar un HashMap con los elementos de las colecciones cars, bikes y transport sin duplicados, ni elementos vacíos
La llave del Hash map deberá ser un incremental del 1 al n

### DataTypes.java
Crea un constructor que inicialice los atributos de la clase **DataTypes** con los siguientes valores:
* cadena = Hola Mundo
* entero = 10
* flotante = 5.9
* caracter = A
* boleano = true

### Padre.java
Crea archivos para cada respectiva clase (Pader, Hijo y EspirituSanto) y en la clase Padre crea un método llamado **test** que genere una instancia de
un hijo y un espíritu santo el cuál debe llamar a la función **pruebaPaternidad** retornando el valor de la prueba
**Condiciones:**
- El hijo debe recibir por referencia (como parámetro) el apellido del padre y de nombre ```Juan```
- El espíritu Santo debe recibir por referencia (como parámetro) el apellido del padre y el nombre del hijo además del apellidoReal ```Lopez```

```java
//Ejemplo sin solución
public Boolean test(){
        Hijo hijo=new Hijo(parameros);
        EspirituSanto es = new EspirituSanto(parametros);
        return es.pruebaParternidad();
    }
```

### Sobrecarga.java

Programa el método reprobar en alumno para generar mostrar los siguientes mensajes dadas las condiciones:
* Si la cualificación es menor a 6 mostrar :(
* De lo contrario mostrar :)

> [!CAUTION]
> Recuerda crear un archivo por cada clase.


 
