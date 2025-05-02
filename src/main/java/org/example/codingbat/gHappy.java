package org.example.codingbat;

public class gHappy {
    public static void main(String[] args) {
        System.out.println(gHappy("xxgggxyz"));
    }
    public static  boolean gHappy(String str) {

        int n=str.length();

        outerloop:
        for(int i=0; i<n; i++) {
            char ch=str.charAt(i);
            if(ch=='g') {
                if((i+1<n) && (str.charAt(i+1) =='g')) {
                    continue outerloop;
                }
                if(i>0 && (str.charAt(i-1) =='g')){
                    continue outerloop;
                }
                return false;
            }
        }
        return true;


//        while(str.length()>0) {
//            //find index of g
//            int indexOfg= str.indexOf("g", i);
//            if(indexOfg<0) {
//                return true;
//            }
//            //compare with g+1
//            if(str.charAt(indexOfg+1)!='g') {
//                return false;
//            }
//            //reduce string to g+2,n
//            str=str.substring(indexOfg+2);
//        }
//        return true;
    }


}
