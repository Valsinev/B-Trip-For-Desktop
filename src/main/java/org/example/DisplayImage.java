package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;

public class DisplayImage extends JFrame {

        private final BufferedImage image;

        public DisplayImage(BufferedImage image) {
            this.image = image;

            initUI();

            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setSize(800, 600);
            setLocationRelativeTo(null);
            pack();
            setLocationRelativeTo(null);
        }

        private void initUI() {
            JPanel contentPanel = new JPanel();
            contentPanel.setLayout(new BorderLayout());

            JScrollPane scrollPane = new JScrollPane(new JLabel(new ImageIcon(image)));
            contentPanel.add(scrollPane, BorderLayout.CENTER);

            JPopupMenu popupMenu = createPopupMenu();
            JLabel imageLabel = (JLabel) scrollPane.getViewport().getView();
            imageLabel.setComponentPopupMenu(popupMenu);

            setContentPane(contentPanel);
        }

        private JPopupMenu createPopupMenu() {
            JPopupMenu popupMenu = new JPopupMenu();

            // Option to save the image
            JMenuItem saveItem = new JMenuItem("Save Image");
            saveItem.addActionListener(e -> saveImage());
            popupMenu.add(saveItem);

            // Option to print the image
            JMenuItem printItem = new JMenuItem("Print Image");
            printItem.addActionListener(e -> printImage());
            popupMenu.add(printItem);

            return popupMenu;
        }

        private void saveImage() {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save Image");
            int userSelection = fileChooser.showSaveDialog(this);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                try {
                    ImageIO.write(image, "png", fileToSave);
                    JOptionPane.showMessageDialog(this, "Image saved successfully!");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error saving image");
                }
            }
        }

        private void printImage() {
            PrinterJob printJob = PrinterJob.getPrinterJob();
            printJob.setPrintable(new PrintableImage(image));
            if (printJob.printDialog()) {
                try {
                    printJob.print();
                } catch (PrinterException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error printing image");
                }
            }
        }

        @Override
        public void dispose() {
            // Release any resources here
            super.dispose();
        }

    }

