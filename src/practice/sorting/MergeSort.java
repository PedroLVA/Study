package practice.sorting;

public class MergeSort {

    // Mescla dois sub-arrays de arr[]
    void merge(int arr[], int l, int m, int r) {
        // Encontra os tamanhos dos dois sub-arrays a serem mesclados
        int n1 = m - l + 1;
        int n2 = r - m;

        // Cria arrays temporários
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copia os dados para os arrays temporários
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        // Mescla os arrays temporários de volta no arr[l..r]
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copia os elementos restantes de L[], se houver
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copia os elementos restantes de R[], se houver
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Função principal que ordena arr[l..r] usando merge()
    void sort(int arr[], int l, int r) {
        if (l < r) {
            // Encontra o ponto do meio
            int m = l + (r - l) / 2;

            // Ordena a primeira e a segunda metade
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Mescla as metades ordenadas
            merge(arr, l, m, r);
        }
    }

    // Método para imprimir o array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        System.out.println("Array original:");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nArray ordenado:");
        printArray(arr);
    }
}
