package org.shshetudev.creational.factory_method.creator;

import org.shshetudev.creational.factory_method.product.ResponseXMLParser;
import org.shshetudev.creational.factory_method.product.XMLParser;

public class ResponseXMLDisplayService extends DisplayService{
    @Override
    protected XMLParser getParser() {
        return new ResponseXMLParser();
    }
}
