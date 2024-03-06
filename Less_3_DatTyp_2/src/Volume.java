import java.util.Arrays;

public class Volume {
    public static void main(String[] args) {
        //створіть клас Volume.
        double rCilindr = 5.8;
        double hCilindr = 7.8;
        double pi =3.14;
       double volumCilindr = 2*pi*rCilindr*hCilindr;// Об'єм V циліндра радіусом – R та висотою – h, обчислюється за формулою: V = πR2h.
       double ploshaCilindr = 2*pi*rCilindr*(rCilindr+hCilindr);// Площа поверхні циліндра обчислюється за формулою: S = 2πR2 + 2πR2 = 2πR(R+h).
        System.out.println("Об*єм циліндру = " + volumCilindr);
        System.out.println("Площа циліндру= " + ploshaCilindr);
        // Результати розрахунків об'єму – V та площі поверхні -S циліндра виведіть на екран.

    }
}
