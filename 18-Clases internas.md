# Clases Internas en Java

## Cuándo no usarlas

- Sirven para organizar mejor el código y agrupar clases que están relacionadas.
- Se usan cuando una clase solo tiene sentido dentro de otra.
- Las clases internas (no estáticas) pueden acceder directamente a los atributos de la clase externa.
- Permiten evitar muchas clases separadas.
- Mantienen el código más ordenado.
- Las clases locales o anónimas se usan cuando necesitas algo rápido y solo en un sitio.

## Cuándo no usarlas
- Si la clase es grande
- Si se va a reutilizar en muchos sitios
- Si hace el código más difícil de entender

## Clase interna NO estática
- No usa `static`
- Necesita objeto de la clase externa
- Puede acceder a atributos de la clase externa

```java
package internanostatic;

class Externa {
    int a = 10;

    class Interna {
        int b = 20;

        void mostrar() {
            System.out.println("a: " + a + ", b: " + b);
        }
    }
}

public class InternaNoStatic {
    public static void main(String[] args) {
        
        Externa ext = new Externa();
        Externa.Interna in = ext.new Interna();
        
        //Externa.Interna in = new Externa().new Interna();
        
        in.mostrar();
    }
}
```

## Clase interna estática
- Usa `static`
- No necesita objeto externo
- Solo accede a atributos estáticos

```java
package internastatic;

class Externa {
    static int x = 50;
    int y = 40;

    static class InternaEstatica {
        void mostrar() {
            System.out.println("x: " + x);
            // System.out.println("y: " + y); // error
        }
    }
}

public class InternaStatic {
    public static void main(String[] args) {
        Externa.InternaEstatica obj = new Externa.InternaEstatica();
        obj.mostrar();
    }
}
```

## Clase interna local
- Se define dentro de un método
- Solo existe dentro de ese método

```java
package internalocal;

class Externa {
    void metodo() {

        class InternaLocal {
            void saludar() {
                System.out.println("Hola desde clase local");
            }
        }

        InternaLocal obj = new InternaLocal();
        obj.saludar();
    }
}

public class InternaLocal {
    public static void main(String[] args) {
       Externa ext = new Externa();
       ext.metodo();
    }
}
```

## Clase interna anónima
- No tiene nombre
- Se usa para implementar interfaces o clases abstractas

```java
package internaanonima;

interface Saludo {
    void decirHola();
}

public class InternaAnonima {
    public static void main(String[] args) {
    
        Saludo s = new Saludo() {
                        @Override
                        public void decirHola() {
                            System.out.println("Hola desde clase anónima");
                        }
                  };

        s.decirHola();   
    }   
}
```