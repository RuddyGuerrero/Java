
# Instalación de Java y primer archivo

## 1. Descargar e instalar el JDK

El **JDK (Java Development Kit)** es el paquete necesario para **desarrollar programas en Java**.

Incluye:

- Herramientas de desarrollo (por ejemplo `javac`, el compilador)
- **JRE (Java Runtime Environment)**

Dentro del JRE se encuentran:

- **Java Class Library**
- **JVM (Java Virtual Machine)**

### Estructura de Java

```
JDK (Java Development Kit)
 ├─ Development Tools
 │    └─ javac, debugger, herramientas de desarrollo
 │
 └─ JRE (Java Runtime Environment)
       ├─ Java Class Library
       └─ JVM (Java Virtual Machine)
```

# 2. Descargar el JDK

1. Ir a la página oficial de Java:  https://www.oracle.com/java/technologies/downloads/

2. Buscar **Java SE Development Kit**.

3. Descargar la versión correspondiente al sistema operativo.

Ejemplo para Windows:

```
jdk-25_windows-x64_bin.exe
```

# 3. Instalar el JDK

1. Ejecutar el archivo descargado.
2. Pulsar **Next**.
3. Pulsar **Install**.
4. Esperar a que termine la instalación.
5. Pulsar **Closed**.

# 4. Dónde se instala el JDK

Todas las versiones instaladas normalmente aparecen en:

```
This PC
   └── C:
        └── Program Files
             └── Java
```

Ejemplo:

```
C:\Program Files\Java\jdk-25.0.2
```

Si instalamos varias versiones veremos algo así:

```
C:\Program Files\Java\jdk-25
C:\Program Files\Java\jdk-23
C:\Program Files\Java\jdk-11
```

# 5. Comprobar que Java funciona

1. Presionar:

```
Windows + R
```

2. Escribir:

```
cmd
```

3. En la consola escribir:

```
javac -version
```

Resultado esperado:

```
javac 23
```

# 6. Si Java no funciona (PATH del sistema)

Si el comando `javac` no funciona, puede que **Java no esté en el PATH del sistema**.

En ese caso hay que añadir la ruta del JDK.

Ejemplo de ruta:

```
C:\Program Files\Java\jdk-23\bin
```

Pasos:

1. Buscar **Editar las variables de entorno del sistema**.
2. Abrir **Variables de entorno**.
3. Editar la variable **Path**.
4. Añadir la ruta:

```
C:\Program Files\Java\jdk-25.0.2\bin
```

5. Guardar y volver a abrir la consola.

