//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.04.20 a las 12:16:32 PM CDT 
//


package me.tell.pago;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidad_Total" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="tipo_Pago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero_Tarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre_Dueno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apellido_Dueno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha_Expiracion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo_Seguridad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cantidadTotal",
    "tipoPago",
    "numeroTarjeta",
    "nombreDueno",
    "apellidoDueno",
    "fechaExpiracion",
    "codigoSeguridad"
})
@XmlRootElement(name = "RealizarPagoRequest")
public class RealizarPagoRequest {

    @XmlElement(name = "cantidad_Total")
    protected float cantidadTotal;
    @XmlElement(name = "tipo_Pago", required = true)
    protected String tipoPago;
    @XmlElement(name = "numero_Tarjeta", required = true)
    protected String numeroTarjeta;
    @XmlElement(name = "nombre_Dueno", required = true)
    protected String nombreDueno;
    @XmlElement(name = "apellido_Dueno", required = true)
    protected String apellidoDueno;
    @XmlElement(name = "fecha_Expiracion", required = true)
    protected String fechaExpiracion;
    @XmlElement(name = "codigo_Seguridad", required = true)
    protected String codigoSeguridad;

    /**
     * Obtiene el valor de la propiedad cantidadTotal.
     * 
     */
    public float getCantidadTotal() {
        return cantidadTotal;
    }

    /**
     * Define el valor de la propiedad cantidadTotal.
     * 
     */
    public void setCantidadTotal(float value) {
        this.cantidadTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPago() {
        return tipoPago;
    }

    /**
     * Define el valor de la propiedad tipoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPago(String value) {
        this.tipoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Define el valor de la propiedad numeroTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTarjeta(String value) {
        this.numeroTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDueno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDueno() {
        return nombreDueno;
    }

    /**
     * Define el valor de la propiedad nombreDueno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDueno(String value) {
        this.nombreDueno = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoDueno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoDueno() {
        return apellidoDueno;
    }

    /**
     * Define el valor de la propiedad apellidoDueno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoDueno(String value) {
        this.apellidoDueno = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExpiracion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    /**
     * Define el valor de la propiedad fechaExpiracion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpiracion(String value) {
        this.fechaExpiracion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoSeguridad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    /**
     * Define el valor de la propiedad codigoSeguridad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSeguridad(String value) {
        this.codigoSeguridad = value;
    }

}
