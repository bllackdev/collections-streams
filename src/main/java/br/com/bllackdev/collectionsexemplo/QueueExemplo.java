package br.com.bllackdev.collectionsexemplo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExemplo {
    public static void main(String[] args) {
        System.out.println("");
        Queue<String> names = new LinkedList<>();

        //Adicionar Nomes na Fila:
        names.add("Juliana");
        names.add("Pedro");
        names.add("Carlos");
        names.add("Larissa");
        names.add("João");

        //Exibir nomes:
        System.out.println("Fila: " + names);
        System.out.println("");

        //Exibir Primeiro Elemento sem Remove-lo
        String primeiro = names.peek();
        System.out.println("Primeiro Elemento da Fila: " + primeiro);
        System.out.println("Fila Com o Primeiro na Fila: " + names);
        System.out.println("");

        //Exibir Primeiro e Remover da Fila
        String primeiroRemover = names.poll();
        System.out.println("Primeiro Elemento da Fila: " + primeiroRemover);
        System.out.println("Fila Com o Primeiro fora da Fila: " + names);
        System.out.println("");

        //Adicionar Daniel na Fila
        System.out.println("Adicionando 'Daniel' na Fila...");
        names.add("Daniel");
        System.out.println(names);
        System.out.println("");

        //Verificar a Posição de Daniel
        int indice = ((LinkedList<String>) names).indexOf("Daniel");
        System.out.println("'Daniel' assumiu o Indice: " + indice);
        System.out.println("");

        //Exibir tamanho da Fila
        int tamanho = names.size();
        System.out.println("A Fila tem o Tamanho de: " + tamanho);
        System.out.println("");

        //Verificar se a Fila está Vazia
        boolean vazio = names.isEmpty();
        System.out.println("A Fila está Vazia? R:" + vazio);
        System.out.println("");

        //Verificar se Carlos está na Fila
        boolean existe = names.contains("Carlos");
        System.out.println("'Carlos está na Fila? R:" + existe);
        System.out.println("");

    }
}
