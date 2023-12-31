import java.util.Scanner;

public class Book {
    private String title, author;
    private int  publication_year;


    public Book(String t, String a,  int y) {
        Scanner s=new Scanner(System.in);

        System.out.println("nom de book :  ");
        t = s.nextLine();

        System.out.println("auteur de book : ");
        a = s.nextLine();

        System.out.println("date de publication de book : ");
        y=s.nextInt();
        this.title = t;
        this.author = a;
        this.publication_year =y;
    }
    public void displayinformation() {
        System.out.println("book inforamtions  : ");
        System.out.println("the book name is " + this.getTitle());
        System.out.println("the book author is " + this.getAuthor());
        System.out.println("the book was released in : " + this.getPublication_year());

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublication_year() {
        return publication_year;
    }


}

