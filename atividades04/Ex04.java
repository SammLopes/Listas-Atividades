package atividades4;
/*Implemente uma função para ler N números inteiros no intervalo [0, 50] e os armazene em um vetor com 100 posições. Preencha um segundo vetor apenas com os números ímpares do primeiro vetor. Imprima o conteúdo dos dois vetores 10 elementos por linha
*/
//perguntar ao professsor de como imprimir os dez primeiros valores em um vetor de 100 posições
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         int[] vet1 = new int[20];
         int[] vet2 = new int[20];
         System.out.println("Digite valores entre 0 e 50");
         for(int i = 0; i < vet1.length; i++){
              System.out.println("Digite o valor da posição: "+i);
              vet1[i] = sc.nextInt();
              
              while(vet1[i] > 50){
                  System.out.println("Digite um valor menor que 50");
                  vet1[i] = sc.nextInt();
              }
              if(vet1[i] % 2 == 1 ){
                  vet2[i] = vet1[i];
              }
         }
         System.out.println("Primeiro Vetor");
         for(int i = 0; i < vet1.length;i++){
                System.out.println(vet1[i]+" , ");
         }
         System.out.println("Segundo Vetor");
         for(int i = 0; i < vet2.length;i++){
                System.out.print("\n"+vet2[i]+" , \n");
         }
    }    
}
