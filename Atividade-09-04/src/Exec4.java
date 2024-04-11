import java.util.Scanner;

public class Exec4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num [] = {1, 4, 6, 8, 7, 9};
        System.out.println("Entre com o valor a ser buscado: ");
        int valorb = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < num.length; i++){
            if (num[i] == valorb){
                System.out.println("O valor encontrado foi: " + valorb);
                encontrado = true;
        }
    }
    sc.close();
    if (!encontrado){
        System.out.println("Valor nao encontrado");
    }
}
}
