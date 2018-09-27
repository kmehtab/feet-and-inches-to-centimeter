package com.kmehtab;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("tim", 500);
        System.out.println("New score is " + newScore);

//        calcFeetInchesToCentimeters(-10);
        double centimeter = calcFeetInchesToCentimeters(1);
        if (centimeter <0.0){
            System.out.println("invalid parameter");
        }

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("player " + playerName + " scored " + score + " points ");
        return score *1000;
    }

    public static double calcFeetInchesToCentimeters(double feet, double inches){
        if ((feet>=0) && (inches>=0 && inches<=12)){
            double centiMeters = (feet * 12)* 2.54;
            centiMeters +=inches * 2.54;
            System.out.println(feet + " feet , " + inches + " inches = " + centiMeters + " cm");
            return centiMeters;

        }else
            return -1;
    }

    public static double calcFeetInchesToCentimeters(double inches){
        if (inches>=0){
            double feet = (int) inches/12;
            double remainingInches = (int) inches%12;
            System.out.println(inches + " inches is = " + feet + "feet , " + remainingInches + "inches" );
            return calcFeetInchesToCentimeters(feet, remainingInches);
        }else
            return -1;
    }

}
