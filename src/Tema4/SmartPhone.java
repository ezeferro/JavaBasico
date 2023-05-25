package Tema4;

import java.security.spec.RSAOtherPrimeInfo;

public class SmartPhone extends SmartDevice{

    private static final double INI_LEV_SIGNAL = 50.0;
    private static final double MIN_SIGNAL = 30.0;
    private String provider;
    private String telephoneNum;
    private double levelSignal;

    public SmartPhone( boolean  state,
                       String   brand,
                       String   cpuModel,
                       String   batteryModel,
                       int      batteryCapacity,
                       int      ramCapacity,
                       int      storageCapacity,
                       String   provider,
                       String   telephoneNum ) {

        super(state, brand, cpuModel, batteryModel, batteryCapacity, ramCapacity, storageCapacity);
        this.provider     = provider;
        this.telephoneNum = telephoneNum;
        this.levelSignal  = INI_LEV_SIGNAL;
    }

    public SmartPhone() {
        super();
        this.provider     = "Claro";
        this.telephoneNum = "9999999999";
        this.levelSignal  = INI_LEV_SIGNAL;
    }

    public void sendTxtMsg( String text, String telNum ){
        if( this.canUseNetwork() ){
            System.out.println("Message:" );
            System.out.println(text);
            System.out.println("Sent to:" + telNum );
        }else {
            System.out.println("No service");
        }
    }

    public void callNumber( String telNum ){
        if( this.canUseNetwork() ){
            System.out.println( "Calling number: "+ telNum );
        }else{
            System.out.println("No service");
        }
    }

    private boolean canUseNetwork(){
        return ( this.getLevelSignal() >= MIN_SIGNAL );
    }

    private double getLevelSignal(){
        return this.levelSignal;
    }

    @Override
    public String toString() {
        return super.toString() +
                "SmartPhone{" +
                "provider='" + provider + '\'' +
                ", telephoneNum='" + telephoneNum + '\'' +
                ", levelSignal=" + levelSignal +
                '}';
    }
}
