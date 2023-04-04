package atividades4;

import java.util.Scanner;
public class Ex08 {
   public static Scanner sc = new Scanner(System.in);
   public static int[] vetor = new int[11];
  
    public static void main(String[] args){
        lerValores();
        comparaValores();
    }
    public static void lerValores(){
        for(int i = 0;i < vetor.length -1; i++){
            System.out.println(" Digite o valor da posição: "+i);
            vetor[i] = sc.nextInt();
        }
        System.out.println();
    }
    public static void comparaValores(){
        for(int i = 0; i < vetor.length ; i++)
           for(int j = 0;j < vetor.length ;j++){ 
                int index = i;
                int aux = vetor[i];
                if(vetor[j] == aux && index != j){
                  System.out.print(vetor[i]+" , ");              
            }
           }
        System.out.println("\n fim função");
        }
         
                
    }

