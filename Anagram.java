Two strings, a and b , are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If a  and b are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.
Input: 
anagram
margana
output:
Anagrams

import java.util.Scanner;
public class Solution {

    static boolean isAnagram(String a, String b) {
        int i=0,j=0,c=0;
        a=a.toLowerCase();
        b=b.toLowerCase();
        boolean B=false;
        if(a.length()!=b.length())  B=false;
        else
        {
            for(i=0;i<a.length();i++)
            {
                for(j=0;j<b.length();j++)
                {
                    if(a.charAt(i)==b.charAt(j))
                    {
                        c++;
                        int t=b.indexOf(b.charAt(j));
                        b=b.substring(0,t)+b.substring(t+1);
                        break;
                    }
                }
            }
            B=b.isEmpty();
        }
       
public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
