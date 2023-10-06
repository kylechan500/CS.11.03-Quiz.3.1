public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade) {
        if (grade >= 90) {
            return 'A';
        }
        if (grade <= 89 && grade >= 80){
            return 'B';
        }
        if (grade <= 79 && grade >= 70){
            return 'C';
        }
        if (grade <= 69 && grade >= 60){
            return 'D';
        }
        if (grade <= 59 && grade >= 50){
            return 'E';
        }
        return 'F';
    }


    // Question 2 - fizzBuzz
    public static String fizzBuzz(int a){
        int b = a % 3;
        int c = a%5;
        if(b==0){
            if(c==0){
                return "fizzbuzz";
            }
            return "fizz";
        }
        if(c==0){
            return "buzz";
        }
        return "unlucky";
    }

    // Question 3 - frontBack
    public static String frontBack(String str){
        if(str.length() > 2){
            String abc = str.substring(0, 2);
            return abc + str + abc;
        }
        if(str.length() == 2){
            return str + str + str;
        }
        return str;
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c){
        if(a+b == c){
            return true;
        }
        if(a-b == c){
            return true;
        }
        if(b-a == c){
            return true;
        }
        return false;
    }

    // Question 5 - endUpd
    public static String endUp(String str){
        if(str.length() > 3){
            String bz = str.substring(str.length() - 3, str.length());
            String last = bz.toUpperCase();
            return str.substring(0, str.length()-3) + last;
        }
        String last = str.toUpperCase();
        return last;
    }
}
