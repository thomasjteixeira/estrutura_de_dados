
import java.util.Scanner;

public class CalcularMedia {

    public static void main(String[] args) {
        //Inicialize um Scanner para capturar as entradas do usuário.
        Scanner scanner = new Scanner(System.in);

        // Define um array para armazenar as 3 notas
        double[] notas = new double[3];

        // Lê as 3 notas do usuário
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }

        // Calcula a média das notas
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / 3;

        // Exibe a média das notas
        System.out.println("A média das notas é: " + media);

        // Determina e exibe se o aluno foi aprovado ou reprovado
        if (media >= 7.0) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }
    }
}
