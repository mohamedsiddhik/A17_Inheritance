

package  department;

public class ComputerScience extends Department {
    void setInfo(String hodName ,int strength, int faculties){
        hod=hodName;
        numberOfStudents = strength;
        numberOfFaculties = faculties;
    }

    public static void main(String[] args) {
        ComputerScience cs = new ComputerScience();
        cs.setInfo("john",45,7);
        cs.displaydetails();
    }
}