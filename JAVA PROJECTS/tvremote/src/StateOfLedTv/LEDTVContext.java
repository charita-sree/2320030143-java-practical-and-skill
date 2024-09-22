package StateOfLedTv;

public class LEDTVContext {
	private StateOfLedTv stateOfLedTv;

    public LEDTVContext() {
        stateOfLedTv = new LEDTVOffState(); 
    }

    public StateOfLedTv getStateOfLedTv() {
        return stateOfLedTv;
    }

    public void setStateOfLedTv(StateOfLedTv stateOfLedTv) {
        this.stateOfLedTv = stateOfLedTv;
    }

    public void doTurnOnOrOff() {
        stateOfLedTv.doTurnOnOrOff(this);
    }
}
