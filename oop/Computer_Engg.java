import java.util.Scanner;

class Computer_Engg{
    String name, hobby;
    int rollNo, GrNo;

    public int getGR(){
        return this.GrNo;
    }
    public int getroll(){
        return this.rollNo;
    }
    public String getname(){
        return this.name;
    }
    public String getHobby(){
        return this.hobby;
    }

}

class Student extends Computer_Engg{
    String area_of_interest;
    int marks;
    
    public int getMarks(){
        return this.marks;
    }
    public String getAreaOfIntrest(){
        return this.area_of_interest;
    }
}

public class Main{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.print("Enter the name of Student : ");
        s.name = sc.nextLine();

        System.out.print("Enter the GR Number of Student : ");
        s.GrNo = sc.nextInt();

        System.out.print("Enter the Roll Number of Student : ");
        s.rollNo = sc.nextInt();
        String dummy = sc.nextLine();

        System.out.print("Enter the hobby of Student : ");
        s.hobby = sc.nextLine();

        System.out.print("Enter the marks of Student : ");
        s.marks = sc.nextInt();
        dummy = sc.nextLine();

        System.out.print("Enter the area of interest of Student : ");
        s.area_of_interest = sc.nextLine();

        System.out.println("\nThe data of Student is as following :-\n");
        System.out.println("Name of Student  : " + s.name);
        System.out.println("GR Number        : " + s.getGR());
        System.out.println("Roll Number      : " + s.getroll());
        System.out.println("Hobby            : " + s.getHobby());
        System.out.println("Marks            : " + s.getMarks());
        System.out.println("Area of interest : " + s.getAreaOfIntrest());

        sc.close();
    }
}



