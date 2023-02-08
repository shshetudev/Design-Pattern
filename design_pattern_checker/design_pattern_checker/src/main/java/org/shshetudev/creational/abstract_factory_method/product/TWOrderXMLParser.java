package org.shshetudev.creational.abstract_factory_method.product;

public class TWOrderXMLParser implements XMLParser{
    @Override
    public String parse() {
        System.out.println("TW parsing order XML...");
        return "TW Order XML Message";
    }
}
