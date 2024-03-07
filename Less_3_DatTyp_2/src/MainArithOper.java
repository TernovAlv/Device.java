import java.util.Arrays;

//Завдання 6
//Використовуючи IntelliJ IDEA, створіть проект із класом main. Створіть дві цілочисельні змінні
// та виведіть на екран результати всіх арифметичних операцій над цими двома змінними.
public class MainArithOper {
    public static void main(String[] args) {
        int A=8;
        int B=2;
        int Sum= A+B;//Додавання  (summa or addition)+ додає два значення x y.

        System.out.println("8+2=" + Sum);
      int  Subtr =A-B;//- Віднімання(subtraction) одного значення з іншого x y
        System.out.println("8-2=" + Subtr);
        int Mult = A*B;//* Множення (multiplication) множить два значення x y.
        System.out.println("8*2=" + Mult);
        int Divis =A/B;// / Ділення (division) ділить одне значення на інше x y.
        System.out.println("8/2=" + Divis);
        int RemDivis = A%B;//% Ділення із виведенням залишку повертає залишок від поділу x y.
        System.out.println("Повертання залишку від ділення 8/2 = " + RemDivis);
        int C=3;// Ввожу іншу змінну, щоб показати іншиу остачу від ділення.
        int _RemDivis=A%C;
        System.out.println("8%3 буде залишок від ділення = " + _RemDivis);
        int Increm =++A; //++ Інкремент збільшує значення змінної на 1 x
        System.out.println("++ Інкремент збільшує значення змінної на 1 x,Було 8, то буде тепер " + Increm);
        int increm1 =++A;
        System.out.println("Та треба зазаначити,що якщо ми вже до 8 два рази застосували інкременет, то вже буде " + increm1);
        int incremPref =++B;//++ Інкремент збільшує значення змінної на 1 x
        System.out.println("Префіксний інкремент збільшує змінну на 1 на слідуючій строчці. Було 2,а стало  " + incremPref);
        int decr=--C;
        System.out.println("Декримент зменьшуэ на 1.Було 3, а стало " + decr);




        //++ Інкремент збільшує значення змінної на 1 x
        //--Декремент зменшує значення змінної на 1 x



    }
}
