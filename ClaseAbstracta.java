import java.util.Scanner;

package Deber;

public class ClaseAbstracta {

    public static void main(String[] args) {
    }
    public abstract class Persona {
    
    public String nombre;
    public int edad;
    protected int cedula;

    public void comer(){
        System.out.println(nombre + "esta comiendo");
    }
    public void dormir(){
        System.out.println(nombre + "esta durmiendo");
    }
}
public class Cuidador extends Deber.Persona {
    
    public int N_ID;
    public String Alimentar_animales;
}
public class Visitante extends Deber.Persona {
    
    public int n_carnet;
    public int comprar;
}
public abstract class Zoo {
    
    public String nombre;
    public int edad;
    private int registro;

    public void comer(){
        System.out.println(nombre + "esta comiendo");
    }
    public void dormir(){
        System.out.println(nombre + "esta durmiendo");
    }
}
public class Leon extends Deber.Zoo {
    
    public int vacuna;
    
    public void rugir(){
        System.out.println(nombre + "esta rugiendo");
    }
    public void cazar(){
        System.out.println(nombre + "esta cazando");
    }
}
public class Pinguino extends Deber.Zoo {
    
    public void nadar(){
        System.out.println(nombre + "esta nadando");
    }
    public void pescar(){
        System.out.println(nombre + "esta pescando");
        }
    }
}