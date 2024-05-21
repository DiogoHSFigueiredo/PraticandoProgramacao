/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deitel.datastructures;

/**
 *
 * @author Diogo
 * @param <T>
 */
class ListNode<T> {

    //membros de acesso de pacote; List pode acessá-los diretamente
    T data; //dados para esse no
    ListNode<T> nextNode; //referencia para o proximo no da lista

    //construtor cria um ListNode que referencia o objeto
    ListNode(T object) {
        this(object, null);
    }

    //construtor cria ListNode que referencia o objeto especificado e o proximo ListNode
    ListNode(T object, ListNode<T> node) {
        data = object;
        nextNode = node;
    }

    //retorna referencia aos dados do no
    T getData() {
        return data;
    }

    //retorna referencia ao proximo no da lista
    ListNode<T> getNext() {
        return nextNode;
    }

} //fim da classe ListNode<T>

//definicao da classe List
public class List<T> {

    private ListNode<T> firstNode;
    private ListNode<T> lastNode;
    private String name; //string como "lista" usada na impressao

    //construtor cria List vazia com "list" como o nome
    public List() {
        this("list");
    }

    //construtor cria uma list vazia com um nome
    public List(String listName) {

        name = listName;
        firstNode = lastNode = null;
    }

    //insere o item na frente de list
    public void insertAtFront(T insertItem) {
        if (isEmpty()) //firstNode e lastNode referenciam o mesmo objeto
        {
            firstNode = lastNode = new ListNode<T>(insertItem);
        } else //firstNode referencia o novo no
        {
            firstNode = new ListNode<T>(insertItem, firstNode);
        }
    }
    //insere o item no fim de list

    public void insertAtBack(T insertItem) {
        if (isEmpty()) //firstNode e lastNode referenciam o mesmo objeto
        {
            firstNode = lastNode = new ListNode<T>(insertItem);
        } else //nextNode do lastNode refencia o novo no
        {
            lastNode = lastNode.nextNode = new ListNode<T>(insertItem);
        }

    }

    //remove o primeiro no de list
    public T removeFromFront() throws EmptyListException {
        if (isEmpty()) //lanca excecao se List estiver vazia
        {
            throw new EmptyListException(name);
        }
        T removedItem = firstNode.data; //recupera dados sendo removidos

        //atualiza referencias fisrtNode e lastNode
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.nextNode;
        }
        return removedItem; //retorna dados de no removidos
    }

    //remove o ultimo no de List
    public T removeFromBack() throws EmptyListException {
        if (isEmpty()) //lanca excecao se List estiver vazia
        {
            throw new EmptyListException(name);
        }
        T removedItem = lastNode.data; //retorna dados sendo removidos

        //atualiza referencias firstNode e lastNode
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else { //localiza o novo ultimo no
            ListNode<T> current = firstNode;

            //faz loop enquanto o no atual nao referencia lastNode
            while (current.nextNode != lastNode) {
                current = current.nextNode;
            }
            lastNode = current; //atual e o novo lastNode
            current.nextNode = null;
        }
        return removedItem; //retorna dados de no removidos
    }

    //determina se a lista estiver vazia
    public boolean isEmpty() {
        return firstNode == null; //retorna true se a lista estiver vazia
    }

    //gera saida do conteudo da lista
    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return;

        }
        System.out.printf("The %s is: ", name);
        ListNode<T> current = firstNode;

        //enquanto nao estiver no fim de lista, gera saida dos dados do nó atual
        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.nextNode;
        }
        System.out.println();
    }

} //fim da classe List<T>
