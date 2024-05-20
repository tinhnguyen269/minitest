public class Main {
    public static void main(String[] args) {
        EmployeePartTime nvp1 = new EmployeePartTime("Nguyen van A",20,"012345678","nva@gmail.com",40);
        EmployeePartTime nvp2 = new EmployeePartTime("Nguyen van B",22,"012345679","nvb@gmail.com",30);
        EmployeeFullTime nvf1 = new EmployeeFullTime("Nguyen van C",25,"03256898","nvc@gmail.com",1000000,100000,5000000);
        EmployeeFullTime nvf2 = new EmployeeFullTime("Nguyen van D",26,"03256899","nvd@gmail.com",300000,2000000,5000000);

        Employee[] employees = new Employee[4];
        employees[0] = nvp1;
        employees[1] = nvp2;
        employees[2] = nvf1;
        employees[3] = nvf2;

        long total_salary = 0;
        long avg=0;

        //        Tinh luong trung binh
        for (Employee nv : employees) {
            total_salary += nv.cal_salary();
        }
        avg = total_salary/employees.length;
        System.out.println("Luong TB nhan vien : " + avg);


        //        Tinh luong nvfulltime < TB
        for (Employee nvf : employees){
            if(nvf instanceof EmployeeFullTime){
                EmployeeFullTime fullTime = (EmployeeFullTime)nvf;
                if(fullTime.cal_salary() < avg){
                    System.out.println("Nhan vien fullTime co luong nho hon TB:"+ fullTime.toString());
                }

            }
        }

//        Tinh tong tien nv part time
        long sum = 0;
        for(Employee nvp : employees){
            if(nvp instanceof EmployeePartTime){
                EmployeePartTime partTime = (EmployeePartTime) nvp;
                sum += nvp.cal_salary();

            }
        }
        System.out.println("Tong tien nv part time:"+sum);

        softNVFullTime(employees);
        for (Employee nvf : employees){
            if(nvf instanceof EmployeeFullTime){
                EmployeeFullTime fullTime = (EmployeeFullTime)nvf;
                    System.out.println(fullTime.getName()+" "+"Luong:"+" "+ fullTime.cal_salary());
                }
        }
    }


    //        Sap xep nv fulltime tang dan
    public static void softNVFullTime(Employee[] employees){
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - i - 1; j++) {
                if (employees[j] instanceof EmployeeFullTime && employees[j + 1] instanceof EmployeeFullTime) {
                    EmployeeFullTime nv1 = (EmployeeFullTime) employees[j];
                    EmployeeFullTime nv2 = (EmployeeFullTime) employees[j + 1];
                    if (nv1.cal_salary() > nv2.cal_salary()) {
                        Employee temp = employees[j];
                        employees[j] = employees[j + 1];
                        employees[j + 1] = temp;
                    }

                }
            }
        }
    }
}
