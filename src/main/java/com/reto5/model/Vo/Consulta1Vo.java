package com.reto5.model.Vo;

import java.io.Serializable;
import java.sql.Date;

public class Consulta1Vo implements Serializable {

    private Integer id;
    private Date fechaInicio;
    private String bancoVinculado;
    private String serial;
    private String constructora;
    private Integer numeroBanos;
    private Integer numeroHabitaciones;
    private Float porcentajeCuotas;
    private String ciudad;
    private String clasificacion;
    private String acabados;
    private Integer idTipo;
    private Integer idLider;

    public Consulta1Vo() {
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public Integer getNumeroBanos() {
        return numeroBanos;
    }

    public void setNumeroBanos(Integer numeroBanos) {
        this.numeroBanos = numeroBanos;
    }

    public Integer getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(Integer numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public Float getPorcentajeCuotas() {
        return porcentajeCuotas;
    }

    public void setPorcentajeCuotas(Float porcentajeCuotas) {
        this.porcentajeCuotas = porcentajeCuotas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getAcabados() {
        return acabados;
    }

    public void setAcabados(String acabados) {
        this.acabados = acabados;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public Integer getIdLider() {
        return idLider;
    }

    public void setIdLider(Integer idLider) {
        this.idLider = idLider;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getBancoVinculado() {
        return bancoVinculado;
    }

    public void setBancoVinculado(String bancoVinculado) {
        this.bancoVinculado = bancoVinculado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Consulta1Vo other = (Consulta1Vo) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Consulta1VO_79 [acabados=" + acabados + ", bancoVinculado=" + bancoVinculado + ", ciudad=" + ciudad
                + ", clasificacion=" + clasificacion + ", constructora=" + constructora + ", fechaInicio=" + fechaInicio
                + ", id=" + id + ", idLider=" + idLider + ", idTipo=" + idTipo + ", numeroBanos=" + numeroBanos
                + ", numeroHabitaciones=" + numeroHabitaciones + ", porcentajeCuotas=" + porcentajeCuotas + ", serial="
                + serial + "]";
    }

}
