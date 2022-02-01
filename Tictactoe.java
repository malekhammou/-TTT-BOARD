package tictactoe;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.text.html.ImageView;
import javax.swing.Icon;
import javax.swing.text.Element;

/**
 *
 * @author Malek Hammou
 */
public class Tictactoe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          /*NEW FRAME*/
        JFrame mainFrame=new JFrame();
        mainFrame.setTitle("TIC TAC TOE BOARD");
        mainFrame.setSize(500,600);
        mainFrame.setLayout(new BorderLayout());
        JPanel digitsPanel=new JPanel();
        digitsPanel.setLayout(new GridLayout(3, 3));
        for (int i = 1; i < 10; i++) {
            JLabel label=new JLabel("");
            label.setHorizontalAlignment(SwingConstants.CENTER);
            Border blackline = BorderFactory.createLineBorder(Color.black);
            label.setFont(new Font("Serif", Font.BOLD, 55));
           label.setForeground(Color.black);

            label.setBorder(blackline);
            digitsPanel.add(label);
            label.addMouseListener(new MouseAdapter() {

        @Override

        public void mouseClicked(MouseEvent e) {
         long test = Math.round( Math.random());
         if(test==0){
    label.setIcon(new ImageIcon(getClass().getResource("o.png")));
         }
         
         else{
    label.setIcon(new ImageIcon(getClass().getResource("x.png")));


         }
         
   

   }

    });
     
        mainFrame.add(digitsPanel,BorderLayout.CENTER);
        mainFrame.setVisible(true);
    }
    
}}
