import java.util.Scanner;

public class Exerc1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entre com o ano de casamento: ");
    int anosCasamento = sc.nextInt();
    System.out.println("Entre com o ano atual: ");
    int anosAtual = sc.nextInt();
    int op = anosAtual - anosCasamento;
    sc.close();

    switch (op) {
      case 25:
        System.out.println("Bodas de Prata!");
        break;
      case 50:
        System.out.println("Bodas de Ouro!");
        break;
      case  75:
        System.out.println("Bodas de Diamante!");
        break;
    }
  }
}
