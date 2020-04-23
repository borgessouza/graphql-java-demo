package br.com.ks.graphql.demo.builders;

import br.com.ks.graphql.demo.DTO.Address;

import java.util.Arrays;
import java.util.List;

public class AddressBuilder {

    public final static List<Address> list = Arrays.asList(
            new Address(123456L, "Brasil Urgente", 10, 12344220, "São Paulo", "SP"),
            new Address(123457L, "Brasil Carnaval", 11, 12344220, "São Paulo", "SP"),
            new Address(987654L, "Raccoon city", 12, 12344220, "Raccoon", "SP"),
            new Address(987653L, "Arklay Forest", 13, 12344220, "Raccoon", "SP"),
            new Address(222322L, "Av Brasil", 14, 12344220, "Rio de Janeiro", "RJ")
    );
}
