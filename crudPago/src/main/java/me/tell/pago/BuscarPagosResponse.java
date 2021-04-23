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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cantidad_Total" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="tipo_Pago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha_Compra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hora_Compra" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "id",
    "cantidadTotal",
    "tipoPago",
    "fechaCompra",
    "horaCompra"
})
@XmlRootElement(name = "BuscarPagosResponse")
public class BuscarPagosResponse {

    protected int id;
    @XmlElement(name = "cantidad_Total")
    protected float cantidadTotal;
    @XmlElement(name = "tipo_Pago", required = true)
    protected String tipoPago;
    @XmlElement(name = "fecha_Compra", required = true)
    protected String fechaCompra;
    @XmlElement(name = "hora_Compra", required = true)
    protected String horaCompra;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

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
     * Obtiene el valor de la propiedad fechaCompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCompra() {
        return fechaCompra;
    }

    /**
     * Define el valor de la propiedad fechaCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCompra(String value) {
        this.fechaCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad horaCompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraCompra() {
        return horaCompra;
    }

    /**
     * Define el valor de la propiedad horaCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraCompra(String value) {
        this.horaCompra = value;
    }

}
