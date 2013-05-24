package hellomongo.domain;

import org.jongo.marshall.jackson.oid.Id;
import org.jongo.marshall.jackson.oid.ObjectId;

public class City {
    @Id @ObjectId
    private String key;

    private String name;

    public String getKey() {
        return key;
    }

    public City setKey(final String key) {
        this.key = key;
        return this;
    }


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
                "key='" + key + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
