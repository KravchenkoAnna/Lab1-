package com.company;

import javax.swing.*;
import java.awt.*;

public class MyContainer extends JFrame {

    public MyContainer(){
        super("Lab №1");
        super.setBounds(500, 200, 500, 300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container =  super.getContentPane();
        container.setLayout(new GridLayout(9, 0, 1, 1));

        Fields allFields = new Fields(container);
    }
}
