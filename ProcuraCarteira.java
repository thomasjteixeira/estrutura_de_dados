
import java.util.Stack;

public class ProcuraCarteira {

    private Stack<String> locaisVisitados = new Stack<>();

    public void adicionarLocalVisitado(String local) {
        locaisVisitados.push(local);
        System.out.println("João visitou: " + local);
    }

    public void procurarCarteira() {
        System.out.println("João percebeu que perdeu a carteira... Procurando...");
        while (!locaisVisitados.isEmpty()) {
            String localAtual = locaisVisitados.pop();
            System.out.println("Procurando na(o) " + localAtual + "...");
            // Simulação: suponha que a carteira foi perdida na lanchonete
            if (localAtual.equals("lanchonete")) {
                System.out.println("A carteira foi encontrada na(o) " + localAtual + "!");
                return;
            }
        }
        System.out.println("A carteira não foi encontrada em nenhum dos locais visitados.");
    }

    public static void main(String[] args) {
        ProcuraCarteira procura = new ProcuraCarteira();
        procura.adicionarLocalVisitado("banco");
        procura.adicionarLocalVisitado("supermercado");
        procura.adicionarLocalVisitado("lanchonete");
        procura.adicionarLocalVisitado("livraria");
        procura.adicionarLocalVisitado("casa do amigo");

        procura.procurarCarteira();
    }
}
