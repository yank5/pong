import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.virtual.DefaultVirtualTerminal;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import static com.googlecode.lanterna.TextColor.ANSI.*;

public class Pong {
    private static int xPosBall;
    private static int yPosBall;
    private static int yPos; //paddle yPos ///xPos is disabled
    private static int LxPad; //paddle xpos
    private static int RxPad;

    public static void draw2Screen() {
        try {
        System.out.println(1);
        Terminal terminal=new DefaultTerminalFactory().createTerminal();

            terminal.enterPrivateMode(); //hide it all

        TextGraphics graphics=terminal.newTextGraphics();
        graphics.setBackgroundColor(BLACK);
        graphics.setForegroundColor(WHITE);

        graphics.fill(' ');
        terminal.setCursorVisible(false);


        //start game
            
        yPos=0;
        while(true){
            if(terminal.readInput().getKeyType()==KeyType.ArrowUp){
                yPos-=1;
//                System.out.println(yPos);
                graphics.setCharacter(5,yPos,'O');
                graphics.setCharacter(5,yPos+1,' ');
            }
            if(terminal.readInput().getKeyType()==KeyType.ArrowDown){
                yPos+=1;
//                System.out.println(yPos);
                graphics.setCharacter(5,yPos,'O');
                graphics.setCharacter(5,yPos-1,' ');
            }
//            Thread.sleep(10);
        }


        } catch (IOException  e) {
            throw new RuntimeException(e);
        }

//        System.console();
    }
}