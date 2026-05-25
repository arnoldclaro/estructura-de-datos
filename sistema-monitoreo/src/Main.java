import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] temperaturasSensor = new int[3][3];
        for (int i = 0; i < temperaturasSensor.length; i++) {
            System.out.println("Registrar temperaturas de la zona " + i);
            for (int j = 0; j < temperaturasSensor[i].length; j++) {
                System.out.println("Ingrese la temperatura del sensor " + j);
                temperaturasSensor[i][j] = input.nextInt();

            }
        }
        promedioZona(temperaturasSensor);
        System.out.println("El promedio general es: " + promedioGeneral(temperaturasSensor));
        valoresCriticos(temperaturasSensor);
    }

    public static void promedioZona(int[][] temperaturas) {
        for (int i = 0; i < temperaturas.length; i++) {
            double suma = 0;
            for (int j = 0; j < temperaturas[i].length; j++) {
                suma += temperaturas[i][j];
            }
            double promedio = suma / temperaturas[i].length;
            System.out.println("promedio de la zona " + i + " : " + promedio);
        }

    }

    public static double promedioGeneral(int[][] temperaturas) {
        double suma = 0;
        for (int[] fila : temperaturas) {
            for (int temperatura : fila) {
                suma += temperatura;
            }
        }
        return suma / (temperaturas.length * temperaturas[0].length);
    }

    public static void valoresCriticos(int[][] temperaturas) {
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                if (temperaturas[i][j] > 40 || temperaturas[i][j] < 0) {
                    System.out.println("Temperatura critica en zona " + i + " sensor " + j + ": " + temperaturas[i][j]);
                }
            }
        }

    }
}