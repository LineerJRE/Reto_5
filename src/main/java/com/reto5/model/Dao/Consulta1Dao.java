package com.reto5.model.Dao;

import java.util.ArrayList;
import com.reto5.model.Vo.Consulta1Vo;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.reto5.util.JDBCUtilities;

public class Consulta1Dao {

    public ArrayList<Consulta1Vo> consulta1DAO() throws SQLException {

        ArrayList<Consulta1Vo> consulta = new ArrayList<>();
        Connection conex = JDBCUtilities.getConnection();

        try {
            String sql = "select  p.ID_Proyecto, " + "p.Fecha_Inicio, " + "p.Banco_Vinculado, " + "p.Serial "
                    + "FROM Proyecto p " + "WHERE ID_Proyecto > 4 and ID_Proyecto < 12";
            PreparedStatement consultasql = conex.prepareStatement(sql);
            ResultSet res = consultasql.executeQuery();

            while (res.next()) {
                Consulta1Vo consu = new Consulta1Vo();
                consu.setId(res.getInt("ID_Proyecto"));
                consu.setFechaInicio(Date.valueOf(res.getString("Fecha_Inicio")));
                consu.setBancoVinculado(res.getString("Banco_Vinculado"));
                consu.setSerial(res.getString("Serial"));
                consulta.add(consu);
            }
            res.close();
            conex.close();
        } finally {

        }
        return consulta;
    }
}
