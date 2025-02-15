import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costCourse = 600;
    private static int id = 1000;

    //Constroctor: Promts user to enter name and Year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student grade level: ");
        this.gradeYear = in.nextInt();

        setStudentID();



    }

    //Generate an ID
    private void setStudentID(){
        //Grade Level + ID
        id++;
       this.studentID = gradeYear + "" + id;

    }

    //Enroll in courses
    public void enrol(){
           do{ System.out.print("Enter course to enrol (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance += costCourse;
            }else {break;}
        }while (1 != 0);


    }

    //View Balance
    public void viewBalance(){
        System.out.println("Your Balance is: $" + tuitionBalance);
    }
    //Pay tution
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // Show status
 public String toString(){
        return "Name: "+ firstName + " " + lastName +
                "\nGrade Level:" + gradeYear +
                "\nStudent Id:" + studentID +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance;
 }
}