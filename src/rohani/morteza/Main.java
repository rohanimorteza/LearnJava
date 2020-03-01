package rohani.morteza;

public class Main {

    public static void main(String[] args) {

        /*
        short a , b , c;
        a = 127;
        b = 100;
        c = a + b ; error
        */

        /*
        byte a = 10;
        char c = '2';
        System.out.println(a+2);
        */

        /*
        byte a = 5 , b =1;
        System.out.println(5/2); // please check result
        */

        byte  a = 5 , b =1;
        b++;
        System.out.println(5/++b);
        System.out.println(b++);
        System.out.println(b);

    }
}
