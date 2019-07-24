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
import com.squareup.connect.models.CatalogCategory;
import com.squareup.connect.models.CatalogDiscount;
import com.squareup.connect.models.CatalogImage;
import com.squareup.connect.models.CatalogItem;
import com.squareup.connect.models.CatalogItemOption;
import com.squareup.connect.models.CatalogItemOptionValue;
import com.squareup.connect.models.CatalogItemVariation;
import com.squareup.connect.models.CatalogMeasurementUnit;
import com.squareup.connect.models.CatalogModifier;
import com.squareup.connect.models.CatalogModifierList;
import com.squareup.connect.models.CatalogPricingRule;
import com.squareup.connect.models.CatalogProductSet;
import com.squareup.connect.models.CatalogTax;
import com.squareup.connect.models.CatalogTimePeriod;
import com.squareup.connect.models.CatalogV1Id;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * The wrapper object for object types in the Catalog data model. The type of a particular &#x60;CatalogObject&#x60; is determined by the value of &#x60;type&#x60; and only the corresponding data field may be set.  - if type &#x3D; &#x60;ITEM&#x60;, only &#x60;item_data&#x60; will be populated and it will contain a valid [CatalogItem](#type-catalogitem) object. - if type &#x3D; &#x60;ITEM_VARIATION&#x60;, only &#x60;item_variation_data&#x60; will be populated and it will contain a valid [CatalogItemVariation](#type-catalogitemvariation) object. - if type &#x3D; &#x60;MODIFIER&#x60;, only &#x60;modifier_data&#x60; will be populated and it will contain a valid [CatalogModifier](#type-catalogmodifier) object. - if type &#x3D; &#x60;MODIFIER_LIST&#x60;, only &#x60;modifier_list_data&#x60; will be populated and it will contain a valid [CatalogModifierList](#type-catalogmodifierlist) object. - if type &#x3D; &#x60;CATEGORY&#x60;, only &#x60;category_data&#x60; will be populated and it will contain a valid [CatalogCategory](#type-catalogcategory) object. - if type &#x3D; &#x60;DISCOUNT&#x60;, only &#x60;discount_data&#x60; will be populated and it will contain a valid [CatalogDiscount](#type-catalogdiscount) object. - if type &#x3D; &#x60;TAX&#x60;, only &#x60;tax_data&#x60; will be populated and it will contain a valid [CatalogTax](#type-catalogtax) object. - if type &#x3D; &#x60;IMAGE&#x60;, only &#x60;image_data&#x60; will be populated and it will contain a valid [CatalogImage](#type-catalogimage) object.  For a more detailed discussion of the Catalog data model, please see the [Design a Catalog](/catalog-api/design-a-catalog) guide.
 */
@ApiModel(description = "The wrapper object for object types in the Catalog data model. The type of a particular `CatalogObject` is determined by the value of `type` and only the corresponding data field may be set.  - if type = `ITEM`, only `item_data` will be populated and it will contain a valid [CatalogItem](#type-catalogitem) object. - if type = `ITEM_VARIATION`, only `item_variation_data` will be populated and it will contain a valid [CatalogItemVariation](#type-catalogitemvariation) object. - if type = `MODIFIER`, only `modifier_data` will be populated and it will contain a valid [CatalogModifier](#type-catalogmodifier) object. - if type = `MODIFIER_LIST`, only `modifier_list_data` will be populated and it will contain a valid [CatalogModifierList](#type-catalogmodifierlist) object. - if type = `CATEGORY`, only `category_data` will be populated and it will contain a valid [CatalogCategory](#type-catalogcategory) object. - if type = `DISCOUNT`, only `discount_data` will be populated and it will contain a valid [CatalogDiscount](#type-catalogdiscount) object. - if type = `TAX`, only `tax_data` will be populated and it will contain a valid [CatalogTax](#type-catalogtax) object. - if type = `IMAGE`, only `image_data` will be populated and it will contain a valid [CatalogImage](#type-catalogimage) object.  For a more detailed discussion of the Catalog data model, please see the [Design a Catalog](/catalog-api/design-a-catalog) guide.")

public class CatalogObject {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  @JsonProperty("version")
  private Long version = null;

  @JsonProperty("is_deleted")
  private Boolean isDeleted = null;

