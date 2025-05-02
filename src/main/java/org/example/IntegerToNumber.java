package org.example;

import java.util.*;


//Range
// 0 = zero
//2 147 483 647 = two billion one hundred forty-seven million four hundred eighty-three thousand six hundred forty-seven

public class IntegerToNumber {

    private static final int BILLION = 1000000000;
    private static final int MILLION = 1000000;
    private static final int THOUSAND = 1000;
    private static final int HUNDRED = 100;
    private static final int TEN = 10;

    static Map<Integer, String> map = new HashMap<>();

    private static void initializemap() {
        map.put(0, "Zero");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(TEN, "Ten");
        map.put(11, "Eleven");
        map.put(12, "Twelve");
        map.put(13, "Thirteen");
        map.put(14, "Fourteen");
        map.put(15, "Fifteen");
        map.put(16, "Sixteen");
        map.put(17, "Seventeen");
        map.put(18, "Eighteen");
        map.put(19, "Nineteen");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");
        map.put(50, "Fifty");
        map.put(60, "Sixty");
        map.put(70, "Seventy");
        map.put(80, "Eighty");
        map.put(90, "Ninety");
        map.put(HUNDRED, "Hundread");
        map.put(THOUSAND, "Thousand");
        map.put(MILLION, "Million");
        map.put(BILLION, "Billion");
    }


    public static void main(String[] args) {
        long initial = System.currentTimeMillis();
        System.out.println(numberToWords(318));
//        System.out.println(numberToWords(0));
//        System.out.println(numberToWords(100));
//        System.out.println(numberToWords(1000));
//        System.out.println(numberToWords(1000000));
//        System.out.println(numberToWords(1000000000));
        long finalTime = System.currentTimeMillis();
        System.out.println("time required :"+(long)(finalTime - initial));
    }

    public static String numberToWords(int num) {
        System.out.println("input"+num);
        StringBuilder result =new StringBuilder();
        initializemap();

        //check if number exists in map
        if(map.containsKey(num))
            return map.get(num);

        //
        List<Integer> individualNumberList = findIndividualNumber(num);
        int multiplier = individualNumberList.size() - 1;
        for(int i : individualNumberList) {
            int n=i;
            int num1 = (int) (i / Math.pow(10, multiplier));
            n = (int) (n-(num1*Math.pow(10,multiplier)));
            if(map.containsKey(n)) {
                result.append(map.get(i)).append(" ");
                result.append(map.get((int)Math.pow(10,multiplier))).append(" ");
            }
            if(map.containsKey(num1)) {
                result.append(map.get(i)).append(" ");
//                result.append(map.get((int)Math.pow(10,multiplier))).append(" ");
            }
        multiplier--;
        }

        return result.toString();
    }

    private static List<Integer> findIndividualNumber(int num) {
        List<Integer> result = new LinkedList<>();
//        StringBuilder n= new StringBuilder(String.valueOf(num));
//        num = Integer.parseInt(n.reverse().toString());
        int multiplier = 1;
        while(num>0) {
//            if(num<20) {
//                result.add(num);
//                break;
//            }
            int digit = (num%10);
//            int digit = num%10;
            System.out.println("digit"+ digit+"multiplier"+ multiplier);
            result.add(digit);
            num=num/10;
            multiplier = multiplier*10;
        }
        Collections.reverse(result);
        System.out.println("Result"+result);
        return  result;
    }
}
