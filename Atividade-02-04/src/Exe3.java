import java.util.Scanner;

// Classe contendo o método principal para calcular o fatorial de um número
public class Exe3 {
    // Método principal que inicializa um objeto Scanner, lê um valor double do usuário,
    // calcula o fatorial do número dado e imprime o resultado
    public static void main(String[] args) {
        // Inicializa um novo objeto Scanner para ler entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que entre com um valor para calcular seu fatorial
        System.out.println("Entre com um valor para calcular o fatorial dele: ");

        // Lê um valor double do usuário
        double x = sc.nextDouble();

        // Fecha o Scanner
        sc.close();

        // Inicializa a variável f com o valor de x
        double f = x;

        // Loop que executa enquanto x for maior que 1
        while(x > 1){
            // Atualiza o valor de f multiplicando-o por (x - 1)
            f = f * (x - 1);

            // Decrementa o valor de x
            x--;
        }

        // Imprime o resultado
        System.out.println("Resultado: " +  f);
    }
}