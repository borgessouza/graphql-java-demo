package br.com.ks.graphql.demo.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Bank {

    private Long id;
    private String nameBank;
    private String account;
    private String type;

}
