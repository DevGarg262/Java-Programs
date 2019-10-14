import java.util.Scanner;

public class recursion_01 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
     int n = sc.nextInt();
      //  int d = sc.nextInt();
        System.out.print(largepower(a, b));
       System.out.println();
       // printinr(a, b);
     // System.out.println();
        System.out.print(fact(n));
    System.out.println();
   // printdr(a, b);
    }

    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }

        int ans = power(a, b - 1);
        return a * ans;

    }

    public static int largepower(int a, int b) {

        if (b == 0) {
            return 1;
        }
        int res = largepower(a, b / 2); // all statements written after recursive fn will print , during returning
        if (b % 2 == 0) {                // jb niche aarhe honge tb print hogi
            System.out.print(res*res+"  ");  //yha ye line srf smjne ke liye likhi hai ki ho kya rha hai
            return res * res;
        } else {
            System.err.print(res * res * a+"  "); // smjhne ke liye likhi hai , check tree dig for more understanding
            
            return res * res * a; // we can write like this also  return(b&1)==0?res*res:res*res*a ;
        }

    }
    
    public static void printinr(int a, int b) {
        if (a == b + 1) {
            return;
        }
        System.out.print(a + " ");   //yha pe statement recursive fn se phle likhi hai to 
        printinr(a + 1, b);    // jb hm uppar jare honge tb print hogi, check tree memory diagram to understand
    }
    
    
    public static void printdr(int a, int b) {
        if (a == b+1) {
            return ;
        }
        printdr(a + 1, b);       // jo statement recursive function ke baad likhi hai 
        System.out.print(a+" ");  // vo return aate hue print hogi jaise iss wale fn me ho rhi hai


    }
    
    public static int fact(int n) {
        if (n <= 0) {
            return 1;
        }
        int res = fact(n - 1);
        System.out.print(n * res+"  ");  // return aate hue print kre ga
        return n * res;               //final return ka ans dega

}

}