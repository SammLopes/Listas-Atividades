package atividades05;

/*Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B.
A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o
valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados
nas variáveis. 
*/
public class ex2 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int aux = 0;
        
        aux = a;
        a = b;
        b = aux;
        System.out.println(a);
        System.out.println(b);
    }
}
