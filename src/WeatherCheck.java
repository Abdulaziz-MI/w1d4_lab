import java.util.Scanner;

public class WeatherCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, What is the temperature today in degrees Celsius?");
        int temperature = sc.nextInt();

/*        The line below is there to stop the terminal from skipping the rain Question.
          I think if I made classes for both temp and rain it would have solved it */
        sc.nextLine();


        String tempAdvice;

        if (temperature > 10 && temperature <= 15) {
            tempAdvice = "It is very cold, wear a big jacket!";
        } else if (temperature > 15 && temperature <= 20) {
            tempAdvice = "It is cold, wear a normal jacket!";
        } else if (temperature > 20 && temperature <= 25) {
            tempAdvice = "Nice weather! Enjoy it with a hoodie";
        } else if (temperature > 25 && temperature <= 30) {
            tempAdvice = "It is warm, wear a T-shirt";
        } else if (temperature > 30) {
            tempAdvice = "It is very hot, find AC!";
        } else {
            tempAdvice = "It is VERY VERY COLD, find Heating!";
        }


        System.out.println("Is it currently raining? (y/n)");
        String isRaining = sc.nextLine();

        boolean isRainingBool = isRaining.equals("y");
        String rainAdvice;

        if (isRainingBool) {
            rainAdvice = "it's raining, get an umbrella";
        } else {
            rainAdvice = "it's not raining, no need for an umbrella";
        }

        System.out.println("Overall, " + tempAdvice + " And " + rainAdvice);

        }


    }


