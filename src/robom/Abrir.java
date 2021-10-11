package robom;

import java.awt.Robot;

public class Abrir {
    public static void vivocorp(Robot m) {
        m.mouseMove(140, 750);
        Click.click(m);
    }
    public static void excel(Robot m) {
        m.mouseMove(200, 750);
        Click.click(m);
    }
}
