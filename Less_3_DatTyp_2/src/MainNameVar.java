import java.util.Arrays;

public class MainNameVar {
    public static void main(String[] args) {
        int uberflu= 89785;//  uberflu? - не можна з "?".
        byte _Identifier= 127; //"_Identifier" -можна.
        boolean u006fIdentifier =false;//"\u006fIdentifier" -не можна з"\".
        char myVar = '\u0457';// "&myVar" - не можна з "&".
        double myVariab1l =3.1798;// можна
        System.out.println("Можна так називати змінні:_Identifier та myVariab1l.");
        System.out.println("НЕ можна так називати змінні: uberflu? та /u006fIdentifier, та &myVar.");

    }
    //Перевірте, чи можна створити змінні з такими іменами:
    //uberflu?,_Identifier , \u006fIdentifier, &myVar, myVariab1l
}
