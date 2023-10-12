/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreriapapel;

import java.util.ArrayList;


public class Registro {
    
    private ArrayList <Libro> listaLibro;

    public Registro() {
        listaLibro = new ArrayList<>();
    }
    
    public boolean agregarLibro(Libro lib){
        return listaLibro.add(lib);
    }
    
    public void listaLibro(){
        for (Libro lib : listaLibro){
            System.out.println(lib);
        }
    }
    
    public void eliminarLibro(String titulo){
        for (Libro lib : listaLibro){
            if (lib.getTitulo().equalsIgnoreCase(titulo)){
                listaLibro.remove(lib);
            }
        }
    }
    
    public boolean buscarLibro(String titulo){
        for (Libro lib : listaLibro){
            if (lib.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("Libro existe");
            } else{
                System.out.println("Libro no existe");
            }
        }
        return false;
    }
    
}
