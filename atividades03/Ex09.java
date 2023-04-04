package atividades3;
//escreva um algoritmo que exiba na tela a soma dos 200 primeiros numeros naturais

public class Ex09 {
   public static void main(String[] args){

       int n = 200;
       int soma = 0;
       int totSoma = 0;
       int cont = 0;
      
       
       do{
       
           cont++;
           soma++;
           System.out.println(soma+" , ");
           totSoma += soma;
               
        }while(cont < n );
       
          /*while(cont < n){
       
           cont++;
           soma++;
           System.out.println(soma+" , ");
           totSoma += soma;
       }*/
       
       
       /* for(int i =0; i < 200; i++){
       
           soma++;
           System.out.println(soma+" , ");
           totSoma += soma;
       }*/
       System.out.println("A soma dos 200 primeiros numeros é de : "+totSoma);
       
   }    
}
