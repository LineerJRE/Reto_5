package com.reto5.controller;

import java.util.ArrayList;
import com.reto5.model.Dao.*;
import com.reto5.model.Vo.*;
import com.reto5.view.Ventana;
import com.reto5.view.Tabla;

import java.sql.SQLException;

public class Controlador {

    private final Consulta1Dao consulta1Dao;
    private final Consulta2Dao consulta2Dao;
    private final Consulta3Dao consulta3Dao;

    public Controlador() {

        this.consulta1Dao = new Consulta1Dao();
        this.consulta2Dao = new Consulta2Dao();
        this.consulta3Dao = new Consulta3Dao();

    }

    public ArrayList<Consulta1Vo> realizarConsulta1() throws SQLException {

        return this.consulta1Dao.consulta1DAO();
    }

    public ArrayList<Consulta2Vo> realizarConsulta2() throws SQLException {

        return this.consulta2Dao.consulta2DAO();
    }

    public ArrayList<Consulta3Vo> realizarConsulta3() throws SQLException {

        return this.consulta3Dao.consulta3DAO();
    }

    public void mostrarVentana() {
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
    }

    public void mostrarTabla(String titulo, Object[][] data, String[] titles) {
        Tabla tabla = new Tabla(titulo, data, titles);
        tabla.setVisible(true);
    }

}
