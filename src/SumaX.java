public class SumaX {
    public static void main(String[] args) {
        // Verifica si se proporcionaron suficientes argumentos en la línea de comandos.
        if (args.length < 3) {
            System.out.println("Debes proporcionar al menos tres números: el valor de x y al menos dos elementos para el arreglo A.");
            return; // Sale del programa si no hay suficientes argumentos.
        }

        // Obtiene el valor de x desde el primer argumento.
        int x = Integer.parseInt(args[0]);
        boolean buscador = false; // Para rastrear si se encontraron elementos cuya suma sea x.

        // Recorre los elementos del arreglo A.
        for (int i = 1; i < args.length; i++) {
            // Recorre los elementos restantes del arreglo A para comparar pares.
            for (int j = i + 1; j < args.length; j++) {
                int num1 = Integer.parseInt(args[i]);
                int num2 = Integer.parseInt(args[j]);
                // Verifica si la suma de num1 y num2 es igual a x.
                if (num1 + num2 == x) {
                    buscador = true; // Si se encuentra, actualiza la variable 'buscador'.
                    break; // Sale del bucle interno, ya que ya se encontraron dos números.
                }
            }
            if (buscador) {
                break; // Sale del bucle externo si ya se encontraron dos números.
            }
        }

        // Imprime "Si" si se encontraron elementos cuya suma sea x, de lo contrario, imprime "No".
        if (buscador) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }
}


