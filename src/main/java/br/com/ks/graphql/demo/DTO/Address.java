package br.com.ks.graphql.demo.DTO;

public class Address {

   private Long id;
   private String address;
   private Integer number;
   private Integer CEP;
   private String city;
   private String state;

   public Address(Long id, String address, Integer number, Integer CEP, String city, String state) {
      this.id = id;
      this.address = address;
      this.number = number;
      this.CEP = CEP;
      this.city = city;
      this.state = state;
   }

   public Long getId() {
      return id;
   }

   public String getAddress() {
      return address;
   }

   public Integer getNumber() {
      return number;
   }

   public Integer getCEP() {
      return CEP;
   }

   public String getCity() {
      return city;
   }

   public String getState() {
      return state;
   }
}
