package atividades3;
//Escreva um algoritmo que imprimatodos os numeros inteiros de 100 e 200 em ordem decrescente
public class Ex17 {
  public static void main(String[] args){
  
      int n1 = 100;
      int n2 = 200;
      int aux = 0;
      
      /*for(int i = n2; i >= n1; i--){
      
          System.out.println(i+" , ");
      }*/
      //usando while
     /* int cont = n2;
      while(true){
       
          cont--;
          System.out.println(cont+" , ");
          if(cont <= n1){
             break;
          }
          
      }*/
     //usando do-while
     int cont = n2;
     do{
       cont--;
       System.out.println(cont+" , ");
       if(cont <= n1){
          break;
       }  
     }while(true);
      
      
  }    
}
