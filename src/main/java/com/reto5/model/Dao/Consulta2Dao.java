package com.reto5.model.Dao;

import java.util.ArrayList;
import com.reto5.model.Vo.Consulta2Vo;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.reto5.util.JDBCUtilities;

public class Consulta2Dao {

    public ArrayList<Consulta2Vo> consulta2DAO() throws SQLException {

        ArrayList<Consulta2Vo> consulta = new ArrayList<>();
        Connection conex = JDBCUtilities.getConnection();

        try {
            String sql = "SELECT  l.Nombre, " + "l.Salario, " + "l.Primer_Apellido, " + "l.Segundo_Apellido "
                    + "FROM Lider l " + "WHERE Salario BETWEEN 500000 and 650000";
            PreparedStatement consultasql = conex.prepareStatement(sql);
            ResultSet res = consultasql.executeQuery();

            while (res.next()) {
                Consulta2Vo consu = new Consulta2Vo();
                consu.setNombre(res.getString("Nombre"));
                consu.setSalario(res.getInt("Salario"));
                consu.setPrimerApellido(res.getString("Primer_Apellido"));
                consu.setSegundoApellido(res.getString("Segundo_Apellido"));
                consulta.add(consu);
            }
            res.close();
            conex.close();
        } finally {

        }
        return consulta;
    }

}
