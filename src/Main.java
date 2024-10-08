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
    public static float findMaximumPrice(float[] stockPrices) {
        float max = Float.MIN_VALUE;
        for (float price : stockPrices) {
            if (price > max) {
                max = price;
            }
        }
        return max;
    }

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