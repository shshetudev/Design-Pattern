package org.shshetudev.creational.factory_method.creator;

import org.shshetudev.creational.factory_method.product.OrderXMLParser;
import org.shshetudev.creational.factory_method.product.XMLParser;

public class OrderXMLDisplayService extends DisplayService{
    @Override
    protected XMLParser getParser() {
        return new OrderXMLParser();
    }
}
