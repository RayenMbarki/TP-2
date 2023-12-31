import java.util.ArrayList;
import java.util.List;

public class Library {
     List<Book> L = new ArrayList<>();
    public void add_book(Book e) {
        if (!L.contains(e)) {
            L.add(e);
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Book already exists!");
        }
    }
    public void remove_book(Book e) throws EmptyLibraryException{
        if (L.size()!=0) {
            if (L.contains(e)) {
                L.remove(e);
                System.out.println("Book removed successfully!");
            } else {
                System.out.println("Book not found!");
            }
        }
        else throw new EmptyLibraryException();

    }

    public void affiche_library() {
        System.out.println("Books in Library are : ");
        for (Book e : L) {
            e.displayinformation();
        }
    }


}
