public class OrangeCat extends Cat{
    boolean isFat;
    double price = 200.0;

    public OrangeCat(String name, int age, String gender, double price,String color, boolean isFat) {
        super(name, age, gender, price,color);
        this.price = price;
        this.isFat=isFat;
    }
}
