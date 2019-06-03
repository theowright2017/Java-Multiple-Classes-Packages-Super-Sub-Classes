package staff;

public abstract class Employee {

    private String name;
    private String NINumber;
    private int salary;

    public Employee(String name, String NINumber, int salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null)
        this.name = name;
    }

    public String getNINumber() {
        return NINumber;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(double raiseBy){
        if (raiseBy > 0){
        this.salary += raiseBy;
        }
    }

    public int payBonus(int salary){
        return (salary / 100) + salary;
    }


}
