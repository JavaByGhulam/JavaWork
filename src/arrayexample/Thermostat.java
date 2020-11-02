package arrayexample;

class Thermostat {

  int temperatureTrigger;

  int getTemperatureTrigger() {
    return temperatureTrigger;
  }

  public void setTemperatureTrigger(int temperatureTrigger) {
    this.temperatureTrigger = temperatureTrigger;
  }

  public static void main(String[] args) {
    Thermostat houseThermostat = new Thermostat();
    houseThermostat.setTemperatureTrigger(68);
    System.out.println(houseThermostat.getTemperatureTrigger());
  }
}
