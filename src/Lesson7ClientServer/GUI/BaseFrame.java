package Lesson7ClientServer.GUI;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Lesson7ClientServer.service.BaseService;


public class BaseFrame extends JFrame {
    JMenuBar jMenuBar;
    JMenu fileMenu;
    JMenu helpMenu;
    JTextArea jTextArea;
    JTextField textField;
    JPanel panel;

    BaseService baseService;


    public BaseFrame() throws HeadlessException {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);

        createMenu();
        createContent();
        setElementPositions();

        setVisible(true);


    }

    private void setElementPositions() {
        this.getContentPane().add(BorderLayout.NORTH, jMenuBar);
        this.getContentPane().add(BorderLayout.CENTER, jTextArea);
        this.getContentPane().add(BorderLayout.SOUTH, panel);
    }

    private void createContent() {
        panel = new JPanel();
        JLabel label = new JLabel("Enter your text");
        textField = new JTextField(10);
        JButton sendButton = new JButton("Send");
        JButton resetButton = new JButton("Reset");

        jTextArea = new JTextArea();
        jTextArea.setEditable(false);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = jTextArea.getText();
                System.out.println(text);
                text = text.concat(textField.getText());
                System.out.println(text);
                jTextArea.setText(text + "\n");
                textField.setText("");
                baseService.execute();
            }
        });


        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                IpProgrammFrame ipProgrammFrame = new IpProgrammFrame();
            }
        });

        panel.add(label);
        panel.add(textField);
        panel.add(sendButton);
        panel.add(resetButton);
    }

    private void createMenu() {
        jMenuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        helpMenu = new JMenu("Help");
        jMenuBar.add(fileMenu);
        jMenuBar.add(helpMenu);

        JMenuItem menuItemOpen = new JMenuItem("Open");
        JMenuItem menuItemSaveAs = new JMenuItem("Save As");

        fileMenu.add(menuItemOpen);
        fileMenu.add(menuItemSaveAs);
    }
}