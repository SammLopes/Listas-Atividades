package atividades3;
//Escreva um algoritmo que imprima o quadrado dos números no intervalo fechado de 1 a 20

public class Ex19 {
   public static void main(String[] args){
       
        int f = 20;
        double quadrado = 0;
       /* for(int i = 1; i <= f;i++){
            quadrado = Math.pow(i, 2);
            System.out.println(quadrado+" , ");
        }*/
       //usando while
       int cont = 0;
      /* while(cont <= 20){
           cont++;
           System.out.println(Math.pow(cont,2
           )+"");
       }*/
      //usando do-while
      do{
        cont++;
          System.out.println(Math.pow(cont,2)+"");
      }while(cont < 20);
   }    
}
