package org.shshetudev.creational.abstract_factory_method.abstract_factory;

import org.shshetudev.creational.abstract_factory_method.product.*;

public class NYParserFactory implements AbstractParserFactory{
    @Override
    public XMLParser getParserInstance(String parserType) {
        return switch (parserType) {
            case "NYERROR" -> new NYErrorXMLParser();
            case "NYFEEDBACK" -> new NYFeedbackXMLParser();
            case "NYORDER" -> new NYOrderXMLParser();
            case "NYRESPONSE" -> new NYResponseXMLParser();
            default -> null;
        };

    }
}
