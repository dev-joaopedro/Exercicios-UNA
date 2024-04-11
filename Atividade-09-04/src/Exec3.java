import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num [] = new double[5];
        double soma = 0;

        for (int i = 0; i < num.length; i++){
            num [i] = sc.nextDouble();
            soma += num[i];
        }
        sc.close();
        System.out.println("A média da soma é: " + soma / 5);
    }
}