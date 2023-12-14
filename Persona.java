/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ClasesyObjetos;

/**
 *
 * @author marco
 */
public class Persona {
    
    public String nombre;
    public int cedula;
    public int edad;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //metodos
    public void leerNombre (){
        nombre = Integer.parseInt(JOptionPane.showInputDialog("escriba su nombre: "));
        cedula = Integer.parseInt(JOptionPane.showInputDialog("escriba su numero de cedula: "));
        edad = Integer.parseInt(JOptionPane.showInputDialog("escriba su edad: "));
    }     
   }
    
}
