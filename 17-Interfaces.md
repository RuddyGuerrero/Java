# Interfaces en Java

## ¿Qué es una interfaz?

- Una interfaz es como una clase abstracta donde todos los métodos son abstractos.
- Se utiliza para definir un contrato que las clases deben cumplir.
- Las clases la implementan usando la palabra clave `implements`.
- Una clase puede implementar múltiples interfaces.
- Se pueden tener referencias de interfaz apuntando a objetos de las clases que la implementan.

## Sintaxis básica

```java
interface Vehiculo {
    void encender();
    void apagar();
}

class Coche implements Vehiculo {
    @Override
    public void encender() {
        System.out.println("Coche encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Coche apagado");
    }
}

public class Test {
    public static void main(String[] args) {
        Vehiculo v = new Coche(); // referencia de la interfaz
        v.encender();
        v.apagar();
    }
}
```

## Reglas y buenas prácticas

- Todos los métodos de una interfaz son `public` y `abstract` por defecto.
- Las variables en interfaces son `public`, `static` y `final`.
- No se pueden declarar métodos privados en interfaces.
- Los métodos pueden tener implementación solo si son `static` o `default`.
- Una interfaz puede heredar de otra interfaz usando `extends`.

## Ventajas sobre la herencia múltiple en Java

- En Java, una clase solo puede extender de una clase padre.
- La herencia múltiple se logra usando interfaces.
- Las interfaces permiten una manera más limpia y segura de reutilizar código y garantizar estándares.

### Ejercicios 

1. [Java Interface](https://www.hackerrank.com/challenges/java-interface/problem)

Modificadores en Java

Combinación | Tipo | Qué significa / Cuándo usar | Ejemplo
------------|------|----------------------------|---------
public | Clase / Método / Variable | Accesible desde cualquier lugar. Usar en métodos que otros necesitan llamar. | public void saludar() { ... }
private | Método / Variable | Solo accesible dentro de la misma clase. Usar para variables internas y encapsulación. | private int edad;
ninguno (default) | Clase / Método / Variable | Accesible solo dentro del mismo paquete. | int contador;
protected | Método / Variable | Accesible en el mismo paquete y en subclases. | protected void mostrar() { ... }
static | Variable / Método | Pertenece a la clase, no a instancias. Compartido entre todos los objetos. | static int total;
 | | | static void mostrarTotal() { ... }
final | Variable | No se puede cambiar el valor (constante). | final double PI = 3.1416;
final | Método | No se puede sobrescribir en subclases. | public final void saludo() { ... }
final | Clase | No se puede heredar. | final class Constantes { ... }
public static | Método | Método accesible desde cualquier lugar, que pertenece a la clase (como main). | public static void main(String[] args)
private static | Variable | Variable compartida por todos los objetos, pero solo accesible dentro de la clase. | private static int contador;
public final | Método | Método que cualquiera puede llamar, pero no se puede sobrescribir. | public final void imprimir() { ... }
static final | Variable | Constante de clase: compartida por todos, inmutable. | static final double GRAVEDAD = 9.8;
public static final | Variable | Constante accesible desde cualquier lugar. Muy usado para configuraciones. | public static final String VERSION = "1.0";

Tips rápidos para recordar:
1. public → todo el mundo puede usarlo.
2. private → solo mi clase puede tocarlo.
3. static → pertenece a la clase, no al objeto.
4. final → no se puede cambiar / sobrescribir / heredar.
5. Nada → accesible solo dentro del paquete.