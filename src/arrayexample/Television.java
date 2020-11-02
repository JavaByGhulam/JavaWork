package arrayexample;

public class Television {

  int channel = 0;
  boolean on = false;

  void setChannel(int channelValue) {
    this.channel = channelValue;
  }

  int getChannel() {
    return this.channel;
  }

  void setOn(boolean on) {
    this.on = on;
  }

  boolean isOn() {
    return this.on;
  }

  public static void main(String[] args) {
    Television tv1 = new Television();
    Television tv2 = new Television();
    tv1.setChannel(2);
    tv2.setChannel(7);
    System.out.println("Television channel for tv1: " + tv1.getChannel());
    System.out.println("Television channel for tv2: " + tv2.getChannel());
  }
}
