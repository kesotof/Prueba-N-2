/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreriapapel;

public class Infantil extends Libro {
    
    private int edad;

    public Infantil() {
        super();
    }

    public Infantil(int edad, String titulo, int paginas, double precio) {
        super(titulo, paginas, precio);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    @Override
    public String toString() {
        return "Infantil{" + "edad=" + edad + '}' + super.toString();
    } 

    @Override
    void vizualizar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
