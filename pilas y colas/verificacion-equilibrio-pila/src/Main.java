public class Main {

    static void main() {

        VerificadorEquilibrio verificador = new VerificadorEquilibrio();

        String[] expresiones = {
                "((a+b)*5) - 7",       // Equilibrada
                "2*[(a+b)/2.5 + x - 7*y",  // Falta cierre ]
                "{a + [b * (c - d)]}",  // Equilibrada
                "([)]"                  // Cruce incorrecto
        };

        System.out.println("=== Ejercicio 5 — Verificación de equilibrio ===");
        System.out.println();

        for (String expr : expresiones) {
            boolean resultado = verificador.esEquilibrada(expr);
            System.out.println("Expresión : " + expr);
            System.out.println("Resultado : " + (resultado ? "EQUILIBRADA" : "NO equilibrada"));
            System.out.println();
        }
    }
}