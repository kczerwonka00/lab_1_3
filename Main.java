import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner wejscie = new Scanner(System.in);
    int a, b, suma;
    System.out.println("Podaj liczbe a: ");
      a=wejscie.nextInt();
    System.out.println("Podaj liczbe b: ");
      b=wejscie.nextInt();
    suma=a+b;
    double potega=Math.pow(a,b);
    System.out.println("Suma a i b wynosi: "+suma);
    System.out.println("Liczba a do potęgi b to: "+potega);
  }
}