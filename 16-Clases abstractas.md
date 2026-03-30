# Clases abstractas en Java

## Conceptos clave

- Clase abstracta: clase que **no puede instanciarse** y puede tener métodos **abstractos** (sin cuerpo) y métodos concretos.
- Método abstracto: declarado sin cuerpo; obliga a las subclases a implementarlo.
- Método concreto: tiene implementación; las subclases pueden usarlo directamente.
- Subclase concreta: clase que sobrescribe todos los métodos abstractos y puede ser instanciada.
- Polimorfismo: una referencia de clase abstracta puede apuntar a cualquier objeto de sus subclases.

## Reglas importantes

- Una clase abstracta no puede ser final.
- Un método abstracto no puede ser final ni static.
- Si la subclase no sobrescribe todos los métodos abstractos, también es abstracta.
- Para crear un objeto, la clase debe ser concreta.

## Ejemplo de código

```java
// Clase abstracta
abstract class Animal {
    void dormir() {
        System.out.println("El animal duerme");
    }

    abstract void hacerSonido();
}

// Subclases concretas
class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Guau Guau");
    }
}

class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Miau Miau");
    }
}

// Clase de prueba
public class Test {
    public static void main(String[] args) {
        Perro p = new Perro();
        Gato g = new Gato();

        p.dormir();
        p.hacerSonido();

        g.dormir();
        g.hacerSonido();

        // Polimorfismo con referencia abstracta
        Animal a;
        a = p;
        a.hacerSonido();
        a = g;
        a.hacerSonido();
    }
}
```

## Explicación del ejemplo

- `void dormir()` es un método concreto, heredado y usado por todas las subclases.
- `abstract void hacerSonido()` obliga a las subclases a implementar este método.
- `Perro` y `Gato` son clases concretas que sobrescriben el método abstracto.
- Se puede usar **polimorfismo** con la referencia de clase abstracta `Animal a`, apuntando a distintos objetos.

## Salida esperada

```
El animal duerme
Guau Guau
El animal duerme
Miau Miau
Guau Guau
Miau Miau
```

### Ejercicios 

1. [Java Abstract Class](https://www.hackerrank.com/challenges/java-abstract-class/problem)