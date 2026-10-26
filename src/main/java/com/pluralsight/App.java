package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] quotes = null;
        int quoteIndex = 0;
        try {
            quotes = new String[]{
                    "You don't have to be perfect. You just have to be better than you were yesterday... or at least better than your Wi-Fi connection.",
                    "Believe in yourself! If a potato can become french fries, you can become anything you want.",
                    "Dream big, work hard, and remember: even your GPS needs to recalculate sometimes.",
                    "Progress is progress, even if you're moving at the speed of a sleepy turtle.",
                    "Don't be afraid to fail. Be afraid of staying the same because you were too scared to try.",
                    "You can't have a million-dollar mindset with a five-minute effort. Now get up and do the thing!",
                    "Every expert was once a beginner who probably Googled the same question 47 times.",
                    "Life doesn't come with instructions, but it does come with mistakes. Consider them the free trial of wisdom.",
                    "Some days you'll conquer the world. Other days you'll conquer your laundry. Both are victories.",
                    "Keep going! Your future self is counting on you, and honestly, they've got enough problems already."
            };

            System.out.print("Enter a number from 1-10 to get the quote: ");
            int quoteNumber = input.nextInt();

            quoteIndex = quoteNumber - 1;

            System.out.println(quotes[quoteIndex]);

        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("Number entered is not in range!");
        }

        System.out.println("Goodbye!");
        input.close();

    }
}
