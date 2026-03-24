package estudiantetest;

class Estudiante{

    private int numero;
    private String nombre;
    private String curso;
    private int nota1, nota2, nota3;

    // Constructor por defecto
    public Estudiante(){
        numero = 0;
        nombre = "";
        curso = "";
        nota1 = nota2 = nota3 = 0;
    }

    // Constructor con parámetros
    public Estudiante(int numero, String nombre, String curso, int n1, int n2, int n3){
        this.numero = numero;
        this.nombre = nombre;
        this.curso = curso;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
    }

    // Getters
    public int getNumero(){
        return numero;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCurso(){
        return curso;
    }

    public int getNota1(){
        return nota1;
    }

    public int getNota2(){
        return nota2;
    }

    public int getNota3(){
        return nota3;
    }

    // Setters
    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public void setNota1(int n1){
        nota1 = n1;
    }

    public void setNota2(int n2){
        nota2 = n2;
    }

    public void setNota3(int n3){
        nota3 = n3;
    }

    // Métodos propios
    public int total(){
        return nota1 + nota2 + nota3;
    }

    public float promedio(){
        return (float)total() / 3;
    }

    public char calificacion(){
        if(promedio() >= 60)
            return 'A';
        else
            return 'B';
    }

    public String toString(){
        return "Numero: " + numero + "\n" +
               "Nombre: " + nombre + "\n" +
               "Curso: " + curso + "\n";
    }
}

public class EstudianteTest{
    public static void main(String[] args){
        Estudiante s = new Estudiante();

        s.setNumero(1);
        s.setNombre("John");
        s.setCurso("CS");
        s.setNota1(70);
        s.setNota2(80);
        s.setNota3(65);

        System.out.println("Total: " + s.total());
        System.out.println("Promedio: " + s.promedio());
        System.out.println("Detalles:\n" + s); // Para imprimir un objeto hay que implementar el metodo toString
    }
}