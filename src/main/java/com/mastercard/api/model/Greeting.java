package com.mastercard.api.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by andrearizzini on 03/07/2017.
 */

//arizzini: otherwise the top most element contains <Greeting>
@JacksonXmlRootElement(localName = "greeting")
public class Greeting {

    private String message;

    public Greeting() {

    }

    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}