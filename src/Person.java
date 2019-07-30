import java.util.Objects;

public class Person {
    private String name;
    private String gender;
    private Address address;

    public Person(String name,String gender,Address address){
        this.address=address;
        this.gender=gender;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getName().equals(person.getName()) &&
                getGender().equals(person.getGender()) &&
                getAddress().equals(person.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGender(), getAddress());
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
