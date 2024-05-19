package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (!palavrasUnicasSet.isEmpty()){
            if(palavrasUnicasSet.contains(palavra)){
                palavrasUnicasSet.remove(palavra);
            }
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Quem");
        conjuntoPalavrasUnicas.adicionarPalavra("Quem ej");
        conjuntoPalavrasUnicas.adicionarPalavra("Quem21j");
        conjuntoPalavrasUnicas.adicionarPalavra("Quem123ddasdj");
        conjuntoPalavrasUnicas.adicionarPalavra("Quem123dd3123dj");
        conjuntoPalavrasUnicas.adicionarPalavra("Quem123dd31vcbcvbj");
        conjuntoPalavrasUnicas.adicionarPalavra("Quem123dd31vcbxcvxcj");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }
}
