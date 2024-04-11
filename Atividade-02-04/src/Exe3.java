import java.util.Scanner;

public class Exe3 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Entre com um valor para calcular o fatorial dele: ");
      double x = sc.nextDouble();
      sc.close();
      double f = x;
      while(x > 1){
          f = f * (x - 1);
          x--;
      }
      System.out.println("Resultado: " +  f);
  }
}
