package org.shshetudev.behavioral.chain_of_responsibility.handler;

import org.shshetudev.behavioral.chain_of_responsibility.client.File;

public interface Handler {
    void setHandler(Handler handler);
    void process(File file);

    String getHandlerName();
}
