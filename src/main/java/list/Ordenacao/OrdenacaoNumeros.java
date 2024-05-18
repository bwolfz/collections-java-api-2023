package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(this.numerosList);
        Collections.sort(numerosAscendentes);
        return numerosAscendentes;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendentes = new ArrayList<>(this.numerosList);
        numerosDescendentes.sort(Collections.reverseOrder());
        return numerosDescendentes;
    }

    public void exibirNumeros(){
        System.out.println(this.numerosList);
    }


    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(26);
        numeros.adicionarNumero(7);
        numeros.adicionarNumero(4);
        numeros.exibirNumeros();
        System.out.println("---");
        System.out.println(numeros.ordenarAscendente());
        System.out.println("---");
        System.out.println(numeros.ordenarDescendente());

    }



}
