
class Employee4{
    String employeeName;
    int employeeId;
    char employeeGender;

    void setBasicDetails(int id ,String name ,char gender){
        employeeName =name;
        employeeId = id;
        employeeGender = gender;
    }
}

class SoftwareDeveloper extends Employee4{
    int baseSalary = 4500;
    int experience;
    String currentProject;
    int totalSalary;

    void calculateSalary(){
        totalSalary = baseSalary  + (experience * 2000);

    }

    void setDetails(int id ,String name , char gender,int exp , String project){
        setBasicDetails(id,name,gender);
        experience = exp;
        currentProject = project;
        calculateSalary();


    }

    void  displayDetails(){
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Employee Id : " + employeeId);
        System.out.println("Employee gender : " + employeeGender);
        System.out.println("Employee Current Project : " + currentProject);
        System.out.println("Employee Basic salary : " + totalSalary);

    }
}


public class Intern extends SoftwareDeveloper
{
    public static void main(String[] args) {
        SoftwareDeveloper sobj = new SoftwareDeveloper();
        sobj.setDetails(150,"john",'M',5,"Front-end Developer");
        Intern iobj = new Intern();
        iobj.setDetails(12,"sam",'M',1,"Training");
        sobj.displayDetails();
        iobj.displayDetails();

//        Employee4 emp = new Employee4();
//        System.out.println(emp.setBasicDetails());
    }
}