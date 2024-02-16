
import java.util.Arrays;

public class DeclaracaoArrays {

    public static void main(String[] args) {
        // Declarações de tipos de arrays diferentes
        String[] nomes = {"Lucas", "Daniel", "Julia", "Tatiana", "Izabela", "Matheus"};
        char[] vogais = {'i', 'u', 'e', 'a', 'o'};
        int[] numeros = {9, 2, 6, 7, 5, 4, 3, 1, 0};
        double[] notas = {6.9, 7.5, 9.5, 7.5, -4.5, 7.4};

        //Ordenar os arrays
        Arrays.sort(nomes);
        System.out.print("\nNomes: ");
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }

        Arrays.sort(vogais);
        System.out.print("\nVogais: ");
        for (char vogal : vogais) {
            System.out.print(vogal + " ");
        }

        Arrays.sort(numeros);
        System.out.print("\nNúmeros: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.print("\nNotas: ");
        Arrays.sort(notas);
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
    }

}
