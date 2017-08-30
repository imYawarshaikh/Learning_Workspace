package com.costacloud.oicl.pojo;




import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CASENUMBER",
    "PRODUCT",
    "STAGE",
    "USER",
    "TRANSACTIONID"
})
public class BASEDETAILS {

    @JsonProperty("CASENUMBER")
    private String cASENUMBER;
    @JsonProperty("PRODUCT")
    private String pRODUCT;
    @JsonProperty("STAGE")
    private String sTAGE;
    @JsonProperty("USER")
    private String uSER;
    @JsonProperty("TRANSACTIONID")
    private String tRANSACTIONID;


    @JsonProperty("CASENUMBER")
    public String getCASENUMBER() {
        return cASENUMBER;
    }

    @JsonProperty("CASENUMBER")
    public void setCASENUMBER(String cASENUMBER) {
        this.cASENUMBER = cASENUMBER;
    }

    public BASEDETAILS withCASENUMBER(String cASENUMBER) {
        this.cASENUMBER = cASENUMBER;
        return this;
    }

    @JsonProperty("PRODUCT")
    public String getPRODUCT() {
        return pRODUCT;
    }

    @JsonProperty("PRODUCT")
    public void setPRODUCT(String pRODUCT) {
        this.pRODUCT = pRODUCT;
    }

    public BASEDETAILS withPRODUCT(String pRODUCT) {
        this.pRODUCT = pRODUCT;
        return this;
    }

    @JsonProperty("STAGE")
    public String getSTAGE() {
        return sTAGE;
    }

    @JsonProperty("STAGE")
    public void setSTAGE(String sTAGE) {
        this.sTAGE = sTAGE;
    }

    public BASEDETAILS withSTAGE(String sTAGE) {
        this.sTAGE = sTAGE;
        return this;
    }

    @JsonProperty("USER")
    public String getUSER() {
        return uSER;
    }

    @JsonProperty("USER")
    public void setUSER(String uSER) {
        this.uSER = uSER;
    }

    public BASEDETAILS withUSER(String uSER) {
        this.uSER = uSER;
        return this;
    }

    @JsonProperty("TRANSACTIONID")
    public String getTRANSACTIONID() {
        return tRANSACTIONID;
    }

    @JsonProperty("TRANSACTIONID")
    public void setTRANSACTIONID(String tRANSACTIONID) {
        this.tRANSACTIONID = tRANSACTIONID;
    }

    public BASEDETAILS withTRANSACTIONID(String tRANSACTIONID) {
        this.tRANSACTIONID = tRANSACTIONID;
        return this;
    }

   
   
  

}
