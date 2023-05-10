package class18HW;
/*
Write a Java program called Teacher.
  Identify features and 4 behaviour of that Class.
   Create 3 subclasses MathTeacher, ChemistryTeacher
    and PianoTeacher . Test all 4 classes
 */
public class Teacher {
    String teacherName;
    String teacherId;
    int teacherAge;
    char teacherGender;

    void  teach(){
        System.out.println("Teaching....");
    }
    void explain(){
        System.out.println("explaining....");
    }
    void read(){
        System.out.println("Teacher "+" "+teacherName+" "+"reading....");
    }
    void breakTime(){
        System.out.println("relaxing...");
    }



}
