
package com.costacloud.oicl.pojo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DOCNAME",
    "DOCTYPE",
    "IMAGINGEXPORTFILENAME",
    "NONIMAGEDOCATTACHED",
    "FIELDS"
})
public class DOCUMENT {

    @JsonProperty("DOCNAME")
    private String dOCNAME;
    @JsonProperty("DOCTYPE")
    private String dOCTYPE;
    @JsonProperty("IMAGINGEXPORTFILENAME")
    private String iMAGINGEXPORTFILENAME;
    @JsonProperty("NONIMAGEDOCATTACHED")
    private List<String> nONIMAGEDOCATTACHED = new ArrayList<String>();
    @JsonProperty("FIELDS")
    private FIELDS fIELDS;
  

    @JsonProperty("DOCNAME")
    public String getDOCNAME() {
        return dOCNAME;
    }

    @JsonProperty("DOCNAME")
    public void setDOCNAME(String dOCNAME) {
        this.dOCNAME = dOCNAME;
    }

    public DOCUMENT withDOCNAME(String dOCNAME) {
        this.dOCNAME = dOCNAME;
        return this;
    }

    @JsonProperty("DOCTYPE")
    public String getDOCTYPE() {
        return dOCTYPE;
    }

    @JsonProperty("DOCTYPE")
    public void setDOCTYPE(String dOCTYPE) {
        this.dOCTYPE = dOCTYPE;
    }

    public DOCUMENT withDOCTYPE(String dOCTYPE) {
        this.dOCTYPE = dOCTYPE;
        return this;
    }

    @JsonProperty("IMAGINGEXPORTFILENAME")
    public String getIMAGINGEXPORTFILENAME() {
        return iMAGINGEXPORTFILENAME;
    }

    @JsonProperty("IMAGINGEXPORTFILENAME")
    public void setIMAGINGEXPORTFILENAME(String iMAGINGEXPORTFILENAME) {
        this.iMAGINGEXPORTFILENAME = iMAGINGEXPORTFILENAME;
    }

    public DOCUMENT withIMAGINGEXPORTFILENAME(String iMAGINGEXPORTFILENAME) {
        this.iMAGINGEXPORTFILENAME = iMAGINGEXPORTFILENAME;
        return this;
    }

    @JsonProperty("NONIMAGEDOCATTACHED")
    public List<String> getNONIMAGEDOCATTACHED() {
        return nONIMAGEDOCATTACHED;
    }

    @JsonProperty("NONIMAGEDOCATTACHED")
    public void setNONIMAGEDOCATTACHED(List<String> nONIMAGEDOCATTACHED) {
        this.nONIMAGEDOCATTACHED = nONIMAGEDOCATTACHED;
    }

    public DOCUMENT withNONIMAGEDOCATTACHED(List<String> nONIMAGEDOCATTACHED) {
        this.nONIMAGEDOCATTACHED = nONIMAGEDOCATTACHED;
        return this;
    }

    @JsonProperty("FIELDS")
    public FIELDS getFIELDS() {
        return fIELDS;
    }

    @JsonProperty("FIELDS")
    public void setFIELDS(FIELDS fIELDS) {
        this.fIELDS = fIELDS;
    }

    public DOCUMENT withFIELDS(FIELDS fIELDS) {
        this.fIELDS = fIELDS;
        return this;
    }

   

  


}
