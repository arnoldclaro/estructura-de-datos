import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] materias = {"ciencias", "sociales"};
        int numEstudiantes = 2;
        int numParciales = 3;

        double[][][] notas = new double[numEstudiantes][materias.length][numParciales];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Estudiante: " + (i + 1));
            for (int j = 0; j < materias.length; j++) {
                System.out.println("Materias: " + materias[j]);
                for (int k = 0; k < numParciales; k++) {
                    System.out.println("Evaluacion " + (k + 1) + " : ");
                    notas[i][j][k] = input.nextDouble();
                }
            }
        }

        int mejorEstudiante = 0;
        double mejorPromedio = 0;

        for (int i = 0; i < notas.length; i++) {
            double promedio = promedioEstudiante(notas[i]);
            System.out.println("Promedio estudiante " + (i + 1) + ":" + promedio);

            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorEstudiante = i;
            }

            if (promedio < 3.0) {
                System.out.println("El estudiante " + (i + 1) + "esta en riesgo de perder la materia " );
            }

            System.out.println("Mejor estudiante " + (mejorEstudiante + 1) + "con" + mejorPromedio);
        }


    }

    public static double promedioEstudiante(double[][] notas) {
        double suma = 0;
        int total = 0;
        for (double[] materia : notas) {
            for (double nota : materia) {
                suma += nota;
                total++;
            }
        }
        return suma / total;
    }
}