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
//definicao da classe TreeNode
class TreeNode<T extends Comparable<T>> {

    //membros de acesso de pacote
    TreeNode<T> leftNode;
    T data; //valor do nó
    TreeNode<T> rightNode;

    //construtor inicializa os dados e os torna um no de folha
    public TreeNode(T nodeData) {
        data = nodeData;
        leftNode = rightNode = null; //o nó nao tem nenhum filho
    }

    //localiza o ponto de insercao e insere novo nó; ignora os valores duplicados
    public void insert(T insertValue) {

        //insere na subarvore esquerda
        if (insertValue.compareTo(data) < 0) {

            //insere novo TreeNode
            if (leftNode == null) {
                leftNode = new TreeNode<T>(insertValue);
            } else { //continua percorrendo a subarvore esquerda recursivamente
                leftNode.insert(insertValue);
            }

            //insere na subarvore direita
        } else if (insertValue.compareTo(data) > 0) {

            //insere novo TreeNode
            if (rightNode == null) {
                rightNode = new TreeNode<T>(insertValue);
            } else { //continua percorrendo a subarvore direita recursivamente
                rightNode.insert(insertValue);
            }
        }
    }
} //fim da classe TreeNode

//definicao da classe Tree
public class Tree<T extends Comparable<T>> {

    private TreeNode<T> root;

    //construtor inicializa uma Tree de inteiros vazia
    public Tree() {
        root = null;
    }

    //insere um novo nó na arvore de pesquisa binaria
    public void insertNode(T insertValue) {
        if (root == null) {
            root = new TreeNode<T>(insertValue); //cria o nó raiz
        } else {
            root.insert(insertValue); //chama o metodo insert
        }
    }

    //inicia o percurso na pre-ordem
    public void preorderTraversal() {
        preorderHelper(root);
    }

    //metodo recursivo para realizar percurso na pre-ordem
    private void preorderHelper(TreeNode<T> node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.data); //gera saida de dados do nó
        preorderHelper(node.leftNode); //percorre a subarvore esquerda
        preorderHelper(node.rightNode); //percorre a subarvore direita
    }

    //inicia percurso na ordem
    public void inorderTraversal() {
        inorderHelper(root);
    }

    //metodo recursivo para realizar percurso na ordem
    private void inorderHelper(TreeNode<T> node) {
        if (node == null) {
            return;
        }
        inorderHelper(node.leftNode); //percorre subarvore esquerda
        System.out.printf("%s ", node.data); //gera saida de dados do nó
        inorderHelper(node.rightNode); //percorre subarvore direita

    }

    //inicia percurso na pos-ordem
    public void postorderTraversal() {
        postorderHelper(root);
    }

    //metodo recursivo para realizar percurso na pos-ordem
    private void postorderHelper(TreeNode<T> node) {
        if (node == null) {
            return;
        }
        postorderHelper(node.leftNode);// percorre subarvore esquerda
        postorderHelper(node.rightNode); //percorre subarvore direita
        System.out.printf("%s ", node.data); //gera saida de dados do nó
    }

} //fim da classe Tree
