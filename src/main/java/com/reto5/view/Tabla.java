package com.reto5.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.event.*;
import java.awt.Color;

import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.TableCellRenderer;

import com.reto5.controller.Controlador;

public class Tabla extends JFrame implements ActionListener {

    JLabel labelTabla;
    JButton botonAtras;
    JTable tabla;
    private Controlador controlador;

    public Tabla(String titulo, Object[][] data, String[] titles) {

        labelTabla = new JLabel(titulo);
        labelTabla.setBounds(310, 20, 220, 30);
        labelTabla.setFont(new java.awt.Font("verdana", 1, 30));
        labelTabla.setForeground(Color.BLUE);

        tabla = new JTable(data, titles);
        tabla.getTableHeader().setDefaultRenderer(new HeaderRenderer());
        tabla.setShowHorizontalLines(true);
        tabla.setRowSelectionAllowed(true);
        tabla.setColumnSelectionAllowed(true);
        tabla.setFont(new java.awt.Font("verdana", 1, 15));
        ;
        tabla.setBackground(Color.LIGHT_GRAY);
        tabla.setSelectionForeground(Color.white);
        tabla.setSelectionBackground(Color.blue);
        JScrollPane panel = new JScrollPane(tabla);
        panel.setBounds(50, 60, 720, 300);

        botonAtras = new JButton("Atras");
        botonAtras.setBounds(640, 370, 70, 30);

        botonAtras.addActionListener(this);

        add(labelTabla);
        add(panel);
        add(botonAtras);

        setSize(840, 450);
        setTitle("Mision TIC 2022 Lrolong");
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        controlador = new Controlador();

    }

    private class HeaderRenderer extends JLabel implements TableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
                int row, int column) {
            setText(value.toString());
            setOpaque(true);
            setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            setBorder(new SoftBevelBorder(BevelBorder.RAISED));
            setBackground(new Color(0, 152, 213));
            setIconTextGap(10);
            setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(240, 240, 240)),
                    BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, new Color(0, 0, 0)),
                            BorderFactory.createEmptyBorder(8, 0, 8, 0))));
            setFont(new Font("Tahoma", 1, 20));
            return this;
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonAtras) {
            try {
                dispose();
                controlador.mostrarVentana();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }

    }

}
