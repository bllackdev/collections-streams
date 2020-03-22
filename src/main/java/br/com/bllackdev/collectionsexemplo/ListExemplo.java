package br.com.bllackdev.collectionsexemplo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExemplo {
    public static void main(String[] args) {
        //Exercicio de List
        List<String> names = new ArrayList<>();

        //Adicionar 5 nomes:
        names.add("Juliana");
        names.add("Pedro");
        names.add("Carlos");
        names.add("Larissa");
        names.add("João");

        //Navegar na Lista e Exibir os Nomes:
        System.out.println("");
        System.out.println("Lista 01: " + names);
        System.out.println("");

        //Substituir Carlos por Roberto:
        names.set(2, "Roberto");
        System.out.println("Carlos substituido por Roberto: "+names);
        System.out.println("");

        //Retorne Nome da Posição 1:
        String name = names.get(1);
        System.out.println("Exibir o Elemento 01: " + name);
        System.out.println("");

        //Remover Nome da Posição 4:
        names.remove(4);
        System.out.println("Elemento 04 removido: ");
        System.out.println(names);
        System.out.println("");

        //Remover João:
        names.remove("João");
        System.out.println("Removendo João: ");
        System.out.println(names);
        System.out.println("");

        //Quantidade de Itens na Lista:
        int tamanho = names.size();
        System.out.println("Quantidade de Itens: " + tamanho);
        System.out.println("");

        //Verificar se Juliano Existe:
        boolean existe = names.contains("Juliano");
        System.out.println("Juliano existe na Lista? R:" + existe);
        System.out.println("");

        //Criar Nova Lista:
        System.out.println("Nova Lista de Nomes: ");
        List<String> names2 = new ArrayList<>();
        names2.add("Ismael");
        names2.add("Rodrigo");
        System.out.println("Lista 02: " + names2);
        System.out.println("");

        //Adicionar Lista2 na Lista
        System.out.println("Adicionar Nova Lista dentro da Primeira: ");
        names.addAll(names2);
        System.out.println(names);
        System.out.println("");

        //Coloque em Ordem Alfabetica:
        Collections.sort(names);
        System.out.println("Lista em Ordem Alfabetica: ");
        System.out.println(names);
        System.out.println("");

        //Verificar se a Lista está Vazia:
        boolean vazio = names.isEmpty();
        System.out.println("A Lista está Vazia? R:" + vazio);
        System.out.println("");

    }
}
