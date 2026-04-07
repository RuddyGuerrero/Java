# Paquetes en Java

## ¿Qué es un paquete?

- Un **paquete (package)** es un contenedor que agrupa clases e interfaces relacionadas.
- Sirve para **organizar el código** y evitar conflictos de nombres.
- Facilita el mantenimiento y reutilización del código.

## ¿Para qué sirven?

- Organizar proyectos grandes
- Evitar conflictos entre clases con el mismo nombre
- Controlar el acceso (public, protected, default)
- Reutilizar código

## Cómo crear un paquete

- Se declara al inicio del archivo `.java`:

~~~java
package miPaquete;

public class MiClase {
    public void saludar() {
        System.out.println("Hola desde miPaquete");
    }
}
~~~

- El archivo debe estar en una carpeta con el mismo nombre:

Proyecto/
miPaquete/
MiClase.java


## Subpaquetes

- Un paquete puede tener otros paquetes dentro.

~~~java
package miPaquete.subPaquete;

public class SubClase {
    public void info() {
        System.out.println("Hola desde subPaquete");
    }
}
~~~

Estructura de carpetas:

Proyecto/
miPaquete/
subPaquete/
SubClase.java


Uso:

~~~java
import miPaquete.subPaquete.SubClase;

public class Main {
    public static void main(String[] args) {
        SubClase s = new SubClase();
        s.info();
    }
}
~~~

## Tipos de paquetes

- **Predefinidos (Java):**
  - `java.util`
  - `java.io`
  - `java.lang`

- **Definidos por el usuario:**
  - Los que creas tú (`miPaquete`, `com.empresa.proyecto`)


## Buenas prácticas

- Usar nombres en minúsculas
- Usar nombres de dominio invertido:
  - `com.empresa.proyecto`
- Mantener una estructura clara de carpetas

## Idea clave

- `package` → organiza clases  
- `import` → permite usar clases de otros paquetes  
- Cada paquete corresponde a una carpeta  