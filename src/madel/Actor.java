package madel;

public class Actor {
    public static long ID = 0;
    private long id;
    private String fullName;
    private String role;

    public Actor( String fullName, String role) {
        this.id = ++ID;
        this.fullName = fullName;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Actor " +
                "id = " + id +
                ", full name = " + fullName +
                ", role = " + role + "\n";
    }
}
