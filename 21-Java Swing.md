# Interfaces gráficas en Java

## AWT vs Swing vs JavaFX

### AWT (Abstract Window Toolkit)

- Librería antigua.
- Usa componentes nativos del sistema operativo.
- Menos flexible.

### Swing

- Basado en AWT pero más avanzado.
- Componentes propios (no nativos).
- Más flexible y portable.

### JavaFX

- Más moderno que Swing.
- Mejor diseño visual (CSS, animaciones).
- Actualmente es la opción más moderna.
- JavaFX ya no viene dentro del JDK (desde Java 11 en adelante).
- Si quieres usar JavaFX tienes que instalarlo aparte, o añadirlo como una dependencia.

## Componentes de Swing

### Contenedores principales

- `JFrame` → ventana principal de la aplicación
- `JPanel` → contenedor para organizar componentes
- `JDialog` → ventana de diálogo (mensajes o formularios secundarios)
- `JInternalFrame` → ventana dentro de otra ventana (MDI)
- `JDesktopPane` → contenedor para múltiples JInternalFrame


### Componentes de entrada de texto

- `JTextField` → campo de texto de una sola línea
- `JPasswordField` → campo de texto para contraseñas
- `JTextArea` → área de texto multilínea
- `JFormattedTextField` → campo con formato (fechas, números, moneda)

### Botones y selección

- `JButton` → botón para ejecutar acciones
- `JCheckBox` → selección múltiple (activado/desactivado)
- `JRadioButton` → selección única dentro de un grupo
- `ButtonGroup` → agrupa JRadioButton

### Etiquetas y visualización

- `JLabel` → muestra texto o imágenes

### Listas y selección de datos

- `JList` → lista de elementos
- `JComboBox` → lista desplegable


### Tablas y estructuras

- `JTable` → tabla de datos
- `JTree` → estructura jerárquica en forma de árbol


### Controles avanzados

- `JSlider` → barra deslizante
- `JProgressBar` → barra de progreso
- `JSpinner` → selector incremental

### Menús y barras

- `JMenuBar` → barra de menú principal
- `JMenu` → menú desplegable
- `JMenuItem` → opción dentro de un menú
- `JToolBar` → barra de herramientas

### Paneles especiales

- `JScrollPane` → añade scroll a componentes
- `JLayeredPane` → permite trabajar con capas

### Documentación oficial (Java Swing)

- Swing package (general): https://docs.oracle.com/javase/8/docs/api/javax/swing/package-summary.html  
- JFrame: https://docs.oracle.com/javase/8/docs/api/javax/swing/JFrame.html  
- JPanel: https://docs.oracle.com/javase/8/docs/api/javax/swing/JPanel.html  
- JButton: https://docs.oracle.com/javase/8/docs/api/javax/swing/JButton.html  
- JLabel: https://docs.oracle.com/javase/8/docs/api/javax/swing/JLabel.html  
- JTextField: https://docs.oracle.com/javase/8/docs/api/javax/swing/JTextField.html  
- JTextArea: https://docs.oracle.com/javase/8/docs/api/javax/swing/JTextArea.html  
- JCheckBox: https://docs.oracle.com/javase/8/docs/api/javax/swing/JCheckBox.html  
- JRadioButton: https://docs.oracle.com/javase/8/docs/api/javax/swing/JRadioButton.html  
- JList: https://docs.oracle.com/javase/8/docs/api/javax/swing/JList.html  
- JComboBox: https://docs.oracle.com/javase/8/docs/api/javax/swing/JComboBox.html  
- JTable: https://docs.oracle.com/javase/8/docs/api/javax/swing/JTable.html  
- JTree: https://docs.oracle.com/javase/8/docs/api/javax/swing/JTree.html  
- JSlider: https://docs.oracle.com/javase/8/docs/api/javax/swing/JSlider.html  
- JProgressBar: https://docs.oracle.com/javase/8/docs/api/javax/swing/JProgressBar.html  
- JOptionPane: https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html  

## JFrame

### Descripción

Ventana principal que contiene todos los componentes.

### Métodos importantes

-   `setSize(w,h)`: define tamaño de la ventana
-   `setVisible(true/false)`: muestra u oculta la ventana
-   `setTitle(String)`: cambia el título
-   `setLayout(LayoutManager)`: organiza componentes
-   `add(Component)`: añade un componente
-   `setDefaultCloseOperation(int)`: define acción al cerrar
-   `pack()`: ajusta tamaño automáticamente

### Eventos

-   WindowEvent: abrir, cerrar, minimizar

### Ejemplo completo

``` java
package jframemain;

import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame {
    MyFrame() {
        setTitle("JFrame Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Cerrando ventana");
            }
        });

        setVisible(true);
    }
}

public class JFrameMain {
    public static void main(String[] args) {
        new MyFrame();
    }
}
```

##  JButton

### Descripción

Botón que ejecuta acciones al hacer clic.

### Métodos importantes

-   `setText(String)`: Cambia el texto que se muestra en el botón
-   `getText()`: Devuelve el texto actual del botón
-   `setEnabled(boolean)`: Activa (true) o desactiva (false) el botón
-   `addActionListener(ActionListener)`: Define la acción que se ejecuta cuando se hace clic

### Eventos

-   ActionEvent

### Ejemplo completo

``` java
package jbuttonmain;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class MyFrame extends JFrame {
    MyFrame() {
        setLayout(new FlowLayout());

        JButton b = new JButton("Click");

        b.addActionListener(e -> jButtonClicActionPerformed(e));
        /*
        b.addActionListener(this::jButtonClicActionPerformed);
         b.addActionListener(e -> {
            System.out.println("Botón pulsado");
        });
        */
        
        add(b);

        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    void jButtonClicActionPerformed(java.awt.event.ActionEvent e){
        System.out.println("Botón pulsado");
    }
}

public class JButtonMain {
    public static void main(String[] args) {
        new MyFrame();
    }
}  
```


