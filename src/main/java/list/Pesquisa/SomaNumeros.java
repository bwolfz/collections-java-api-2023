package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer numero : numeros){
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero=Integer.MIN_VALUE;
        for (Integer numero:numeros){
            if (numero>=maiorNumero){
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        for (Integer numero: numeros){
            if (numero<=menorNumero) {
                menorNumero = numero;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        System.out.println(this.numeros);
    }


    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(6);
        numeros.adicionarNumero(11);
        numeros.adicionarNumero(10);
        System.out.println("maior: "+numeros.encontrarMaiorNumero());
        System.out.println("soma: "+numeros.calcularSoma());
        System.out.println("menor: "+numeros.encontrarMenorNumero());
        numeros.exibirNumeros();
    }
}
