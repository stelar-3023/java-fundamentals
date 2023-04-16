import java.util.Random;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(2);
        showTime();
    }
    public static String pluralize(String word, int count) {
        return pluralize(word, count, word + "s");
    }
    public static String pluralize(String word, int count, String plural) {
        if(count == 1) {
            return word;
        }
        return plural;
    }

    public static void flipNHeads(int n) {
        Random random = new Random();
        int flips = 0;
        int heads = 0;
        while (heads < n) {
            flips++;
            int flip = random.nextInt(2);
            switch (flip)
            {
                case 0:
                {
                    heads++;
                    System.out.println("heads");
                    break;
                }
                case 1:
                {
                    heads = 0;
                    System.out.println("tails");
                    break;
                }
                default:
                {
                    System.out.println("error: " + flip);
                    break;
                }
            }
        }

        // message
        System.out.println("It took " + flips + " " + pluralize("flip", flips) + " to flip " + heads + " " + pluralize("head", heads) + ".");
    }

    public static void showTime() {
        int incrementSeconds = 0;
        int previousSecond = -1;

        while (true)
        {
            LocalDateTime now = LocalDateTime.now();
            if (now.getSecond() != previousSecond) {
                int hour = now.getHour();
                int minute = now.getMinute();
                int second = now.getSecond();

                String minuteString;
                String secondString;

                // zero-pad single digit numbers
                if (minute < 10){
                    minuteString = ":0" + minute;
                } else {
                    minuteString = ":" + minute;
                }

                if (second < 10){
                    secondString = ":0" + second;
                } else {
                    secondString = ":" + second;
                }


                String formattedTime = hour + minuteString + secondString;
//                System.out.println(formattedTime);
                System.out.println(formattedTime + " " + ((float)incrementSeconds / 1_000_000_000f) + " GHz"); // GHz float

                previousSecond = second;
                incrementSeconds = 0;


            }
            else incrementSeconds++;
        }
    }
}