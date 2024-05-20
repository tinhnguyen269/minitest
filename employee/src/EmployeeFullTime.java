public class EmployeeFullTime extends Employee {
    private double bonus;
    private double  fine;
    private double  hard_salary;


    public EmployeeFullTime(String name, int age, String phone, String email, double bonus, double fine, double hard_salary) {
        super(name, age, phone, email);
        this.bonus = bonus;
        this.fine = fine;
        this.hard_salary = hard_salary;
    }
    public EmployeeFullTime(){}



    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getHard_salary() {
        return hard_salary;
    }

    public void setHard_salary(double hard_salary) {
        this.hard_salary = hard_salary;
    }



    @Override
    public double cal_salary() {
        return getHard_salary() + getBonus()-getFine();
    }


    public String toString() {
        return
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", phone='" + getPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ",Luong :"+ cal_salary();
    }
}
