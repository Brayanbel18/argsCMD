public class SumaPrefija {
    public static void main(String[] args) {

        // Verifica si no se proporcionaron argumentos en la línea de comandos.
        if (args.length == 0) {
            System.out.println("Es necesario brindar, por lo menos, un número entero. ");
            return; // Sale del programa si no hay argumentos.
        }

        // Crea un arreglo para almacenar los números ingresados y la suma prefija.
        int[] num = new int[args.length];
        int suma = 0; // Inicializa la suma prefija en cero.

        System.out.println("Suma Prefija: ");

        // Recorre cada argumento ingresado en la línea de comandos.
        for (int i = 0; i < args.length; i++) {
            try {
                // Convierte el argumento en un número entero.
                num[i] = Integer.parseInt(args[i]);

                // Agrega el número actual a la suma prefija.
                suma += num[i];     //+= es asignación compuesta y sirve para sumarle una cantidad al valor de una variable.

                // Imprime el número y la suma prefija actual.
                System.out.println(num[i] + ", " + suma);
            } catch (NumberFormatException e) {
                // Si el argumento no es un número válido, muestra un mensaje de error.
                System.out.println("El argumento '" + args[i] + "' no es un número entero válido.");
            }
        }
    }
}
