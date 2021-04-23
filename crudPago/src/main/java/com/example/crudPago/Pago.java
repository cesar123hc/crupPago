package com.example.crudPago;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private float cantidadTotal;
    private String tipoPago;
    private String numeroTarjeta;
    private String nombreDueno;
    private String apellidoDueno;
    private String fechaExpiracion;
    private String codigoSeguridad;
    private String fechaCompra;
    private String horaCompra;
    private String folio_Pago;
    private String estatusPago;

    public String getEstatusPago() {
        return estatusPago;
    }


    public void setEstatusPago(String estatusPago) {
        this.estatusPago = estatusPago;
    }

    public Pago(){

    }
   
  
    

    public String getFolio_Pago() {
        return folio_Pago;
    }




    public void setFolio_Pago(String folio_Pago) {
        this.folio_Pago = folio_Pago;
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(String horaCompra) {
        this.horaCompra = horaCompra;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fecahCompra) {
        this.fechaCompra = fecahCompra;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getApellidoDueno() {
        return apellidoDueno;
    }

    public void setApellidoDueno(String apellidoDueno) {
        this.apellidoDueno = apellidoDueno;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public float getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(float cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }
}