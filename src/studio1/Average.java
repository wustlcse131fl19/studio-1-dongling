package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args){
        ArgsProcessor ap = new ArgsProcessor(args);
        int t1 = ap.nextInt("What was the highest temperature yesterday in integer?");
        int t2 = ap.nextInt("What is the highest temperature today in integer?");
        double average = (double) (t1 + t2)/2;
        System.out.println("Average of " + t1 + " degrees and " + t2 + " degrees is " + average + ".");

    }
}
