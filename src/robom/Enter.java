package robom;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Enter {
    public static void enter(Robot m){
        m.keyPress(KeyEvent.VK_ENTER);
        m.keyRelease(KeyEvent.VK_ENTER);
    }
}
