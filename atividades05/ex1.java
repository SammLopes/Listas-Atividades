package atividades05;

/*Realizar a soma sem usar os operadores aritimeticos*/
public class ex1 {
    public static void main(String[] args){
        System.out.println("A soma é: "+sum(2,2));
    }
    
    public static int sum(int a, int b){
        while(b != 0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
