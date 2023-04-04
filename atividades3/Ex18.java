package atividades3;
//imprima os 100 primeiors numeros impares 
public class Ex18 {
   public static void main(String[] args){
    
      //usando laço for 
       /*for(int i = 0; i < 100;i++){
           if(i % 2 == 1){
               System.out.println(i+" , ");       
           }
       }*/
      /* for(int i = 1; i < 100;i+=2){
           System.out.println(i+" , ");
       }*/
      //usando while
      int cont = -1;
     /* while(cont < 100){
         cont += 2;
          System.out.println(cont+" , ");
      }*/
     /*while(cont < 100){
         cont++;
         if( cont % 2 == 1){
             System.out.println(cont+" , ");
                     
         }
                 
     }*/
     //usando do-while
    /* do{
         cont+=2;
         System.out.println(cont+" , ");
     }while(cont < 100);*/
    /*do{
       cont++;
       if(cont % 2 == 1){
           System.out.println(cont+" , "); 
       }
    }while(cont < 100);*/
    
    for(int i = 1; i < 100; i+=2){
    
        if(i % 2 == 1){
            System.out.println(i+"");
        }else{
            continue;
        }
    }
     
     
      
   }    
}
