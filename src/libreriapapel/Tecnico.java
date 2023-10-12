/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreriapapel;

public class Tecnico extends Libro {
    
    private char material;

    public Tecnico() {
        super();
    }

    public Tecnico(char material, String titulo, int paginas, double precio) {
        super(titulo, paginas, precio);
        this.material = material;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "material=" + material + '}' + super.toString();
    }

    @Override
    void vizualizar() {
        System.out.println("");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
            
}
