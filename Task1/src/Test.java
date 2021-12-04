import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        Cat c1 = new OrangeCat("Kitty", 3, "female", 200.0, "橘色",true);
        Cat c2 = new OrangeCat("Coco", 4, "male", 200.0,"橘色",true);
        Cat c3 = new OrangeCat("Tina", 1, "female", 200.0, "橘色",false);
        Cat c4 = new BlackCat("Lily", 2, "female", 350.0,"黑色");
        Cat c5 = new BlackCat("Tom", 6, "male", 350.0,"黑色");

        Customer a1 = new Customer("阿陈", 3, LocalDate.of(2021, 5, 3));
        Customer a2 = new Customer("木木", 7, LocalDate.of(2021, 5, 20));
        Customer a3 = new Customer("水水", 2, LocalDate.of(2021, 7, 7));
        Customer a4 = new Customer("火火", 5, LocalDate.of(2021, 10, 9));
        Customer a5 = new Customer("张三", 9, LocalDate.now());

        //创建我的猫咖
        MyCatCafe m = new MyCatCafe();
        m.balance = 90000;

        //买入猫猫
        try {
            m.buyCat(c1);
        }catch (InsufficientBalanceException i){
                i.printStackTrace();
            System.out.println("余额不足，购买失败");
        }

        try {
            m.buyCat(c2);
        }catch (InsufficientBalanceException i){
            i.printStackTrace();
            System.out.println("余额不足，购买失败");
        }

        try {
            m.buyCat(c3);
        }catch (InsufficientBalanceException i){
            i.printStackTrace();
            System.out.println("余额不足，购买失败");
        }

        try {
            m.buyCat(c4);
        }catch (InsufficientBalanceException i){
            i.printStackTrace();
            System.out.println("余额不足，购买失败");
        }

        try {
            m.buyCat(c5);
        }catch (InsufficientBalanceException i){
            i.printStackTrace();
            System.out.println("余额不足，购买失败");
        }

        //招待顾客
        Cat cat1 = m.catsList.get(m.cat.nextInt(m.catsList.size()));
        Cat cat2 = m.catsList.get(m.cat.nextInt(m.catsList.size()));
        Cat cat3 = m.catsList.get(m.cat.nextInt(m.catsList.size()));
        Cat cat4 = m.catsList.get(m.cat.nextInt(m.catsList.size()));
        Cat cat5 = m.catsList.get(m.cat.nextInt(m.catsList.size()));
        try {
            m.entertainCustomer(a1,cat1);
            a1.arrival(a1);
        }catch (CatNotFoundException e){
            e.printStackTrace();
            System.out.println("店里没有猫猫");
        }

        try {
            m.entertainCustomer(a2,cat2);
            a2.arrival(a2);
        }catch (CatNotFoundException e){
            e.printStackTrace();;
            System.out.println("店里没有猫猫");
        }

        try {
            m.entertainCustomer(a3,cat3);
            a3.arrival(a3);
        }catch (CatNotFoundException e){
            e.printStackTrace();
            System.out.println("店里没有猫猫");
        }

        try {
            m.entertainCustomer(a4,cat4);
            a4.arrival(a4);
        }catch (CatNotFoundException e){
            e.printStackTrace();
            System.out.println("店里没有猫猫");
        }

        try {
            m.entertainCustomer(a5,cat5);
            a5.arrival(a5);
        }catch (CatNotFoundException e){
            e.printStackTrace();
            System.out.println("店里没有猫猫");
        }

        //歇业
        m.close(m);
    }
}
