package collections;


import java.util.*;

public class Employee implements Comparable<Employee> {
    public Integer id;
    public Integer salary;
    public String name;
    public Employee(Integer id,Integer salary,String name){
        this.id=id;
        this.salary=salary;
        this.name=name;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }



    @Override
    public int compareTo(Employee o) {
        return id-o.id;
//        if(id>o.id)
//            return 1;
//        else if (id<o.id)
//            return -1;
//        else
//            return 0;
    }
}
