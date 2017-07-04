package com.mastercard.api.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by andrearizzini on 04/07/2017.
 */


@JacksonXmlRootElement(localName = "error_detail")

/**
 {
 "status" : "failure",
 "errors" : [ {
 "code" : "PAN_INELIGIBLE" ,
 "desc" : "Account Number is not eligible for Installments."
 }]
 }
 */

public class ErrorDetail {
    private String code;
    private String desc;

    public ErrorDetail() {
    }

    public ErrorDetail(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}


