package br.com.ks.graphql.demo.DTO;

import br.com.ks.graphql.demo.builders.AddressBuilder;
import br.com.ks.graphql.demo.builders.BankBuilder;

public class Customer {

    private Long id;
    private String firstName;
    private String lastName;
    private Long registroGeral;
    private Long field1;
    private String field2;
    private Address address;
    private Bank bank;

    public Customer(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(Long registroGeral) {
        this.registroGeral = registroGeral;
    }

    public Long getField1() {
        return field1;
    }

    public void setField1(Long field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }


    public Address getAddress() {
        return AddressBuilder.list
                .stream()
                .filter($ -> $.getId().equals(Long.valueOf(this.id)))
                .findAny()
                .orElse(new Address());
    }

    public Bank getBank() {
        return BankBuilder.list
                .stream()
                .filter($ -> $.getId().equals(Long.valueOf(this.id)))
                .findAny()
                .orElse(Bank.builder().build());
    }
}
