package com.softserve.edu.hw9_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DollarServices {

    public static void main(String[] args) {

        String pattern1 = "[${1}][0-9]+\\.[0-9]{2}";

        String text ="We win $100.11 dollars,but i hope that i will win $10000 dollars " +
                "also $100.11 it`s normal bonus for us." + "I love a lot of money ,my payment" +
                " at last year was $112000.00 and u spent $76890.33 for funny" ; ;

        Pattern p1 = Pattern.compile(pattern1);
        Matcher m1 = p1.matcher(text);

        if (m1.matches()) {
            System.out.println("m.matches() OK");//якшо весь текст співпадає то ОК
        } else {
            System.out.println("m.matches() FALSE");//якщо частинка тексту тільки співпадає то FALSE
        }
        m1.reset();//скидання ітератора в початкове положення
        int t = 0;
        while (m1.find()) {
            t++;
            System.out.print(t + " For pattern ([${1}][0-9]+\\.[0-9]{2}) (is)are matches this part of sentence:"
                    + text.substring(m1.start(), m1.end()) + " *\n");//виділяємо строку де перший символ m1.start а останній m1.end
        }
    }

}




