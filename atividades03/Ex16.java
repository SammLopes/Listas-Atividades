package atividades3;
//Escreva um algoritmo que imprima todos os numeor s inteiros de 1-00 a 200
public class Ex16 {
    public static void main(String[] args){
        int n1 = 100;
        int n2 = 200;
        //usando laço for
        /*for(int i = n1; i <= n2;i++){
            System.out.println(i+" , ");
        }*/
       //usando while
      /* int cont = n1;
       while(true){
       
           cont++;
           System.out.println(cont+" , ");
           if(cont >= n2){
              break;
           }
       }*/
      //usando do-while
      int cont = n1;
      do{
        cont++;
          System.out.println(cont+" , ");
          if(cont >= n2){
              break; 
          }
      }while(true);
    }
    
}
