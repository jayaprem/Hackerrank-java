https://www.hackerrank.com/challenges/handshake/problem

Given the fact that any two persons shake hand exactly once, Can you tell the total count of handshakes?
INPUT:
The first line contains the number of test cases T, T lines follow. 
Each line then contains an integer N, the total number of Board of Directors of Acme.
OUTPUT:
0
1

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    static int handshake(int n) {
        int sum=0;
        if(n<=1) return 0;
        for(int i=(n-1);i>=1;i--)
        {
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
        int n=sc.nextInt();
        int a=handshake(n);
        System.out.println(a);
        }
        
    }
}
