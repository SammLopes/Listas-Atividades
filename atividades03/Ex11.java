package atividades3;
//escreva um algortimo que exiba a media aritmetica dos numeros pares compreendido entre 27 e 135
public class Ex11 {
    public static void main(String[] args){
    
        int n1 = 27;
        int n2 = 135;
        int soma = 0;
        int totPar = 0;
        for(int i = n1;i <= n2 ;i++){
        
            if(i % 2 == 0){
               soma += i;
               totPar++;
            }
        }
        int media = soma / totPar ;
        System.out.println("A media dos numeros pares entre 27 e 135 é: "+media);
                
        
    }
}
