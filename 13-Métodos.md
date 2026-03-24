# Métodos en Java

Un método es un miembro de una clase que proporciona funcionalidad. Permite ejecutar acciones, procesar datos y devolver resultados.

## 1. Qué son los métodos

- Son miembros de una clase que proporcionan funcionalidad.
- Podemos escribir nuestros propios métodos dentro de las clases.
- Las funciones que operan sobre los datos se llaman métodos.
- Cuando un método devuelve un valor, ese valor lo toma el propio método.
- Un método tiene su propia copia de sus variables internas.

### Estructura básica

```java
tipoDeRetorno nombreDelMetodo(listaDeParametros) { // firma o encabezado
    // instrucciones
}
```

## 2. Ejemplo básico

```java
class Test {
    static int max(int x, int y) {
        
        if (x > y)
            return x;
        else
            return y;
    }

    public static void main(String args[]) {
        int a = 10, b = 15, c;
        c = max(a, b);
        System.out.println(c);
    }
}
```

## Métodos estáticos

- Un método estático pertenece a la **clase**, no al objeto.
- Se pueden llamar directamente desde `main`.
- Solo acceden a miembros estáticos.
- No pueden usar `this`.

```java
class Test {
    static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int r = sumar(5, 3);  // llamada directa
        System.out.println(r);
    }
}
```

## Métodos no estáticos

- Un método no estático pertenece a un **objeto**.
- Para llamarlo desde `main`, es necesario crear una instancia.

```java
class Test {
    int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Test obj = new Test();     // creación del objeto
        int r = obj.sumar(5, 3);   // llamada mediante el objeto
        System.out.println(r);
    }
}
```

## Paso de objetos como parámetros

- Tipos primitivos → pasados por **valor**.
- Objetos → pasados por **referencia**.
- Los `String` son inmutables, no pueden modificarse.

```java
class Test {
    static void actualizar(int A[]) {
        A[0] = 25;
    }

    public static void main(String args[]) {
        int A[] = {2, 3, 4, 5, 6};
        actualizar(A);
        System.out.println(A[0]);  // 25
    }
}
```

## Sobrecarga de métodos (Method Overloading)

- Permite métodos con el mismo nombre pero diferente lista de parámetros o tipos de datos.
- El compilador elige el método adecuado según los parámetros.

```java
class Test {
    int sumar(int x, int y) {
        return x + y;
    }

    double sumar(double x, double y) {
        return x + y;
    }

    int sumar(int x, int y, int z) {
        return x + y;
    }

    public static void main(String args[]) {
        Test t = new Test();
        System.out.println(t.sumar(10, 5));
        System.out.println(t.sumar(2.5, 3.1));
        System.out.println(t.sumar(1, 2, 3));
    }
}
```

## Argumentos variables (varargs)

- Permiten recibir un número variable de parámetros del mismo tipo.
- Se usan `...` y se convierten en un array.
- Debe ser el último parámetro del método.

```java
class Test {

    // Método que acepta un número variable de enteros
    void mostrar(int... numeros) {
        System.out.println("Mostrando los números recibidos:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }

        System.out.println("Total de números recibidos: " + numeros.length);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        // Crear un objeto de la clase Test
        Test t = new Test();

        // Llamadas al método con distinta cantidad de argumentos
        t.mostrar(5);
        t.mostrar(10, 20, 30);
        t.mostrar(1, 2, 3, 4, 5);
    }
}
```

## Recursión

- Un método recursivo se llama a sí mismo.
- Debe tener una **condición base** para detenerse.
- Se usa para problemas de descomposición.


```java
class Test {

    // Método recursivo para calcular el factorial de un número
    int factorial(int n) {
        if (n == 1) // condición base
            return 1;
        return n * factorial(n - 1); // llamada recursiva
    }

    public static void main(String[] args) {
        Test t = new Test();

        // Probar el factorial de distintos números
        int num1 = 5;
        int num2 = 3;
        int num3 = 1;

        System.out.println("Factorial de " + num1 + " = " + t.factorial(num1));
        System.out.println("Factorial de " + num2 + " = " + t.factorial(num2));
        System.out.println("Factorial de " + num3 + " = " + t.factorial(num3));
    }
}
```

## Métodos genéricos (Generics)

Los métodos genéricos permiten trabajar con **distintos tipos de datos usando un solo método**.

En lugar de escribir varios métodos (sobrecarga), usamos un tipo genérico.

### Sintaxis

```java
public <T> void nombreMetodo(T parametro) {
    // código
}
```

- `<T>` es un tipo genérico (puede ser cualquier tipo: Integer, String, etc.).
- Se podría utilizar otro nombre diferente, por ejemplo `<Dato>`, pero por convención se usa `<T>` (**Type**).
- Se define antes del tipo de retorno del método.

```java
class Test {

    // Método genérico
    public <T> void imprimir(T[] array) {
        for (T elemento : array) {
            System.out.print(elemento + " "); 
        }
        System.out.println("\n----------------------------");
    }

    public static void main(String[] args) {
        Test t = new Test();

        Integer[] numeros = {1, 2, 3};
        String[] palabras = {"Hola", "Mundo"};

        t.imprimir(numeros);
        t.imprimir(palabras);
    }
}
```

### Ventajas

- Evita repetir código
- Reemplaza la sobrecarga de métodos en muchos casos
- Hace el código más flexible y reutilizable


## Ejercicicos

1. [Simple Array Sum](https://www.hackerrank.com/challenges/simple-array-sum/problem)
2. [Java Generics](https://www.hackerrank.com/challenges/java-generics/problem)
3. [Mini-Max Sum](https://www.hackerrank.com/challenges/mini-max-sum/problem)
4. [Funny String](https://www.hackerrank.com/challenges/funny-string/problem)
5. [Prime Checker](https://www.hackerrank.com/challenges/prime-checker/problem)