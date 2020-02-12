package main;

import java.util.Objects;

public class Address implements Comparable {

    private String street;
    private Country address;

    public Address(String street, Country address) {
        this.street = street;
        this.address = address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Country getAddress() {
        return address;
    }

    public void setAddress(Country address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address1 = (Address) o;
        return Objects.equals(street, address1.street) &&
                Objects.equals(address, address1.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, address);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
