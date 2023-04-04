package atividades3;
//Escreva um algoritmo que imprima na tela od multiplos de 7 menores  que 300;
public class Ex10 {
    public static void main(String[] args) {
        int n = 300;
        int multiplo = 7;
        int soma = 0;
        
        for(int i = 0;i < n; i++){
        
             soma++;
             if(soma % multiplo == 0){
             
                 System.out.println(soma+" , ");
             }
        }
    }
}
