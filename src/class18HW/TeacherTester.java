package class18HW;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.teach();


        MathTeacher mt=new MathTeacher();
        mt.teacherName="Lina";
        mt.teacherAge=29;
        mt.teach();

        PianoTeacher pianoTeacher=new PianoTeacher();
        pianoTeacher.read();
        pianoTeacher.explain();

        ChemistryTeacher chem=new ChemistryTeacher();
        chem.teacherAge=37;
        chem.teacherId="AB123z";
        chem.teacherName="Hana";
       chem.explain();
       chem.breakTime();


    }
}
