package com.johnpickup.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MainMenuForm {
    private JPanel panel1;
    private JButton garminButton;
    private JButton icalButton;
    private static Image icon;

    private void init() {
        garminButton.addActionListener(e -> ScheduleConverterForm.display());
        icalButton.addActionListener(e -> CalendarConverterForm.display());
        panel1.setBackground(Color.DARK_GRAY);
        garminButton.setBackground(Color.DARK_GRAY);
        icalButton.setBackground(Color.DARK_GRAY);
    }

    private static void display() throws IOException {
        JFrame frame = new JFrame("Garmin Workout Converter");
        MainMenuForm form = new MainMenuForm();
        form.init();
        frame.setContentPane(form.panel1);
        frame.setBackground(Color.DARK_GRAY);
        BufferedImage image = ImageIO.read(new File("resources/GarminWorkoutCreator.png"));
        frame.setIconImage(image);
        com.apple.eawt.Application.getApplication().setDockIconImage(image);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        display();
    }
}
