package StateOfLedTv;

public class LEDTVOnState implements StateOfLedTv{
	public void doTurnOnOrOff(LEDTVContext context) {
        System.out.println("TV is turned ON");
        context.setStateOfLedTv(new LEDTVOffState());
    }
}
