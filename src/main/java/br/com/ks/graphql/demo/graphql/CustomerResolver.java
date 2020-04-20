package br.com.ks.graphql.demo.graphql;

import br.com.ks.graphql.demo.DTO.Address;
import br.com.ks.graphql.demo.DTO.Customer;
import br.com.ks.graphql.demo.builders.AddressBuilder;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
public class CustomerResolver implements GraphQLResolver<Customer> {

    public Address getAddress(Customer customer) {
        return AddressBuilder.list
                .stream()
                .filter($ -> $.getId().equals(Long.valueOf(customer.getId())))
                .findAny().get();
    }
}
