# Java Swing con NetBeans

## Introducción

NetBeans permite crear interfaces gráficas usando el GUI Builder (Design), donde los componentes se arrastran visualmente en lugar de escribir todo el código manualmente.

## Concepto clave: Design vs Código

### Design (interfaz visual)

- Se crean componentes arrastrando y soltando.
- Se configuran propiedades desde el IDE.
- NetBeans genera el código automáticamente.

### Código (backend)

- Contiene la lógica del programa.
- No se recomienda modificar el código generado por el GUI Builder.

Importante:

- No modificar la sección:
  - Variables declaration - do not modify


## Estructura básica en NetBeans

Toda ventana Swing creada en NetBeans sigue esta estructura:

- La clase principal extiende javax.swing.JFrame
- Se crea un constructor
- Dentro del constructor se llama a `initComponents()`
    - `initComponents()` es el método generado automáticamente que crea la interfaz.

## Propiedades importantes

Cada componente tiene propiedades configurables:

- text → texto visible
- enabled → habilitar o deshabilitar el componente
- editable → permitir escritura (solo `JTextField`)
- font → tipo de letra
- background / foreground → colores

## Eventos en NetBeans

Los eventos se crean desde el IDE:

Proceso:

1. Click derecho en el componente
2. Ir a la opción Events
3. Seleccionar el tipo de evento (por ejemplo `actionPerformed`)

Ejemplo de evento generado:

Cuando se pulsa un botón, NetBeans crea automáticamente un método asociado al evento.

Eventos más importantes:

- `ActionEvent` → botones
- `KeyEvent` → teclado
- `MouseEvent` → ratón
- `ItemEvent` → `JCheckBox` y `JRadioButton`

## Buenas prácticas

- Renombrar los componentes (evitar nombres como `jButton1` o `jTextField1`)
  - Ejemplo: `btnEnviar`, `txtNombre`
- No escribir lógica compleja dentro del evento
- Separar la lógica en métodos independientes
- Validar siempre los datos de entrada

## Errores comunes

- Modificar código generado por NetBeans
- No renombrar los componentes
- Poner toda la lógica dentro del evento
- No validar entradas de usuario
- No entender qué parte genera el IDE automáticamente

## Resumen final

- NetBeans permite crear interfaces gráficas de forma visual
- El código se genera automáticamente
- Los eventos se crean desde el IDE
- La lógica debe separarse de la interfaz
- Es fundamental usar nombres claros en los componentes