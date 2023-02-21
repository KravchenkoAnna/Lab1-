package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Fields extends JFrame {

    private JRadioButton encrypt;
    private JRadioButton decrypt;
    private JRadioButton fileButton1;
    private JRadioButton fileButton2;
    private JTextField text_field;
    private JTextField key_field;


    public Fields(Container cont){
        setFields(cont);
    }

    private void setFields(Container cont) {

        JLabel text = new JLabel("Input text or filepath");
        text_field = new JTextField();

        cont.add(text);
        cont.add(text_field);

        JLabel key = new JLabel("Input key");
        key_field = new JTextField();

        cont.add(key);
        cont.add(key_field);


        encrypt = new JRadioButton("Encrypt");
        decrypt = new JRadioButton("Decrypt");
        fileButton1 = new JRadioButton("Encrypt from file");
        fileButton2 = new JRadioButton("Decrypt from file");
        encrypt.setSelected(true);
        cont.add(encrypt);
        cont.add(decrypt);
        cont.add(fileButton1);
        cont.add(fileButton2);

        ButtonGroup group = new ButtonGroup();
        group.add(encrypt);
        group.add(decrypt);
        group.add(fileButton1);
        group.add(fileButton2);

        JButton go = new JButton("GO");
        cont.add(go);

        go.addActionListener(new ButtonEventManager());
    }

    class ButtonEventManager implements ActionListener {
        private Caesar first = new Caesar();

        @Override
        public void actionPerformed(ActionEvent e)  {
            String resultString = "";
            if (encrypt.isSelected()) {
                //вызов метода для зашифровки
                resultString = first.print1(text_field.getText(), Integer.parseInt(key_field.getText()));
            } else if (fileButton1.isSelected()) {
                try {
                    resultString = first.print1(first.fileReader(text_field.getText()), Integer.parseInt(key_field.getText()));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else if (fileButton2.isSelected()){
                try {
                    resultString = first.print2(first.fileReader(text_field.getText()), Integer.parseInt(key_field.getText()));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            else {
                //вызов метода для расшифровки
                resultString = first.print2(text_field.getText(), Integer.parseInt(key_field.getText()));
            }

            JOptionPane.showMessageDialog(null, "The message is:\n " + resultString,
                    "Results" ,JOptionPane.PLAIN_MESSAGE);
        }
    }
}