  @JsonProperty("catalog_v1_ids")
  private List<CatalogV1Id> catalogV1Ids = new ArrayList<CatalogV1Id>();

  @JsonProperty("present_at_all_locations")
  private Boolean presentAtAllLocations = null;

  @JsonProperty("present_at_location_ids")
  private List<String> presentAtLocationIds = new ArrayList<String>();

  @JsonProperty("absent_at_location_ids")
  private List<String> absentAtLocationIds = new ArrayList<String>();

  @JsonProperty("image_id")
  private String imageId = null;

  @JsonProperty("item_data")
  private CatalogItem itemData = null;

  @JsonProperty("category_data")
  private CatalogCategory categoryData = null;

  @JsonProperty("item_variation_data")
  private CatalogItemVariation itemVariationData = null;

  @JsonProperty("tax_data")
  private CatalogTax taxData = null;

  @JsonProperty("discount_data")
  private CatalogDiscount discountData = null;

  @JsonProperty("modifier_list_data")
  private CatalogModifierList modifierListData = null;

  @JsonProperty("modifier_data")
  private CatalogModifier modifierData = null;

  @JsonProperty("time_period_data")
  private CatalogTimePeriod timePeriodData = null;

  @JsonProperty("product_set_data")
  private CatalogProductSet productSetData = null;

  @JsonProperty("pricing_rule_data")
  private CatalogPricingRule pricingRuleData = null;

  @JsonProperty("image_data")
  private CatalogImage imageData = null;

  @JsonProperty("measurement_unit_data")
  private CatalogMeasurementUnit measurementUnitData = null;

  @JsonProperty("item_option_data")
  private CatalogItemOption itemOptionData = null;

  @JsonProperty("item_option_value_data")
  private CatalogItemOptionValue itemOptionValueData = null;

