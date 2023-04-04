
 
 import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args ){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a velociade do carro: ");
        double vMot = sc.nextDouble();
        int multa = 0;
        
        if(vMot >= 50 + 10 && vMot < 61){
           multa = + 50;
            System.out.println("Voçe pagara de multa 50 reais."+multa);
        }else if(vMot >= 61 && vMot < 91){
            multa = 100;
            System.out.println("Voçe pagara a multa de 100 reais."+multa); 
           
        }else if(vMot >= 91){
            multa = 200;
            System.out.println("Voçe paraga uma multa de 200 reais."+multa);
        }else if (vMot <= 25){
            multa = 50;
            System.out.println("Voçe sera multado por estar muito lento multa de : "+multa);
        }else if(vMot > 25 && vMot < 50){
            System.out.println("Voçe esta na velociade ideal ");
                    
        }
        
                
    }
}
