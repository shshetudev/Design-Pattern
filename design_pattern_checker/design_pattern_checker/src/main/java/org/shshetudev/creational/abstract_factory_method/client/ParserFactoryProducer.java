package org.shshetudev.creational.abstract_factory_method.client;

import org.shshetudev.creational.abstract_factory_method.abstract_factory.AbstractParserFactory;
import org.shshetudev.creational.abstract_factory_method.abstract_factory.NYParserFactory;
import org.shshetudev.creational.abstract_factory_method.abstract_factory.TWParserFactory;

public class ParserFactoryProducer {
    private ParserFactoryProducer() {
        throw new AssertionError();
    }

    public static AbstractParserFactory getFactory(String factoryType) {
        return switch (factoryType) {
            case "NYFactory" -> new NYParserFactory();
            case "TWFactory" -> new TWParserFactory();
            default -> null;
        };
    }
}
