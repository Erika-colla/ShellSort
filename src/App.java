import controllers.ShellSort;

public class App {
    public static void main(String[] args) {
        int[] a = {-10, 0, 4, 7, 2, 1, 9, 6};

        ShellSort sS = new ShellSort();

        System.out.println("Arreglo original:");
        sS.printArray(a);

        System.out.println("\n--- Orden ascendente ---");
        sS.sort(a, true);
        System.out.println("Arreglo final ordenado ascendente:");
        sS.printArray(a);

        int[] b = {-10, 0, 4, 7, 2, 1, 9, 6};

        System.out.println("\n--- Orden descendente ---");
        sS.sort(b, false);
        System.out.println("Arreglo final ordenado descendente:");
        sS.printArray(b);
    }
}