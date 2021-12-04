import java.time.LocalDate;

public class Customer {
    String name;
    int rua;
    LocalDate arrival=LocalDate.now();

    public Customer(String name,int rua,LocalDate arrival){
        this.name=name;
        this.rua=rua;
        this.arrival=arrival;
    }

    public void rua(Cat c ){
        System.out.println(this.name+"rua了"+c.name);
    }

    public void arrival(Customer a){

    }

    @Override
    public String toString() {
        return "顾客{" +
                "名字：" + name +
                ";rua了"+ rua +
                "次;到店日期：" + arrival +
                '}';

    }
}
