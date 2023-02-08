package org.shshetudev.creational.abstract_factory_method.abstract_factory;

import org.shshetudev.creational.abstract_factory_method.product.XMLParser;

public interface AbstractParserFactory {
    public XMLParser getParserInstance(String parserType);
}
