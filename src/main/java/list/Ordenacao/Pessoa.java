package main.java.list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    //atributos
    private String nomme;
    private int idade;
    private double altura;

    public Pessoa(String nomme, int idade, double altura) {
        this.nomme = nomme;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNomme() {
        return nomme;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nomme='" + nomme + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade,p.getIdade());
    }
}

class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}