package StateOfLedTv;

public class LEDTVOffState implements StateOfLedTv{
	public void doTurnOnOrOff(LEDTVContext context) {
        System.out.println("TV is turned OFF");
        context.setStateOfLedTv(new LEDTVOnState());
    }
}
