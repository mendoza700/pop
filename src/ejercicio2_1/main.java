package ejercicio2_1;

   public class main {
        public static void main(String[] args) {
            // Crear dos objetos de Persona
            Persona persona1 = new Persona("ana", "lopez", 12345678, 1990, "ni9czragua", 'H');
            Persona persona2 = new Persona("pancho", "gonsales", 87654321, 1985, "mwxico", 'M');

            // Mostrar los valores de los atributos en pantalla
            System.out.println("Persona 1:");
            persona1.imprimir();

            System.out.println("\nPersona 2:");
            persona2.imprimir();
        }
    }

