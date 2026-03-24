package cilindrotest;

class Cilindro{
    private int radio;
    private int altura;
    
    // Constructor por defecto
    public Cilindro(){
        radio = altura = 1;
    }
    
    // Constructor con parámetros
    public Cilindro(int r, int h){
        radio = r;
        altura = h;
    }
    
    // Getters
    public int getAltura(){
        return altura;
    }
    
    public int getRadio(){
        return radio;
    }
    
    // Setters
    public void setAltura(int h){
        if(h >= 0)
            altura = h;
        else
            altura = 0;
    }
    
    public void setRadio(int r){
        if(r >= 0)
            radio = r;
        else
            radio = 0;
    }
    
    // Métodos propios
    public double areaBase(){
        return Math.PI * radio * radio;
    }
    
    public double perimetroBase(){
        return 2 * Math.PI * radio;
    }
    
    public double areaTotal(){
        return 2 * areaBase() + perimetroBase() * altura;
    }
    
    public double volumen(){
        return areaBase() * altura;
    }
}

public class CilindroTest {

    public static void main(String[] args){
        Cilindro c1 = new Cilindro();
        c1.setAltura(10);
        c1.setRadio(7);
        System.out.println("Area base: " + c1.areaBase());
        System.out.println("Perimetro base: " + c1.perimetroBase());
        System.out.println("Area total: " + c1.areaTotal());
        System.out.println("Volumen: " + c1.volumen());
        System.out.println("Altura: " + c1.getAltura());
        System.out.println("Radio: " + c1.getRadio());
        
        Cilindro c2 = new Cilindro(5, 10);
        System.out.println("Area base: " + c2.areaBase());
        System.out.println("Perimetro base: " + c2.perimetroBase());
        System.out.println("Area total: " + c2.areaTotal());
        System.out.println("Volumen: " + c2.volumen());
        System.out.println("Altura: " + c2.getAltura());
        System.out.println("Radio: " + c2.getRadio());
    }
}