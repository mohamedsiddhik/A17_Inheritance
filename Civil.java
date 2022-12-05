

package  department;

public  class Civil extends Department
{
    void setInfo(String hodName ,int strength, int faculties){
        hod=hodName;
        numberOfStudents = strength;
        numberOfFaculties = faculties;
    }
    public static void main(String[] args) {
        Civil cv = new Civil();
        cv.setInfo("stanley",129,18);
        cv.displaydetails();
    }
}