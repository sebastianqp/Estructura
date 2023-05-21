import java.util.Stack;

public class PilasEjemplo {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        // Agregar elementos a la pila
        pila.push("Elemento 1");
        pila.push("Elemento 2");
        pila.push("Elemento 3");

        // Obtener el elemento en la parte superior de la pila
        String elementoSuperior = pila.peek();
        System.out.println("Elemento superior: " + elementoSuperior);

        // Eliminar el elemento en la parte superior de la pila
        String elementoEliminado = pila.pop();
        System.out.println("Elemento eliminado: " + elementoEliminado);

        // Verificar si la pila está vacía
        boolean estaVacia = pila.isEmpty();
        System.out.println("¿La pila está vacía? " + estaVacia);
    }
}
