package BaekJoon.OneDayCoding.Bronze5.Day20;

import java.util.Scanner;

public class ex4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && a == b){
                break;
            }
            if (a > b)  {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
