/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan_1_samsul_maarif;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Administrator
 */
public class LatihanGui1 {
    public static void  main(String[] args){
        JFrame frame = new JFrame("GUI Sederhana");
        JLabel label = new JLabel("Hello, Swing");
        JButton button = new JButton("Klik Saya");
        
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        label.setBounds(100, 30, 150, 10);
        button.setBounds(80, 70, 120, 30);
        
        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
    }
}
