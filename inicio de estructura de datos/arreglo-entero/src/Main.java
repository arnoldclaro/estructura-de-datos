//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 4, 6, 2, 8, 5, 0};

        System.out.print("Arreglo: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println();

        int mayor = arr[0];
        int menor = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > mayor) mayor = arr[i];
            if (arr[i] < menor) menor = arr[i];
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}