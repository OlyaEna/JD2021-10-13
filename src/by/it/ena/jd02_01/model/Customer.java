package by.it.ena.jd02_01.model;

import java.util.Objects;

public class Customer {

    private final String name;

    public Customer() {
        name = "unknown customer";
    }

    public Customer(int number) {
        this.name = String.format("Customer №%d", number);
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Customer customer = (Customer) obj;
        return Objects.equals(name, customer.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
