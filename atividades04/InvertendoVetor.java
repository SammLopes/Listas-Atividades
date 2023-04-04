package atividades4;
/*
1.int vetorOriginal: representa o tamanho do vetor original. Ou seja, 5;
2.int[] vetorCopia = new int[vetorOriginal]: cria um novo vetor/array com o mesmo tamanho do vetorOriginal;
3.int vetorOriginalZero: arrays são estruturas zero-based. Isso significa que sua contagem de registros nunca começa do número 1, mas sim do 0. Ex: se você fizer System.out.println(vetorOriginal[1]) será impresso 2 e não 1, pois o registro 1 está na posição vetorOriginal[0]. 
Criei essa variável para usar como um pequeno truque para percorrer o array. Se o tamanho do vetorOriginal é 5, se formos percorrer de 0 á 5 teremos 6 posições: 0, 1, 2, 3, 4, 5. Por isso subtraio 1 do tamanho original, fazendo com que essa variável fique com o valor 4 e quando formos percorrer teremos: 0, 1, 2, 3, 4 -> 5 posições;
4.vetorCopia[i] = vetorOriginal[vetorOriginalZero - i]: itera o vetorOriginal de trás para frente. Ex: assumindo i = 0, teremos: vetorCopia[0] = vetorOriginal[vetorOriginalZero - 0] -> na posição 0 do vetorCopia é atribuído o valor da última posição do vetorOriginal;
*/
import java.util.Scanner;
public class InvertendoVetor {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          
          int[] vetor = new int[5];
          
          for(int i = 0; i < vetor.length; i++){
              System.out.println("Digite o valor da posição: "+i);
              vetor[i] = sc.nextInt();
              
          }
          
          int vetorOriginal = vetor.length;
          int[] vetorCopia = new int[vetorOriginal];
          int vetorOriginalZero = vetorOriginal - 1;
          for(int i = 0; i < vetorOriginal; i++){
             vetorCopia[i] = vetor[vetorOriginalZero - i];
             System.out.print(vetorCopia[i]+" , ");
          }
          
          for(int i  = 0; i < vetor.length; i++){
              System.out.print("\n "+vetor[i]+" , ");
          }
          
     }    
}
