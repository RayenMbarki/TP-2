public class Textbook extends Book {
    public Textbook(String t,String a , int y) {
        super(t,a,y);
    }


    public void displayinformation() {
        System.out.println("Textbook inforamtions : ");
        System.out.println("the textbook name is " + super.getTitle());
        System.out.println("the textbook author is " + super.getAuthor());
        System.out.println("the textbook was released in : " + super.getPublication_year());

    }
}
