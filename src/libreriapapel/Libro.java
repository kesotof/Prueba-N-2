/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreriapapel;


abstract class Libro {
    protected String titulo;
    protected int paginas;
    protected double precio;

    public Libro() {
    }

    public Libro(String titulo, int paginas, double precio) {
        this.titulo = titulo;
        this.paginas = paginas;
        
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        
        this.paginas = paginas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", paginas=" + paginas + ", precio=" + precio + '}';
    }
    
    
    abstract void vizualizar();
    
    
}
