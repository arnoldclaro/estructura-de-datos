public class Main {

    static int filas = 4;
    static int columnas = 7;

    static double[][] calcularPromediosPorCliente(double[][] matriz) {
        double[] promedios = new double[filas];
        for (int i = 0; i < filas; i++) {
            double suma = 0;
            for (int j = 0; j < columnas; j++) {
                suma += matriz[i][j];
            }
            promedios[i] = suma / columnas;
        }
        return new double[][]{promedios};
    }

    static double[] calcularMaximoPorCliente(double[][] matriz) {
        double[] maximos = new double[filas];
        for (int i = 0; i < filas; i++) {
            maximos[i] = matriz[i][0];
            for (int j = 1; j < columnas; j++) {
                if (matriz[i][j] > maximos[i]) {
                    maximos[i] = matriz[i][j];
                }
            }
        }
        return maximos;
    }

    static double[] calcularVariacionPorCliente(double[][] matriz) {
        double[] variacion = new double[filas];
        for (int i = 0; i < filas; i++) {
            variacion[i] = matriz[i][columnas - 1] - matriz[i][0];
        }
        return variacion;
    }

    public static void main(String[] args) {
        String[] clientes = {"Ana Lopez", "Carlos Ruiz", "Maria Gomez", "Pedro Silva"};
        String[] dias = {"Lun", "Mar", "Mie", "Jue", "Vie", "Sab", "Dom"};

        double[][] movimientos = {
                {1200, 850, 2300, 400, 1750, 600, 3100},
                {500,  1300, 700, 2100, 950, 1800, 450},
                {3000, 2200, 1500, 800, 2700, 1100, 1900},
                {750,  400,  1800, 2500, 600, 1300, 2200}
        };

        System.out.println("=== SIMULACION FINANCIERA BANCARIA ===\n");

        System.out.printf("%-15s", "Cliente");
        for (String dia : dias) {
            System.out.printf("%-8s", dia);
        }
        System.out.println();

        for (int i = 0; i < filas; i++) {
            System.out.printf("%-15s", clientes[i]);
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%-8.0f", movimientos[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n=== RESULTADOS ===\n");

        double[][] promediosArr = calcularPromediosPorCliente(movimientos);
        double[] maximos = calcularMaximoPorCliente(movimientos);
        double[] variacion = calcularVariacionPorCliente(movimientos);

        System.out.printf("%-15s %-12s %-12s %-12s%n",
                "Cliente", "Promedio", "Maximo", "Variacion");

        for (int i = 0; i < filas; i++) {
            System.out.printf("%-15s %-12.2f %-12.2f %-12.2f%n",
                    clientes[i],
                    promediosArr[0][i],
                    maximos[i],
                    variacion[i]);
        }
    }
}