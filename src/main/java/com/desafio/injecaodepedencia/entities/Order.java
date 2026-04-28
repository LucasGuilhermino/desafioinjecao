package com.desafio.injecaodepedencia.entities;

public class Order {

   private Integer code;
   private Double basic;
   private Double discount;

   public Order(){}

   public Order(Double discount, Double basic, Integer code) {
      this.discount = discount;
      this.basic = basic;
      this.code = code;
   }

   public Order(Integer code, Double basic, Double discount) {
      this.code = code;
      this.basic = basic;
      this.discount = discount;
   }
}
