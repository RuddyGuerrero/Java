# Herencia en Java

## Idea clave

La herencia permite reutilizar código.  
La herencia es el proceso de adquirir propiedades y métodos de otra clase.  
Una clase nueva puede usar atributos y métodos de otra clase.  
Se usa la palabra clave `extends`.

``` java
class Circle {
    double radius;

    double area() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    double height;

    double volume() {
        return area() * height;
    }
}

public class Test {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.radius = 3;
        c.height = 5;

        System.out.println("Área: " + c.area());
        System.out.println("Volumen: " + c.volume());
    }
}
```

## Jerarquía

En herencia siempre hay una relación:

-   Superclase (Padre)
-   Subclase (Hijo)

Ejemplo:

Animal\
├── Perro\
├── Gato

## Generalización vs Especialización

### Generalización (Bottom-Up)

Se agrupan varias clases en una más general.

Ejemplo: Perro, Gato → Animal

### Especialización (Top-Down)

Se crean clases más específicas a partir de una general.

Ejemplo: Animal → Perro → PastorAleman

## Constructores en Herencia

Los constructores se ejecutan de arriba hacia abajo.

Primero se ejecuta el constructor del padre y luego el del hijo.


### Ejemplo 1:

```java
class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child {
    GrandChild() {
        System.out.println("GrandChild Constructor");
    }
}

public class Test {
    public static void main(String[] args) {
        GrandChild g = new GrandChild();
    }
}
```

Salida: Parent Constructor\
Child Constructor\
GrandChild Constructor

### Ejemplo 2:

```java
class Parent {
    Parent() {
        System.out.println("Non-Param of Parent");
    }

    Parent(int x) {
        System.out.println("Param of Parent " + x);
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Non-Param of Child");
    }

    Child(int y) {
        System.out.println("Param of Child " + y);
    }

    Child(int x, int y) {
        super(x); // llamada explícita al constructor del padre
        System.out.println("2 Param of Child " + y);
    }
}

public class Test {
    public static void main(String[] args) {
        Child c1 = new Child();
        System.out.println("----");
        Child c2 = new Child(10);
        System.out.println("----");
        Child c3 = new Child(10, 20);
    }
}
```

## This vs super

En Java, `this` y `super` se utilizan para referirse a elementos dentro de una jerarquía de clases.

### this

-   Se refiere al objeto actual
-   Se usa para acceder a atributos y métodos de la misma clase
-   Se usa comúnmente en constructores para diferenciar variables

### super

-   Se refiere a la clase padre (superclase)
-   Se usa para llamar al constructor del padre
-   Se usa para acceder a atributos o métodos del padre


### Ejemplo completo

``` java
class Rectangle {
    int length;
    int breadth;
    int x = 10;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Cuboid extends Rectangle {
    int height;
    int x = 20;

    Cuboid(int l, int b, int h) {
        super(l, b); // llamada al constructor del padre
        height = h;
    }

    void display() {
        System.out.println(super.x);
        System.out.println(x);
    }
}

public class Test {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(10, 5, 15);
        c.display();
    }
}
```

## Explicación del ejemplo

-   `this.length = length;`
    -   Se refiere al atributo de la clase actual
-   `super(l, b);`
    -   Llama al constructor de la clase padre
-   `super.x`
    -   Accede a la variable `x` del padre (10)
-   `x`
    -   Accede a la variable `x` del hijo (20)


## Overriding (Sobrescritura)

Redefinir un método del padre en el hijo para cambiar su comportamiento.

```java
class Animal {
    void sonido() {
        System.out.println("Sonido genérico");
    }
}

class Perro extends Animal {
    @Override
    void sonido() {
        System.out.println("Guau");
    }
}

public class Test {
    public static void main(String[] args) {
        Perro p = new Perro();
        p.sonido(); // Se ejecuta el método redefinido en Perro
    }
}
```

## Polimorfismo

**Polimorfismo** significa “una referencia, muchos comportamientos”.  
- Una referencia de la clase padre puede apuntar a un objeto de la subclase.  
- El método que se ejecuta depende del objeto real, no del tipo de referencia.  

```java
class Animal {
    void sonido() {
        System.out.println("Sonido genérico");
    }
}

class Perro extends Animal {
    @Override
    void sonido() {
        System.out.println("Guau");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Perro(); // referencia de Animal apuntando a objeto Perro
        a.sonido(); // Se ejecuta el método de Perro, no de Animal
    }
}
```

## Dynamic Method Dispatch

**Dynamic Method Dispatch** es cómo Java implementa este polimorfismo en tiempo de ejecución.  
- Cuando llamas a un método sobrescrito desde una referencia de padre, Java decide qué método ejecutar según el objeto real.

```java
class Super {
    void display() {
        System.out.println("Hello");
    }
}

class Sub extends Super {
    @Override
    void display() {
        System.out.println("Hello Welcome");
    }
}

public class Test {
    public static void main(String[] args) {
        Super s = new Sub(); // referencia de Super apuntando a objeto Sub
        s.display(); // Se ejecuta display() de Sub
    }
}
```

## Reglas de Overriding (Sobrescritura)

- Nombre del método: igual.
- Parámetros: idénticos.
- Tipo de retorno: compatible.
- No se puede sobrescribir métodos `final` ni `static`.
- Se puede aumentar visibilidad (`protected` → `public`).

## Overloading vs Overriding

### Overloading (Sobrecarga)

- Misma clase.
- Métodos con distinta firma.
- Compile-time polymorphism.

```java
class MathUtils {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

public class Test {
    public static void main(String[] args) {
        MathUtils m = new MathUtils();
        System.out.println(m.sum(2, 3));      // 5
        System.out.println(m.sum(2, 3, 4));   // 9
    }
}
```

### Overriding (Sobrescritura)

- Herencia.
- Firma idéntica.
- Runtime polymorphism.

```java
class Animal {
    void sonido() {
        System.out.println("Sonido");
    }
}

class Gato extends Animal {
    @Override
    void sonido() {
        System.out.println("Miau");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Gato();
        a.sonido(); // Miau
    }
}
```

## Ejemplo final combinando Overriding y Polimorfismo

```java
class Animal {
    void sonido() {
        System.out.println("Sonido genérico");
    }
}

class Perro extends Animal {
    @Override
    void sonido() {
        System.out.println("Guau");
    }
}

class Gato extends Animal {
    @Override
    void sonido() {
        System.out.println("Miau");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Perro();
        Animal a2 = new Gato();

        a1.sonido(); // Guau
        a2.sonido(); // Miau
    }
}
```

### Ejercicios 

1. [Java Inheritance I](https://www.hackerrank.com/challenges/java-inheritance-1/problem)
2. [Java Inheritance II](https://www.hackerrank.com/challenges/java-inheritance-2/problem)
3. [Java Method Overriding](https://www.hackerrank.com/challenges/java-method-overriding/problem)
4. [Java Method Overriding 2 (Super Keyword)](https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem)