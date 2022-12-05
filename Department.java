

package department;

public class Department
{
    public String hod;
    public  int numberOfStudents;
    public  int numberOfFaculties;

    void displaydetails(){
        System.out.println("HOD : " + hod);
        System.out.println("Number of Students : " + numberOfStudents);
        System.out.println("Number of Faculties : " + numberOfFaculties);
    }
}