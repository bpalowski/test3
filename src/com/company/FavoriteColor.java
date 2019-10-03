package com.company;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Date;

public class FavoriteColor {

    public static void main(String[] args) throws IOException {
        // Primative Types
//        byte age = 30;
//        int views = 1234567890;
        //or
//        int views = 123_456_7890;
//        long viewCount = 123456789100000000L;
//        float price = 10.99F;
//        char letter ='A';
//        boolean isEligible =false;

        //Reference for complex objects
//        Date now = new Date();
//        System.out.println(now);

        //
//        Point point1 = new Point(1,1);
//        Point point2 = point1;
//        point2.x = 2;
//        System.out.println("point1"+point1);
//        System.out.println("point2"+point2);
//
//        int num11 = 1;
//        int num22 = num11;
//        num22 = num22+1;
//        System.out.println("num11 "+ num11);
//        System.out.println("num22 "+ num22);


////////////////////////////////////////////////////////Array

//        int[] numbers = new int[8];
//        numbers[0]=1;
//        numbers[1]=2;
//         int[] numbers = {200,2,5,10,4};
//         Arrays.sort(numbers);
//         System.out.println(numbers.length);
//         System.out.println("numbers "+ Arrays.toString(numbers));

        // Matrix Array
//        int[][][] numbers = new int[4][1][1];
//        numbers[0][0][0] =1;
//        int[][] numbers = {{1,2,3},{4,5,6}};
//        System.out.println(Arrays.deepToString(numbers));

        /// Constants
//        final float pi = 3.14f;
//        System.out.println(pi);

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("What did you eat for breakfast?");
//        String yourBreakfast = bufferedReader.readLine();
//        System.out.println("You had " + yourBreakfast + " for breakfast.");

//        askWhatYouAteFor("breakfast");
//        askWhatYouAteFor("lunch");
//        askWhatYouAteFor("dinner");
    }

    public static void askWhatYouAteFor(String meal) {

        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("What did you eat for " + meal + "?");
            String yourMeal = bufferedReader.readLine();
            System.out.println("You had " + yourMeal + " for " + meal + ".");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}