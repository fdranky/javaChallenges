import java.util.Scanner;

/**
 * Created by hoecakenux on 15.12.17.
 */
public class romanNumerals {
    public static String romanHelper(String num, int val) {

        while(val > 0) {
            int digitCount = (int) Math.log10(val) + 1;
            int decimals = (int) Math.pow(10, (digitCount - 1));
            int digit = (val / decimals);

            if(digit == 9) {
                switch(digitCount) {
                    case 3 :
                        num += "CM";
                        break;
                    case 2 :
                        num += "XC";
                        break;
                    case 1 :
                        num += "IX";
                        break;
                }

            } else if (digit < 9 && 3 < digit) {
                if(digit == 4) {
                    switch(digitCount) {
                        case 3 :
                            num += "CD";
                            break;
                        case 2 :
                            num += "XL";
                            break;
                        case 1 :
                            num += "IV";
                            break;
                    }
                } else if (digit >= 5){
                    switch(digitCount) {
                        case 3 :
                            num += "D";
                            break;
                        case 2 :
                            num += "L";
                            break;
                        case 1 :
                            num += "V";
                            break;
                    }
                    char lilRoman = ' ';
                    switch(digitCount) {
                        case 3 :
                            lilRoman = 'C';
                            break;
                        case 2 :
                            lilRoman = 'X';
                            break;
                        case 1 :
                            lilRoman = 'I';
                            break;
                    }
                    for(int i = 0; i < digit % 5; i++) {
                        num += lilRoman;
                    }
                }
            } else {
                char lilRoman = ' ';
                switch(digitCount) {
                    case 4 :
                        lilRoman = 'M';
                        break;
                    case 3 :
                        lilRoman = 'C';
                        break;
                    case 2 :
                        lilRoman = 'X';
                        break;
                    case 1 :
                        lilRoman = 'I';
                        break;
                }
                for(int i = 0; i < digit; i++) {
                    num += lilRoman;
                }
            }

            val -= digit * decimals;

        }
        return num;
    }

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //int value = scan.nextInt();
        String numeral = "";

        for(int i = 1000; i < 4000; i++) {
            System.out.println(romanHelper(numeral, i));
        }
    }
}
