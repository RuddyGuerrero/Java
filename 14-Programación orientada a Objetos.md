# Programación Orientada a Objetos en Java

La Programación Orientada a Objetos (POO) permite modelar programas usando **objetos**, que combinan **datos (atributos)** y **funciones (métodos)** para representar entidades del mundo real.

## Principios de la POO

- **Abstracción**: 
    - Ocultar los detalles internos y mostrar solo lo necesario.
    - Ejemplo: usar un coche sin conocer su mecanismo interno.

- **Encapsulación**: 
    - Agrupar datos y métodos que operan sobre ellos en una sola unidad.
    - Permite ocultar los datos usando `private` y exponer métodos `public`.
    - Ejemplo: un televisor donde los botones controlan los circuitos internos.

- **Herencia**: 
    - Crear nuevas clases reutilizando propiedades y métodos de clases existentes.
    - Es una forma de **especialización**.
    - Ejemplo: un televisor antiguo transformado en un televisor moderno con más funcionalidades.

- **Polimorfismo**:
    - Un mismo método puede comportarse de distintas formas según el objeto.
    - Es una forma de **generalización**.

## Esqueleto de clase en Java

```java
// Modificador de acceso de la clase
public class NombreClase {

    // 1. Atributos (datos)
    private int atributo1;
    private String atributo2;

    // 2. Constructor no parametrizado
    public NombreClase() {
        // Inicialización de atributos
        atributo1 = 0;
        atributo2 = "Desconocido";
    }

    // 3. Constructor parametrizado
    public NombreClase(int a1, String a2) {
        atributo1 = a1;
        atributo2 = a2;
    }

    // 4. Métodos públicos (comportamientos)
    public void mostrarDatos() {
        System.out.println("Atributo1: " + atributo1 + ", Atributo2: " + atributo2);
    }

    // 5. Métodos privados (solo para uso interno de la clase)
    private void metodoInterno() {
        System.out.println("Este método es privado.");
    }

    // 6. Getters y Setters (para acceder a atributos privados)
    public int getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(int a1) {
        atributo1 = a1;
    }

    public String getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(String a2) {
        atributo2 = a2;
    }
}
```

### Modificadores de acceso en Java

Los modificadores de acceso controlan quién puede usar o ver una clase, un atributo o un método.

| Modificador | Dónde se puede usar            | Acceso                                           |
|-------------|--------------------------------|------------------------------------------------|
| public      | Clase, métodos, atributos      | Desde cualquier parte del programa             |
| private     | Métodos, atributos             | Solo dentro de la propia clase                 |
| protected   | Métodos, atributos             | Dentro de la clase, subclases y mismo paquete |
| default     | Clase, métodos, atributos      | Solo dentro del mismo paquete (sin escribir nada) |

⚠️ **Tip:** Es recomendable declarar los atributos como `private` y exponerlos mediante **getters y setters**, mientras que los métodos que deben ser usados por otras clases se declaran como `public`.


## Clase vs Objeto

- **Clase:** plantilla o diseño de un objeto.
- **Objeto:** instancia concreta de la clase, con valores específicos.
- Se pueden crear múltiples objetos de una misma clase.

## Ejemplo básico de clase y objeto

```java
class Television {
    private int channel;
    private int volume;

    public void changeChannel(int c) {
        channel = c;
    }

    public void changeVolume(int v) {
        volume = v;
    }
}

public class Test {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.changeChannel(10);
        tv.changeVolume(15);
    }
}
```

## Encapsulación y Data Hiding

- Los atributos privados (`private`) no se pueden acceder directamente desde fuera de la clase.
- Se usan métodos `get` y `set` para leer y escribir propiedades.

```java
class Rectangle {
    private int length;
    private int breadth;

    public void setLength(int l) {
        length = l;
    }

    public void setBreadth(int b) {
        breadth = b;
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }
}

public class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(5);
        r.setBreadth(3);
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
```

## Constructores

- Método especial que inicializa atributos al crear un objeto.
- Por defecto, si no defines ninguno, el compilador proporciona un constructor sin parámetros.
- No tiene tipo de retorno.
- Puedes tener varios constructores en una misma clase (sobrecarga de constructores).
- Tipos:
  - **No parametrizado**: sin parámetros.
  - **Parametrizado**: recibe parámetros para inicializar atributos.

```java
class Person {
    String name;
    int age;

    Person() {
        name = "Desconocido";
        age = 0;
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Ruddy", 26);
        Person p2 = new Person();
        p1.show();
        p2.show();
    }
}
```

## Herencia

- Permite que una clase nueva reutilice propiedades y métodos de otra clase.

```java
class Animal {
    void sound() {
        System.out.println("Sonido genérico");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Guau");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}
```

## Polimorfismo

- Un mismo método puede comportarse de distintas formas en distintas clases.

```java
class Animal {
    void sound() {
        System.out.println("Sonido genérico");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Miau");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Cat();
        a1.sound();
        a2.sound();
    }
}
```

### Ejercicio

1. Escribe la clase Ciculo.
2. Escribe la clase Rectángulo.
3. Escribe la clase Cilíndro.
4. Escribe la clase Estudiante.
5. Escribe la clase `Asignatura`, que representa una asignatura de un estudiante.  
Esta clase incluye los datos principales de la asignatura y métodos para calcular si el estudiante ha aprobado.

- **Atributos**
    - `idAsignatura` (String): Identificador único de la asignatura.  
    - `nombre` (String): Nombre de la asignatura.  
    - `notaMaxima` (int): Nota máxima posible en la asignatura.  
    - `notaObtenida` (int): Nota que ha obtenido el estudiante en la asignatura.  

- **Constructores**
    - **Constructor parametrizado**: Inicializa `idAsignatura`, `nombre` y `notaMaxima`.  
    - **Constructor por defecto**: Inicializa los atributos con valores predeterminados (opcional).  

- **Métodos**
    - **Getters y Setters**: Para acceder y modificar los atributos de forma segura (`getIdAsignatura()`, `setNotaObtenida()`, etc.).  
    - **`estaAprobado()`**: Devuelve `true` si el estudiante ha obtenido al menos el 40% de la nota máxima, o `false` en caso contrario.  
    - **`toString()`**: Devuelve una representación en texto de la asignatura, incluyendo `idAsignatura`, `nombre` y `notaObtenida`.  

- **Ejemplo de uso**
    - Crea un método `main` donde se cree un array con tres objetos `Asignatura` con datos iniciales.  
    - Imprime la información de cada asignatura y, opcionalmente, si el estudiante está aprobado usando el método `estaAprobado()`.