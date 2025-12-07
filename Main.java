import java.util.Scanner;

public class Main {
    String[][] series = new String[1][1];
    public static void main(String[] args) {
        System.out.println("Bienvenido al selector de series\n");
        System.out.println("¿Que quieres hacer?");
        System.out.println("1. Ver lista de series");
        System.out.println("2. Añadir series");
        System.out.println("3. Quitar series");
        System.out.println("4. Salir del programa");
    }


    public static String mostrar(String[][] series){
        
        for (int i = 0; i < series.lenght; i++){
            for (int j = 0; j < series[i].lenght; j++){
                System.out.print(series[i][j]);
            }
            System.out.println();
        }
    }

}
