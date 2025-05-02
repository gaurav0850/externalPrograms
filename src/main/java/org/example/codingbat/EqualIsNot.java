package org.example.codingbat;

public class EqualIsNot {
    public static void main(String[] args) {
        System.out.println(equalIsNot("isis"));
    }

    public static boolean  equalIsNot(String str) {
//        if(!str.contains("is") && !str.contains("not")) {
//            return true;
//        }
//        if((str.contains("is") && !str.contains("not")) || (!str.contains("is") && str.contains("not"))) {
//            return false;
//        }
        return countIs(str)==countNot(str);
    }

    static int  countIs(String str) {
        System.out.println("inside countIs");
        int count =0;
        int i=0;
        while((i+2)<=str.length()) {
            if(str.substring(i,i+2).equals("is")) {
                count++;
            }
            i++;
        }
        System.out.println(count);
        return count;
    }

    static int  countNot(String str) {
        System.out.println("inside countNot");
        int count =0;
        int i=0;
        while((i+3)<=str.length()) {
            if(str.substring(i,i+3).equals("not")) {
                count++;
                i+=2;
            }
            i++;
        }
        System.out.println(count);
        return count;
    }

}
