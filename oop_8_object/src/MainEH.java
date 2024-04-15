package equalHash;

public class MainEH {
    public static void main(String[] args) {
DeviceEH deviceEH1=new DeviceEH(1);
DeviceEH deviceEH2=new DeviceEH(2);
DeviceEH deviceEH3=deviceEH1;

       // порівнюємо за посиланнями (різні об'єкти)
        System.out.println(deviceEH1.equals(deviceEH2));

                // посилаємось на один і той самий об'єкт
                System.out.println(deviceEH1.equals(deviceEH3));

                System.out.println(deviceEH1 == deviceEH2);

                System.out.println(deviceEH1 == deviceEH3);
    }

}

