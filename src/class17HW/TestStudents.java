package class17HW;

public class TestStudents {
    public static void main(String[] args) {
        Students students1=new Students("Fati",70.0,45.0,78.0);
        Students students2=new Students("Ana",70.0,56.0,99.0);
        Students students3=new Students("Lina",90.0,70.0,76.0);
        Students students4=new Students("Bob",68.0,50.0,24.0);
        Students students5=new Students("Lica",100.0,79.0,89.0);
        students1.printAverageGrad();
        students2.printAverageGrad();
        students3.printAverageGrad();
        students4.printAverageGrad();
        students5.printAverageGrad();


    }
}
