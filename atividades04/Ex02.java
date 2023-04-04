package atividades4;
//Leia um vetor de 10 posições. Conte e escreva quantos valores pares ele possui

import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] vetor = new int[10];
        
        int par = 0;
        int totPar = 0;
        
        
        for(int i  = 1;i < vetor.length; i++){
            System.out.println("Digite o numero "+i);
            vetor[i] = sc.nextInt();
            
            if(vetor[i] % i == 0){
                par = vetor[i];
                totPar += i;
            }
            
            System.out.println("posição: "+i+" vetor: "+vetor[i]);
        }
         System.out.println("Total de pares no vetor é de: "+totPar);
    }
    
           
            
           
}
