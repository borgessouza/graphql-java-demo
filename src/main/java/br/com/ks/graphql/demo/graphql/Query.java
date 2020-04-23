package br.com.ks.graphql.demo.graphql;

import br.com.ks.graphql.demo.DTO.Address;
import br.com.ks.graphql.demo.DTO.Customer;
import br.com.ks.graphql.demo.builders.AddressBuilder;
import br.com.ks.graphql.demo.builders.CustomerBuilder;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    public Customer getCustomer(int id) {
        return CustomerBuilder.list
                .stream()
                .filter($ -> $.getId().equals(Long.valueOf(id)))
                .findAny().get();
    }


    public Address getAddress(Integer id) {
        return AddressBuilder.list
                .stream()
                .filter($ -> $.getId().equals(Long.valueOf(id)))
                .findAny().get();
    }
}
