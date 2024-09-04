package Aula15_Observer;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Observer {
    private String nome;
    private List<String> generosInscritos = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void inscreverGenero(String genero) {
        generosInscritos.add(genero);
        System.out.println(nome + " se inscreveu para notificações do gênero: " + genero);
    }

    public void removerInscricao(String genero) {
        generosInscritos.remove(genero);
        System.out.println(nome + " cancelou as notificações do gênero: " + genero);
    }

    @Override
    public void atualizar(String genero, String titulo) {
        if (generosInscritos.contains(genero)) {
            System.out.println("Notificação para " + nome + ": Novo " + genero + " adicionado - " + titulo);
        }
    }
}
