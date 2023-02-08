package org.shshetudev.creational.abstract_factory_method.product;

public class TWErrorXMLParser implements XMLParser{
    @Override
    public String parse() {
        System.out.println("TW parsing error XML...");
        return "TW Error XML Message";
    }
}
