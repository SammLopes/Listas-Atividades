package atividades4;
//Faça uma função que receba um vetor de 10 posições e verifique se existem valores iguais exibindo esses valores caso existam
import java.util.Scanner;
import java.util.ArrayList;
public class Ex07 {
    public static Scanner sc = new Scanner(System.in);
    public static int[] vetor = new int[11];
    public static ArrayList <Integer> numIguais = new ArrayList(10);
     public static void main(String[] args){
           lerVetor();
           mostrar();
           verificarIguais();
     }
     public static void lerVetor(){
         for(int i = 0; i < vetor.length - 1; i++){
               System.out.println("Digite a aposição: "+i);
               vetor[i] = sc.nextInt();
          }
         System.out.println("Fim da função de leitura de valores");
     }
     public static void verificarIguais(){
          
          for(int i = 0;i < vetor.length  ; i++){
              for(int j = 0; j < vetor.length ; j++){
               int aux = vetor[i];
               int index = i;
                if(vetor[j] == aux && index != j){
                   numIguais.add(vetor[i]);
                   System.out.println("Valores iguais: "+vetor[i]);
                 }
                
            }
             
          }
          System.out.println("Fim da verificação de valores iguais");
          for(int i = 0; i <  numIguais.size(); i++){
                System.out.println(numIguais.get(i)+" , \n");
          }
          System.out.println("Fim da função que mostra a alista de valores");
     }
     public static void mostrar(){
         for(int i = 0; i < vetor.length -1;i++){
               System.out.print(vetor[i]+" , \n");
         }
         System.out.println("Fim da função mostrar");
     }
}
