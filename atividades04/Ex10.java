package atividades4;
/*Faça um programa que leia dois números n e m e:
Crie e leia um vetor de inteiros de n posições;
Crie e leia um vetor de inteiros de m posições;
Crie e construa um vetor de inteiros que seja a união entre os dois vetores anteriores, ou seja, que contém os elementos dos dois vetores (inclusive repetidos). 
No método main, imprima os três vetores criados. Use funções para os procedimentos anteriores
*/
// terminar
import java.util.Scanner;
public class Ex10 {
     public static int vet1;
     public static int vet2;
     private static int[] vetor1;
     private static int[] vetor2;
     private static int[] soma;
     public static void main(String[] args){
           definindoVetores();
           somaVetor();
           mostrar(vetor1, vetor2);
     }    
     public static void somaVetor(){// Parei a
         soma = new int[vetor1.length + vetor2.length];
         for(int i = 0; i < vetor1.length; i++){
             if(soma[i] == 0){
                soma[i] = vetor1[i];
             }
         }
         for(int i = 0; i < vetor2.length; i++){
             soma[vetor1.length + i] = vetor2[i];
         }
     }
     
     public static void definindoVetores(){
         Scanner sc = new Scanner(System.in);
        
         System.out.println("Digite um valor M: ");
         vet1 = sc.nextInt();
         System.out.println("Digite um valor N: ");
         vet2 = sc.nextInt();
         
         vetor1 = new int[vet1];
         vetor2 = new int[vet2];
         
         for(int i = 0;i < vetor1.length; i++){
             System.out.println("Digite o valor do vetor 1  na posição: "+i);
             vetor1[i] = sc.nextInt();
         }
         for(int i = 0;i < vetor2.length; i++){
             System.out.println("Digite o valor do vetor 2 na posição: "+i);
             vetor2[i] = sc.nextInt();
         }
             System.out.println("fim do metodo");
     }
     
     
     public static void mostrar(int[] vetor1, int[] vetor2){
         System.out.println("Vetor 1: ");
         for(int i = 0; i < vetor1.length; i++){
              System.out.println(vetor1[i]+" , ");
         }
         System.out.println("Vetor 2: ");
         for(int i = 0; i < vetor2.length; i++){
              System.out.print(vetor2[i]+" , ");
         }
         System.out.print("\nVetor Soma de 1 e 2: ");
         for(int i = 0; i < soma.length;i++){
             System.out.println("\n"); 
             System.out.print(soma[i]+" , ");
         }
         System.out.println("\nFim do metodo");
     }
}
