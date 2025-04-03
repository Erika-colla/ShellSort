package controllers;
public class ShellSort {
    public void sort(int[] array, boolean ascendente) {
        int n = array.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            int cambios = 0;

            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j = i;

                while (j >= gap && (
                        (ascendente && array[j - gap] > temp) |
                        (!ascendente && array[j - gap] < temp)
                )) {
                    array[j] = array[j - gap];
                    j -= gap;
                    cambios++;
                }

                if (j != i) {
                    array[j] = temp;
                    cambios++;
                }
            }

         
            printArray(array);
            System.out.println(cambios + " Cambios en Gap: " + gap);
        }
    }

    public void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

