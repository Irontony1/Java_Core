import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Ivan","Ivanov","89541201258","2000-05-07","dev",50500);
        Employee worker2 = new Employee("Ekaterina","Sidorova","89556897150","1989-11-13","dev",73200);
        Employee worker3 = new Employee("Alex","Petrov","89001505258","1997-09-10","test",80000);
        Employee worker4 = new Employee("Vika","Svirodov","89541201110","2001-01-02","prod",77500);
        Employee worker5 = new Employee("Nick","Nikolaev","89702303252","1995-12-12","dev",55200);
        HeadManager manger1 = new HeadManager("Oleg","Romanov","894054064552","1980-02-28","head",115050);

        List<Employee> teamWorkers = new ArrayList<>();
        teamWorkers.add(worker1);
        teamWorkers.add(worker2);
        teamWorkers.add(worker3);
        teamWorkers.add(worker4);
        teamWorkers.add(worker5);
        teamWorkers.add(manger1);

        for (Employee worker : teamWorkers) {
            manger1.upSalary(worker);
        }

        System.out.println(teamWorkers);
        System.out.println(worker5.compareTo(worker3));


    }
}
