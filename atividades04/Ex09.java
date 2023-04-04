package atividades4;
/*Faça um programa que leia um vetor de cinco posições para números reais e, depois, um código inteiro. Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa. Caso, o código for diferente de 1 e 2 escreva uma mensagem falando que o código é inválido
*///Terminar o codigo
/*
1.int vetorOriginal: representa o tamanho do vetor original. Ou seja, 5;
2.int[] vetorCopia = new int[vetorOriginal]: cria um novo vetor/array com o mesmo tamanho do vetorOriginal;
3.int vetorOriginalZero: arrays são estruturas zero-based. Isso significa que sua contagem de registros nunca começa do número 1, mas sim do 0. Ex: se você fizer System.out.println(vetorOriginal[1]) será impresso 2 e não 1, pois o registro 1 está na posição vetorOriginal[0]. 
Criei essa variável para usar como um pequeno truque para percorrer o array. Se o tamanho do vetorOriginal é 5, se formos percorrer de 0 á 5 teremos 6 posições: 0, 1, 2, 3, 4, 5. Por isso subtraio 1 do tamanho original, fazendo com que essa variável fique com o valor 4 e quando formos percorrer teremos: 0, 1, 2, 3, 4 -> 5 posições;
4.vetorCopia[i] = vetorOriginal[vetorOriginalZero - i]: itera o vetorOriginal de trás para frente. Ex: assumindo i = 0, teremos: vetorCopia[0] = vetorOriginal[vetorOriginalZero - 0] -> na posição 0 do vetorCopia é atribuído o valor da última posição do vetorOriginal;
*/
import java.util.Scanner;
public class Ex09 {
    static Scanner sc = new Scanner(System.in);
    static double[] vetor = new double[5];
    
     public static void main(String[] args){
            lerVetor();
            lerCodigo();
     } 
     static void lerCodigo(){
         System.out.println("Digite 0 para finalizar o programa");
         System.out.println("Digite 1, para mostrar o vetor na ordem direta");
         System.out.println("Digite 2 paramostrar o vetor na ordem invertida");
         System.out.println("Digite o código: ");
         int num = sc.nextInt();
           while(num > 3 || num < 0){
                System.out.println("Digite um numero valido!!!");
                System.out.println("Digire 0 ,1 ,2");
                num = sc.nextInt();
            }
            switch(num){
                case 0:
                     System.out.println("Fim do programa");    
                break;
                case 1:
                    mostra();
                break;
                case 2:
                    inverteVetor();
                break;
            }
     }
     static void inverteVetor(){
        int vetorOriginal = vetor.length;
        double[] vetorCopia = new double[vetorOriginal];
        int vetorOriginalZero = vetorOriginal - 1;
        for(int i = 0; i < vetor.length; i++){
             vetorCopia[i] = vetor[vetorOriginalZero - i];
             System.out.print(vetorCopia[i]+" , ");
           }
     }
     static void lerVetor(){
         for(int i = 0;i < vetor.length;i++){
              System.out.println("Digite um numero da posição: "+i);
              vetor[i] = sc.nextInt();
         }
     }
     static void mostra(){
         for(int i = 0;i < vetor.length;i++){
             System.out.print(vetor[i]+" , ");
                     
         }
     }
     public static void para(){
         
     }
}
