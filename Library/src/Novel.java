public class Novel extends Book {
    public Novel(String t,String a,int y) {
        super(t,a,y);
    }

    public void displayinformation() {
        System.out.println("Novel inforamtions : ");
        System.out.println("the textbook name is " + super.getTitle());
        System.out.println("the textbook author is " + super.getAuthor());
        System.out.println("the textbook was released in : " + super.getPublication_year());

    }
}
