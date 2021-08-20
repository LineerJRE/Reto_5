package com.reto5.view;

import com.reto5.controller.*;
import com.reto5.model.Vo.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class Vista {

    public static final Controlador controlador = new Controlador();

    public void consulta1(String titles[], Object data[][]) {

        try {

            ArrayList<Consulta1Vo> lista = controlador.realizarConsulta1();

            // Encabezado del resultado
            titles[0] = "ID Proyecto";
            titles[1] = "Fecha Inicio";
            titles[2] = "Banco Vinculado";
            titles[3] = "Serial";

            // Cada VO cargado, mostrarlo en la vista
            Integer contador = 0;
            for (Object object : data) {
                data[contador] = new Object[] { lista.get(contador).getId(), lista.get(contador).getFechaInicio(),
                        lista.get(contador).getBancoVinculado(), lista.get(contador).getSerial() };
                contador++;
            }
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public void consulta2(String titles[], Object data[][]) {

        try {

            ArrayList<Consulta2Vo> lista = controlador.realizarConsulta2();

            // Encabezado del resultado
            titles[0] = "Nombre";
            titles[1] = "Salario";
            titles[2] = "Deducible";
            titles[3] = "Apellidos";
            // Cada VO cargado, mostrarlo en la vista
            Integer contador = 0;
            for (Object object : data) {
                String primerApellido = lista.get(contador).getPrimerApellido();
                String segundoApellido = lista.get(contador).getPrimerApellido();
                String cocatenado = primerApellido + "-" + segundoApellido;
                Double deducible = lista.get(contador).getSalario() * 0.08;
                data[contador] = new Object[] { lista.get(contador).getNombre(), lista.get(contador).getSalario(),
                        deducible, cocatenado };

                contador++;
            }

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public void consulta3(String titles[], Object data[][]) {

        try {

            ArrayList<Consulta3Vo> lista = controlador.realizarConsulta3();

            // Encabezado del resultado
            titles[0] = "ID Proyecto";
            titles[1] = "Nom Ape";

            // Cada VO cargado, mostrarlo en la vista
            Integer contador = 0;
            for (Object object : data) {
                String nombre = lista.get(contador).getNombre();
                String apellido = lista.get(contador).getPrimerApellido();
                String cocatenado = nombre + " " + apellido;
                data[contador] = new Object[] { lista.get(contador).getId(), cocatenado };
                contador++;
            }

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

}
