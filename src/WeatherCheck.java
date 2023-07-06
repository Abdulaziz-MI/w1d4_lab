import java.util.Scanner;

public class WeatherCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Hi, What is the temperature today in degrees Celsius?");
        int temperature = sc.nextInt();
        String tempAdvice = getTempAdvice(temperature);


//  The line below is there to stop the terminal from skipping the rain Question.
        sc.nextLine();


        System.out.println("Is it currently raining? (y/n)");
        String isRaining = sc.nextLine();

        boolean isRainingBool = isRaining.equals("y");
        String rainAdvice =getRainAdvice(isRainingBool);

        System.out.println("Overall, " + tempAdvice + " And " + rainAdvice);
        }


    private static String getTempAdvice(int temperature) {
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
        return tempAdvice;
    }
    private static String getRainAdvice(boolean isRainingBool){
        String rainAdvice;
        if (isRainingBool) {
            rainAdvice = "it's raining, get an umbrella";
        } else {
            rainAdvice = "it's not raining, no need for an umbrella";
        }
        return rainAdvice;
    }


}


