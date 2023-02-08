package org.shshetudev.creational.abstract_factory_method.abstract_factory;

import org.shshetudev.creational.abstract_factory_method.product.*;

public class TWParserFactory implements AbstractParserFactory{
    @Override
    public XMLParser getParserInstance(String parserType) {
        return switch (parserType) {
            case "TWERROR" -> new TWErrorXMLParser();
            case "TWFEEDBACK" -> new TWFeedbackXMLParser();
            case "TWORDER" -> new TWOrderXMLParser();
            case "TWRESPONSE" -> new TWResponseXMLParser();
            default -> null;
        };

    }
}
