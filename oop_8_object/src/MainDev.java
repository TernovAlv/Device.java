import java.util.Arrays;

public class MainDev {
    public static void main(String[] args) {
        Device device=new Device("Samsung", 120.0f,"AB1234567CD");
        System.out.println(device.getClass());
        System.out.println(device);
    }
}
