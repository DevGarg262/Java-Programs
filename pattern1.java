import java.util.Scanner;

public class pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number :  ");
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n - 1;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print(" ");
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*");
            }
            System.out.println();
            nsp--;
            nst++;
        }
    }
}