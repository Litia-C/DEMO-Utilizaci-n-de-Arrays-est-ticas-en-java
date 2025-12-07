import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //String[][] series = new String[30][3];

            //SERIES PREDETERMINADAS
            String[][] series = 
            {{"null", "null", "null"},
            {"C Serie", "12", "3"},
            {"B serie", "50", "4"}};
            

        Scanner sc = new Scanner(System.in);
    
        // En cada fila hay tres columnas: la 1a con los nombres de las series, la 2a con la duración en minutos y la 3a con la valoración
        System.out.println("Bienvenido al selector de series\n");
        System.out.println("¿Que quieres hacer?");
        System.out.println("1. Ver lista de series");
        System.out.println("2. Añadir series");
        System.out.println("3. Quitar series");
        System.out.println("4. Salir del programa");
    
       int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                mostrar(series);
                break;
            case 2:
                //anadir(series);
                break;
            case 3:
                //quitar(series);
                break;
            default:
                break;
        }
    }


    // Función para mostrar la lista
    public static void  mostrar (String[][] series){
        Scanner sc = new Scanner(System.in);

        System.out.println("¿De qué forma quieres ver la lista?");
        System.out.println("1. Ver la lista sin cambios");
        System.out.println("2. Aplicar filtros");

        int opcion = sc.nextInt();
        switch (opcion) {
                    // Mostrar lista sin alterar
            case 1:
                    for (int i = 0; i < series.length; i++){
                        for (int j = 0; j < series[i].length; j++){
                            if (!series[i][2].equals("null")){
                            System.out.print(series[i][j] + " ");
                            }
            }
                            if (!series[i][2].equals("null")){
                            System.out.println();
                            }
        }
            break;
                    // FILTROS
            case 2: 
            
        System.out.println("¿Qué filtro quieres aplicar?");
        System.out.println("1. Ordenar por nombre");
        System.out.println("2. Ordenar por duración");
        System.out.println("3. Ordenar por valoración");
        
        int opcion2 = sc.nextInt();

                    switch (opcion2) {

                        case 1:
                        // Esto ayuda a ordenar filas o columnas en una array2D comparando dos elementos...
                    Arrays.sort(series, (a, b) -> a[0].compareTo(b[0]));

                        // Bucle para mostrar las filas ordenadas por nombre :)
                        for (int i = 0; i < series.length; i++){
                            for (int j = 0; j < series[i].length; j++){
                                if (!series[i][2].equals("null")){
                                    System.out.print(series[i][j] + " ");
                                }
                                }
                                if (!series[i][2].equals("null")){
                                    System.out.println();
                                }
                    }

                    break;

                        case 2:
                        // Esto ayuda a ordenar filas o columnas en una array2D comparando dos elementos...
                    Arrays.sort(series, (a, b) -> a[1].compareTo(b[1]));

                        // Bucle para mostrar las filas ordenadas por duración... aunque sea una String
                        for (int i = 0; i < series.length; i++){
                            for (int j = 0; j < series[i].length; j++){
                                if (!series[i][2].equals("null")){
                                    System.out.print(series[i][j] + " ");
                                }
                                }
                                if (!series[i][2].equals("null")){
                                    System.out.println();
                                }
                    }

                    break;
                        case 3:
                        // Esto ayuda a ordenar filas o columnas en una array2D comparando dos elementos...
                    Arrays.sort(series, (a, b) -> b[2].compareTo(a[2]));

                        // Bucle para mostrar las filas ordenadas por valoración, una vez más aunque sea una Stringa
                        for (int i = 0; i < series.length; i++){
                            for (int j = 0; j < series[i].length; j++){
                                if (!(series[i][2].equals("null"))){
                                    System.out.print(series[i][j] + " ");
                                }
                                }
                                if (!(series[i][2].equals("null"))){
                                    System.out.println();
                    }
                    }
                    
                    break;
    }


        }

        
    }
}


