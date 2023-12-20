package madel;

public class Producer {
    public static long ID = 0;
    private long id;
    private String firstName;
    private String lastName;

    public Producer(String firstName, String lastName) {
        this.id = ++ID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Producer " +
                "id = " + id +
                ", first name = " + firstName +
                ", last name = " + lastName +  '\n';
    }
}
