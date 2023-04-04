package atividades4;
//Criar uma função para retornar um inteiro que seja o resultado da soma entre dois inteiros A e B. Use um programa para testar essa função
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args){
        teste();
    }    
    
    public static int soma(int num1, int num2){
        return num1 + num2;
    }
    
    public static void teste(){
         int teste1 = soma(1,2);
         System.out.println("Soma: "+teste1);
         int teste2 = soma(2,5);
         System.out.println("Soma: "+teste2);
    }
}
