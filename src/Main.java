import java.util.Scanner;

public class Main
{


    public static void main(String[] args)
    {

        Scanner line = new Scanner(System.in);
        String[] input = line.nextLine().split(" ");
        int answer = 0;
        String result = null;
        char operator = input[1].charAt(0);
        char a = input[0].charAt(0);
        char b = input[2].charAt(0);
        if (input.length > 3)
        {
            System.out.println("throws Exception");
        }
        else
        {
            if ((a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9') && (b == '0' || b == '1' || b == '2' || b == '3' || b == '4' || b == '5' || b == '6' || b == '7' || b == '8' || b == '9'))
            {
                if (operator == '+' || operator == '-' || operator == '*' || operator == '/')
                {
                    int one = Integer.parseInt(input[0]);
                    int two = Integer.parseInt(input[2]);
                    switch (operator)
                    {
                        case '+' -> answer = one + two;
                        case '-' -> answer = one - two;
                        case '*' -> answer = one * two;
                        case '/' -> answer = one / two;
                    }
                    System.out.println(answer);
                }
                else
                    System.out.println("throws Exception");
            }
            else if ((a == 'I' || a == 'V' || a == 'X') && (b == 'I' || b == 'V' || b == 'X'))
            {
                int one, two;
                switch (input[0])
                {
                    case "I" -> one = 1; case "II" -> one = 2;
                    case "III" -> one = 3; case "IV" -> one = 4;
                    case "V" -> one = 5; case "VI" -> one = 6;
                    case "VII" -> one = 7; case "VIII" -> one = 8;
                    case "IX" -> one = 9; case "X" -> one = 10;
                    default -> one = -1;
                }
                switch (input[2])
                {
                    case "I" -> two = 1; case "II" -> two = 2;
                    case "III" -> two = 3; case "IV" -> two = 4;
                    case "V" -> two = 5; case "VI" -> two = 6;
                    case "VII" -> two = 7; case "VIII" -> two = 8;
                    case "IX" -> two = 9; case "X" -> two = 10;
                    default -> two = -1;
                }
                if (one != -1 && two != -1 && (operator == '+' || operator == '-' || operator == '*' || operator == '/'))
                {
                    switch (operator)
                    {
                        case '+' -> answer = one + two;
                        case '-' -> answer = one - two;
                        case '*' -> answer = one * two;
                        case '/' -> answer = one / two;
                    }
                    if (answer <= 10)
                    {
                        switch (answer)
                        {
                            case 1 -> result = "I";
                            case 2 -> result = "II";
                            case 3 -> result = "III";
                            case 4 -> result = "IV";
                            case 5 -> result = "V";
                            case 6 -> result = "VI";
                            case 7 -> result = "VII";
                            case 8 -> result = "VIII";
                            case 9 -> result = "IX";
                            case 10 -> result = "X";
                        }
                    }
                    else if (answer <= 20)
                    {
                        switch (answer)
                        {
                            case 11 -> result = "XI";
                            case 12 -> result = "XII";
                            case 13 -> result = "XIII";
                            case 14 -> result = "XIV";
                            case 15 -> result = "XV";
                            case 16 -> result = "XVI";
                            case 17 -> result = "XVII";
                            case 18 -> result = "XVIII";
                            case 19 -> result = "XIX";
                            case 20 -> result = "XX";
                        }
                    }
                    else if (answer <= 30)
                    {
                        switch (answer)
                        {
                            case 21 -> result = "XXI";
                            case 22 -> result = "XXII";
                            case 23 -> result = "XXIII";
                            case 24 -> result = "XXIV";
                            case 25 -> result = "XXV";
                            case 26 -> result = "XXVI";
                            case 27 -> result = "XXVII";
                            case 28 -> result = "XXVIII";
                            case 29 -> result = "XXIX";
                            case 30 -> result = "XXX";
                        }
                    }
                    else if (answer <= 40)
                    {
                        switch (answer)
                        {
                            case 31 -> result = "XXXI";
                            case 32 -> result = "XXXII";
                            case 33 -> result = "XXXIII";
                            case 34 -> result = "XXXIV";
                            case 35 -> result = "XXXV";
                            case 36 -> result = "XXXVI";
                            case 37 -> result = "XXXVII";
                            case 38 -> result = "XXXVIII";
                            case 39 -> result = "XXXIX";
                            case 40 -> result = "XL";
                        }
                    }
                    else if (answer <= 50)
                    {
                        switch (answer)
                        {
                            case 41 -> result = "XLI";
                            case 42 -> result = "XLII";
                            case 43 -> result = "XLIII";
                            case 44 -> result = "XLIV";
                            case 45 -> result = "XLV";
                            case 46 -> result = "XLVI";
                            case 47 -> result = "XLVII";
                            case 48 -> result = "XLVIII";
                            case 49 -> result = "XLIX";
                            case 50 -> result = "L";
                        }
                    }
                    else if (answer <= 60)
                    {
                        switch (answer)
                        {
                            case 51 -> result = "LI";
                            case 52 -> result = "LII";
                            case 53 -> result = "LIII";
                            case 54 -> result = "LIV";
                            case 55 -> result = "LV";
                            case 56 -> result = "LVI";
                            case 57 -> result = "LVII";
                            case 58 -> result = "LVIII";
                            case 59 -> result = "LIX";
                            case 60 -> result = "LX";
                        }
                    }
                    else if (answer <= 70)
                    {
                        switch (answer)
                        {
                            case 61 -> result = "LXI";
                            case 62 -> result = "LXII";
                            case 63 -> result = "LXIII";
                            case 64 -> result = "LXIV";
                            case 65 -> result = "LXV";
                            case 66 -> result = "LXVI";
                            case 67 -> result = "LXVII";
                            case 68 -> result = "LXVIII";
                            case 69 -> result = "LXIX";
                            case 70 -> result = "LXX";
                        }
                    }
                    else if (answer <= 80)
                    {
                        switch (answer)
                        {
                            case 71 -> result = "LXXI";
                            case 72 -> result = "LXXII";
                            case 73 -> result = "LXXIII";
                            case 74 -> result = "LXXIV";
                            case 75 -> result = "LXXV";
                            case 76 -> result = "LXXVI";
                            case 77 -> result = "LXXVII";
                            case 78 -> result = "LXXVIII";
                            case 79 -> result = "LXXIX";
                            case 80 -> result = "LXXX";
                        }
                    }
                    else if (answer <= 90)
                    {
                        switch (answer)
                        {
                            case 81 -> result = "LXXXI";
                            case 82 -> result = "LXXXII";
                            case 83 -> result = "LXXXIII";
                            case 84 -> result = "LXXXIV";
                            case 85 -> result = "LXXXV";
                            case 86 -> result = "LXXXVI";
                            case 87 -> result = "LXXXVII";
                            case 88 -> result = "LXXXVIII";
                            case 89 -> result = "LXXXIX";
                            case 90 -> result = "XC";
                        }
                    }
                    else if (answer <= 100)
                    {
                        switch (answer)
                        {
                            case 91 -> result = "XCI";
                            case 92 -> result = "XCII";
                            case 93 -> result = "XCIII";
                            case 94 -> result = "XCIV";
                            case 95 -> result = "XCV";
                            case 96 -> result = "XCVI";
                            case 97 -> result = "XCVII";
                            case 98 -> result = "XCVIII";
                            case 99 -> result = "XCIX";
                            case 100 -> result = "C";
                        }
                    }
                    else 
                    {
                        result = "throws Exception";
                    }
                    System.out.print(result);
                }
                else System.out.println("throws Exception");
            }
        }
    }
}