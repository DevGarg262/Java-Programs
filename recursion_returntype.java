import java.util.ArrayList;
import java.util.Scanner;

public class recursion_returntype {
  
    public static Scanner sc = new Scanner(System.in);

    
    public static ArrayList<String> subsequence(String str) {

        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>(); //base condition , it will make the new string
            base.add(" "); // check the tree diagram
            return base;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> recans = subsequence(ros); //recursion function
        ArrayList<String> myans = new ArrayList<>();
        myans.addAll(recans); //to add the previous elements without adding new element

        for (String s : recans) {
            myans.add(ch + s); //to add new elements
        }
        return myans;
    }

  
    public static String removehi(String ques) {

        if (ques.length() == 0) {
            String str = " ";
            return str;
        }

        if (ques.length() > 1 && ques.substring(0, 2).equals("hi")) {
            return removehi(ques.substring(2));
        } else {
            char ch = ques.charAt(0);
            return ch + removehi(ques.substring(1));
        }
    }


    public static String removehit(String ques) {
            
        if (ques.length() == 0) {
            String str = " ";
            return str;
        }
        
        if (ques.length() > 1 && ques.substring(0, 2).equals("hi")) {
            if (ques.length() > 2 && ques.substring(0, 3).equals("hit")) 
                return "hit" + removehit(ques.substring(3));
            else
                 return removehit(ques.substring(2));
    
        }      
        else {
            char ch = ques.charAt(0);
            return ch + removehit(ques.substring(1));
        }
        
}


    public static String removeduplicates(String ques) {

        if (ques.length() == 1) {
            String str = "  ";
            return str;
        }

        char ch = ques.charAt(0);
        String recans = removeduplicates(ques.substring(1));
        if(ch==recans.charAt(0))
        {
            return recans;
        } else {
            return ch + recans;
        } 

    }


    public static String compression(String str, int idx, int count) {
        if (idx == str.length()) {
            String ans = str.charAt(idx - 1) + (count > 1 ? count + " " : " ");
            return ans;
        }
        
        if(str.charAt(idx-1)==str.charAt(idx)){
            return compression(str,idx+1,count+1);
        }else{
            String ans=str.charAt(idx-1)+(count>1?count+" ":" ");
            return ans+compression(str,idx+1,1);
        }
        
        
    }


    public static ArrayList<String> mazepath(int sr, int sc, int er, int ec) {
     
        if (sr == er && sc == ec) {
            ArrayList<String> base = new ArrayList<>();
            base.add("  ");
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();
        if (sc + 1 <= ec) {
            ArrayList<String> horizontal = mazepath(sr, sc + 1, er, ec);
            for (String s : horizontal) {
                ans.add("H " + s);
            }
        }

        if (sr + 1 <= er) {
            ArrayList<String> vertical = mazepath(sr + 1, sc, er, ec);
            for (String s : vertical) {
                ans.add("V " + s);
            }
        }
        return ans;
 }


    public static ArrayList<String> mazepath_diagonal(int sr, int sc, int er, int ec) {

        if (sr == er && sc == ec) {
            ArrayList<String> base = new ArrayList<>();
            base.add("  ");
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();
        if (sc + 1 <= ec) {
            ArrayList<String> horizontal = mazepath_diagonal(sr, sc + 1, er, ec);
            for (String s : horizontal) {
                ans.add("H " + s);
            }
        }

        if (sr + 1 <= er) {
            ArrayList<String> vertical = mazepath_diagonal(sr + 1, sc, er, ec);
            for (String s : vertical) {
                ans.add("V " + s);
            }
        }

        if (sr + 1 <= er && sc + 1 <= ec) {
            ArrayList<String> diagonal = mazepath_diagonal(sr + 1, sc + 1, er, ec);
            for (String s:diagonal){
                ans.add("D "+s);
            }

        }
        return ans;
    }


    public static ArrayList<String> mazepath_diagonal_multi(int sr, int sc, int er, int ec) {

        if (sr == er && sc == ec) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; sc + i <= ec;i++) {
            ArrayList<String> horizontal = mazepath_diagonal_multi(sr, sc + 1, er, ec);
            for (String s : horizontal) {
                ans.add("H"+i+""+ s);
            }
        }

        for (int i = 0; sr + i <= er;i++) {
            ArrayList<String> vertical = mazepath_diagonal_multi(sr + 1, sc, er, ec);
            for (String s : vertical) {
                ans.add("V" + i + "" + s);
            }
        }

        for (int i = 0; ((sr + i) <= er) && ((sc + i) <= ec);i++) {
            ArrayList<String> diagonal = mazepath_diagonal_multi(sr + 1, sc + 1, er, ec);
            for (String s : diagonal) {
                ans.add("D" + i + "" + s);
            }

        }
        return ans;
    }

    
    public static void main(String[] args) {

       // String str = "ABCD";
        //String ques = sc.nextLine();
        //System.out.println(subsequence(str));
      //  System.out.println(removehi(ques));
      // System.out.println(removehit(ques));
        //System.out.println(compression(ques, 1, 0));
       // System.out.println(mazepath(0, 0, 2, 2));
      //  System.out.println(mazepath_diagonal(0, 0, 2, 2));
      System.out.println(mazepath_diagonal_multi(0,0,2,2));
    }
}