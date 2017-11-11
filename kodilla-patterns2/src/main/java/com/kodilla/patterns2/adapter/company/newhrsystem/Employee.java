package com.kodilla.patterns2.adapter.company.newhrsystem;
import java.math.BigDecimal;
public class Employee {
    final private String peselID;
    final private String firstname;
    final private String lastname;
    final private BigDecimal baseSalary;

    public Employee(String peselID, String firstname, String lastname, BigDecimal baseSalary) {
        this.peselID = peselID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
    }

    public String getPeselID() {
        return peselID;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return peselID != null ? peselID.equals(employee.peselID) : employee.peselID != null;

    }
    @Override
    public int hashCode() {
        return peselID != null ? peselID.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Emoloyee{" +
                "peselID='" + peselID + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
