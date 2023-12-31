import java.time.LocalDate;

public class LibraryCard {
    private String name;
    private String id;
    private LocalDate expired_date;


    public LibraryCard(String name, String last_name) {
        this.name = name;
        this.id = id;
        this.expired_date = LocalDate.now().plusYears(1);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public LocalDate getAvailability_duration() {
        return expired_date;
    }
}
