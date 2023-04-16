import java.util.Random;

public class Basics {
    public static void main(String[] args) {
        System.out.println("This will run");
        // int -> Integer
        // primitive data types

        // type var name = value;
        int int1 = 5;
        long long1 = 100;
        byte byte1 = (byte) 0xFF;
        short short1 = (short) 0xFFF;
        boolean bool1 = true;

        // decimals
        float float1 = 0.1f;
        float float2 = 0.2f;
        float float3 = float1 + float2;
        boolean booleanFloat = (float3 == 0.3f);
        System.out.println("booleanFloat: " + booleanFloat);
        System.out.println("float3: " + float3);

        double double1 = 0.1;
        double double2 = 0.2;
        double double3 = double1 + double2;
        boolean booleanDouble = (double3 == 0.3);
        System.out.println("booleanDouble: " + booleanDouble);
        System.out.println("double3: " + double3);

        // char
        char char1 = 'a';
        char char2 = 'b';
        System.out.println("char1: " + char1);
        System.out.println("char2: " + char2);

        // String Builder

        // Keyword new constructs a new Object
        Random random = new Random();

        double doubleRandom1 = random.nextDouble();
        System.out.println("doubleRandom1: " + doubleRandom1);

        Integer IntegerRandom2 = random.nextInt(100);
        System.out.println("IntegerRandom2: " + IntegerRandom2);

        // strings
        int int2 = 20;
        String numberString1 = "30";
        System.out.println("int 2 + numberString1: " + (int2 + numberString1)); // 2030

        // comparing strings
        // == -> compare primitives, compare memory address xxx===xxx
        // .equals() compares the value

        String hello1 = "hello";
        String hel = "hel";
        String lo = "lo";
        System.out.println("\"hello\" == \"hel\" + \"lo\": " + ("hello" == "hel" + "lo")); // true
        System.out.println("\"hello\" == hel + lo: " + ("hello" == (hel + lo))); // false

        System.out.println("\"hello\".equals(\"hel\" + \"lo\"): " + ("hello".equals("hel" + "lo"))); // true
        System.out.println("\"hello\".equals(hel + lo): " + ("hello".equals(hel + lo))); // true

        // conditionals
        int number1 = 7;
        int number2 = 10;

        if (number2 > number1) {
            // condition 1
            System.out.println("number2 is greater than number1");
        } else if (number2 == number1) {
            // condition 2
            System.out.println("number2 is equal to number1");
        } else {
            // condition 3 - alternative
            System.out.println("number2 is less than number1");
        }

        // switch
        int month = 13;
        String monthString;
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;
        }
        System.out.println("monthString: " + monthString);

        // loops - for, while, do while, foreach
        // arrays - arrays are static, fixed size

        // while loop - while(condition){ code }
        int counter = 0;
        while (counter < 10) {
            System.out.println("counter: " + counter);
            counter++;
            if (counter > 10) {
                // full stop, break out of the loop
                break;
            }
        }



        // for loop - for(initialization; condition; increment/decrement){ code }
        // Java array static. Fixed size
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        String[] stringArray = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("intArray[" + i + "]: " + intArray[i]);
        }

        for (int currentInt : intArray) {
            System.out.println("currentInt: " + currentInt);
        }

        // functions / methods in java
        String newString = stringReturner();
        System.out.println("newString: " + newString);

    }

    // what are 2 things that functions / methods can do?
    // 1. return a value
    // 2. perform an action

    public static String stringReturner() {
        return "This is a string";
    }
}