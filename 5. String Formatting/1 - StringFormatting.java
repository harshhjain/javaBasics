import java.lang.String;


public class Main {
    public static void main(String[] args) {

        int iVal = 32;

        String s1 = String.format("%d", iVal);
        String s2 = String.format("%x", iVal);
        String s3 = String.format("%#x", iVal);
        String s4 = String.format("%#X", iVal);

        System.out.println(s1);     //32
        System.out.println(s2);     //20
        System.out.println(s3);     //0x20
        System.out.println(s4);     //0X20

    }
}