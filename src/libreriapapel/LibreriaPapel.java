/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreriapapel;

import java.util.Scanner;

/**
 *
 * @author vina
 */
public class LibreriaPapel {

    public static void main(String[] args) {
        
        Infantil infantil = new Infantil (10, "El Principito", 250, 9990);
        Tecnico tecnico = new Tecnico('C', "Java", 600, 39990);
        
        Registro reg = new Registro();
        
        
        
        reg.agregarLibro(tecnico);
        reg.agregarLibro(infantil);
        reg.listaLibro();
        
        
        Tecnico tecni = new Tecnico();   
        Infantil infan =new Infantil();
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        int edad = 0;
        String titulo = "";
        int paginas = 0;
        double precio = 0;
        do{
            System.out.println("1- Agregar libro infantil");
            System.out.println("2- Agregar libro tecnico");
            System.out.println("3- Mostrar informacion");
            System.out.println("4- Eliminar libro");
            System.out.println("5- Salir");
            opcion = leer.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("Ingrese edad: ");
                    edad = leer.nextInt();
                    System.out.println("Ingrese titulo: ");
                    titulo = leer.next();
                    System.out.println("Ingrese paginas: ");
                    paginas = leer.nextInt();
                    System.out.println("Ingrese precio: ");
                    precio = leer.nextDouble();
                    reg.agregarLibro(infan);
                    break;
                case 2:
                    System.out.println("Ingrese edad: ");
                    edad = leer.nextInt();
                    System.out.println("Ingrese titulo: ");
                    titulo = leer.next();
                    System.out.println("Ingrese paginas: ");
                    paginas = leer.nextInt();
                    System.out.println("Ingrese precio: ");
                    precio = leer.nextDouble();
                    reg.agregarLibro(tecni);
                    break;
                case 3:
                    reg.listaLibro();
                    break;
                case 4:
                    System.out.println("Ingrese libro para eliminar: ");
                    titulo = leer.next();
                    if (reg.buscarLibro( infantil.getTitulo())){
                        reg.eliminarLibro(titulo);
                    }break;
                case 5:
                    System.out.println("Esta saliendo!");                                       
            }
            
        }while (opcion != 5);
    }
    
}
