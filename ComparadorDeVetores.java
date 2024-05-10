import java.util.Scanner;

public class ComparadorDeVetores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho dos vetores: ");
        int tamanho = scanner.nextInt();

        // Criar e preencher o primeiro vetor
        int[] vetor1 = criarEInserirValores(tamanho, "primeiro", scanner);

        // Criar e preencher o segundo vetor
        int[] vetor2 = criarEInserirValores(tamanho, "segundo", scanner);

        // Comparar os vetores
        if (compararVetores(vetor1, vetor2)) {
            System.out.println("Os vetores são iguais.");
        } else {
            System.out.println("Os vetores são diferentes.");
        }

        scanner.close();
    }

    // Método para criar um vetor e preenchê-lo com valores fornecidos pelo usuário
    public static int[] criarEInserirValores(int tamanho, String ordem, Scanner scanner) {
        System.out.println("Digite os valores do " + ordem + " vetor:");

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Valor " + (i) + ": ");
            vetor[i] = scanner.nextInt();
        }

        return vetor;
    }

    // Método para comparar dois vetores
    public static boolean compararVetores(int[] vetor1, int[] vetor2) {
        if (vetor1.length != vetor2.length) {
            return false; // Se os tamanhos forem diferentes, os vetores são diferentes
        }

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] != vetor2[i]) {
                return false; // Se um elemento for diferente, os vetores são diferentes
            }
        }

        return true; // Se todos os elementos forem iguais, os vetores são iguais
    }
}
