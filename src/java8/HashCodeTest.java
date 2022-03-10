package java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeTest {
    public static void main(String[] args) {

        Employee ranjith = new Employee("ranjith",25);
        Employee kumar = new Employee("ranjith",34);
        System.out.println(ranjith.hashCode());
        System.out.println(kumar.hashCode());
        System.out.println(ranjith.equals(kumar));

        Map<Employee,Integer> employeeMap = new HashMap<>();
        employeeMap.put(ranjith,1729);
        employeeMap.put(kumar,1198);
        employeeMap.forEach((key,val)-> System.out.println(key.hashCode()+"  "+val));
    }
}

class Employee {

    private String name;
    private Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        Employee employee = (Employee) o;
        if(this.name.equalsIgnoreCase(employee.name) && this.age.equals(employee.age)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 1234;
    }
}
