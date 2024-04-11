import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        int dia = sc.nextInt();
        System.out.println("Digite o mes: ");
        int mes = sc.nextInt();
        System.out.println("Digite o ano: ");
        int ano = sc.nextInt();
        sc.close();

        switch (mes) {
            case 1:
                System.out.println(dia + " de janeiro de " + ano);
                break;
            case 2:
            System.out.println(dia + " de fevereiro de " + ano);
                break;
            case 3:
                System.out.println(dia + " de março de " + ano);
                break;
            case 4:
                System.out.println(dia + " de abril de " + ano);
                break;
            case 5:
                System.out.println(dia + " de maio de " + ano);
                break;
            case 6:
                System.out.println(dia + " de junho de " + ano);
                break;
            case 7:
                System.out.println(dia + " de julho de " + ano);
                break;
            case 8:
                System.out.println(dia + " de agosto de " + ano);
                break;
            case 9:
                System.out.println(dia + " de setembro de " + ano);
                break;
            case 10:
                System.out.println(dia + " de outubro de " + ano);
                break;
            case 11:
                System.out.println(dia + " de novembro de " + ano);
                break;
            case 12:
                System.out.println(dia + " de dezembro de " + ano);
                break;
            default:
                System.out.println("Mês inválido");
                return;
        }
    }
}
