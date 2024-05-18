package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributos

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> listLivroPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)){
                    listLivroPorAutor.add(l);
                }
            }
        }
        return listLivroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listLivroPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    listLivroPorIntervaloAnos.add(l);
                }
            }
        }
        return listLivroPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 1919);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 1920);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 1921);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 1923);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1922);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println("---");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
        System.out.println("---");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1920,1923));

    }
}
