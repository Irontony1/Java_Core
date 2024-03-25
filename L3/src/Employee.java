import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private final String firstName;
    private final String lastName;
    private String phoneNumber;
    private final String birthDay;
    private String position;
    private int salary;

    public Employee(String firstName, String lastName, String phoneNumber, String birthDay, String position, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.birthDay = birthDay;
        this.position = position;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthDay() {
        return birthDay;
    }
    public int getAge(){
        LocalDate birthDay = LocalDate.parse(this.birthDay);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDay, currentDate).getYears();
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + getAge() + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary || Objects.equals(position, employee.position);
    }

    @Override
    public int compareTo(Employee e) {
        return this.getSalary() - e.getSalary();
    }
}