  public CatalogObject type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of this object. Each object type has expected properties expressed in a structured format within its corresponding `*_data` field below. See [CatalogObjectType](#type-catalogobjecttype) for possible values
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of this object. Each object type has expected properties expressed in a structured format within its corresponding `*_data` field below. See [CatalogObjectType](#type-catalogobjecttype) for possible values")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CatalogObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An identifier to reference this object in the catalog. When a new CatalogObject is inserted, the client should set the id to a temporary identifier starting with a `'#'` character. Other objects being inserted or updated within the same request may use this identifier to refer to the new object.  When the server receives the new object, it will supply a unique identifier that replaces the temporary identifier for all future references.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "An identifier to reference this object in the catalog. When a new CatalogObject is inserted, the client should set the id to a temporary identifier starting with a `'#'` character. Other objects being inserted or updated within the same request may use this identifier to refer to the new object.  When the server receives the new object, it will supply a unique identifier that replaces the temporary identifier for all future references.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogObject updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Last modification [timestamp](#workingwithdates) in RFC 3339 format, e.g., `\"2016-08-15T23:59:33.123Z\"` would indicate the UTC time (denoted by `Z`) of August 15, 2016 at 23:59:33 and 123 milliseconds.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "Last modification [timestamp](#workingwithdates) in RFC 3339 format, e.g., `\"2016-08-15T23:59:33.123Z\"` would indicate the UTC time (denoted by `Z`) of August 15, 2016 at 23:59:33 and 123 milliseconds.")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CatalogObject version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the object. When updating an object, the version supplied must match the version in the database, otherwise the write will be rejected as conflicting.
   * @return version
  **/
  @ApiModelProperty(value = "The version of the object. When updating an object, the version supplied must match the version in the database, otherwise the write will be rejected as conflicting.")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public CatalogObject isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * If `true`, the object has been deleted from the database. Must be `false` for new objects being inserted. When deleted, the `updated_at` field will equal the deletion time.
   * @return isDeleted
  **/
  @ApiModelProperty(value = "If `true`, the object has been deleted from the database. Must be `false` for new objects being inserted. When deleted, the `updated_at` field will equal the deletion time.")
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public CatalogObject catalogV1Ids(List<CatalogV1Id> catalogV1Ids) {
    this.catalogV1Ids = catalogV1Ids;
    return this;
  }

  public CatalogObject addCatalogV1IdsItem(CatalogV1Id catalogV1IdsItem) {
    this.catalogV1Ids.add(catalogV1IdsItem);
    return this;
  }

   /**
   * The Connect V1 IDs for this object at each [location](#type-location) where it is present, where they differ from the object's Connect V2 ID. The field will only be present for objects that have been created or modified by legacy APIs.
   * @return catalogV1Ids
  **/
  @ApiModelProperty(value = "The Connect V1 IDs for this object at each [location](#type-location) where it is present, where they differ from the object's Connect V2 ID. The field will only be present for objects that have been created or modified by legacy APIs.")
  public List<CatalogV1Id> getCatalogV1Ids() {
    return catalogV1Ids;
  }

  public void setCatalogV1Ids(List<CatalogV1Id> catalogV1Ids) {
    this.catalogV1Ids = catalogV1Ids;
  }

  public CatalogObject presentAtAllLocations(Boolean presentAtAllLocations) {
    this.presentAtAllLocations = presentAtAllLocations;
    return this;
  }

   /**
   * If `true`, this object is present at all locations (including future locations), except where specified in the `absent_at_location_ids` field. If `false`, this object is not present at any locations (including future locations), except where specified in the `present_at_location_ids` field. If not specified, defaults to `true`.
   * @return presentAtAllLocations
  **/
  @ApiModelProperty(value = "If `true`, this object is present at all locations (including future locations), except where specified in the `absent_at_location_ids` field. If `false`, this object is not present at any locations (including future locations), except where specified in the `present_at_location_ids` field. If not specified, defaults to `true`.")
  public Boolean getPresentAtAllLocations() {
    return presentAtAllLocations;
  }

  public void setPresentAtAllLocations(Boolean presentAtAllLocations) {
    this.presentAtAllLocations = presentAtAllLocations;
  }

  public CatalogObject presentAtLocationIds(List<String> presentAtLocationIds) {
    this.presentAtLocationIds = presentAtLocationIds;
    return this;
  }

  public CatalogObject addPresentAtLocationIdsItem(String presentAtLocationIdsItem) {
    this.presentAtLocationIds.add(presentAtLocationIdsItem);
    return this;
  }

   /**
   * A list of locations where the object is present, even if `present_at_all_locations` is `false`.
   * @return presentAtLocationIds
  **/
  @ApiModelProperty(value = "A list of locations where the object is present, even if `present_at_all_locations` is `false`.")
  public List<String> getPresentAtLocationIds() {
    return presentAtLocationIds;
  }

  public void setPresentAtLocationIds(List<String> presentAtLocationIds) {
    this.presentAtLocationIds = presentAtLocationIds;
  }

  public CatalogObject absentAtLocationIds(List<String> absentAtLocationIds) {
    this.absentAtLocationIds = absentAtLocationIds;
    return this;
  }

  public CatalogObject addAbsentAtLocationIdsItem(String absentAtLocationIdsItem) {
    this.absentAtLocationIds.add(absentAtLocationIdsItem);
    return this;
  }

   /**
   * A list of locations where the object is not present, even if `present_at_all_locations` is `true`.
   * @return absentAtLocationIds
  **/
  @ApiModelProperty(value = "A list of locations where the object is not present, even if `present_at_all_locations` is `true`.")
  public List<String> getAbsentAtLocationIds() {
    return absentAtLocationIds;
  }

  public void setAbsentAtLocationIds(List<String> absentAtLocationIds) {
    this.absentAtLocationIds = absentAtLocationIds;
  }

  public CatalogObject imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * Identifies the `CatalogImage` attached to this `CatalogObject`.
   * @return imageId
  **/
  @ApiModelProperty(value = "Identifies the `CatalogImage` attached to this `CatalogObject`.")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public CatalogObject itemData(CatalogItem itemData) {
    this.itemData = itemData;
    return this;
  }

   /**
   * Structured data for a [CatalogItem](#type-catalogitem), set for CatalogObjects of type `ITEM`.
   * @return itemData
  **/
  @ApiModelProperty(value = "Structured data for a [CatalogItem](#type-catalogitem), set for CatalogObjects of type `ITEM`.")
  public CatalogItem getItemData() {
    return itemData;
  }

  public void setItemData(CatalogItem itemData) {
    this.itemData = itemData;
  }

  public CatalogObject categoryData(CatalogCategory categoryData) {
    this.categoryData = categoryData;
    return this;
  }

   /**
   * Structured data for a [CatalogCategory](#type-catalogcategory), set for CatalogObjects of type `CATEGORY`.
   * @return categoryData
  **/
  @ApiModelProperty(value = "Structured data for a [CatalogCategory](#type-catalogcategory), set for CatalogObjects of type `CATEGORY`.")
  public CatalogCategory getCategoryData() {
    return categoryData;
  }

  public void setCategoryData(CatalogCategory categoryData) {
    this.categoryData = categoryData;
  }

  public CatalogObject itemVariationData(CatalogItemVariation itemVariationData) {
    this.itemVariationData = itemVariationData;
    return this;
  }

   /**
   * Structured data for a [CatalogItemVariation](#type-catalogitemvariation), set for CatalogObjects of type `ITEM_VARIATION`.
   * @return itemVariationData
  **/
  @ApiModelProperty(value = "Structured data for a [CatalogItemVariation](#type-catalogitemvariation), set for CatalogObjects of type `ITEM_VARIATION`.")
  public CatalogItemVariation getItemVariationData() {
    return itemVariationData;
  }

  public void setItemVariationData(CatalogItemVariation itemVariationData) {
    this.itemVariationData = itemVariationData;
  }

  public CatalogObject taxData(CatalogTax taxData) {
    this.taxData = taxData;
    return this;
  }

   /**
   * Structured data for a [CatalogTax](#type-catalogtax), set for CatalogObjects of type `TAX`.
   * @return taxData
  **/
  @ApiModelProperty(value = "Structured data for a [CatalogTax](#type-catalogtax), set for CatalogObjects of type `TAX`.")
  public CatalogTax getTaxData() {
    return taxData;
  }

  public void setTaxData(CatalogTax taxData) {
    this.taxData = taxData;
  }

  public CatalogObject discountData(CatalogDiscount discountData) {
    this.discountData = discountData;
    return this;
  }

   /**
   * Structured data for a [CatalogDiscount](#type-catalogdiscount), set for CatalogObjects of type `DISCOUNT`.
   * @return discountData
  **/
  @ApiModelProperty(value = "Structured data for a [CatalogDiscount](#type-catalogdiscount), set for CatalogObjects of type `DISCOUNT`.")
  public CatalogDiscount getDiscountData() {
    return discountData;
  }

  public void setDiscountData(CatalogDiscount discountData) {
    this.discountData = discountData;
  }

  public CatalogObject modifierListData(CatalogModifierList modifierListData) {
    this.modifierListData = modifierListData;
    return this;
  }

   /**
   * Structured data for a [CatalogModifierList](#type-catalogmodifierlist), set for CatalogObjects of type `MODIFIER_LIST`.
   * @return modifierListData
  **/
  @ApiModelProperty(value = "Structured data for a [CatalogModifierList](#type-catalogmodifierlist), set for CatalogObjects of type `MODIFIER_LIST`.")
  public CatalogModifierList getModifierListData() {
    return modifierListData;
  }

  public void setModifierListData(CatalogModifierList modifierListData) {
    this.modifierListData = modifierListData;
  }

  public CatalogObject modifierData(CatalogModifier modifierData) {
    this.modifierData = modifierData;
    return this;
  }

   /**
   * Structured data for a [CatalogModifier](#type-catalogmodifier), set for CatalogObjects of type `MODIFIER`.
   * @return modifierData
  **/
  @ApiModelProperty(value = "Structured data for a [CatalogModifier](#type-catalogmodifier), set for CatalogObjects of type `MODIFIER`.")
  public CatalogModifier getModifierData() {
    return modifierData;
  }

  public void setModifierData(CatalogModifier modifierData) {
    this.modifierData = modifierData;
  }

  public CatalogObject timePeriodData(CatalogTimePeriod timePeriodData) {
    this.timePeriodData = timePeriodData;
    return this;
  }

   /**
   * Structured data for a [CatalogTimePeriod](#type-catalogtimeperiod), set for CatalogObjects of type `TIME_PERIOD`.
   * @return timePeriodData
  **/
  @ApiModelProperty(value = "Structured data for a [CatalogTimePeriod](#type-catalogtimeperiod), set for CatalogObjects of type `TIME_PERIOD`.")
  public CatalogTimePeriod getTimePeriodData() {
    return timePeriodData;
  }

  public void setTimePeriodData(CatalogTimePeriod timePeriodData) {
    this.timePeriodData = timePeriodData;
  }

  public CatalogObject productSetData(CatalogProductSet productSetData) {
    this.productSetData = productSetData;
    return this;
  }

   /**
   * Structured data for a [CatalogProductSet](#type-catalogproductset), set for CatalogObjects of type `PRODUCT_SET`.
   * @return productSetData
  **/
  @ApiModelProperty(value = "Structured data for a [CatalogProductSet](#type-catalogproductset), set for CatalogObjects of type `PRODUCT_SET`.")
  public CatalogProductSet getProductSetData() {
    return productSetData;
  }

  public void setProductSetData(CatalogProductSet productSetData) {
    this.productSetData = productSetData;
  }

  public CatalogObject pricingRuleData(CatalogPricingRule pricingRuleData) {
    this.pricingRuleData = pricingRuleData;
    return this;
  }

   /**
   * Structured data for a [CatalogPricingRule](#type-catalogpricingrule), set for CatalogObjects of type `PRICING_RULE`.
   * @return pricingRuleData
  **/
  @ApiModelProperty(value = "Structured data for a [CatalogPricingRule](#type-catalogpricingrule), set for CatalogObjects of type `PRICING_RULE`.")
  public CatalogPricingRule getPricingRuleData() {
    return pricingRuleData;
  }

  public void setPricingRuleData(CatalogPricingRule pricingRuleData) {
    this.pricingRuleData = pricingRuleData;
  }

  public CatalogObject imageData(CatalogImage imageData) {
    this.imageData = imageData;
    return this;
  }

   /**
   * Structured data for a [CatalogImage](#type-catalogimage), set for CatalogObjects of type `IMAGE`.
   * @return imageData
  **/
  @ApiModelProperty(value = "Structured data for a [CatalogImage](#type-catalogimage), set for CatalogObjects of type `IMAGE`.")
  public CatalogImage getImageData() {
    return imageData;
  }

  public void setImageData(CatalogImage imageData) {
    this.imageData = imageData;
  }

  public CatalogObject measurementUnitData(CatalogMeasurementUnit measurementUnitData) {
    this.measurementUnitData = measurementUnitData;
    return this;
  }

   /**
   * Structured data for a [CatalogMeasurementUnit](#type-catalogmeasurementunit), set for CatalogObjects of type `MEASUREMENT_UNIT`.
   * @return measurementUnitData
  **/
  @ApiModelProperty(value = "Structured data for a [CatalogMeasurementUnit](#type-catalogmeasurementunit), set for CatalogObjects of type `MEASUREMENT_UNIT`.")
  public CatalogMeasurementUnit getMeasurementUnitData() {
    return measurementUnitData;
  }

  public void setMeasurementUnitData(CatalogMeasurementUnit measurementUnitData) {
    this.measurementUnitData = measurementUnitData;
  }

  public CatalogObject itemOptionData(CatalogItemOption itemOptionData) {
    this.itemOptionData = itemOptionData;
    return this;
  }

   /**
   * Structured data for a [CatalogItemOption](#type-catalogitemoption), set for CatalogObjects of type `ITEM_OPTION`.
   * @return itemOptionData
  **/
  @ApiModelProperty(value = "Structured data for a [CatalogItemOption](#type-catalogitemoption), set for CatalogObjects of type `ITEM_OPTION`.")
  public CatalogItemOption getItemOptionData() {
    return itemOptionData;
  }

  public void setItemOptionData(CatalogItemOption itemOptionData) {
    this.itemOptionData = itemOptionData;
  }

  public CatalogObject itemOptionValueData(CatalogItemOptionValue itemOptionValueData) {
    this.itemOptionValueData = itemOptionValueData;
    return this;
  }

   /**
   * Structured data for a [CatalogItemOptionValue](#type-catalogitemoptionvalue), set for CatalogObjects of type `ITEM_OPTION_VAL`.
   * @return itemOptionValueData
  **/
  @ApiModelProperty(value = "Structured data for a [CatalogItemOptionValue](#type-catalogitemoptionvalue), set for CatalogObjects of type `ITEM_OPTION_VAL`.")
  public CatalogItemOptionValue getItemOptionValueData() {
    return itemOptionValueData;
  }

  public void setItemOptionValueData(CatalogItemOptionValue itemOptionValueData) {
    this.itemOptionValueData = itemOptionValueData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogObject catalogObject = (CatalogObject) o;
    return Objects.equals(this.type, catalogObject.type) &&
        Objects.equals(this.id, catalogObject.id) &&
        Objects.equals(this.updatedAt, catalogObject.updatedAt) &&
        Objects.equals(this.version, catalogObject.version) &&
        Objects.equals(this.isDeleted, catalogObject.isDeleted) &&
        Objects.equals(this.catalogV1Ids, catalogObject.catalogV1Ids) &&
        Objects.equals(this.presentAtAllLocations, catalogObject.presentAtAllLocations) &&
        Objects.equals(this.presentAtLocationIds, catalogObject.presentAtLocationIds) &&
        Objects.equals(this.absentAtLocationIds, catalogObject.absentAtLocationIds) &&
        Objects.equals(this.imageId, catalogObject.imageId) &&
        Objects.equals(this.itemData, catalogObject.itemData) &&
        Objects.equals(this.categoryData, catalogObject.categoryData) &&
        Objects.equals(this.itemVariationData, catalogObject.itemVariationData) &&
        Objects.equals(this.taxData, catalogObject.taxData) &&
        Objects.equals(this.discountData, catalogObject.discountData) &&
        Objects.equals(this.modifierListData, catalogObject.modifierListData) &&
        Objects.equals(this.modifierData, catalogObject.modifierData) &&
        Objects.equals(this.timePeriodData, catalogObject.timePeriodData) &&
        Objects.equals(this.productSetData, catalogObject.productSetData) &&
        Objects.equals(this.pricingRuleData, catalogObject.pricingRuleData) &&
        Objects.equals(this.imageData, catalogObject.imageData) &&
        Objects.equals(this.measurementUnitData, catalogObject.measurementUnitData) &&
        Objects.equals(this.itemOptionData, catalogObject.itemOptionData) &&
        Objects.equals(this.itemOptionValueData, catalogObject.itemOptionValueData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, updatedAt, version, isDeleted, catalogV1Ids, presentAtAllLocations, presentAtLocationIds, absentAtLocationIds, imageId, itemData, categoryData, itemVariationData, taxData, discountData, modifierListData, modifierData, timePeriodData, productSetData, pricingRuleData, imageData, measurementUnitData, itemOptionData, itemOptionValueData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogObject {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    catalogV1Ids: ").append(toIndentedString(catalogV1Ids)).append("\n");
    sb.append("    presentAtAllLocations: ").append(toIndentedString(presentAtAllLocations)).append("\n");
    sb.append("    presentAtLocationIds: ").append(toIndentedString(presentAtLocationIds)).append("\n");
    sb.append("    absentAtLocationIds: ").append(toIndentedString(absentAtLocationIds)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    itemData: ").append(toIndentedString(itemData)).append("\n");
    sb.append("    categoryData: ").append(toIndentedString(categoryData)).append("\n");
    sb.append("    itemVariationData: ").append(toIndentedString(itemVariationData)).append("\n");
    sb.append("    taxData: ").append(toIndentedString(taxData)).append("\n");
    sb.append("    discountData: ").append(toIndentedString(discountData)).append("\n");
    sb.append("    modifierListData: ").append(toIndentedString(modifierListData)).append("\n");
    sb.append("    modifierData: ").append(toIndentedString(modifierData)).append("\n");
    sb.append("    timePeriodData: ").append(toIndentedString(timePeriodData)).append("\n");
    sb.append("    productSetData: ").append(toIndentedString(productSetData)).append("\n");
    sb.append("    pricingRuleData: ").append(toIndentedString(pricingRuleData)).append("\n");
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
    sb.append("    measurementUnitData: ").append(toIndentedString(measurementUnitData)).append("\n");
    sb.append("    itemOptionData: ").append(toIndentedString(itemOptionData)).append("\n");
    sb.append("    itemOptionValueData: ").append(toIndentedString(itemOptionValueData)).append("\n");
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

