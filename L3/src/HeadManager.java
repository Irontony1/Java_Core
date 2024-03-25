import java.util.Date;

public class HeadManager extends Employee{
    private int salaryRaisingStep = 5000;

    public HeadManager(String firstName, String lastName, String phoneNumber, String birthDay, String position, int salary) {
        super(firstName, lastName, phoneNumber, birthDay, position, salary);
    }
    public void upSalary(Employee e){
        if(!(e instanceof HeadManager)) {
            int currentSelary = e.getSalary();
            e.setSalary(currentSelary + this.salaryRaisingStep);
        }
    }

    public int getSalaryRaisingStep() {
        return salaryRaisingStep;
    }

    public void setSalaryRaisingStep(int salaryRaisingStep) {
        this.salaryRaisingStep = salaryRaisingStep;
    }
}
