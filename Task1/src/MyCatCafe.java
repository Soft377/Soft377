import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;

public class MyCatCafe implements CatCafe {
    int number = 0;
    int cost;
    int balance;
    int ruaSum = 0;
    Random cat = new Random();

    ArrayList<Customer> customersList = new ArrayList<Customer>();
    ArrayList<Cat> catsList = new ArrayList<Cat>();


    @Override
    public void buyCat(Cat c) throws InsufficientBalanceException {
        if (balance < c.price) {
            throw new InsufficientBalanceException("店内余额不足");
        } else {
            cost += c.price;
            balance -= c.price;
            catsList.add(c);
            number++;
            System.out.println("新增猫猫："+c);
            }
        }

    final

    @Override
    public void entertainCustomer(Customer a, Cat c) throws CatNotFoundException {
        if (number <= 0) {
            throw new CatNotFoundException("没有猫猫");
        } else {
            a.rua(c);
            System.out.println(a);
            customersList.add(a);
            if (a.arrival.equals(LocalDate.now()) == true) {
                customersList.add(a);
            }
            //顾客随机挑选要rua的猫猫
            int size = catsList.size();
            for (int i = 0; i < size; i++) {
                int myRand = cat.nextInt(catsList.size());
                catsList.add(catsList.get(myRand));
                catsList.remove(myRand);
                balance = balance + 15 * (a.rua);
                //一天内所有顾客的rua猫总次数
                ruaSum = ruaSum + a.rua;

            }
        }

    }

    @Override
    public void close(MyCatCafe m) {
        LocalDate CloseTime = LocalDate.now();
        //LocalDate判断
        if (CloseTime.equals(LocalTime.now()) == true) {
            System.out.println(CloseTime + "营业结束");}
            System.out.println("今日顾客名单:" + customersList);

            //计算本日利润
            int profit = 15 * ruaSum - cost;
            System.out.println("今日利润:" + profit);
        }

    }

