package com.shubham.arrays;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Solution to Little Elephants and Candies
 *
 * Source: CodeChef
 * Link: https://www.codechef.com/problems/LECANDY
 */
public class LittleElephantAndCandies {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        int numOfTestCases = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < numOfTestCases; i++) {
            String[] input = scanner.nextLine().split(" ");
            int numOfElephants = Integer.parseInt(input[0]);
            int numOfCandies = Integer.parseInt(input[1]);
            boolean output = true;

            String[] candiesRequiredArray = scanner.nextLine().split(" ");
            for(int k = 0; k < candiesRequiredArray.length; k++) {
                int candiesRequired = Integer.parseInt(candiesRequiredArray[k]);
                if (candiesRequired <= numOfCandies) {
                    numOfCandies = numOfCandies - candiesRequired;
                } else {
                    output = false;
                }
            }
            if(output) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
