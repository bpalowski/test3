package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarWith {


    public static void main(String[] args){
//        System.out.println("Whats your name");
//        try{
//            BufferedReader bufferrReader =  new BufferedReader(new InputStreamReader(System.in));
//            String userName = bufferrReader.readLine();
//            if(userName.startsWith("B")){
//                System.out.println("Your name");
//            }else{
//                System.out.println("No");
//            }
//
//        }
//        catch (IOException e){
//
//            e.printStackTrace();
//        }

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("In what season are you booking a stay?");
//        String season = bufferedReader.readLine();
//
//        System.out.println("On the weekend, or a weeknight?");
//        String dayOfWeek = bufferedReader.readLine();
//
//        boolean summer = season.equals("summer");
//        boolean weekend = dayOfWeek.equals("weekend")
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("In what season are you booking a stay?");
            String season = bufferedReader.readLine();

            System.out.println("On the weekend, or a weeknight?");
            String dayOfWeek = bufferedReader.readLine();

            boolean summer = season.equals("summer");
            boolean weekend = dayOfWeek.equals("weekend");
            if ( summer && weekend ) {
                System.out.println("Your stay is probably going to be pretty expensive. It's both peak travel season AND the weekend.");
            } else {
                System.out.println("Your stay might be expensive, but it's not during peak travel season, so it could certainly be worse!");
            }
        }

        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    }

