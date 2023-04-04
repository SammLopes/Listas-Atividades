package atividades4;
//metodo da troca da inversão de valores de um vetor
public class InvertendoVetor2 {
    public static void main(String[] args){
        
        int[] v = {1,3,6,4,5,9};
        
        inverter(v);
        mostra(v);
     }    
    private static void mostra(int[] v){
         for(int x : v){
             System.out.print(x+" , ");
         }
    }
    private static void inverter(int[] v){
        int i, f;
        i = 0;
        f = v.length - 1;
        while(i < f){
            trocar(v ,i, f);
            i++;
            f--;
        }
    }

    private static void trocar(int[] v, int i, int f) {
        int aux = v[i];
        v[i] = v[f];
        v[f] = aux;
    }
}
