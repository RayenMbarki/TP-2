import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            String t=new String();
            String a=new String();
            int y = 0 ;
            System.out.println("what's your books : ");
            Book B=new Book(t,a,y);
            //Book C=new Book(t,a,y);
            /*Book D=new Book(t,a,y);
            Book E=new Book(t,a,y);*/
            System.out.println("what's your Textbook : ");
            Textbook b=new Textbook(t,a,y);
            System.out.println("what's your Novel : ");
            Novel N=new Novel(t,a,y);
            B.displayinformation();
            b.displayinformation();
            N.displayinformation();
            Library L = new Library();
            L.add_book(B);
            //L.add_book(C);
            L.add_book(N);
            L.add_book(b);
            L.affiche_library();

            Student student=new Student(L);
            student.getStudentCard();

            Teacher teacher=new Teacher(L);
            teacher.getTeacherCard();
            LibraryUser studentUser=new Student(L);


            studentUser.borrowBook(B);
            studentUser.returnBook(B);

            LibraryUser teacherUser=new Teacher(L);

            teacherUser.borrowBook(N);
            teacherUser.returnBook(N);







    }
}