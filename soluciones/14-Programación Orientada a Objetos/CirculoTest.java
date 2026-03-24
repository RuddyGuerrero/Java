class Circulo{

    public double radio; // Esto rompe el encapsulamiento. En Java, lo correcto hacer las propiedades private.
    
    // Falta el constructor

    // Faltan los metodos getters/setters
    
    public double area(){
        return Math.PI*radio*radio;
    }
    
    public double perimetro(){
        return 2*Math.PI*radio;
    }
}

public class CirculoTest {
    public static void main(String[] args) {
        
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo();
        
        c1.radio = 7;
        c2.radio = 15;
        
        System.out.println("Area:" + c1.area());
        System.out.println("Perimeter:" + c1.perimetro());
        
        System.out.println("Area:" + c2.area());
        System.out.println("Perimeter:" + c2.perimetro());
    }   
}