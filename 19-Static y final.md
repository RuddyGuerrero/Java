# static y final en Java

---

## 1. static

- `static` se usa para definir miembros de clase (variables o métodos) que **pertenecen a la clase, no al objeto**.
- Se comparte entre todas las instancias de la clase.
- Se puede acceder directamente con el **nombre de la clase** sin crear un objeto.
- Los métodos `static` solo pueden acceder a otros miembros `static`.
- Se usa para **variables compartidas, utilidades o datos de clase**.

### Ejemplo completo

~~~java
package staticexample;

class Test {
    static int x = 10; // variable de clase
    int y = 20;        // variable de objeto

    void show() {
        System.out.println(x + " " + y);
    }

    static void display() {
        System.out.println(x);
    }
}

public class Staticexample {
    public static void main(String[] args) {
        
        Test t1 = new Test();
        t1.show(); // 10 20

        t1.x = 30; // cambia el valor static para todos
        t1.y = 50; // solo cambia para t1

        Test t2 = new Test();
        t2.show(); // 30 20, x es compartido
        
    }
}
~~~

## 2. static block

- Bloque `static` se ejecuta **una sola vez al cargar la clase**.
- Se usa para **inicializar variables static** o ejecutar código antes de `main`.

### Ejemplo completo

~~~java
package staticblock;

class Test {

    static {
        System.out.println("Block 1");
    }

    static {
        System.out.println("Block 2");
    }
}

public class StaticBlock {  
    public static void main(String[] args) {
        System.out.println("Main");
        Test t = new Test();
    }
}
~~~

## 3. final

- `final` indica que **no se puede cambiar** lo declarado.
- Puede aplicarse a **variables, métodos o clases**.

### Variables final

- Se inicializan al declararlas, en un constructor o en un bloque static.
- Se escriben normalmente en **mayúsculas** si son constantes.

### Métodos final

- No pueden ser sobrescritos (override) por clases hijas.

### Clases final

- No pueden ser heredadas.

### Ejemplo completo

~~~java
package finalexample;

class Test {
    public final void show() {
        System.out.println("Método final");
    }
}

class Test1 extends Test {
    // public void show() { } // Error: no se puede sobrescribir método final
}

final class Final{
      public void show() {
        System.out.println("Método final");
     }
}

//class Test2 extends Final{  // Error: no se puede heredar de una clase final  
//}

public class FinalExample {
    public static void main(String[] args) {
         final float PI = 3.14f; // variable final
         System.out.println(PI);

        //PI = 4.0f; // Error: no se puede modificar
    }
    
}
~~~

---

## 4. Singleton (uso de static + final)

- Una **Singleton class** permite crear **solo un objeto**.
- Se usa `static` para guardar la instancia y `private` en el constructor.
- Método `getInstance()` retorna la misma instancia siempre.

### Ejemplo completo

~~~java
ppackage singleton;

class CoffeeMachine {

    private float waterQty;
    private static CoffeeMachine instance = null;

    private CoffeeMachine() {
        waterQty = 1;
    }

    public void fillWater(float qty) {
        waterQty = qty;
    }

    static CoffeeMachine getInstance() {
        if (instance == null)
            instance = new CoffeeMachine();
        return instance;
    }
}

public class Singleton {
    public static void main(String[] args) {

        CoffeeMachine m1 = CoffeeMachine.getInstance();
        CoffeeMachine m2 = CoffeeMachine.getInstance();

        System.out.println(m1);
        System.out.println(m2);

        if (m1 == m2)
            System.out.println("Same instance");
    }
}
~~~

### Idea clave

- `static` → pertenece a la clase, se comparte entre objetos, se accede con el nombre de la clase.  
- `final` → no se puede cambiar, se usa en variables, métodos y clases.  
- `static + final` → ideal para **constantes** o **control de instancias únicas** (Singleton).