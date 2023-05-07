package class17HW;
/*
Write a java class that have 4 constructors with 4 different
 access levels of constructors(private,public,default,protected)
  and create 4 objects of this class: 1 - inside same class;
   2- from outside the class;
   3 - from different class inside different package  and observe result.
 */
public class Constructors {
    char gender;
    int age;
    String id;

   private Constructors(char gender){
        this.gender = gender;
       System.out.println(this.gender);
    }

    public Constructors(int age){
        this.age=age;
        System.out.println(this.age);
    }
    Constructors(){
        System.out.println("default");
    }
    protected Constructors(String id){
       this.id=id;
        System.out.println(this.id);
    }

    public static void main(String[] args) {
        Constructors obj1=new Constructors('F');
    }

}
