package class17HW;
/*
Write a java Class Students that have a constructor
which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
 Test Student class for 5 different students with different
  marks.Your program should print an average mark of each
   students name.
 */
public class Students {
    String name;
  double math;
    double english;
    double science;

    Students(String name,double grades1,double grades2,double grades3){
        this.name=name;
        this.math=grades1;
        this.english=grades2;
        this.science=grades3;
    }
    void printAverageGrad(){
        double calculate=(math+english+science)/3;
        System.out.println(name+" "+calculate);
    }

}
