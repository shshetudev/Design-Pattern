package org.shshetudev.creational.abstract_factory_method.product;

public class TWResponseXMLParser implements XMLParser{
    @Override
    public String parse() {
        System.out.println("TW parsing response XML...");
        return "TW Response XML Message";
    }
}
