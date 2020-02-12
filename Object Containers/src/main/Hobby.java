package main;

import java.util.List;
import java.util.Objects;

public class Hobby implements Comparable{

    private String hobbyName;
    private int frequency;
    private List<Address> hobbyAddress;

    public Hobby(String hobbyName, int frequency, List<Address> hobbyAddress) {
        this.hobbyName = hobbyName;
        this.frequency = frequency;
        this.hobbyAddress = hobbyAddress;
    }

    public Hobby(String climbing, int frequency, Address address) {

    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public List<Address> getHobbyAddress() {
        return hobbyAddress;
    }

    public void setHobbyAddress(List<Address> hobbyAddress) {
        this.hobbyAddress = hobbyAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hobby hobby = (Hobby) o;
        return frequency == hobby.frequency &&
                Objects.equals(hobbyName, hobby.hobbyName) &&
                Objects.equals(hobbyAddress, hobby.hobbyAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hobbyName, frequency, hobbyAddress);
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "hobbyName='" + hobbyName + '\'' +
                ", frequency=" + frequency +
                ", hobbyAddress=" + hobbyAddress +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
