package class15HW;

public class Students {
    /*Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students*/

    String name;
    String ID;
     static int numberOfStudents;

    public static void main(String[] args) {

        Students student1=new Students();
        student1.name="Ali";
        student1.ID="al45d";
        numberOfStudents++;

        Students students2=new Students();
        students2.name="Chaymae";
        students2.ID="sfd3245";
        numberOfStudents++;

        Students students3=new Students();
        students3.name="Fati";
        students3.ID="adae35";
       numberOfStudents++;

        System.out.println("total number of students: "+Students.numberOfStudents);










    }

}
