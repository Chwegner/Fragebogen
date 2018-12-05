package fragebogen;

import com.sun.org.apache.bcel.internal.classfile.Utility;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Chef
 */
public class Fragebogen
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Variablen //
        JLabel header, frage1, frage2, frage3, frage4, frage5, frage6, frage7,
                frage8, frage9, frage10;
        JCheckBox box1, box2, box3, box4, box5, box6, box7, box8, box9, box10;
        JButton submit;
        JTextArea tArea;

        /*---------------- Grundgerüst ---------------------------------------*/
        // Erstellung JFrame //
        JFrame frame = new JFrame("Fragebogen");
        frame.setSize(800, 800);

        // Frame Layout //
        Container c = frame.getContentPane();
        c.setLayout(null);

        // Fonts //
        /*--------- Erstellung Panels ----------------------------------------*/
        // Panel Header //
        JPanel panel1 = new JPanel();
        panel1.setBounds(100, 100, 600, 50);
        panel1.setLayout(new GridBagLayout());

        // Panel Fragen //
        JPanel panel2 = new JPanel();
        panel2.setBounds(160, 200, 540, 450);
        panel2.setLayout(new GridLayout(0, 1));

        // Panel Checkboxen //        
        JPanel panel3 = new JPanel();
        panel3.setBounds(100, 200, 50, 450);
        panel3.setLayout(new GridLayout(0, 1));

        // Panel Button //
        JPanel panel4 = new JPanel();
        panel4.setBounds(100, 650, 600, 50);
        panel4.setLayout(new GridBagLayout());
        panel4.setVisible(true);

        // Panel Ende //
        JPanel panel5 = new JPanel();
        panel5.setBounds(100, 650, 600, 50);
        panel5.setLayout(new GridBagLayout());
        panel5.setVisible(false);

        /*----Erstellung Komponenten------------------------------------------*/
        // Komponenten Panel Header //
        header = new JLabel();
        header.setText("Header");

        // Komponenten Panel Fragen //
        frage1 = new JLabel("Mögen Sie mich?");
        frage2 = new JLabel("Mögen Sie Putin?");
        frage3 = new JLabel("Mögen Sie Bin Salman?");
        frage4 = new JLabel("Mögen Sie Obama?");
        frage5 = new JLabel("Sind Ihnen demokratische Werte wichtig?");
        frage6 = new JLabel("Wollen Sie die Mauer zu Mexiko?");
        frage7 = new JLabel("Sehen Sie Kim Jong Un als sozialkompetenten Menschen?");
        frage8 = new JLabel("Mögen Sie den Song Rocket Man?");
        frage9 = new JLabel("Glauben Sie an Gerechtigkeit im US-Wahlkampf?");
        frage10 = new JLabel("Denken Sie, dass ich als US-Präsident geeignet bin?");

        // Komponenten Panel Checkboxen //
        box1 = new JCheckBox();
        box2 = new JCheckBox();
        box3 = new JCheckBox();
        box4 = new JCheckBox();
        box5 = new JCheckBox();
        box6 = new JCheckBox();
        box7 = new JCheckBox();
        box8 = new JCheckBox();
        box9 = new JCheckBox();
        box10 = new JCheckBox();

        // Komponenten Panel Button //
        submit = new JButton("Abschicken");

        // Komponenten Panel Ende //
        tArea = new JTextArea(5, 20);


        /*--------- Platzierung Komponenten auf Panels -----------------------*/
        // Platzieren Komponenten Header //
        panel1.add(header);

        // Platzieren Komponenten FragenPanel //
        panel2.add(frage1);
        panel2.add(frage2);
        panel2.add(frage3);
        panel2.add(frage4);
        panel2.add(frage5);
        panel2.add(frage6);
        panel2.add(frage7);
        panel2.add(frage8);
        panel2.add(frage9);
        panel2.add(frage10);

        // Platzieren Komponenten BoxenPanel //
        box1.setHorizontalAlignment(JCheckBox.RIGHT);
        panel3.add(box1);
        box2.setHorizontalAlignment(JCheckBox.RIGHT);
        panel3.add(box2);
        box3.setHorizontalAlignment(JCheckBox.RIGHT);
        panel3.add(box3);
        box4.setHorizontalAlignment(JCheckBox.RIGHT);
        panel3.add(box4);
        box5.setHorizontalAlignment(JCheckBox.RIGHT);
        panel3.add(box5);
        box6.setHorizontalAlignment(JCheckBox.RIGHT);
        panel3.add(box6);
        box7.setHorizontalAlignment(JCheckBox.RIGHT);
        panel3.add(box7);
        box8.setHorizontalAlignment(JCheckBox.RIGHT);
        panel3.add(box8);
        box9.setHorizontalAlignment(JCheckBox.RIGHT);
        panel3.add(box9);
        box10.setHorizontalAlignment(JCheckBox.RIGHT);
        panel3.add(box10);

        // Platzieren Komponenten ButtonPanel //
        panel4.add(submit);

        // Platzieren Komponenten EndePanel //
        panel5.add(tArea);


        /*-------- Platzierung Panels auf Frame ------------------------------*/
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);

        /* ----- Action Listener ---------------------------------------------*/
        submit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                panel4.setVisible(false);
                panel5.setVisible(true);
                if (box4.isSelected() || box5.isSelected() || box9.isSelected())
                {
                    tArea.setText("Fail!");
                }
                else
                {
                    tArea.setText("Success!");
                }
            }
        });


        /*-----------------Frame Abschluss------------------------------------*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
