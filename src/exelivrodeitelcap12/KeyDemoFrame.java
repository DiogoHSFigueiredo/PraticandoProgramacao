package exelivrodeitelcap12;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Diogo
 */
public class KeyDemoFrame extends JFrame implements KeyListener {
    private  String line1 = ""; //primeira linha da area de texto
    private  String line2 = ""; //segunda linha
    private  String line3 = ""; //terceira linha
    private final JTextArea textArea; //area de texto para exibir a saida

    //construtor KeyDemoFrame
    public KeyDemoFrame() {
        super("Demonstrating Keystroke Events");
        textArea = new JTextArea(10, 15); //configura JTextArea
        textArea.setText("Press any key on the keyboard...");
        textArea.setEnabled(false);
        textArea.setDisabledTextColor(Color.BLACK);
        add(textArea); //adiciona area de texto ao JFrame
        addKeyListener(this); //permite que o frame processe os eventos de teclado
    }

    //trata pressionamento de qualquer tecla
    @Override
    public void keyPressed(KeyEvent event) {
        line1 = String.format("Key pressed: %s", KeyEvent.getKeyText(event.getKeyCode())); // mostra a tecla pressionada
        setLines2and3(event);//configura a saida das linhas dois e tres
    }
    
    // trata liberacao de qualquer tecla
    @Override
    public void keyReleased(KeyEvent event){
        line1 = String.format("Key released: %s", KeyEvent.getKeyText(event.getKeyCode())); // mostra a tecla liberada
        setLines2and3(event); // configura a saida das linhas dois e tres
    }
    
    //trata pressionamento de uma tecla de acao
    @Override
    public void keyTyped(KeyEvent event){
        line1 = String.format("Key typed: %s", event.getKeyChar());
        setLines2and3(event); //configura a saida das linhas dois e tres
    }
    
    //configura segunda e terceira linhas de saida
    private void setLines2and3(KeyEvent event){
        line2 = String.format("This key is %san action key", (event.isActionKey()? "" : "not "));
        
        String temp = KeyEvent.getKeyModifiersText(event.getModifiersEx());
        
        line3 = String.format("Modifier keys pressed: %s", (temp.equals("")? "none" : temp)); //modificadores de saida
        
        textArea.setText(String.format("%s\n%s\n%s\n", line1, line2, line3)); //gera saida de tres linhas de texto
    }
}// fim da classe
