package Aula15_Observer;

public class Main {
    public static void main(String[] args) {
        // Criando gêneros
        Genero acao = new Genero("Ação");
        Genero comedia = new Genero("Comédia");
        Genero terror = new Genero("Terror");

        // Criando usuários
        Usuario user1 = new Usuario("Carlos");
        Usuario user2 = new Usuario("Ana");
        Usuario user3 = new Usuario("João");
        Usuario user4 = new Usuario("Maria");
        Usuario user5 = new Usuario("Pedro");

        // Inscrevendo usuários em gêneros
        acao.adicionarObserver(user1);
        acao.adicionarObserver(user2);
        comedia.adicionarObserver(user3);
        comedia.adicionarObserver(user4);
        terror.adicionarObserver(user5);
        terror.adicionarObserver(user1);

        user1.inscreverGenero("Ação");
        user2.inscreverGenero("Ação");
        user3.inscreverGenero("Comédia");
        user4.inscreverGenero("Comédia");
        user5.inscreverGenero("Terror");
        user1.inscreverGenero("Terror");

        // Adicionando novos filmes
        acao.adicionarFilme("Filme de Ação 1");
        comedia.adicionarFilme("Comédia Louca");
        terror.adicionarFilme("Terror Assustador");
    }
}
