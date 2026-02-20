import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double notas[] = new double[10];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = input.nextDouble();
        }


        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Promedio: " + promedio(notas));
        System.out.println("Nota Máxima: " + notaMaxima(notas));
        System.out.println("Nota Mínima: " + notaMinima(notas));
        System.out.println("Cantidad de Aprobados: " + cantidadAprobados(notas));
    }

    public static double promedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) { suma += nota; }
        return suma / notas.length;
    }

    public static double notaMaxima(double[] notas) {
        double notaMax = notas[0];
        for (double nota : notas) {
            if (nota > notaMax) notaMax = nota;
        }
        return notaMax;
    }

    public static double notaMinima(double[] notas) {
        double notaMin = notas[0];
        for (double nota : notas) {
            if (nota < notaMin) notaMin = nota;
        }
        return notaMin;
    }


    public static byte cantidadAprobados(double notas[]) {
        byte cant = 0;
        for (double nota : notas) {
            if (nota >= 3) {
                cant++;
            }
        }
        return cant;
    }
}



