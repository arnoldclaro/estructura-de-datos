import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double notas[] = new double[10];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("ingrese la nota del estudiante");
            notas[i] = input.nextDouble();
        }
        System.out.println("EL promedio de las notas es: "+ promedio(notas));
    }

    public static double promedio(double[] notas){
        double suma = 0;
        for(int i = 0; i < notas.length; i++){
            suma += notas[i];
        }
        return suma / notas.length;
    }
}