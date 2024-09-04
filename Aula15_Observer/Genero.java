package Aula15_Observer;

import java.util.ArrayList;
import java.util.List;

public class Genero implements Subject {
    private String nome;
    private List<Observer> observadores = new ArrayList<>();

    public Genero(String nome) {
        this.nome = nome;
    }

    @Override
    public void adicionarObserver(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removerObserver(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservers(String titulo) {
        for (Observer o : observadores) {
            o.atualizar(nome, titulo);
        }
    }

    public void adicionarFilme(String titulo) {
        System.out.println("Novo " + nome + " adicionado: " + titulo);
        notificarObservers(titulo);
    }
}
