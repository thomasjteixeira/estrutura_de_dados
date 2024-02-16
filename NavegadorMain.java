
import java.util.Stack;

class Navegador {

    private Stack<String> historico = new Stack<>();

    public void visitarPagina(String url) {
        historico.push(url);
        System.out.println("Visitando a página: " + url);
    }

    public void voltarPagina() {
        if (historico.size() > 1) { // Verifica se há mais de uma página no histórico
            historico.pop(); // Remove a página atual do histórico
            String urlAnterior = historico.peek(); // amarzena a página anterior
            System.out.println("Voltando para a página: " + urlAnterior);
        } else {
            System.out.println("Não há mais páginas no histórico para voltar.");
        }
    }
}

public class NavegadorMain {

    public static void main(String[] args) {
        Navegador navegador = new Navegador();
        navegador.visitarPagina("http://www.ifbaiano.edu.br");
        navegador.visitarPagina("http://www.oracle.com/java");
        navegador.visitarPagina("http://www.github.com");

        navegador.voltarPagina(); // Deve voltar para http://www.oracle.com/java
        navegador.voltarPagina(); // Deve voltar para http://www.ifbaiano.edu.br        
    }
}
