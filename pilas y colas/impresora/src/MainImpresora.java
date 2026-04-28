public class MainImpresora {

    public static void main(String[] args) {

        Impresora impresora = new Impresora();

        System.out.println("===== SIMULADOR DE IMPRESORA =====\n");

        impresora.agregarDocumento("Informe_Ventas_Enero.pdf");
        impresora.agregarDocumento("Carta_Bienvenida.docx");
        impresora.agregarDocumento("Factura_001.pdf");
        impresora.agregarDocumento("Contrato_Proveedor.pdf");

        System.out.println();
        impresora.mostrarCola();

        System.out.println();
        impresora.siguienteDocumento();

        System.out.println();
        System.out.println("--- Procesando primer documento ---");
        impresora.imprimirSiguiente();

        System.out.println();
        System.out.println("--- Procesando segundo documento ---");
        impresora.imprimirSiguiente();

        System.out.println();
        impresora.mostrarCola();

        System.out.println();
        System.out.println("--- Agregando nuevo documento en medio del proceso ---");
        impresora.agregarDocumento("Reporte_Anual.xlsx");

        System.out.println();
        impresora.mostrarCola();

        System.out.println();
        System.out.println("--- Procesando el resto ---");
        impresora.imprimirSiguiente();
        impresora.imprimirSiguiente();
        impresora.imprimirSiguiente();

        System.out.println();
        System.out.println("--- Intento de imprimir con cola vacia ---");
        impresora.imprimirSiguiente();

        System.out.println();
        System.out.println("--- Consulta con cola vacia ---");
        impresora.siguienteDocumento();
    }
}