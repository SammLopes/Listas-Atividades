
package atividades4;
//Faça uma função que receba do usuário dois arrays, A e B, com 10 números inteiros cada e crie 
//um novo array C calculando C = A – B. Exiba os dados do array C após o cálculo
import java.util.Scanner;

public class Ex06 {
    private static int[] a = new int[10];
    private static int[] b = new int[10];
    private static int[] c = new int[10];
      public static void main(String[] args){
              System.out.println("Digite os valores para os vetores A e B");
              lerVetores();
              mostra();
              calculoVetor();
      }    
      public static void lerVetores(){
          Scanner sc  = new Scanner(System.in);
          
          for(int i = 0; i < a.length;i++){
              System.out.println("Digite o valor para o Vetor A: "+i);
              a[i] = sc.nextInt();
              System.out.println("Digite o valor para o Vetor B: "+i);
              b[i] = sc.nextInt();
              
          }
          
      }
      public static void mostra(){
           System.out.println("Vetor A: ");
           for(int i = 0; i < a.length; i++){
               System.out.print(" "+a[i]+" , \n");
            }
           System.out.println("Vetor B: ");
           for(int i = 0; i < b.length; i++){
               System.out.print(" "+b[i]+", \n");
           }
      }
      public static void calculoVetor(){
           System.out.println("Vetor C: ");
           for(int i = 0; i < a.length; i++){
                c[i] = a[i] - b[i];
                System.out.println(" "+c[i]+" , \n");
           }
      }
      
      
}
