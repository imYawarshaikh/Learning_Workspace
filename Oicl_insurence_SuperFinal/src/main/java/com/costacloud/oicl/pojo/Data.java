package com.costacloud.oicl.pojo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BASEDETAILS",
    "DOCUMENTS"
})
public class Data {

    @JsonProperty("BASEDETAILS")
    private BASEDETAILS bASEDETAILS;
    @JsonProperty("DOCUMENTS")
    private List<DOCUMENT> dOCUMENTS = new ArrayList<DOCUMENT>();
 
    @JsonProperty("BASEDETAILS")
    public BASEDETAILS getBASEDETAILS() {
        return bASEDETAILS;
    }

    @JsonProperty("BASEDETAILS")
    public void setBASEDETAILS(BASEDETAILS bASEDETAILS) {
        this.bASEDETAILS = bASEDETAILS;
    }

    public Data withBASEDETAILS(BASEDETAILS bASEDETAILS) {
        this.bASEDETAILS = bASEDETAILS;
        return this;
    }

    @JsonProperty("DOCUMENTS")
    public List<DOCUMENT> getDOCUMENTS() {
        return dOCUMENTS;
    }

    @JsonProperty("DOCUMENTS")
    public void setDOCUMENTS(List<DOCUMENT> dOCUMENTS) {
        this.dOCUMENTS = dOCUMENTS;
    }

    public Data withDOCUMENTS(List<DOCUMENT> dOCUMENTS) {
        this.dOCUMENTS = dOCUMENTS;
        return this;
    }


  

  


}
