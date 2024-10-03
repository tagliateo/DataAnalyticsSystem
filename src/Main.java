/*
You are working on a data analysis project where you need to process an array of opening stock prices containing 10 days of data as float datatype.

Question:

Consider a scenario where you have been given an array of integers representing the daily stock prices of a company for a given period. You are also provided with an ArrayList of stock prices for the same period You are required to implement a program that performs the following tasks:

Note:

Assume both the array and ArrayList of stock prices is not null and contains at least one element.

You are allowed to use loops (for, while) for array and ArrayList.

Write the code for the above scenario, including the required methods and their implementations.

Remember to use appropriate variable names and follow coding best practices.

Submit the assignment in MS Word or PDF file. Your submission should contain the program code, explanation, and output screenshot

 */


import java.util.ArrayList;

public class Main {

    public static float calculateAveragePrice(float[] stockPrices) {
        /*
        Calculate the average stock price:
        Write a method, calculateAveragePrice, that takes the array of stock prices as input and returns the average price of the stock`
         */

        float sum = 0.0f;
        for (float price : stockPrices) {
            sum += price;
        }
        return sum / stockPrices.length;
    }

    /*
    Find the maximum stock price:
    Write a method, findMaximumPrice, that takes the array of stock prices as input and returns the maximum price among all the stocks.
     */
    public static float findMaximumPrice(float[] stockPrices) {
        float max = Float.MIN_VALUE;
        for (float price : stockPrices) {
            if (price > max) {
                max = price;
            }
        }
        return max;
    }


    /*
    Determine the occurrence count of a specific price:
    Write a method, countOccurrences, that takes the array of stock prices and a target price as input and returns the number of times the target price occurs in the array.
     */

    public static int countOccurrences(float[] stockPrices, float targetPrice) {
        int count = 0;
        // Loop through the array and count occurrences of the target price
        for (float price : stockPrices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count; // Return the total count
    }

    /*
    Compute the cumulative sum of stock prices:
    Write a method, computeCumulativeSum, that takes the ArrayList of stock prices as input and returns a new ArrayList containing the cumulative sum of prices at each position.
     */

    // Method to compute the cumulative sum of stock prices in an ArrayList
    public static ArrayList<Float> computeCumulativeSum(ArrayList<Float> stockPrices) {
        ArrayList<Float> cumulativeSum = new ArrayList<>();
        float runningTotal = 0.0f;

        // Loop through the provided stock prices to compute cumulative sum
        for (float price : stockPrices) {
            runningTotal += price; // Update running total with the current price
            cumulativeSum.add(runningTotal); // Add the running total to the cumulativeSum list
        }
        return cumulativeSum; // Return the cumulative sum ArrayList
    }


    public static void main(String[] args) {
        float[] stockPricesArray = {150.5f, 152.3f, 149.8f, 153.2f, 151.0f, 154.5f, 150.0f, 152.8f, 149.2f, 153.0f};

        ArrayList<Float> stockPricesList = new ArrayList<>();
        stockPricesList.add(150.5f);
        stockPricesList.add(152.3f);
        stockPricesList.add(149.8f);
        stockPricesList.add(151.0f);
        stockPricesList.add(154.5f);
        stockPricesList.add(150.0f);
        stockPricesList.add(152.8f);
        stockPricesList.add(149.2f);
        stockPricesList.add(153.0f);
        stockPricesList.add(151.3f);

        // Specifying the target price for analysis
        float targetPrice = 150.5f;

        // Welcome msg
        System.out.println("**************Hello********************");

        // Calculate average from the array
        float averagePriceArray = calculateAveragePrice(stockPricesArray);
        System.out.println("Average Stock Price (Array): " + averagePriceArray);

        // Find the Maximum
        float maximumPrice = findMaximumPrice(stockPricesArray);
        System.out.println("\nMaximum Stock Price (Array): " + maximumPrice);

        // Find the occurrences
        int occurrences = countOccurrences(stockPricesArray, maximumPrice);
        System.out.println("\nNumber of occurrences: " + occurrences);

        // Compute the cumulative sum of stock prices
        ArrayList<Float> cumulativeSum = computeCumulativeSum(stockPricesList);

        // Print the cumulative sum
        System.out.println("\nCumulative Sum of Stock Prices:");
        for (Float sum : cumulativeSum) {
            System.out.println("Printing sum " + sum);
        }


    }
}