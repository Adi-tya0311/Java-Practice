import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.*;

class Employee{
    int id;
    int salary;
    Employee(int id,int salary){
        this.id=id;
        this.salary=salary;
    }
}
public class lambdaexpressionmini {
    public static void main(String[] args) {
        /*
        Predicate -> check true false                   -test
        Function -> take input and return output        -apply
        Consumer -> takes input, return nothing         -accept
        Supplier -> doesnt take input, returns output   -get
        */
        Supplier<List<Employee>> supply= () -> {
            List<Employee> emp = new ArrayList<>();
            emp.add(new Employee(101, 40000));
            emp.add(new Employee(102, 20000));
            emp.add(new Employee(103, 38000));
            emp.add(new Employee(104, 15000));
            emp.add(new Employee(105, 80000));

            return emp;
        };

        Predicate<Employee> highSalary = (emp) -> emp.salary>30000;
        Function<Employee,String> func = (emp) -> emp.id+" "+emp.salary;
        Consumer<String> print = (msg) -> System.out.println(msg);
        List<Employee> employee = supply.get();

        for (Employee emp : employee) {
            if(highSalary.test(emp)){
                String message = func.apply(emp);
                print.accept(message);
            }
        }
    }
}

