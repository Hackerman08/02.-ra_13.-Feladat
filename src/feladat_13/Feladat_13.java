
package feladat_13;

import java.util.Scanner;


public class Feladat_13 {

   
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int osszes = 0;
    int a = 1 + (int) (Math.random() * 99);
    int talalatok = 0;

    System.out.println("Gondoltam egy számra 1 és 100 közöt"
        + " ... ki találod melyik az ?");

    while (talalatok != a) {
        talalatok = keyboard.nextInt();
        osszes++;
        if (talalatok > a) {
            System.out.println("Kisseb!");
        } else if (talalatok < a) {
            System.out.println("Nagyobb!");
        }
    }
    System.out.println("Gratulálok. Ki találtad a számot "
        + osszes + " probálkozásból!");
    }
  }
    

