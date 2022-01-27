package ua.com.eventinfo;

public class Java_Operators_xmpl {
    public static void main(String[] args){
        int i = 100;
        int j = 10;
        System.out.println(i*j);

        j=23;
        for(i = 1; i < 30; i++){
            System.out.println("Остача " + i + " % " + j +" = " + i%j);

            System.out.println("Остача " + j + " % " + i + " = "+j%i);

        }
        System.out.println(i);
        i+=j;
        System.out.println(i + " - " + j);
        System.out.println("------------------------------------------------------");
        System.out.println(5&5);
        System.out.println(5&6);
        System.out.println(5|6);
    }
}
