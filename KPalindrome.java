import java.util.Scanner;

public class KPalindrome {
    /**
     * @author Rishabh
     * @param string
     * @param k
     * @return
     */
    public static int kPalindrome(String string,int k){

        //Base Case If the length of the String is Less than 2
        if (string.length() < 2){
            return k;
        } else {
            //Checks the First and the last character
            if (string.charAt(0) == string.charAt(string.length() - 1)) {
                return kPalindrome(string.substring(1, string.length() - 1), k);
            } else {
                //Checks the first and the second last character
                if (string.charAt(0) == string.charAt(string.length()-2)){
                    //Shrinks the string from last by 1 element
                    return kPalindrome(string.substring(0, string.length() - 1), k + 1);
                    //Checks the second and the last character
                }else if(string.charAt(1) == string.charAt(string.length() -1)){
                    //Shrinks the string from fist by 1
                    return kPalindrome(string.substring(1,string.length()),k+1);
                    // Removes the first and the last element
                }else {
                    //Shrinks the String from both front and back
                    return kPalindrome(string.substring(1, string.length()-1), k + 2);
                }
            }
        }
    }

    public static void main(String[] args) {

        //Scanner for taking the user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Word: ");
        //Converting the user input into a String
        String s1 =sc.next();

        int number = kPalindrome(s1,0);

        //Displaying the final result
        System.out.println(s1+" is a "+number+"-Palindrome");


    }
}
