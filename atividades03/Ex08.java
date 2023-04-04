package atividades3;
//Escreva um algoritmo que leia dois numeros inteiros x e n e escrevga na tela n vezes o numero x.
import java.util.Scanner;
public class Ex08 {
     public static void main(String[] args){
     
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Digite um numero x: ");
         int x = sc.nextInt();
         System.out.println("Digite um numero n: ");
         int n = sc.nextInt();
         
         int totM = 0; 
         int cont = 0;
         
        
         do{
         
             cont++;
             totM += x;
                     
         }while(cont < n);
         
         
         
         /* while(cont < n){
         
             cont++;
             totM += x;
         
         }*/
        
         
         
         
         
         
         /* for(int i = 0; i < n; i++){
         
              totM += x;
         }*/
         System.out.println("O resultado de n vezes o numero x é de : "+totM);
     }    
}
