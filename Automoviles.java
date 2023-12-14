/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesyObjetos;

/**
 *
 * @author marco
 */
public class Automoviles {
   //atributos
    public String color; 
    public String marca;
    public String modelo;
    private int precio;
    
    public static void main(String [] args){
        Automoviles carro= new Automoviles();
        
        carro.color = "amarillo";
        carro.marca = "chevrolet";
        carro.modelo = "camaro";
        carro.precio = 1000;
        
        System.out.println("el color es: "+carro.color);
        System.out.println("la marca es: "+carro.marca);
        System.out.println("el modelo es: "+carro.modelo);
        System.out.println("el precio es: "+carro.precio);
        
        
        Automoviles moto= new Automoviles();
        
        moto.color = "violeta";
        moto.marca = "KTM";
        moto.modelo= "duke";
        moto.precio = 2000;
        
        System.out.println("el color es: "+moto.color);
        System.out.println("la marca es: "+moto.marca);
        System.out.println("el modelo es: "+moto.modelo);
        System.out.println("el precio es: "+moto.precio);
        
        //metodos
        public void abrirPuertas(){
        System.out.println("Puertas abiertas");
    
        public void encender(){
            System.out.ln("moto encendida");
        }
                
    }
}
