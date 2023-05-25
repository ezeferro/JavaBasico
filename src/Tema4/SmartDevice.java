package Tema4;

public class SmartDevice {

    private boolean onOffState; // true->ON;false->OFF
    private String brand;
    private String cpuModel;
    private String batteryModel;
    private int batteryCapacity; //in mAh
    private int ramCapacity; //in GB
    private int storageCapacity; //in GB

    public SmartDevice( boolean onOffState,
                        String  brand,
                        String  cpuModel,
                        String  batteryModel,
                        int     batteryCapacity,
                        int     ramCapacity,
                        int     storageCapacity) {

        this.onOffState = onOffState;
        this.brand              = brand;
        this.cpuModel           = cpuModel;
        this.batteryModel       = batteryModel;
        this.batteryCapacity    = batteryCapacity;
        this.ramCapacity        = ramCapacity;
        this.storageCapacity    = storageCapacity;

    }

    //default
    public SmartDevice(){
        this.onOffState = false;
        this.brand           = "Motorola";
        this.cpuModel        = "SnapDragon 840";
        this.batteryModel    = "Samsung A100";
        this.batteryCapacity = 4200;
        this.ramCapacity     = 8;
        this.storageCapacity = 128;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public String getBatteryModel() {
        return batteryModel;
    }

    public void setBatteryModel(String batteryModel) {
        this.batteryModel = batteryModel;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void turnON(){
        this.setOnOffState("ON");
    }

    public void turnOff(){
        this.setOnOffState("OFF");
    }

    public boolean isOn(){
        return this.onOffState;
    }
    private void setOnOffState(String onOffState){
        switch (onOffState){
            case "ON":
                this.onOffState = true;
                break;
            case "OFF":
                this.onOffState = false;
                break;
        }
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "OnOffstate=" + onOffState +
                ", brand='" + brand + '\'' +
                ", cpuModel='" + cpuModel + '\'' +
                ", batteryModel='" + batteryModel + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", ramCapacity=" + ramCapacity +
                ", storageCapacity=" + storageCapacity +
                '}';
    }
}
