package com.mastercard.api.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrearizzini on 04/07/2017.
 */


@JacksonXmlRootElement(localName = "Error")

/**
 {
 "status" : "failure",
 "errors" : [ {
 "errorCode" : "PAN_INELIGIBLE" ,
 "errorDesc" : "Account Number is not eligible for Installments."
 }]
 }
 */

public class Error {
    private String status;
    private List<ErrorDetail> errors;

    public Error() {
    }

    public Error(String status, String code, String description) {
        this.status = status;
        errors = new ArrayList<>();
        errors.add(new ErrorDetail(code, description));
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ErrorDetail> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorDetail> errors) {
        this.errors = errors;
    }
}


