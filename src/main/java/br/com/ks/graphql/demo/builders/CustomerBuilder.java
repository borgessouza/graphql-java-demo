package br.com.ks.graphql.demo.builders;

import br.com.ks.graphql.demo.DTO.Customer;

import java.util.Arrays;
import java.util.List;

public class CustomerBuilder {

   public final static List<Customer> list = Arrays.asList(
          new Customer(123456L, "Jose", "Feliz"),
          new Customer(123457L, "Maira", "Paz"),
          new Customer(987654L, "Albert", "Wesker"),
          new Customer(987653L,"Jill", "Valentine"),
          new Customer(222322L,"Chris", "Redfield")
   );



}
