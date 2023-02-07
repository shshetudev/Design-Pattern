package org.shshetudev.creational.factory_method.creator;

import org.shshetudev.creational.factory_method.product.XMLParser;

// Creator
public abstract class DisplayService {
    public void display() {
        XMLParser parser = getParser();
        String msg = parser.parse();
        System.out.println(msg);
    }

    protected abstract XMLParser getParser();
}
