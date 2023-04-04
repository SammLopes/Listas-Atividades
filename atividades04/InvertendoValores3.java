package atividades4;
import java.util.Scanner;
public class InvertendoValores3 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        for(int i = 0 ; i < vetor.length; i++){
             System.out.println("Digite o valor da posição: "+i);
             vetor[i] = sc.nextInt();
        }
        inverter(vetor);
        mostrar(vetor);
     }  
     public static void mostrar(int[] vetor){
         for(int x : vetor){
             System.out.println(x+" , ");
         }
     }
     public static void inverter(int[] vetor){
         int f, i;
         i = 0;
         f = vetor.length - 1;
         while(i < f){
            troca(vetor, i, f);
            i++;
            f--;
         }
     }
     public static void troca(int[] vetor, int i, int f){
         int aux = 0;
         aux = vetor[i];
         vetor[i] = vetor[f];
         vetor[f] = aux;
    }
}
