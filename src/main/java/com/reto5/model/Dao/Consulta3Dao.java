package com.reto5.model.Dao;

import java.util.ArrayList;
import com.reto5.model.Vo.Consulta3Vo;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.reto5.util.JDBCUtilities;

public class Consulta3Dao {

    public ArrayList<Consulta3Vo> consulta3DAO() throws SQLException {

        ArrayList<Consulta3Vo> consulta = new ArrayList<>();
        Connection conex = JDBCUtilities.getConnection();

        try {
            String sql = "SELECT  p.ID_Proyecto, " + "l.Nombre, " + "l.Primer_Apellido " + "FROM Proyecto p "
                    + "inner join Lider l on p.ID_Lider = l.ID_Lider " + "WHERE p.Banco_Vinculado = 'Colpatria'";
            PreparedStatement consultasql = conex.prepareStatement(sql);
            ResultSet res = consultasql.executeQuery();

            while (res.next()) {
                Consulta3Vo consu = new Consulta3Vo();
                consu.setNombre(res.getString("Nombre"));
                consu.setId(res.getInt("ID_Proyecto"));
                consu.setPrimerApellido(res.getString("Primer_Apellido"));
                consulta.add(consu);
            }
            res.close();
            conex.close();
        } finally {

        }
        return consulta;
    }

}
