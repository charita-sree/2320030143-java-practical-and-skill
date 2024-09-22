package StateOfLedTv;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LEDTVContextTest {

    @Test
    public void testInitialState() {
        LEDTVContext context = new LEDTVContext();
        assertTrue(context.getStateOfLedTv() instanceof LEDTVOffState);
    }

    @Test
    public void testTurnOnFromOffState() {
        LEDTVContext context = new LEDTVContext();
        context.doTurnOnOrOff(); 

        assertTrue(context.getStateOfLedTv() instanceof LEDTVOnState);
    }

    @Test
    public void testTurnOffFromOnState() {
        LEDTVContext context = new LEDTVContext();
        context.doTurnOnOrOff(); 
        context.doTurnOnOrOff(); 

        assertTrue(context.getStateOfLedTv() instanceof LEDTVOffState);
    }

    @Test
    public void testStateTransitions() {
        LEDTVContext context = new LEDTVContext();

        
        assertTrue(context.getStateOfLedTv() instanceof LEDTVOffState);

        
        context.doTurnOnOrOff();
        assertTrue(context.getStateOfLedTv() instanceof LEDTVOnState);

        
        context.doTurnOnOrOff();
        assertTrue(context.getStateOfLedTv() instanceof LEDTVOffState);

        
        context.doTurnOnOrOff();
        assertTrue(context.getStateOfLedTv() instanceof LEDTVOnState);
    }
}
