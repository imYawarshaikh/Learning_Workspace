
package com.costacloud.oicl.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Vehicle Type",
    "Policy Type",
    "Reg Date",
    "Vehicle Purchase Date",
    "City"
})
public class FIELDS {

    @JsonProperty("Vehicle Type")
    private String vehicleType;
    @JsonProperty("Policy Type")
    private String policyType;
    @JsonProperty("Reg Date")
    private String regDate;
    @JsonProperty("Vehicle Purchase Date")
    private String vehiclePurchaseDate;
    @JsonProperty("City")
    private String city;


    @JsonProperty("Vehicle Type")
    public String getVehicleType() {
        return vehicleType;
    }

    @JsonProperty("Vehicle Type")
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public FIELDS withVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    @JsonProperty("Policy Type")
    public String getPolicyType() {
        return policyType;
    }

    @JsonProperty("Policy Type")
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public FIELDS withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    @JsonProperty("Reg Date")
    public String getRegDate() {
        return regDate;
    }

    @JsonProperty("Reg Date")
    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public FIELDS withRegDate(String regDate) {
        this.regDate = regDate;
        return this;
    }

    @JsonProperty("Vehicle Purchase Date")
    public String getVehiclePurchaseDate() {
        return vehiclePurchaseDate;
    }

    @JsonProperty("Vehicle Purchase Date")
    public void setVehiclePurchaseDate(String vehiclePurchaseDate) {
        this.vehiclePurchaseDate = vehiclePurchaseDate;
    }

    public FIELDS withVehiclePurchaseDate(String vehiclePurchaseDate) {
        this.vehiclePurchaseDate = vehiclePurchaseDate;
        return this;
    }

    @JsonProperty("City")
    public String getCity() {
        return city;
    }

    @JsonProperty("City")
    public void setCity(String city) {
        this.city = city;
    }

    public FIELDS withCity(String city) {
        this.city = city;
        return this;
    }

   
}
