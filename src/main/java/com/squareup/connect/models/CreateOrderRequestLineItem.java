/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.squareup.connect.models.CreateOrderRequestDiscount;
import com.squareup.connect.models.CreateOrderRequestTax;
import com.squareup.connect.models.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a line item to include in an order. Each line item describes a different product to purchase, with its own quantity and price details.
 */
@ApiModel(description = "Represents a line item to include in an order. Each line item describes a different product to purchase, with its own quantity and price details.")

public class CreateOrderRequestLineItem {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("quantity")
  private String quantity = null;

  @JsonProperty("base_price_money")
  private Money basePriceMoney = null;

  @JsonProperty("taxes")
  private List<CreateOrderRequestTax> taxes = new ArrayList<CreateOrderRequestTax>();

  @JsonProperty("discounts")
  private List<CreateOrderRequestDiscount> discounts = new ArrayList<CreateOrderRequestDiscount>();

  public CreateOrderRequestLineItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the line item. This value cannot exceed 500 characters.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the line item. This value cannot exceed 500 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateOrderRequestLineItem quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity to purchase, as a string representation of a number. Currently, only integer values are supported.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The quantity to purchase, as a string representation of a number. Currently, only integer values are supported.")
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public CreateOrderRequestLineItem basePriceMoney(Money basePriceMoney) {
    this.basePriceMoney = basePriceMoney;
    return this;
  }

   /**
   * The base price for a single unit of the line item's associated variation. If a line item represents a Custom Amount instead of a particular product, this field indicates that amount.
   * @return basePriceMoney
  **/
  @ApiModelProperty(value = "The base price for a single unit of the line item's associated variation. If a line item represents a Custom Amount instead of a particular product, this field indicates that amount.")
  public Money getBasePriceMoney() {
    return basePriceMoney;
  }

  public void setBasePriceMoney(Money basePriceMoney) {
    this.basePriceMoney = basePriceMoney;
  }

  public CreateOrderRequestLineItem taxes(List<CreateOrderRequestTax> taxes) {
    this.taxes = taxes;
    return this;
  }

  public CreateOrderRequestLineItem addTaxesItem(CreateOrderRequestTax taxesItem) {
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * The taxes include the custom taxes.
   * @return taxes
  **/
  @ApiModelProperty(value = "The taxes include the custom taxes.")
  public List<CreateOrderRequestTax> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<CreateOrderRequestTax> taxes) {
    this.taxes = taxes;
  }

  public CreateOrderRequestLineItem discounts(List<CreateOrderRequestDiscount> discounts) {
    this.discounts = discounts;
    return this;
  }

  public CreateOrderRequestLineItem addDiscountsItem(CreateOrderRequestDiscount discountsItem) {
    this.discounts.add(discountsItem);
    return this;
  }

   /**
   * The discounts include the custom discounts.
   * @return discounts
  **/
  @ApiModelProperty(value = "The discounts include the custom discounts.")
  public List<CreateOrderRequestDiscount> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<CreateOrderRequestDiscount> discounts) {
    this.discounts = discounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrderRequestLineItem createOrderRequestLineItem = (CreateOrderRequestLineItem) o;
    return Objects.equals(this.name, createOrderRequestLineItem.name) &&
        Objects.equals(this.quantity, createOrderRequestLineItem.quantity) &&
        Objects.equals(this.basePriceMoney, createOrderRequestLineItem.basePriceMoney) &&
        Objects.equals(this.taxes, createOrderRequestLineItem.taxes) &&
        Objects.equals(this.discounts, createOrderRequestLineItem.discounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, quantity, basePriceMoney, taxes, discounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderRequestLineItem {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    basePriceMoney: ").append(toIndentedString(basePriceMoney)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

