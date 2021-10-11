package robom;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author Administrador
 */
public class Copiar {
    
    public static void copiando (Robot m){
        m.keyPress(KeyEvent.VK_CONTROL);
        m.keyPress(KeyEvent.VK_C);
        m.keyRelease(KeyEvent.VK_C);
        m.keyRelease(KeyEvent.VK_CONTROL);
    }
    public static void copiarRazao(Robot m){
            m.mouseMove(125, 285);
            m.mousePress(InputEvent.BUTTON1_MASK);
            m.mouseMove(125, 330);
            m.mouseRelease(InputEvent.BUTTON1_MASK);
            Copiar.copiando(m);
    }
    public static void copiarCidade(Robot m){
        m.mouseMove(1020, 375);
        m.mousePress(InputEvent.BUTTON1_MASK);
        m.mouseMove(1020, 420);
        m.mouseRelease(InputEvent.BUTTON1_MASK);
        Copiar.copiando(m);
    }
    public static void copiarNome(Robot m){
        m.mouseMove(130, 295);
        Click.click(m);
        Copiar.copiando(m);
    }
    public static void copiarSobrenome(Robot m){
        m.mouseMove(400, 295);
        Click.click(m);
        Copiar.copiando(m);
        
    }
    public static void copiarCPF(Robot m){
        m.mouseMove(620, 295);
        Click.click(m);
        Copiar.copiando(m);
    }
    public static void copiarEmail(Robot m){
        m.mouseMove(1185, 295);
        Click.click(m);
        Copiar.copiando(m);
    }
    public static void copiarTel(Robot m){
        m.mouseMove(1280, 295);
        Click.click(m);
        Copiar.copiando(m);
    }

    static void copiarCSA(Robot m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void copiarEstado(Robot m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
