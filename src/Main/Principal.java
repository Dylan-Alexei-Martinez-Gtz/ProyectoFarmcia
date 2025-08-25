package Main;

import java.util.Scanner;

import Dominio.Medicamentos;
import Implementacion.LogicaMetodos;

public class Principal {

    public static void main(String[] args) {

        Scanner lectura = null;

        String nombreMedi;
        String marcaMedi;
        float precioMedi;
        boolean recetaMedi;

        Medicamentos medicamento = null;

        int menuPrinc;

        LogicaMetodos imp = new LogicaMetodos();

        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1.- ALTA");
            System.out.println("2.- MOSTRAR");
            System.out.println("3.- BUSCAR");
            System.out.println("4.- EDITAR");
            System.out.println("5.- ELIMINAR");
            System.out.println("6.- SALIR");

            lectura = new Scanner(System.in);
            menuPrinc = lectura.nextInt();

            switch (menuPrinc) {
                case 1:
                    try {
                        System.out.println("Ingrese el nombre");
                        lectura = new Scanner(System.in);
                        nombreMedi = lectura.nextLine();

                        System.out.println("Ingrese la marca");
                        lectura = new Scanner(System.in);
                        marcaMedi = lectura.nextLine();

                        System.out.println("Ingrese el precio");
                        lectura = new Scanner(System.in);
                        precioMedi = lectura.nextFloat();

                        System.out.println("Es con receta medica? true o false");
                        lectura = new Scanner(System.in);
                        recetaMedi = lectura.nextBoolean();

                        // CREACION DEL OBJETO
                        medicamento = new Medicamentos(nombreMedi, marcaMedi, precioMedi, recetaMedi);

                        // AGREGAR AL HASHMAP
                        imp.guardar(medicamento);
                        System.out.println("Se guardó correctamente");

                    } catch (Exception e) {
                        System.out.println("Error al guardar");
                    }
                    break;

                case 2:
                    imp.mostrar();
                    break;

                case 3:
                	System.out.println("Ingrese el nombre del medicamento a buscar");
                	lectura = new Scanner(System.in);
                	nombreMedi = lectura.nextLine();
                    
                    break;

                case 4:
                	System.out.println("Ingrese el nombre del medicamento a editar");
                	lectura =  new Scanner (System.in);
                	nombreMedi = lectura.nextLine();
                	
                	//BUSCAR 
                	medicamento = imp.buscar(nombreMedi);
                	System.out.println("Se encontro el medicamento" + medicamento.getNombre());
                	
                	//EDITAR RECETA 
                	System.out.println("Ingrese si lleva receta o no: true o false");
                	lectura = new Scanner(System.in);
                	recetaMedi = lectura.nextBoolean();
                    
                	//ACTUALIZA EL OBJETO
                	medicamento.setReceta(recetaMedi);
                	
                	//ACTUALIZA EL HASHMAP
                	imp.editar(medicamento);
                	System.out.println("Se edito");
                	
                    break;

                case 5:
                	
                	System.out.println("Ingrese el nombre");
                	lectura = new Scanner(System.in);
                	nombreMedi = lectura.nextLine();
                	
                	//ELIMINAR 
                	imp.eliminar(nombreMedi);
                	System.out.println("Se elimino con exito");
                	                    
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;
            }

        } while (menuPrinc < 6);
    }
}

