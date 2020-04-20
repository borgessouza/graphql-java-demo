package br.com.ks.graphql.demo.graphql;

import br.com.ks.graphql.demo.DTO.Address;
import br.com.ks.graphql.demo.DTO.Customer;
import br.com.ks.graphql.demo.builders.AddressBuilder;
import br.com.ks.graphql.demo.builders.CustomerBuilder;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import java.util.List;

public class Query implements GraphQLQueryResolver {
    private PostDao postDao;

    public Query(PostDao postDao) {
        this.postDao = postDao;
    }

    public List<Post> getRecentPosts(int count, int offset) {
        return postDao.getRecentPosts(count, offset);
    }

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
