package org.shshetudev.creational.factory_method.product;

public class ResponseXMLParser implements XMLParser{
    @Override
    public String parse() {
        System.out.println("Parsing response XML");
        return "Response XML Message";
    }
}
