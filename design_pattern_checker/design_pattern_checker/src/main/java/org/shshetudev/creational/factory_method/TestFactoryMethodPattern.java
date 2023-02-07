package org.shshetudev.creational.factory_method;

import org.shshetudev.creational.factory_method.creator.*;

public class TestFactoryMethodPattern {
    public static void main(String[] args) {
        DisplayService service = new FeedbackXMLDisplayService();
        service.display();

        service = new ErrorXMLDisplayService();
        service.display();

        service = new OrderXMLDisplayService();
        service.display();

        service = new ResponseXMLDisplayService();
        service.display();
    }
}
