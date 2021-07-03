public abstract class EntertainmentDevice {
  public int deviceState; // current channel or current chapter
  public int maxSetting; // maximum channel or maximum chapter
  public int volumeLevel = 0;
  public abstract void buttonFivePressed();
  public abstract void buttonSixPressed();

  public void deviceFeedback(){
    if(deviceState > maxSetting || deviceState < 0) {
      deviceState = 0;
      System.out.println("On " + deviceState);
    }
  }
  public void buttonSevenPressed(){
    volumeLevel++;
    System.out.println("Volume at: " + volumeLevel);
  }
  public void buttonEightPressed(){
    volumeLevel--;
    System.out.println("Volume at: " + volumeLevel);
  }
}
