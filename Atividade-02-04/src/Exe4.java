import java.util.Scanner;

public class Exe4{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Entre com um numero: ");
      int num = sc.nextInt();
      sc.close();
      boolean primo = true;
      for(int i = 2; i < num; i++){
          if(num % i == 0){
              primo = false;
              break;
          }
      }
      if(primo){
          System.out.println(num + " é um numero primo!");
      }else{
          System.out.println(num + " não é um número primo!");
      }
  }
}