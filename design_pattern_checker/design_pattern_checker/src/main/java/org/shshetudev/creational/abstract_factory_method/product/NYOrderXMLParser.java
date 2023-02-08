package org.shshetudev.creational.abstract_factory_method.product;

public class NYOrderXMLParser implements XMLParser{
    @Override
    public String parse() {
        System.out.println("NY Parsing order XML");
        return "NY Order XML message";
    }
}
