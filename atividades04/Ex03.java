package atividades4;
//Leia um vetor de 10 posições e atribua o valor 0 para todos os elementos que possuírem valores negativos
import java.util.Scanner;
public class Ex03 {
     public static void main(String[] args){
     
         Scanner sc = new Scanner(System.in);
         
         int[] vet = new int[10];
         
         for(int i = 0; i < vet.length; i++){
              System.out.println("Digite o valor da posição "+i);
              vet[i] = sc.nextInt();
              if(vet[i] < 0){
                  vet[i] = 0;
              }
         }
         for(int i = 0; i < vet.length; i++){
             System.out.print(vet[i]+" , ");
         }
     }    
}
