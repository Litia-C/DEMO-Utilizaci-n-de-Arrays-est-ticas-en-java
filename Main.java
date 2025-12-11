import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // String[][] series = new String[30][3];

        // SERIES PREDETERMINADAS
        String[][] series = { { "Breaking Bad", "2293 Min", "5/5" },
                { "Jojo's Bizzarre Adventure: Stone Ocean", "0937 Min", "3/5" },
                { "Milya Broken", "0253 Min", "1/5" },
                { "I cannot Drown", "0665 Min", "4/5" },
                { ".flow", "0663 Min", "0/5" },
                { "null", "null", "null" },
                { "null", "null", "null" },
                { "null", "null", "null" },
                { "null", "null", "null" },
                { "null", "null", "null" },
                { "null", "null", "null" },
                { "null", "null", "null" },
                { "null", "null", "null" },
                { "null", "null", "null" },
                { "null", "null", "null" },
                { "null", "null", "null" },
                { "null", "null", "null" },
                { "null", "null", "null" },
                { "null", "null", "null" },
                { "null", "null", "null" }, };

        Scanner sc = new Scanner(System.in);
        int opcion1 = 1, opcion2 = 1;

        // En cada fila hay tres columnas: la 1a con los nombres de las series, la 2a
        // con la duración en minutos y la 3a con la valoración
        do {
            System.out.println("\nBienvenido al selector de series");

            do {
                if (opcion1 < 1 || opcion1 > 4) System.out.println("\nLa opcion escigida no existe. Escoge otra vez:");
                
                System.out.println("\n¿Que quieres hacer?");
                System.out.println("1. Ver lista de series");
                System.out.println("2. Añadir series");
                System.out.println("3. Quitar series");
                System.out.println("4. Salir del programa");

                opcion1 = sc.nextInt();
                
            } while (opcion1 < 1 || opcion1 > 4);

            if (opcion1 == 4)
                break;

            switch (opcion1) {
                case 1:
                    mostrar(series);
                    break;
                case 2:
                    anadir(series);
                    break;
                case 3:
                    quitar(series);
                    break;
                default:
                    break;
            }

            do {
                if (opcion2 < 1 || opcion2 > 2) System.out.println("\nLa opcion escigida no existe. Escoge otra vez:\n");
                
                System.out.println("\n¿Que quieres hacer?");
                System.out.println("1. Reiniciar");
                System.out.println("2. Salir");

                opcion2 = sc.nextInt();
                
            } while (opcion2 < 1 || opcion2 > 2);

        } while (opcion2 != 2);

        System.out.println("\nGracias por usar este programa. Hasta la proxima");
    }

    public static void anadir(String[][] series) {
        Scanner sc = new Scanner(System.in);
        boolean espacio_lista = true;
        int fila_vacia = 0;

        for (int fila = 0; fila < series.length; fila++) {
            if (series[fila][0].equals("null")) {
                fila_vacia = fila;
                break;
            }
            if (fila + 1 == series.length && !(series[fila][0].equals("null")))
                espacio_lista = false;
        }

        if (espacio_lista) {
            System.out.println("\nEscribe el nombre de la series que quieres añadir: ");
            series[fila_vacia][0] = sc.nextLine();
            System.out.println("Escribe la duración de la series en minutos con 4 dígitos (xxxx Min): ");
            series[fila_vacia][1] = sc.nextLine();
            System.out.println("Escribe la valoración de la serie (x/5): ");
            series[fila_vacia][2] = sc.nextLine();
        } else {
            System.out.println("\nLa lista esta llena. Para añadir una serie, antes tienes que eliminar una");
        }
    }

    public static void quitar(String[][] series) {
        Scanner sc = new Scanner(System.in);
        boolean existe_serie = false;
        int respuesta = 1;

        do {
            System.out.println("\nEscribe el nombre de la serie que quieres borrar: ");
            String nombre = sc.nextLine();

            for (int row = 0; row < series.length; row++) {
                if (series[row][0].equals(nombre)) {
                    series[row][0] = "null";
                    series[row][1] = "null";
                    series[row][2] = "null";
                    System.out.println(nombre + " Ha sido eleminada de la lista\n");
                    existe_serie = true;
                    break;
                }
            }

            if (!existe_serie) {
                System.out.println(nombre + " no esta en la lista\n");
                do {
                    if (respuesta < 1 || respuesta > 2)
                        System.out.println("\nError\n");

                    System.out.println("¿Quieres volver a intentar eliminar una serie?");
                    System.out.println("1. Si");
                    System.out.println("2. NO");
                    respuesta = sc.nextInt();
                    sc.nextLine();
                } while (respuesta < 1 || respuesta > 2);
            }
        } while (respuesta == 1 && !existe_serie);
    }

    // Función para mostrar la lista
    public static void mostrar(String[][] series) {
        Scanner sc = new Scanner(System.in);
        int opcion = 1, opcion2 = 1;

        do {
            if (opcion < 1 || opcion > 2)
                System.out.println("\nError\n");

            System.out.println("\n¿De qué forma quieres ver la lista?");
            System.out.println("1. Ver la lista sin cambios");
            System.out.println("2. Aplicar filtros");

            opcion = sc.nextInt();

        } while (opcion < 1 || opcion > 2);

        switch (opcion) {
            // Mostrar lista sin alterar
            case 1:
                System.out.println();
                for (int i = 0; i < series.length; i++) {
                    for (int j = 0; j < series[i].length; j++) {
                        if (!series[i][2].equals("null")) {
                            System.out.print(series[i][j] + " ");
                        }
                    }
                    if (!series[i][2].equals("null")) {
                        System.out.println();
                    }
                }
                break;
            // FILTROS
            case 2:

                do {
                    if (opcion2 < 1 || opcion2 > 3)
                        System.out.println("\nError\n");

                    System.out.println("\n¿Qué filtro quieres aplicar?");
                    System.out.println("1. Ordenar por nombre");
                    System.out.println("2. Ordenar por duración");
                    System.out.println("3. Ordenar por valoración");

                    opcion2 = sc.nextInt();

                } while (opcion2 < 1 || opcion2 > 3);

                switch (opcion2) {

                    case 1:
                        System.out.println();
                        filtro_nombre(series);
                        break;
                    case 2:
                        System.out.println();
                        filtro_duracion(series);
                        break;
                    case 3:
                        System.out.println();
                        filtro_valoracion(series);
                        break;
                }

        }

    }

    public static void filtro_nombre(String[][] series) {
        // Esto ayuda a ordenar filas o columnas en una array2D comparando dos
        // elementos...
        Arrays.sort(series, (a, b) -> a[0].compareTo(b[0]));

        // Bucle para mostrar las filas ordenadas por nombre :)
        for (int i = 0; i < series.length; i++) {
            for (int j = 0; j < series[i].length; j++) {
                if (!series[i][2].equals("null")) {
                    System.out.print(series[i][j] + " ");
                }
            }
            if (!series[i][2].equals("null")) {
                System.out.println();
            }
        }
    }

    public static void filtro_duracion(String[][] series) {
        // Esto ayuda a ordenar filas o columnas en una array2D comparando dos
        // elementos...
        Arrays.sort(series, (a, b) -> a[1].compareTo(b[1]));

        // Bucle para mostrar las filas ordenadas por duración... aunque sea una String
        for (int i = 0; i < series.length; i++) {
            for (int j = 0; j < series[i].length; j++) {
                if (!series[i][2].equals("null")) {
                    System.out.print(series[i][j] + " ");
                }
            }
            if (!series[i][2].equals("null")) {
                System.out.println();
            }
        }
    }

    public static void filtro_valoracion(String[][] series) {
        // Esto ayuda a ordenar filas o columnas en una array2D comparando dos
        // elementos...
        Arrays.sort(series, (a, b) -> b[2].compareTo(a[2]));

        // Bucle para mostrar las filas ordenadas por valoración, una vez más aunque sea
        // una Stringa
        for (int i = 0; i < series.length; i++) {
            for (int j = 0; j < series[i].length; j++) {
                if (!(series[i][2].equals("null"))) {
                    System.out.print(series[i][j] + " ");
                }
            }
            if (!(series[i][2].equals("null"))) {
                System.out.println();
            }
        }
    }
}