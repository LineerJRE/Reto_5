package com.reto5.model.Vo;

import java.io.Serializable;
import java.sql.Date;

public class Consulta2Vo implements Serializable {

    private Integer id_Lider;
    private Date fechaNacimiento;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Integer salario;
    private String ciudadResidencia;
    private String cargo;
    private Double clasificacion;
    private String documentoIdentidad;

    public Consulta2Vo() {
    }
    
    public Integer getId_Lider() {
        return id_Lider;
    }

    public void setId_Lider(Integer id_Lider) {
        this.id_Lider = id_Lider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Double clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_Lider == null) ? 0 : id_Lider.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Consulta2Vo other = (Consulta2Vo) obj;
        if (id_Lider == null) {
            if (other.id_Lider != null)
                return false;
        } else if (!id_Lider.equals(other.id_Lider))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Consulta2VO_79 [cargo=" + cargo + ", ciudadResidencia=" + ciudadResidencia + ", clasificacion="
                + clasificacion + ", documentoIdentidad=" + documentoIdentidad + ", fechaNacimiento=" + fechaNacimiento
                + ", id_Lider=" + id_Lider + ", nombre=" + nombre + ", primerApellido=" + primerApellido + ", salario="
                + salario + ", segundoApellido=" + segundoApellido + "]";
    }

}
