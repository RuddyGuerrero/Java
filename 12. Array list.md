# Array List en Java

Un **ArrayList** es una lista dinámica que puede crecer o reducirse automáticamente.  
Forma parte del paquete `java.util` y solo almacena **objetos** (no tipos primitivos).

## 1. Características principales

- Tamaño dinámico.
- Solo almacena objetos → usar wrappers (`Integer`, `Double`, `Character`, etc.).
- Mantiene el orden de inserción.
- Permite elementos duplicados.
- Acceso por índice.
- Métodos útiles para agregar, eliminar y buscar elementos.


## 2. Importación


```java
import java.util.ArrayList;

```

## 3. Declaración y creación


```java
ArrayList<Integer> lista = new ArrayList<>();
```

## 4. Métodos principales

| Método | Descripción |
|--------|-------------|
| add(valor) | Agrega al final |
| add(pos, valor) | Inserta en una posición |
| get(pos) | Obtiene un elemento |
| set(pos, valor) | Reemplaza un elemento |
| remove(pos) | Elimina por índice |
| remove(obj) | Elimina por valor |
| size() | Cantidad de elementos |
| contains(obj) | Verifica si existe |
| clear() | Vacía la lista |
| isEmpty() | Indica si está vacía |


## 5. Ejemplo básico


```java
class Ejemplo {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");

        System.out.println(nombres.get(1)); // Luis

        nombres.remove(0); // elimina "Ana"

        for (String n : nombres) {
            System.out.println(n);
        }
    }
}
```

## 6. Recorrido

### For tradicional

```java
for (int i = 0; i < lista.size(); i++) {
    System.out.println(lista.get(i));
}
```

### For-each

```
for (Integer x : lista) {
    System.out.println(x);
}
```

## 7. Array vs ArrayList

| Aspecto | Array | ArrayList |
|---------|-------|-----------|
| Tamaño | Fijo | Dinámico |
| Tipos | Primitivos y objetos | Solo objetos |
| Métodos | No tiene | Muchos |
| Rendimiento | Más rápido | Más flexible |

## 8. Conversión entre Array y ArrayList

### Array → ArrayList

```java
String[] A = {"a", "b", "c"};
ArrayList<String> lista = new ArrayList<>(Arrays.asList(A));
```

### ArrayList → Array

```java
String[] A = lista.toArray(new String[0]);
```

## 9. Ejemplo completo

```java
class Test {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);

        nums.set(1, 99); // reemplaza 20 por 99

        if (nums.contains(30)) {
            System.out.println("La lista contiene 30");
        }

        nums.remove(Integer.valueOf(10));

        for (int n : nums) {
            System.out.println(n);
        }
    }
}
```

## Ejercicicos

1. [Java List](https://www.hackerrank.com/challenges/java-list/problem)
2. [Java Arraylist](https://www.hackerrank.com/challenges/java-arraylist/problem)