## JTextField

### Descripción

Campo de texto de una sola línea.

### Métodos importantes

-   `setText(String)`: Establece el texto dentro del campo de texto
-   `getText()`: Devuelve el texto escrito por el usuario
-   `setColumns(int)`: Define el ancho visible del campo (número de columnas)
-   `setEditable(boolean)`: Permite o bloquea la edición del texto
-   `addActionListener(ActionListener)`: Ejecuta una acción cuando se pulsa Enter

### Eventos

-   ActionEvent
-   KeyEvent

### Ejemplo completo

``` java
package jtextfieldmain;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    MyFrame() {
        setLayout(new FlowLayout());

        JTextField tf = new JTextField(20);

        tf.addActionListener(e -> {
            System.out.println(tf.getText());
        });

        add(tf);

        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class JTextFieldMain {
    public static void main(String[] args) {
         new MyFrame();
    }
}
```

## JCheckBox

### Descripción

Selección múltiple.

### Métodos importantes

-   `setSelected(boolean)`: Marca (true) o desmarca (false) el checkbox
-   `isSelected()`: Devuelve si está marcado (true) o no (false)
-   `addActionListener(ActionListener)`: Ejecuta una acción cuando se cambia su estado

### Eventos

-   ActionEvent
-   ItemEvent

### Ejemplo

``` java
package jcheckboxmain;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    MyFrame() {
        setLayout(new FlowLayout());

        JCheckBox c = new JCheckBox("Aceptar");

        c.addItemListener(e -> {
            System.out.println(c.isSelected());
        });

        add(c);

        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class JCheckBoxMain {
    public static void main(String[] args) {
        new MyFrame();
    }   
}
```

## JRadioButton

### Descripción

Selección única dentro de un grupo.

### Métodos importantes

-   `setSelected(boolean)`: Marca o desmarca el botón de opción
-   `isSelected()`: Devuelve si el botón está seleccionado o no
-   `addActionListener(ActionListener)`: Ejecuta una acción cuando se selecciona el botón

### Eventos

-   ActionEvent

### Ejemplo

``` java
package jradiobuttonmain;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    MyFrame() {
        setLayout(new FlowLayout());

        JRadioButton r1 = new JRadioButton("A");
        JRadioButton r2 = new JRadioButton("B");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        r1.addActionListener(e -> System.out.println("A"));
        r2.addActionListener(e -> System.out.println("B"));

        add(r1);
        add(r2);

        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class JRadioButtonMain {
    public static void main(String[] args) {
        new MyFrame();
    }   
}
```

## JTextArea

### Descripción

Texto multilínea.

### Métodos importantes

-   `setText(String)`: Establece el texto completo del área
-   `getText()`: Devuelve todo el texto escrito
-   `append(String)`: Añade texto al final del contenido actual
-   `setLineWrap(boolean)`: Activa o desactiva el salto de línea automático

### Eventos

-   KeyEvent

### Ejemplo

``` java
package jtextareamain;

import javax.swing.*;

class MyFrame extends JFrame {
    MyFrame() {
        JTextArea ta = new JTextArea(5,20);

        ta.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
                System.out.println(ta.getText());
            }
        });

        add(new JScrollPane(ta));

        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class JTextAreaMain {
    public static void main(String[] args) {
        new MyFrame();
    }
}
```

## Mouse Events

### Eventos

-   MouseEvent

### Ejemplo

``` java
package mouse.events;

import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame {
    MyFrame() {
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getX() + "," + e.getY());
            }
        });

        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class MouseEvents {
    public static void main(String[] args) {
        new MyFrame();
    }
}
```

## Color y Font en Java (Swing)

### Color

La clase `Color` se usa para definir y aplicar colores en componentes gráficos o en dibujos.

Permite:

- Usar colores predefinidos como `Color.RED`, `Color.BLUE`
- Crear colores personalizados con `new Color(r, g, b)`

Método principal:

- `setColor(Color c)` // Establece el color con el que se dibuja o pinta

### Font

La clase `Font` se usa para definir el estilo del texto en la interfaz gráfica.

Permite definir:

- Tipo de letra (ej: Arial, Times New Roman)
- Estilo (PLAIN, BOLD, ITALIC)
- Tamaño

Método principal:

- `setFont(Font f)` // Cambia el tipo de letra del texto

Ejemplo de creación:

- `new Font("Arial", Font.BOLD, 20)`


##  Eventos en Java

### ¿Qué es un evento?

Un evento es una acción que ocurre cuando el usuario interactúa con la interfaz.

### Ejemplos

- Click en un botón
- Escribir en un campo de texto
- Mover el ratón
- Cerrar una ventana

### ¿Cuándo se genera un evento?

- El usuario hace una acción (click, teclado, mouse)
- El sistema detecta el cambio
- Java crea un objeto Event (ej: `ActionEvent`)

### Ejemplo

Pulsas un botón → se crea un ActionEvent

## Modelo de delegación de eventos

### ¿Qué es?

Es el sistema que usa Java para manejar eventos.

### Idea clave

- El componente NO ejecuta la lógica
- Solo genera el evento
- El listener lo maneja

### Funcionamiento

- Un componente genera un evento (ej: `JButton`)
- El evento se crea (`ActionEvent`)
- Un listener lo recibe (`ActionListener`)
- El listener ejecuta el código

### Estructura

- Source (Fuente) → componente
- Event (Evento) → acción ocurrida
- Listener (Escuchador) → quien responde
