import java.util.Scanner;
public class biopattern{

    public static void pattern(int n){

int nst = 1;
      for(int r=0;r<n;r++){
int val =1;

          for(int cst=0;cst<nst;cst++){
              System.out.print(val);
         val =(val*(r-cst))/(cst+1);
          }
          nst++;
          System.out.println();
      }

    }

    public static void main(String[] args){
   Scanner sc =new Scanner(System.in); 
           System.out.println("enter your number :  ") ;
        int n =sc.nextInt();
            pattern(n);
}
}