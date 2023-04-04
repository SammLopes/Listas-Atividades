package atividades3;
//Criar um algoritmo que leia um número (NUM), e depois leia NUM (essa quantidade) números inteiros e imprima o maior deles. Suponha que todos os números lidos serão positivos
import java.util.Scanner;
public class Ex21 {
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos numeros voçe quer digitar?  ");
        int num = sc.nextInt();
        int n ;
        int  aux = 0;
       /* for(int i = 0; i <= num; i++){
        
            System.out.println("Digite o numero "+i);
            n = sc.nextInt();
            
            if(n > aux){
              aux = n;
            }
                    
        }*/
       int cont = 0;
       /*while(cont <= num){
           cont++;
           System.out.println("Digite um numero "+cont);
           n = sc.nextInt();
           
           if(n > aux){
               aux = n;
           }
           
       }*/
       
       do{
         cont++;
         System.out.println("Digite um numero "+cont);
         n = sc.nextInt();
         
         if(n > aux){
            aux = n;
         }
                 
       }while(cont <= num);
        System.out.println("O maior numero digitado é: "+aux);
        
    }
}
