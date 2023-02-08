package org.shshetudev.creational.abstract_factory_method.product;

public class TWFeedbackXMLParser implements XMLParser{
    @Override
    public String parse() {
        System.out.println("TW Parsing feedback XML...");
        return "TW Error XML Message";
    }
}
