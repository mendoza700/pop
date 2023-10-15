package ejercicio2_3;

public class main {
    public static void main(String[] args) {
        Automovil automovil = new Automovil("zuzuqui", 2022, 2.0, Automovil.TipoCombustible.GASOLINA, Automovil.TipoAutomovil.SUV, 4, 5, 180, Automovil.Color.AZUL, true);
        automovil.setVelocidadActual(100);

        System.out.println("Velocidad Actual normal: " + automovil.getVelocidadActual() + " km/h");

        automovil.acelerar(20);
        System.out.println("Velocidad Actual normal: " + automovil.getVelocidadActual() + " km/h");

        automovil.desacelerar(50);

        automovil.frenar();
        System.out.println("Velocidad Actual normal: " + automovil.getVelocidadActual() + " km/h");

        automovil.imprimir();
    }
}

