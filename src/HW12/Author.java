package HW12;

import java.util.Objects;

public class Author {
    private final String firstName;
    private final String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (obj.getClass().equals(Author.class)) return false;
        Author other = (Author) obj;
        return Objects.equals(this.firstName, other.firstName)
                && Objects.equals(this.secondName, other.secondName);
    }
}