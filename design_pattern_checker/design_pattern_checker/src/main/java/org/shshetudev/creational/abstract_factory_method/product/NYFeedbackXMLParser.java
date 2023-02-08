package org.shshetudev.creational.abstract_factory_method.product;

public class NYFeedbackXMLParser implements XMLParser{
    @Override
    public String parse() {
        System.out.println("NY Parsing feedback XML");
        return "NY Feedback XML Message";
    }
}
