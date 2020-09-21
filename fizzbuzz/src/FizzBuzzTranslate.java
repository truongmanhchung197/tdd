public class FizzBuzzTranslate {
    public static String FizzBuzz(int number) {
        String result;
        boolean divisibleBy15 = number % 15 == 0;
        boolean divisibleBy5 = number % 5 == 0;
        boolean divisibleBy3 = number % 3 == 0;
        if (divisibleBy15) {
            result = "FizzBuzz";
        } else if (divisibleBy3) {
            result = "Fizz";
        } else if (divisibleBy5) {
            result = "Buzz";
        } else {
            result = readNumber(number);
        }
        return result;
    }

    public static String readNumber(int number) {
        String result;
        if (number == 0) {
            result = "zero";
        } else if (number < 10) {
            result = readUnit(number);
        } else if (number < 20) {
            result = readTenn(number);
        } else {
            int dozen = (int) Math.floor((double) number / 10);
            int unit = number - dozen * 10;
            if (unit == 0) {
                result = readDozen(number);
            } else {
                result = readDozen(dozen) + readUnit(unit);
            }
        }
        return result;
    }

    public static String readUnit(int number) {
        String result = "";
        switch (number) {
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
        }
        return result;
    }

    public static String readDozen(int number) {
        String result = "";
        switch (number) {
            case 2:
                result = "twenty ";
                break;
            case 3:
                result = "thirty ";
                break;
            case 4:
                result = "forty ";
                break;
            case 5:
                result = "fifty ";
                break;
            case 6:
                result = "sixty ";
                break;
            case 7:
                result = "seventy ";
                break;
            case 8:
                result = "eighty ";
                break;
            case 9:
                result = "ninety ";
                break;
        }
        return result;
    }

    public static String readTenn(int number) {
        String result = "";
        switch (number) {
            case 10:
                result = "ten";
                break;
            case 11:
                result = "eleven";
                break;
            case 12:
                result = "twelve";
                break;
            case 13:
                result = "thirteen";
                break;
            case 14:
                result = "fourteen";
                break;
            case 15:
                result = "fifteen";
                break;
            case 16:
                result = "sixteen";
                break;
            case 17:
                result = "seventeen";
                break;
            case 18:
                result = "eighteen";
                break;
            case 19:
                result = "nineteen";
                break;
        }
        return result;
    }
}
