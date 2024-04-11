public class Exec2 {
    public static void main(String[] args) {
        double num [] = {2.5, 6.4, 7.5, 1, 1, 2, 7, 5};
        double soma = 0;
        
        for (int i = 0; i < num.length; i++){
            soma += num[i];
        }
        System.out.println(soma);
    }
}