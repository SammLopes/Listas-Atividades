package atividades3;

//Escreva um algoritmo que determine se dois valores inteiros e positivos A e B são primos entre si. (dois números inteiros são ditos primos entre si, caso não exista divisor comum aos dois números)
// se o resto da divisao dos dois numeros for igual a 1 os dois sao primos 

import java.util.Scanner;
public class Ex24 {
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Digite um numero A: ");
          int a = sc.nextInt();
          System.out.println("Digite um numero B: ");
          int b = sc.nextInt();
          
          int resto;
          
          int menor = 0;
          int maior = 0;
          
          if(a > b){
             maior = a;
             menor = b;
          }else{
             maior = b;
             menor = a;
          }
          
          while(maior % menor != 0){
              resto = maior % menor;
              maior = menor;
              menor = resto;
              
          }
          if(menor == 1){
              System.out.println("Os Numeros A e B são primos");
          }else{
              System.out.println("Os numeros não sao primos ");
          }
          
        
          
        }    
}
