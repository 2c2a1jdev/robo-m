
package robom;

import java.awt.Robot;
import java.awt.event.InputEvent;

public class Click {
    
    public static void click (Robot m){
        m.mousePress(InputEvent.BUTTON1_MASK);
        m.mouseRelease(InputEvent.BUTTON1_MASK);
    }
    
    public static void doubleClick (Robot m){
        m.mousePress(InputEvent.BUTTON1_MASK);
        m.mousePress(InputEvent.BUTTON1_MASK);
        m.mousePress(InputEvent.BUTTON1_MASK);
        m.mouseRelease(InputEvent.BUTTON1_MASK);

    }
    public static void pesquisarCNPJ(Robot m){
        m.mouseMove(720, 180);
        Click.click(m);
        m.mouseMove(860, 344);
    }
}
