import java.util.Scanner;

public class suhuu {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println(" Masukkan Celsius : ");
    double x = input.nextDouble();
   
    System.out.println(" Pilih Opsi :");
    System.out.println(" Farenheit :");
    System.out.println(" Reamur :");
    System.out.println(" Kelvin :");

    int opsi = input.nextInt();
     if (opsi == 1){
        double F = (x* 9/5) + 32;
        System.out.println(x + " Adalah " + F);
     }
     else if (opsi == 2){
      double R = (x* 4/5);
      System.out.println(x + " Adalah " + R);
     }
     else if (opsi == 3){
      double K = (x + 273);
      System.out.println(x + " Adalah " + K);
     }
     else{
      System.out.println("Opsi tidak valid");
     }
  }  
}
