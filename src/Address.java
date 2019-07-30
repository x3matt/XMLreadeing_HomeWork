import java.util.Objects;

public class Address {
    private String street;
    private Integer houseNumber;

    public Address(Integer houseNumber,String street) {
        this.houseNumber = houseNumber;
        this.street=street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return getStreet().equals(address.getStreet()) &&
                getHouseNumber().equals(address.getHouseNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStreet(), getHouseNumber());
    }

    public String getStreet() {
        return street;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }
}
