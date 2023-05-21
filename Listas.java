import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumaLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.print("Ingrese la cantidad de números: ");
        int cantidadNumeros = scanner.nextInt();

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        System.out.println("La suma de los números es: " + suma);
    }
}
