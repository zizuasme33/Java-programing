package ZebibPractices.Practice_day14.Replit.ArraysREplit;

import java.util.*;

public class ArraysDivingScoreReplit {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            float[] score = new float[7];

            float max = score[0] , min = 11, sum =0, total =0, diff;

        for (int i = 0; i < score.length; i++) {

            System.out.println("Enter score for judge " + (i+1) + ":");
            score[i] = scan.nextFloat();
            if (score[i] > max){
                max = score[i];
            }
            if (score[i] < min ){
                min = score[i];
            }
            sum += score[i];

        }

        sum = sum-max-min;
        System.out.println("Enter difficulty:" );
        diff = scan.nextFloat();
        total = sum * diff * 0.6f;
        System.out.println("Total: " + total);






    }


}
