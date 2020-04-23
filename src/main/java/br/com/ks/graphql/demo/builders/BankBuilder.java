package br.com.ks.graphql.demo.builders;

import br.com.ks.graphql.demo.DTO.Bank;

import java.util.Arrays;
import java.util.List;

public class BankBuilder {

   public final static List<Bank> list = Arrays.asList(
           Bank.builder().id(123456L).nameBank("Itau").account("1234").type("0").build(),
           Bank.builder().id(123457L).nameBank("Itau").account("2345").type("X").build(),
           Bank.builder().id(987654L).nameBank("Itau").account("4532").type("8").build(),
           Bank.builder().id(987653L).nameBank("Itau").account("3215").type("3").build(),
           Bank.builder().id(222322L).nameBank("Itau").account("7854").type("0").build()
   );
}

