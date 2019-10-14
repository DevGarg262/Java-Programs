import java.util.Scanner;

public class numberpattern {

    public static void number(int n) {
        int nsp = n / 2;
        int nst = 1;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print(" ");
            }
            int val = r;
            if (r > n / 2 + 1) {
                val = n - r + 1;
            }

            for (int cst = 1; cst <= nst; cst++) {

                System.out.print(val);
                if (cst <= nst / 2) {
                    val++;
                } else
                    val--;
            }
            if (r <= n / 2) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }
            System.out.println();
        }

    }

    public static void number1(int n) {
        int nsp = n / 2;
        int nst = 1;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print(" ");
            }
            int val = r;
            if (r > n / 2 + 1) {
                val = n - r + 1;
            }

            for (int cst = 1; cst <= nst; cst++) {

                System.out.print(val);
                if (cst <= nst / 2) {
                    val--;
                } else
                    val++;
            }
            if (r <= n / 2) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number :  ");
        int n = sc.nextInt();
        number(n);
        number1(n);
    }
}