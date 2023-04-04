package atividades4;
/*
Crie uma função chamada imprimeLinha sem retorno que receba como parâmetro um número inteiro N. Essa função deve imprimir na tela uma linha com a sequencia de N caracteres ‘=’. 
Por exemplo: a chamada imprimeLinha(10) deve imprimir a sequência ==========
Crie um programa para testar sua função

*/
public class Ex16 {
    public static void main(String[] args){
        imprimiLinha(10);
    }
    
    public static void imprimiLinha(int num){
        for(int i = 0; i < num; i++){
            System.out.print("=");
        }
        System.out.println();       
    }
}
