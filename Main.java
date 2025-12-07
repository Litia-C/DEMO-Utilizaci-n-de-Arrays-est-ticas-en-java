import java.util.Scanner;

public class Main {
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

    public static void anadir(String[][] series) {
        Scanner sc = new Scanner(System.in);
        int fila_vacia = 0;

        for(int fila = 0; fila < series.length; fila++) {
            if(series[fila][0] == null) {
                fila_vacia = fila;
                break;
            }
        }

        System.out.println("Escribe el nombre de la series que quieres añadir: ");
        series[fila_vacia][0] = sc.next();
        System.out.println("Escribe la duración de la series en minutos: ");
        series[fila_vacia][1] = sc.next();
        System.out.println("Escribe la valoración de la serie: ");
        series[fila_vacia][2] = sc.next();
    }

    public static void quitar(String[][] series) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el nombre de la serie que quieres borrar: ");
        String nombre = sc.next();

        for(int row = 0; row < series.length; row++) {
            if(series[row][0].equals(nombre)) {
                series[row][0] = null;
                series[row][1] = null;
                series[row][2] = null;
                System.out.println(nombre + "Ha sido eleminada de la lista");
                break;
            }
            else if (row + 1 == series.length && !(series[row][0].equals(nombre))) {
                System.out.println("Esta serie no esta en la lista");
            }
        }
    }
}