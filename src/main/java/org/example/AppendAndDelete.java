package org.example;

import java.util.ArrayList;
import java.util.List;

public class AppendAndDelete {

    public static void main(String[] args) {
        int[] arr=new int[3];
        System.out.println(arr[0]);
        List<String> inputs = new ArrayList<>();
        inputs.add("abc,ba,4");
        inputs.add("ashley,ash,2");

        for(String in: inputs) {
            String[] ins=in.split(",");
            String s=ins[0];
            String t=ins[1];
            int k=Integer.parseInt(ins[2]);
            System.out.println(method(s,t,k));
        }
    }

    public static String method(String s, String t, int k) {

        if((s.length()+t.length())<k) return "Yes";
        //Find length of common prefix
        int minLength = Math.min(s.length(), t.length());
        int commonLength = 0;
        for (int i = 0; i < minLength; i++) {
            if (s.charAt(i) == t.charAt(i))
                commonLength++;
            else
                break;
        }
        System.out.println("common"+commonLength);

        //find minimum moves
        //delete remaining characters from s
        //add remaining characters of t

        int min = (s.length()-commonLength)+(t.length()-commonLength);
        System.out.println("min"+min);

        if(k<min) return "No";
        return (k-min)%2==0?"yes":"no";
    }
}
