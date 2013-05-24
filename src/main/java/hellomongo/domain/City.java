package hellomongo.domain;

public class City {
    private String name;

    public String getName() {
        return name;
    }

    public City setName(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }
}
