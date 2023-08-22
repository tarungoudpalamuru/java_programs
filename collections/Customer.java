package collections;

import java.util.Comparator;

public class Customer implements Comparator<Customer> {
    int id;
    String cname;

    public Customer(int id, String cname) {
        this.id = id;
        this.cname = cname;
    }
    public int  compare(Customer obj1,Customer obj2){
        return (obj1.cname.compareTo(obj2.cname));
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                '}';
    }
}
