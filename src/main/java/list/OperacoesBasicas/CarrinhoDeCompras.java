package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemCompra;

    public CarrinhoDeCompras(){
        this.itemCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemCompra.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item i:itemCompra){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }

        itemCompra.removeAll(itemParaRemover);
    }

    public void calcularValorTotal(){
        double soma = 0;
        for (Item i:itemCompra){
            soma+=i.getPreco();
        }
        System.out.println("Valor total: "+soma);
    }

    public void exibirItens(){
        System.out.println(itemCompra);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras itemCompra = new CarrinhoDeCompras();
        //adicionar itens
        itemCompra.adicionarItem("Pao",2.00, 2);
        itemCompra.adicionarItem("Mac",2.60, 1);
        itemCompra.exibirItens();
        itemCompra.calcularValorTotal();
        //remover pao
        System.out.println("Remover pao");
        itemCompra.removerItem("Pao");
        itemCompra.exibirItens();
        itemCompra.calcularValorTotal();

    }

}
