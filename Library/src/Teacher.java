import java.util.Scanner;

import java.time.Duration;
public class Teacher implements LibraryUser
{   private Library l;
    private String first_name,last_name;

    private LibraryCard teacherCard;


    public Teacher(Library l) {
        this.l = l;
        Scanner s=new Scanner(System.in);
        System.out.println("  HEY TEACHER   ");
        System.out.print("  ENTER YOUR FIRST NAME :   ");
        this.first_name = s.nextLine();
        System.out.print(" ENTER YOUR LAST NAME :   ");
        this.last_name = s.nextLine();
        this.teacherCard = new LibraryCard(first_name,last_name);
    }

    public void getTeacherCard() {
        System.out.print("  HERE IS YOUR LIBRARY CARD PROFESSOR :      ");
        System.out.println(" CARD NAME : "+first_name + " " + last_name + " ------   valid for : " + (teacherCard.getAvailability_duration()));
    }

    @Override
    public void borrowBook(Book b) {
        if (l != null) {
            boolean check=false;
            System.out.println(" HELLO PROFESSOR , YOU CAN CHOOSE WHATEVER BOOK YOU WANT  ");
            System.out.println(" YOU CAN GIVE IT BACK WHENEVER YOU WANT , TAKE YOUR TIME ");
            System.out.println(" LET ME CHECK IF THE BOOK :" + b.getTitle() + " EXIST OR NO !");

            for (Book e : l.L) {
                if (e.getTitle().equalsIgnoreCase(b.getTitle())) {check=true;break;}
            }
            if (!check) System.out.println("Book does not exist in the library ");
            else { System.out.println(" BOOK EXIST , YOU CAN BORROW IT "); l.L.remove(b);}
        }
    }

    @Override
    public void returnBook(Book b) {
        System.out.println(" THANKS FOR YOUR TRUST : BOOK RETURNED TO LIBRARY ");
        l.L.add(b);
    }
}
