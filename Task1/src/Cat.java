public abstract class Cat {
    String name;
    int age;
    String gender;
    double price;
    String color;

    @Override
    public String toString() {
        return "{" +
                "名字：" + name  +
                ", 年龄：" + age +
                ", 性别：" + gender +
                ", 价格：" + price +
                ", 颜色："+ color +
                '}';
    }

    public Cat(String name, int age, String gender, double price,String color) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.price = price;
        this.color=color;

    }

}
