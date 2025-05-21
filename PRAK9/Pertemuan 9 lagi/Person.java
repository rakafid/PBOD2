import java.io.Serializable;

public class Person implements Serializable {
    private String name;

    public Person(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }
}
