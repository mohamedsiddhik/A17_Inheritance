

package department;

public class Mechanical extends Department
{
    void setInfo(String hodName ,int strength, int faculties){
        hod=hodName;
        numberOfStudents = strength;
        numberOfFaculties = faculties;
    }
    public static void main(String[] args) {
      Mechanical mech = new Mechanical();
      mech.setInfo("james",78,9);
      mech.displaydetails();
    }
}