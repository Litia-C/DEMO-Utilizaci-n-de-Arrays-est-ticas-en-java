import java.util.Scanner;

public class Main {
    String[][] series = new String[1][1];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] series = new String[30][3]; // En cada fila hay tres columnas: la 1a con los nombres de las series, la 2a con la duración en minutos y la 3a con la valoración

        System.out.println("Bienvenido al selector de series\n");
        System.out.println("¿Que quieres hacer?");
        System.out.println("1. Ver lista de series");
        System.out.println("2. Añadir series");
        System.out.println("3. Quitar series");
        System.out.println("4. Salir del programa");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                mostrar();
                break;
            case 2:
                añadir();
                break;
            case 3:
                quitar();
                break;
            default:
                break;
        }
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
