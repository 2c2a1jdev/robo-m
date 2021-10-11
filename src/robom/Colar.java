package robom;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Colar {
    
    public static void colando (Robot m) {
        m.keyPress(KeyEvent.VK_CONTROL);
        m.keyPress(KeyEvent.VK_V);
        m.keyRelease(KeyEvent.VK_V);
        m.keyRelease(KeyEvent.VK_CONTROL);
    }
}
