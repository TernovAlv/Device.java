    //Створити класи:
    //1) Основний клас Device (manufacturer(String), price(float), serialNumber(String));
    //2) Сабклас Monitor (resolutionX(int), resolutionY(int)) і EthernetAdapter (speed(int), mac(String));
    // Додати методи доступу. Конструктор.

    public class Device {
    String manufacturer;
    float price;
    String serialNumber;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

        @Override
        public String toString() {
            return String.format("manufacture is:%s\nPrice is:%f;\nSerial Number is:%s", manufacturer, price, serialNumber);
        }

}

//    //і сабклас EthernetAdapter (speed(int), mac(String));
    //class EthernetAdapter extends Device{
    //int speed;
    //String mac;

   //     public int getSpeed() {
     //       return speed;
   //     }

   //     public void setSpeed(int speed) {
       //     this.speed = speed;
      //  }

       // public String getMac() {
        //    return mac;
       // }

       // public void setMac(String mac) {
          //  this.mac = mac;}
    //}

   // public void main(String[] args) {
        //Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
        //Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280, Y=1024
//    }



