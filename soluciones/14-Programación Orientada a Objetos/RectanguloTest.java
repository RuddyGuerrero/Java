package rectangulotest;

class Rectangulo{
    
    // Propiedades
    private double largo;
    private double ancho;
    
    // Contructor
    public Rectangulo(double l, double a){
        largo = l;
        ancho = a;
    }
    
     // Getter y Setter de largo
    public double getLargo(){
        return largo;
    }
    
    public void setLargo(double largo){
        this.largo = largo;
    }
    
    // Getter y Setter de ancho
    public double getAncho(){
        return ancho;
    }
    
    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    
    // metodos
    public double area(){ 
        return largo * ancho;
    }
    
    public double perimetro(){
        return 2 * (largo + ancho);
    }
    
    public boolean esCuadrado(){
        return largo == ancho;
    }
}

public class RectanguloTest {
    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo(10.5, 5.5);
        Rectangulo r2 = new Rectangulo(5, 5);
        
        System.out.println("Area: " + r1.area());
        System.out.println("Perimetro: " + r1.perimetro());
        System.out.println("Es un cuadrado: " + r1.esCuadrado());
        
        System.out.println("Area: " + r2.area());
        System.out.println("Perimetro: " + r2.perimetro());
        System.out.println("Es un cuadrado: " + r2.esCuadrado());
    }
}