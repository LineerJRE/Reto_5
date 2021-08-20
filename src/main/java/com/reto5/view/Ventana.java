package com.reto5.view;

import javax.swing.*;

import com.reto5.model.Vo.*;
import com.reto5.controller.*;

import java.awt.Color;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class Ventana extends JFrame implements ActionListener {

    JLabel labelTitulo ;
    JButton botonConsulta1, botonConsulta2, botonConsulta3;
    private Vista vista;
    private Controlador controlador;

    public Ventana() {

        labelTitulo = new JLabel("Reto 5 Grupo 79");
        labelTitulo.setBounds(290, 15, 300, 40);
        labelTitulo.setFont(new java.awt.Font("verdana",1,30));
        labelTitulo.setForeground(Color.BLUE);

        botonConsulta1 = new JButton("Consulta 1");
        botonConsulta1.setBounds(70, 70, 200, 40);
        botonConsulta1.setBackground(Color.DARK_GRAY);
        botonConsulta1.setForeground(Color.WHITE);
        botonConsulta1.setFont(new java.awt.Font("verdana",1,18));
        botonConsulta2 = new JButton("Consulta 2");
        botonConsulta2.setBounds(340, 70, 200, 40);
        botonConsulta2.setBackground(Color.DARK_GRAY);
        botonConsulta2.setFont(new java.awt.Font("verdana",1,18));
        botonConsulta2.setForeground(Color.WHITE);
        botonConsulta3 = new JButton("Consulta 3");
        botonConsulta3.setBounds(610, 70, 200, 40);
        botonConsulta3.setBackground(Color.DARK_GRAY);
        botonConsulta3.setFont(new java.awt.Font("verdana",1,18));
        botonConsulta3.setForeground(Color.WHITE);

        botonConsulta1.addActionListener(this);
        botonConsulta2.addActionListener(this);
        botonConsulta3.addActionListener(this);

        add(labelTitulo);
        add(botonConsulta1);
        add(botonConsulta2);
        add(botonConsulta3);

        setSize(880,170);
        setTitle("Mision TIC 2022 Lrolong");
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        vista = new Vista();
        controlador = new Controlador();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==botonConsulta1) {
            
            ArrayList<Consulta1Vo> lista;
            try {
                lista = controlador.realizarConsulta1();
                String titles[]= new String[4];
                Object data[][]= new Object [lista.size()][];
                String titulo = "CONSULTA 1";
                vista.consulta1(titles, data);
                controlador.mostrarTabla(titulo, data, titles);
                dispose();
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            
        }

        if (e.getSource()==botonConsulta2) {
            
            ArrayList<Consulta2Vo> lista;
            try {
                lista = controlador.realizarConsulta2();
                String titles[]= new String[4];
                Object data[][]= new Object [lista.size()][];
                String titulo = "CONSULTA 2";
                vista.consulta2(titles, data);
                controlador.mostrarTabla(titulo, data, titles);
                dispose();
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

        }

        if (e.getSource()==botonConsulta3) {
            
            ArrayList<Consulta3Vo> lista;
            try {
                lista = controlador.realizarConsulta3();
                String titles[]= new String[2];
                Object data[][]= new Object [lista.size()][];
                String titulo = "CONSULTA 1";
                vista.consulta3(titles, data);
                controlador.mostrarTabla(titulo, data, titles);
                dispose();
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

        }

    }
    
}
