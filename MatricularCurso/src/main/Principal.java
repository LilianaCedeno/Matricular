package main;
import java.util.*;
import clases.*;


public class Principal {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int op;
		Curso c = new Curso();
		ArrayList<Curso> cursos= c.CursosListos();
		
        do {
            System.out.println("Centro de Estudios Integrales");
            System.out.println("-----------------------------");
            System.out.println("1: Ver lista de Cursos Disponibles.");
            System.out.println("2: Matricular Nuevo Alumno.");
            System.out.println("3: Ingresar Nuevo curso.");
            System.out.println("4: Asignar Curso");
            System.out.println("5: Ver Lista alumnos por curso.");
            System.out.println("6: Salir.");
            System.out.println("Digite la opción: ");
            System.out.println("-----------------------------");
            op = leer.nextInt();
            leer.nextLine();  
            switch (op) {
                case 1:
                	System.out.println(" Lista de Cursos Disponibles.");
                	 cursos.toString();
                	
                	
                    break;
                case 2:
                   
                    break;
                case 3:
                   
                    break;
                case 4:
                    
                    break;
                case 5:
                   
                    break;
                case 6:
                	System.out.println("---------------------");
                     System.out.println("Saliendo del Sistema");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (op != 6);
		
		
		
	}
}
