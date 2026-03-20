public class Main {
    public static void main(String[] args) {

        GestionRanking servidor = new GestionRanking();

        Jugador j1 = new Jugador("Alok", "Soporte", 2500);
        Jugador j2 = new Jugador("Kelly", "Rusher", 3200);
        Jugador j3 = new Jugador("K", "Estratega", 1500);
        Jugador j4 = new Jugador("Hayato", "Tanque", 4100);

        servidor.insertarJugador(j1);
        servidor.insertarJugador(j2);
        servidor.insertarJugador(j3);
        servidor.insertarJugador(j4);

        System.out.println("=== RANKING AL INICIAR LA PARTIDA ===");
        servidor.mostrarRanking();

        System.out.println("\n=== BUSCANDO JUGADOR ===");
        String nombreABuscar = "Kelly";
        Jugador encontrado = servidor.buscarJugador(nombreABuscar);

        if (encontrado != null) {
            System.out.println("¡Jugador encontrado! -> Nombre: " + encontrado.getNombre() +
                    " | Rol: " + encontrado.getTipo() +
                    " | Puntos: " + encontrado.getPosicion());
        } else {
            System.out.println("El jugador '" + nombreABuscar + "' no está registrado.");
        }

        System.out.println("\n=== ORDENANDO EL RANKING DE MAYOR A MENOR ===");
        servidor.ordenarRanking();

        servidor.mostrarRanking();
    }
}