package org.shshetudev.creational.abstract_factory_method;

import org.shshetudev.creational.abstract_factory_method.abstract_factory.AbstractParserFactory;
import org.shshetudev.creational.abstract_factory_method.client.ParserFactoryProducer;
import org.shshetudev.creational.abstract_factory_method.product.XMLParser;

public class TestAbstractFactoryPattern {
    public static void main(String[] args) {
        AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("NYFactory");
        XMLParser parser = parserFactory.getParserInstance("NYORDER");
        String msg = "";
        msg = parser.parse();
        System.out.println(msg);

        System.out.println("**************************************************");

        parserFactory = ParserFactoryProducer.getFactory("TWFactory");
        parser = parserFactory.getParserInstance("TWFEEDBACK");
        msg = parser.parse();
        System.out.println(msg);
    }
}
