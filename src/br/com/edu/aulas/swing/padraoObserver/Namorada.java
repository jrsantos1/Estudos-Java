package br.com.edu.aulas.swing.padraoObserver;

public class Namorada implements ObservadorChegadaAniversariante{

    @Override
    public void chegou(EventoChegadaAniversariante evento) {
        System.out.println("Feliz Aniversário!!!");
        System.out.println("Ihaaaa!!!!!!!");
    }
}
