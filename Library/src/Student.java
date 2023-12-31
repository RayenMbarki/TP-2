import java.util.Scanner;

public class Student implements LibraryUser{
    private  Library l;
    private  LibraryCard studentCard;
    private String first_name,last_name;


    public Student(Library l) {
        this.l = l;
        Scanner s=new Scanner(System.in);
        this.studentCard = new LibraryCard(first_name,last_name);
        System.out.println("  HEY DEAR STUDENT   ");
        System.out.print("  ENTER YOUR FIRST NAME :   ");
        this.first_name = s.nextLine();
        System.out.print("  ENTER YOUR LAST NAME :   ");
        this.last_name = s.nextLine();
    }


    public void getStudentCard() {
        System.out.print("  HERE IS YOUR LIBRARY CARD DEAR STUDENT :      ");
        System.out.println(" CARD NAME : "+first_name + " " + last_name + "     ---------    valid for : " + studentCard.getAvailability_duration());
    }

    @Override
    public void borrowBook(Book b) {
        boolean check = false;
        if (l != null) {
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
