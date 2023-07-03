

public class Main {
    public static void main(String args[]) {
        int[] vetor = {5,3,2,4,7,1,0,6};
        int aux = 0;
        int i = 0;

        System.out.println("Vetor desordenado: ");
        for (i = 0; i < 8; i++) {
            System.out.println(" " + vetor[i]);
        }
        System.out.println(" ");

        for (i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado:");
        for (i = 0; i < 8; i++) {
            System.out.println(" " + vetor[i]);
        }
    }
}