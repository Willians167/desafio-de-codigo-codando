import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class AjudandoYoda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da frase invertida
        System.out.println("Digite a frase invertida de Yoda:");
        String fraseYoda = scanner.nextLine();

        // TODO: Inverter a frase
        String[] palavras = fraseYoda.split(" ");
        Collections.reverse(Arrays.asList(palavras));
        String fraseCorrigida = String.join(" ", palavras);

        System.out.println("Frase corrigida de Yoda: " + fraseCorrigida);

        // Parte 2: Coletar as lições Jedi
        String[] licoes = new String[3];
        System.out.println("\nAgora, compartilhe três lições que você aprendeu como Padawan:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Lição " + (i + 1) + ": ");
            licoes[i] = scanner.nextLine();
        }

        // Exibir as lições formatadas
        System.out.println("\nSeus aprendizados como Padawan:");
        for (int i = 0; i < licoes.length; i++) {
            System.out.println((i + 1) + ". " + licoes[i]);
        }

        scanner.close();
    }
}

