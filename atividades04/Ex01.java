package atividades4;
//Escreva um programa que leia 10 números inteiros e os armazene em um vetor. Imprima o vetor, o maior elemento e a posição que ele se encontra. Use uma função para a tarefa dada

import java.util.Scanner;
public class Ex01 {

    public static void main(String[] args) {
 
         Scanner sc = new Scanner(System.in); 
         
         int v1[] = new int[10];
         int i ;
         
         
         int maior = v1[0];
         int posicao = 0;
         
         for(i = 0; i < v1.length; i++){
              System.out.println("\nDigite o valor do elemnto: "+i);
              v1[i] = sc.nextInt();
              
              if(v1[i] > maior){
                maior = v1[i];
                posicao = i;
             }
         } 
         
        System.out.println("O maior elemnto´é: "+maior+" localizado na posição: "+posicao);
    }
    
}
