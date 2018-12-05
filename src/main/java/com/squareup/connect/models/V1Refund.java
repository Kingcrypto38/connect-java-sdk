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
import com.squareup.connect.models.V1Money;
import com.squareup.connect.models.V1PaymentSurcharge;
import com.squareup.connect.models.V1PaymentTax;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * V1Refund
 */

public class V1Refund {
  /**
   * The type of refund 
   */
  public enum TypeEnum {
    FULL("FULL"),
    
    PARTIAL("PARTIAL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("refunded_money")
  private V1Money refundedMoney = null;

  @JsonProperty("refunded_processing_fee_money")
  private V1Money refundedProcessingFeeMoney = null;

  @JsonProperty("refunded_tax_money")
  private V1Money refundedTaxMoney = null;

  @JsonProperty("refunded_additive_tax_money")
  private V1Money refundedAdditiveTaxMoney = null;

  @JsonProperty("refunded_additive_tax")
  private List<V1PaymentTax> refundedAdditiveTax = new ArrayList<V1PaymentTax>();

  @JsonProperty("refunded_inclusive_tax_money")
  private V1Money refundedInclusiveTaxMoney = null;

  @JsonProperty("refunded_inclusive_tax")
  private List<V1PaymentTax> refundedInclusiveTax = new ArrayList<V1PaymentTax>();

  @JsonProperty("refunded_tip_money")
  private V1Money refundedTipMoney = null;

  @JsonProperty("refunded_discount_money")
  private V1Money refundedDiscountMoney = null;

  @JsonProperty("refunded_surcharge_money")
  private V1Money refundedSurchargeMoney = null;

  @JsonProperty("refunded_surcharges")
  private List<V1PaymentSurcharge> refundedSurcharges = new ArrayList<V1PaymentSurcharge>();

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("processed_at")
  private String processedAt = null;

  @JsonProperty("payment_id")
  private String paymentId = null;

  @JsonProperty("merchant_id")
  private String merchantId = null;

  @JsonProperty("is_exchange")
  private Boolean isExchange = null;

  public V1Refund type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of refund 
   * @return type
  **/
  @ApiModelProperty(value = "The type of refund ")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public V1Refund reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The merchant-specified reason for the refund.
   * @return reason
  **/
  @ApiModelProperty(value = "The merchant-specified reason for the refund.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1Refund refundedMoney(V1Money refundedMoney) {
    this.refundedMoney = refundedMoney;
    return this;
  }

   /**
   * The amount of money refunded. This amount is always negative.
   * @return refundedMoney
  **/
  @ApiModelProperty(value = "The amount of money refunded. This amount is always negative.")
  public V1Money getRefundedMoney() {
    return refundedMoney;
  }

  public void setRefundedMoney(V1Money refundedMoney) {
    this.refundedMoney = refundedMoney;
  }

  public V1Refund refundedProcessingFeeMoney(V1Money refundedProcessingFeeMoney) {
    this.refundedProcessingFeeMoney = refundedProcessingFeeMoney;
    return this;
  }

   /**
   * The amount of processing fee money refunded. This amount is always positive.
   * @return refundedProcessingFeeMoney
  **/
  @ApiModelProperty(value = "The amount of processing fee money refunded. This amount is always positive.")
  public V1Money getRefundedProcessingFeeMoney() {
    return refundedProcessingFeeMoney;
  }

  public void setRefundedProcessingFeeMoney(V1Money refundedProcessingFeeMoney) {
    this.refundedProcessingFeeMoney = refundedProcessingFeeMoney;
  }

  public V1Refund refundedTaxMoney(V1Money refundedTaxMoney) {
    this.refundedTaxMoney = refundedTaxMoney;
    return this;
  }

   /**
   * The total amount of tax money refunded. This amount is always negative.
   * @return refundedTaxMoney
  **/
  @ApiModelProperty(value = "The total amount of tax money refunded. This amount is always negative.")
  public V1Money getRefundedTaxMoney() {
    return refundedTaxMoney;
  }

  public void setRefundedTaxMoney(V1Money refundedTaxMoney) {
    this.refundedTaxMoney = refundedTaxMoney;
  }

  public V1Refund refundedAdditiveTaxMoney(V1Money refundedAdditiveTaxMoney) {
    this.refundedAdditiveTaxMoney = refundedAdditiveTaxMoney;
    return this;
  }

   /**
   * The amount of additive tax money refunded. This amount is always negative.
   * @return refundedAdditiveTaxMoney
  **/
  @ApiModelProperty(value = "The amount of additive tax money refunded. This amount is always negative.")
  public V1Money getRefundedAdditiveTaxMoney() {
    return refundedAdditiveTaxMoney;
  }

  public void setRefundedAdditiveTaxMoney(V1Money refundedAdditiveTaxMoney) {
    this.refundedAdditiveTaxMoney = refundedAdditiveTaxMoney;
  }

  public V1Refund refundedAdditiveTax(List<V1PaymentTax> refundedAdditiveTax) {
    this.refundedAdditiveTax = refundedAdditiveTax;
    return this;
  }

  public V1Refund addRefundedAdditiveTaxItem(V1PaymentTax refundedAdditiveTaxItem) {
    this.refundedAdditiveTax.add(refundedAdditiveTaxItem);
    return this;
  }

   /**
   * All of the additive taxes associated with the refund.
   * @return refundedAdditiveTax
  **/
  @ApiModelProperty(value = "All of the additive taxes associated with the refund.")
  public List<V1PaymentTax> getRefundedAdditiveTax() {
    return refundedAdditiveTax;
  }

  public void setRefundedAdditiveTax(List<V1PaymentTax> refundedAdditiveTax) {
    this.refundedAdditiveTax = refundedAdditiveTax;
  }

  public V1Refund refundedInclusiveTaxMoney(V1Money refundedInclusiveTaxMoney) {
    this.refundedInclusiveTaxMoney = refundedInclusiveTaxMoney;
    return this;
  }

   /**
   * The amount of inclusive tax money refunded. This amount is always negative.
   * @return refundedInclusiveTaxMoney
  **/
  @ApiModelProperty(value = "The amount of inclusive tax money refunded. This amount is always negative.")
  public V1Money getRefundedInclusiveTaxMoney() {
    return refundedInclusiveTaxMoney;
  }

  public void setRefundedInclusiveTaxMoney(V1Money refundedInclusiveTaxMoney) {
    this.refundedInclusiveTaxMoney = refundedInclusiveTaxMoney;
  }

  public V1Refund refundedInclusiveTax(List<V1PaymentTax> refundedInclusiveTax) {
    this.refundedInclusiveTax = refundedInclusiveTax;
    return this;
  }

  public V1Refund addRefundedInclusiveTaxItem(V1PaymentTax refundedInclusiveTaxItem) {
    this.refundedInclusiveTax.add(refundedInclusiveTaxItem);
    return this;
  }

   /**
   * All of the inclusive taxes associated with the refund.
   * @return refundedInclusiveTax
  **/
  @ApiModelProperty(value = "All of the inclusive taxes associated with the refund.")
  public List<V1PaymentTax> getRefundedInclusiveTax() {
    return refundedInclusiveTax;
  }

  public void setRefundedInclusiveTax(List<V1PaymentTax> refundedInclusiveTax) {
    this.refundedInclusiveTax = refundedInclusiveTax;
  }

  public V1Refund refundedTipMoney(V1Money refundedTipMoney) {
    this.refundedTipMoney = refundedTipMoney;
    return this;
  }

   /**
   * The amount of tip money refunded. This amount is always negative.
   * @return refundedTipMoney
  **/
  @ApiModelProperty(value = "The amount of tip money refunded. This amount is always negative.")
  public V1Money getRefundedTipMoney() {
    return refundedTipMoney;
  }

  public void setRefundedTipMoney(V1Money refundedTipMoney) {
    this.refundedTipMoney = refundedTipMoney;
  }

  public V1Refund refundedDiscountMoney(V1Money refundedDiscountMoney) {
    this.refundedDiscountMoney = refundedDiscountMoney;
    return this;
  }

   /**
   * The amount of discount money refunded. This amount is always positive.
   * @return refundedDiscountMoney
  **/
  @ApiModelProperty(value = "The amount of discount money refunded. This amount is always positive.")
  public V1Money getRefundedDiscountMoney() {
    return refundedDiscountMoney;
  }

  public void setRefundedDiscountMoney(V1Money refundedDiscountMoney) {
    this.refundedDiscountMoney = refundedDiscountMoney;
  }

  public V1Refund refundedSurchargeMoney(V1Money refundedSurchargeMoney) {
    this.refundedSurchargeMoney = refundedSurchargeMoney;
    return this;
  }

   /**
   * The amount of surcharge money refunded. This amount is always negative.
   * @return refundedSurchargeMoney
  **/
  @ApiModelProperty(value = "The amount of surcharge money refunded. This amount is always negative.")
  public V1Money getRefundedSurchargeMoney() {
    return refundedSurchargeMoney;
  }

  public void setRefundedSurchargeMoney(V1Money refundedSurchargeMoney) {
    this.refundedSurchargeMoney = refundedSurchargeMoney;
  }

  public V1Refund refundedSurcharges(List<V1PaymentSurcharge> refundedSurcharges) {
    this.refundedSurcharges = refundedSurcharges;
    return this;
  }

  public V1Refund addRefundedSurchargesItem(V1PaymentSurcharge refundedSurchargesItem) {
    this.refundedSurcharges.add(refundedSurchargesItem);
    return this;
  }

   /**
   * A list of all surcharges associated with the refund.
   * @return refundedSurcharges
  **/
  @ApiModelProperty(value = "A list of all surcharges associated with the refund.")
  public List<V1PaymentSurcharge> getRefundedSurcharges() {
    return refundedSurcharges;
  }

  public void setRefundedSurcharges(List<V1PaymentSurcharge> refundedSurcharges) {
    this.refundedSurcharges = refundedSurcharges;
  }

  public V1Refund createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time when the merchant initiated the refund for Square to process, in ISO 8601 format.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time when the merchant initiated the refund for Square to process, in ISO 8601 format.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public V1Refund processedAt(String processedAt) {
    this.processedAt = processedAt;
    return this;
  }

   /**
   * The time when Square processed the refund on behalf of the merchant, in ISO 8601 format.
   * @return processedAt
  **/
  @ApiModelProperty(value = "The time when Square processed the refund on behalf of the merchant, in ISO 8601 format.")
  public String getProcessedAt() {
    return processedAt;
  }

  public void setProcessedAt(String processedAt) {
    this.processedAt = processedAt;
  }

  public V1Refund paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

   /**
   * A Square-issued ID associated with the refund. For single-tender refunds, payment_id is the ID of the original payment ID. For split-tender refunds, payment_id is the ID of the original tender. For exchange-based refunds (is_exchange == true), payment_id is the ID of the original payment ID even if the payment includes other tenders.
   * @return paymentId
  **/
  @ApiModelProperty(value = "A Square-issued ID associated with the refund. For single-tender refunds, payment_id is the ID of the original payment ID. For split-tender refunds, payment_id is the ID of the original tender. For exchange-based refunds (is_exchange == true), payment_id is the ID of the original payment ID even if the payment includes other tenders.")
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public V1Refund merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * 
   * @return merchantId
  **/
  @ApiModelProperty(value = "")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public V1Refund isExchange(Boolean isExchange) {
    this.isExchange = isExchange;
    return this;
  }

   /**
   * Indicates whether or not the refund is associated with an exchange. If is_exchange is true, the refund reflects the value of goods returned in the exchange not the total money refunded.
   * @return isExchange
  **/
  @ApiModelProperty(value = "Indicates whether or not the refund is associated with an exchange. If is_exchange is true, the refund reflects the value of goods returned in the exchange not the total money refunded.")
  public Boolean getIsExchange() {
    return isExchange;
  }

  public void setIsExchange(Boolean isExchange) {
    this.isExchange = isExchange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Refund v1Refund = (V1Refund) o;
    return Objects.equals(this.type, v1Refund.type) &&
        Objects.equals(this.reason, v1Refund.reason) &&
        Objects.equals(this.refundedMoney, v1Refund.refundedMoney) &&
        Objects.equals(this.refundedProcessingFeeMoney, v1Refund.refundedProcessingFeeMoney) &&
        Objects.equals(this.refundedTaxMoney, v1Refund.refundedTaxMoney) &&
        Objects.equals(this.refundedAdditiveTaxMoney, v1Refund.refundedAdditiveTaxMoney) &&
        Objects.equals(this.refundedAdditiveTax, v1Refund.refundedAdditiveTax) &&
        Objects.equals(this.refundedInclusiveTaxMoney, v1Refund.refundedInclusiveTaxMoney) &&
        Objects.equals(this.refundedInclusiveTax, v1Refund.refundedInclusiveTax) &&
        Objects.equals(this.refundedTipMoney, v1Refund.refundedTipMoney) &&
        Objects.equals(this.refundedDiscountMoney, v1Refund.refundedDiscountMoney) &&
        Objects.equals(this.refundedSurchargeMoney, v1Refund.refundedSurchargeMoney) &&
        Objects.equals(this.refundedSurcharges, v1Refund.refundedSurcharges) &&
        Objects.equals(this.createdAt, v1Refund.createdAt) &&
        Objects.equals(this.processedAt, v1Refund.processedAt) &&
        Objects.equals(this.paymentId, v1Refund.paymentId) &&
        Objects.equals(this.merchantId, v1Refund.merchantId) &&
        Objects.equals(this.isExchange, v1Refund.isExchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, reason, refundedMoney, refundedProcessingFeeMoney, refundedTaxMoney, refundedAdditiveTaxMoney, refundedAdditiveTax, refundedInclusiveTaxMoney, refundedInclusiveTax, refundedTipMoney, refundedDiscountMoney, refundedSurchargeMoney, refundedSurcharges, createdAt, processedAt, paymentId, merchantId, isExchange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Refund {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    refundedMoney: ").append(toIndentedString(refundedMoney)).append("\n");
    sb.append("    refundedProcessingFeeMoney: ").append(toIndentedString(refundedProcessingFeeMoney)).append("\n");
    sb.append("    refundedTaxMoney: ").append(toIndentedString(refundedTaxMoney)).append("\n");
    sb.append("    refundedAdditiveTaxMoney: ").append(toIndentedString(refundedAdditiveTaxMoney)).append("\n");
    sb.append("    refundedAdditiveTax: ").append(toIndentedString(refundedAdditiveTax)).append("\n");
    sb.append("    refundedInclusiveTaxMoney: ").append(toIndentedString(refundedInclusiveTaxMoney)).append("\n");
    sb.append("    refundedInclusiveTax: ").append(toIndentedString(refundedInclusiveTax)).append("\n");
    sb.append("    refundedTipMoney: ").append(toIndentedString(refundedTipMoney)).append("\n");
    sb.append("    refundedDiscountMoney: ").append(toIndentedString(refundedDiscountMoney)).append("\n");
    sb.append("    refundedSurchargeMoney: ").append(toIndentedString(refundedSurchargeMoney)).append("\n");
    sb.append("    refundedSurcharges: ").append(toIndentedString(refundedSurcharges)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    processedAt: ").append(toIndentedString(processedAt)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    isExchange: ").append(toIndentedString(isExchange)).append("\n");
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

