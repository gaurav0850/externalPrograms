package org.example.codingbat;

public class countTriple {
    public static void main(String[] args) {
        System.out.println(countTriple("xxxabyyyycd"));
    }

    public static int countTriple(String str) {
        int n=str.length();
        int count=0;
        if(n<3) {
            return 0;
        }

        for(int i=1; i<n-1; i++) {
            char ch=str.charAt(i);
            if(str.charAt(i-1)== ch && str.charAt(i+1)==ch) {
                count++;
            }
        }

        return count;
    }

}
