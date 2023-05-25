package Tema4;

public class SmartWatch extends SmartDevice{

    private String sensorBpm;
    private String sensorO2;

    private int bpm;
    private double o2Level;

    public SmartWatch(boolean state,
                      String brand,
                      String cpuModel,
                      String batteryModel,
                      int batteryCapacity,
                      int ramCapacity,
                      int storageCapacity,
                      String sensorBpm,
                      String sensorO2 ) {
        super(state, brand, cpuModel, batteryModel, batteryCapacity, ramCapacity, storageCapacity);
        this.sensorBpm = sensorBpm;
        this.sensorO2  = sensorO2;
    }

    public SmartWatch() {
        this.sensorBpm = "Sensor BPM X-2000";
        this.sensorO2  = "Sensor OxyFlash 2T-Max";
    }

    public void setBpm( int bpm ){
        this.bpm = bpm;
    }

    public void setO2Level ( double o2level ){
        this.o2Level = o2level;
    }

    public int getBpm() {
        return bpm;
    }

    public double getO2Level() {
        return o2Level;
    }

    public String getSensorBpm() {
        return sensorBpm;
    }

    public void setSensorBpm(String sensorBpm) {
        this.sensorBpm = sensorBpm;
    }

    public String getSensorO2() {
        return sensorO2;
    }

    public void setSensorO2(String sensorO2) {
        this.sensorO2 = sensorO2;
    }

    @Override
    public String toString() {
        return super.toString() +
                "SmartWatch{" +
                "sensorBpm='" + sensorBpm + '\'' +
                ", sensorO2='" + sensorO2 + '\'' +
                ", bpm=" + bpm +
                ", o2Level=" + o2Level +
                "} ";
    }
}
