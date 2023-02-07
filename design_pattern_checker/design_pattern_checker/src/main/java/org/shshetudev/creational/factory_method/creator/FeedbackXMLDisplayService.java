package org.shshetudev.creational.factory_method.creator;

import org.shshetudev.creational.factory_method.product.FeedbackXMLParser;
import org.shshetudev.creational.factory_method.product.XMLParser;

public class FeedbackXMLDisplayService extends DisplayService{
    @Override
    protected XMLParser getParser() {
        return new FeedbackXMLParser();
    }
}
