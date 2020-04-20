package br.com.ks.graphql.demo.builders;

import br.com.ks.graphql.demo.DTO.Address;

import java.util.Arrays;
import java.util.List;

public class AddressBuilder {

    public final static List<Address> list = Arrays.asList(
            new Address(123456L, "Brasil Urgente", 17, 12344220, "São Paulo", "SP"),
            new Address(123457L, "Brasil Urgente", 17, 12344220, "São Paulo", "SP"),
            new Address(987654L, "Brasil Urgente", 17, 12344220, "São Paulo", "SP"),
            new Address(987653L, "Brasil Urgente", 17, 12344220, "São Paulo", "SP"),
            new Address(222322L, "Brasil Urgente", 17, 12344220, "São Paulo", "SP")
    );
}
