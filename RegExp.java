import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RegExp {
    public static void main(String[] args) {
        
        String str1 = args[1];
        String str2 = args[2];
        int s2Count = Integer.parseInt(args[3]);
               
         System.out.println("The input file:"+args[0]);
         System.out.println("str1="+str1);
         System.out.println("str2="+str2);
         System.out.println("num of repeated requests of str2 = "+s2Count);

        

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String line;
            while ((line = reader.readLine()) != null) {

                line = line.toLowerCase();

                boolean isPalindrome = PalindromeOrNot(line.toLowerCase());

                boolean containsStr1 = line.toLowerCase().contains(str1);

                boolean containsStr2N = CountStr(line.toLowerCase(), str2) >= s2Count;
 
                boolean containCertain = containOrNot(line.toLowerCase());


                 System.out.print(isPalindrome ? "Y," : "N,");
                 System.out.print(containsStr1 ? "Y," : "N,");
                 System.out.print(containsStr2N ? "Y," : "N,");                
                 System.out.println(containCertain ? "Y" : "N");
                 

            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


      public static boolean PalindromeOrNot(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }



    public static int CountStr(String str2, String subStr) {
        int count = 0;
        int lastIndex = 0;

        while ((lastIndex = str2.indexOf(subStr, lastIndex)) != -1) {
            count++;
            lastIndex += subStr.length();
        }
        return count;
    }

    public static boolean containOrNot(String line) {
        line = line.toLowerCase(); 

        int indexA = line.indexOf('a');
        if (indexA == -1) {
            return false; 
        }


        for (int i = indexA; i < line.length() - 2; i++) {
            if (line.charAt(i + 1) == 'b' && line.charAt(i + 2) == 'b') {
                return true; 
            }
        }

        return false; 
    }
}
