package robom;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;


public class RoboM {
    
    public static void main(String[] args) throws AWTException, UnsupportedFlavorException, IOException {
            int proxCNPJ = 190;
            int razao = 190;
            int nome = 190;
            int sobrenome = 190;
            int cpf = 190;
            int tel = 190;
            int cidade = 190;
            int campoEmail = 190;
            int campoPedido = 190;
     

            
       int campoPedido2 = 190;
            int CSA = 190;
            
        for(int i=0; i<300; i++){ 
        try {
            System.out.println(i);
            Robot m = new Robot();
            m.delay(1000);
            m.setAutoDelay(300);
            
            //INDO PARA PROX NA PLANILHA
            proxCNPJ+= 20;
            razao+=20;
            nome+=20;
            sobrenome+=20;
            cpf+=20;
            campoEmail+=20;
            tel+=20;
            cidade+=20;
            campoPedido+=20;
            campoPedido2+=20;
            CSA+=20;
            
            if(proxCNPJ>680){
                proxCNPJ=210;
                razao=210;
                nome=210;
                sobrenome=210;
                cpf=210;
                campoEmail=210;
                tel=210;
                cidade=210;
                campoPedido=210;
                campoPedido2=210;
                CSA=210;
                m.mouseWheel(8);
            }            
            
            //COMEÇAR A OPERAÇÃO
            m.mouseMove(80, proxCNPJ);
  
            Click.click(m);

            Copiar.copiando(m);

            Abrir.vivocorp(m);

            Click.pesquisarCNPJ(m);
            m.delay(7000);
            Click.click(m);

            Colar.colando(m);

            Enter.enter(m);
            
            m.delay(8000);
            //VALIDANDO CLIENTE
            m.mouseMove(180, 270);
            
            Click.click(m);
            
            Copiar.copiando(m);

            Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
            String v = (String) c.getContents(null).getTransferData(DataFlavor.stringFlavor);

        if (v.contains("-")) {
            m.mouseMove(230, 270);
            Click.click(m);
            m.delay(10000);
            m.mouseWheel(50);
            m.mouseMove(335,230); 
            Click.click(m);
            m.delay(7000);
            m.mouseMove(760,500);
            m.delay(8000);
            Click.click(m);
            m.mouseMove(760,520);
            m.delay(3000);
            Click.click(m);
            Copiar.copiando(m);
            
            Clipboard c1 = Toolkit.getDefaultToolkit().getSystemClipboard();
            String v1 = (String) c1.getContents(null).getTransferData(DataFlavor.stringFlavor);
            
            if(v1.contains("Ativo")){
                    m.mouseMove(60,450);
                    Click.click(m);
                    m.delay(10000);
                    //COPIAR RAZAO SOCIAL
                    m.mouseWheel(-50);
                    Copiar.copiarRazao(m);
                    Abrir.excel(m);
                    m.mouseMove(160, razao);
                    Click.click(m);
                    Colar.colando(m);
                    // COPIAR ESTADO 
                    Abrir.vivocorp(m);
                    Copiar.copiarEstado(m);
                    Abrir.excel(m);
                    m.mouseMove(290, sobrenome);
                    Click.click(m);
                    Colar.colando(m);
                    // COPIAR CIDADE
                    Abrir.vivocorp(m);
                    Copiar.copiarCidade(m);
                    Abrir.excel(m);
                    m.mouseMove(550, cidade);
                    Click.click(m);
                    Colar.colando(m);
                    //CODIGO DO CSA
                    Abrir.vivocorp(m);
                    Copiar.copiarCSA(m);
                    Abrir.excel(m);
                    m.mouseMove(220, nome);
                    Click.click(m);
                    Colar.colando(m);
                    //INFOS GESTOR                   
                    Abrir.vivocorp(m);
                    m.mouseMove(140, 500);
                    m.delay(1500);
                    m.mouseWheel(50);
                    //COPIAR NOME GESTOR
                    Copiar.copiarNome(m);
                    Abrir.excel(m);
                    m.mouseMove(220, nome);
                    Click.click(m);
                    Colar.colando(m);
                    //COPIAR SOBRENOME
                    Abrir.vivocorp(m);
                    Copiar.copiarSobrenome(m);
                    Abrir.excel(m);
                    m.mouseMove(290, sobrenome);
                    Click.click(m);
                    Colar.colando(m);
                    //COPIAR CPF
                    Abrir.vivocorp(m);
                    Copiar.copiarCPF(m);
                    Abrir.excel(m);
                    m.mouseMove(355, cpf);
                    Click.click(m);
                    Colar.colando(m);
                    //COPIAR EMAIL
                    Abrir.vivocorp(m);
                    Copiar.copiarEmail(m);
                    Abrir.excel(m);
                    m.mouseMove(420, campoEmail);
                    Click.click(m);
                    Colar.colando(m);
                    //COPIAR TELEFONE
                    Abrir.vivocorp(m);
                    Copiar.copiarTel(m);
                    Abrir.excel(m);
                    m.mouseMove(490,tel);
                    Click.click(m);
                    Colar.colando(m);
                    //COPIAR DATA DO ULTIMO PEDIDO
                    Abrir.vivocorp(m);
                    m.mouseMove(140, 500);
                    m.delay(3500);
                    m.mouseWheel(50);
                    m.mouseMove(970, 230);
                    Click.click(m);
                    m.delay(10000);
                    m.mouseMove(760, 500);
                    Click.click(m);
                    m.delay(1500);
                    Click.click(m);
                    m.delay(4000);
                    m.mouseMove(760, 520);
                    Click.click(m);
                    Copiar.copiando(m);
                    Abrir.excel(m);
                    m.mouseMove(610, campoPedido);
                    Click.click(m);
                    Colar.colando(m);
                    Abrir.vivocorp(m);
                    m.keyPress(KeyEvent.VK_TAB);
                    m.keyRelease(KeyEvent.VK_TAB);
                    //VALIDANDO SEGUNDO PEDIDO
                    m.delay(3000);
                    Color corDoPedido, validandoPedido;
                    corDoPedido = m.getPixelColor(720, 540);
                    validandoPedido = m.getPixelColor(720, 540);
                    
                    // CONVERTENDO COR EM STRING
                    String corCerta = corDoPedido.toString();
                    corCerta = "java.awt.Color[r=255,g=254,b=192]";
                    String corValidar = validandoPedido.toString();
                    
                    if(corValidar.equals(corCerta)){
                    
                        m.mouseMove(720, 540);
                        Click.click(m);
                        Copiar.copiando(m);
                        Abrir.excel(m);
                        m.mouseMove(670, campoPedido2);
                        Click.click(m);
                        Colar.colando(m);
                        
                    }else{
                        Abrir.excel(m);
                        continue;
                    }    
                    //PROX CNPJ
                    continue;
                }else{
                    Abrir.excel(m);
                    continue;
                }
            } else {
                Abrir.excel(m);
                continue;
            }
            //
        } catch (AWTException e) {
                
            }
        }
    }
}
