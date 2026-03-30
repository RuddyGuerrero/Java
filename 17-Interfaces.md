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