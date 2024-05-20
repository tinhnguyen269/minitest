public class EmployeePartTime extends Employee {
    private int hour;

    public EmployeePartTime(){
    }



    public EmployeePartTime(String name, int age, String phone, String email, int hour) {
        super(name, age, phone, email);
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }


    @Override
    public double cal_salary() {
        return getHour()*100000;
    }

}
