import java.awt.BorderLayout;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();
        
        if(valor >0){
            System.out.println("O valor digitado é maior que zero");
        }else if(valor == 0 ){
            System.out.println("O valor digitado é igaul a zero");
        }else{
            System.out.println("O valor digigtado é menor que zero");        
        }
                
    }
}
