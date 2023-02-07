package org.shshetudev.creational.factory_method.creator;

import org.shshetudev.creational.factory_method.product.ErrorXMLParser;
import org.shshetudev.creational.factory_method.product.XMLParser;

public class ErrorXMLDisplayService extends DisplayService{
    @Override
    protected XMLParser getParser() {
        return new ErrorXMLParser();
    }
}
