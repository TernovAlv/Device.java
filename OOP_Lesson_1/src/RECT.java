import java.util.Arrays;

public class RECT {
    private double side1;
    private double side2;
    //Конструктор
    public RECT(double side1, double side2){
        this.side1=side1;
        this.side2=side2;
    }
    // Геттери та сеттери
    public double getSide1(){

        return side1;
    }
    public void setSide1(){

        this.side1=side1;
    }

    public double getSide2() {

        return side2;
    }

    public void setSide2(double side2) {

        this.side2=side2;
    }
    //Метод обчислення площи прямокутника
    public double areaCalculator(){
        return side1*side2;
    }
    //Метод обчислення периметра Прямокутника
    public double perimeterCalculator(){
        return 2*(side1+side2);
    }
    // Метод запуску
    public static void main(String[] args) {
        //Створення екземпляру класа з введеними користувачем значеннями
        RECT rect1=new RECT(5.0,3.0);
        RECT rect2=new RECT(8.0,6.0);
        //Обчислення S & P
        double area1=rect1.areaCalculator();
        double perimeter1=rect1.perimeterCalculator();

        double area2=rect2.areaCalculator();
        double perimeter2=rect2.perimeterCalculator();
        //Виведення результатів на консоль
        System.out.println("Площа прямокутника 1 = " + area1);
        System.out.println("Периметер прямокутника 1 = " + perimeter1);
        System.out.println("Площа прямокутника 2 = " + area2);
        System.out.println("Периметер прямокутника 2 = " + perimeter2);
    }
}
