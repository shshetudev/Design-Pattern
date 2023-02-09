package org.shshetudev.behavioral.chain_of_responsibility.handler;

import org.shshetudev.behavioral.chain_of_responsibility.client.File;

public class ExcelFileHandler implements Handler{
    private Handler handler;

    public ExcelFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    private String handlerName;
    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {
    if(file.getFileType().equals("excel")) {
        System.out.println("Process and saving excel file... by " + handlerName);
    } else if(handler != null) {
        System.out.println(handlerName + " forward request to " + handler.getHandlerName());
    } else {
        System.out.println("File not supported");
    }
    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
