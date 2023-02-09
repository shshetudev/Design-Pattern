package org.shshetudev.behavioral.chain_of_responsibility.handler;

import org.shshetudev.behavioral.chain_of_responsibility.client.File;

public class VideoFileHandler implements Handler{
    private Handler handler;
    private String handlerName;

    public VideoFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handlerName = handlerName;
    }

    @Override
    public void process(File file) {
        if(file.getFileType().equals("video")){
            System.out.println("Process and saving video file... by "+
                    handlerName);
        }else if(handler!=null){
            System.out.println(handlerName+" fowards request to "+handler.
                    getHandlerName());
            handler.process(file);
        }else{
            System.out.println("File not supported");
        }
    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
