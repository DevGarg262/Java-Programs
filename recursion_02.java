import java.util.Scanner ;

public class recursion_02 {
    public static Scanner sc = new Scanner(System.in);

    public static int calls(int n) {
        if (n <= 1) {
            System.out.println("Base:  " + n);
            return n + 1;
        }
        int count = 0;

        System.out.println("Pre:  " + n);
        count += calls(n - 1);

        System.out.println("In:  " + n);
        count += calls(n - 2);

        System.out.println("Post:  " + n);
        return count + 3;
        
    }

    public static int calls_01(int n, int level) {
        if (n <= 1) {
            System.out.println("base : " + n + " @ " + level);
            return n + 1;
        }
        
        int count = 0;
        
        System.out.println("pre : " + n + " @ " + level);
        count += calls_01(n - 1, level + 1);
        
        System.out.println("In 1 : " + n + " @ " + level);
        count += calls_01(n - 2, level + 1);
        
        System.out.println("In 2 : " + n + " @ " + level);
        count += calls_01(n - 3, level + 1);
        
        System.err.println("post : " + n + " @ " + level);
        
        return count+3;

        

 }

    
    public static void main(String[] args) {
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        int level=sc.nextInt();

       // System.out.println(calls(n));
        // calls(n);
        System.out.println(calls_01(n, level));
    }
}      