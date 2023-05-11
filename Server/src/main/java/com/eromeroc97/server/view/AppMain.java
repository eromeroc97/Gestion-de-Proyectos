/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eromeroc97.server.view;

import javax.swing.JFrame;
import com.eromeroc97.server.resources.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author InformaticoLuciana
 */
public class AppMain {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AppMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        JFrame appframe = new JFrame(Locale.APP_MAIN_TITLE);
        appframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appframe.setSize(400, 175);
        appframe.setLocationRelativeTo(null);
        appframe.getContentPane().add(new AppMainPane());
        appframe.setVisible(true);
    }
}
