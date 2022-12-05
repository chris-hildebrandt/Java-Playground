import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        primitive types
        byte age = 37;
        short numberOfCharacters = -32000;
        int viewsCount = 123456789;
        long lotsOfViews = 9_123_456_789L;
        float price = 10.99F;
        double defaultForDecimals = 10.999999999;
        char firstLetter = 'a';
        boolean isTired = false;
//        reference types
        String greeting = "Hello world" + "!!!";
        String difficultString = "Hello \"Doctor\" go to C:\\windows\\";
//                \t adds a tab \n adds a new line
        greeting.endsWith("!");
//        true
        greeting.startsWith("!");
//        false
        greeting.length();
//        14
        greeting.indexOf("H");
//        0
//        "h" would return -1
        greeting.replace("!", "?");
//        this returns a new string because in Java strings are immutable
        greeting.toLowerCase();
        greeting.toUpperCase();
        greeting.trim();
//        removes white space from ends

//        Arrays have a fixed length in Java!?!?!
        int[] numbers = {2,3,5,6,3};




        Date now = new Date();
//        object members
        now.getTime();

        System.out.println(now);
        System.out.println(greeting);

        byte a = 1;
        byte b = a;
        System.out.println(b);
//        result: 1
        byte c = 1;
        byte d = c;
        c = 2;
        System.out.println(d);
//        result: still 1!
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point2.x = 5;
        System.out.println(point1);
    }
}