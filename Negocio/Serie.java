//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.20 at 11:11:12 AM COT 
//


package Negocio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="temporada" type="{}temporada"/>
 *         &lt;element name="actor" type="{}actor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="director" type="{}director" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nombre" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serie", propOrder = {
    "temporada",
    "actor",
    "director"
})
public class Serie {

    @XmlElement(required = true)
    protected Temporada temporada;
    protected List<Actor> actor;
    @XmlElement(required = true)
    protected List<Director> director;
    @XmlAttribute(name = "nombre", required = true)
    protected String nombre;

    /**
     * Gets the value of the temporada property.
     * 
     * @return
     *     possible object is
     *     {@link Temporada }
     *     
     */
    public Temporada getTemporada() {
        return temporada;
    }

    /**
     * Sets the value of the temporada property.
     * 
     * @param value
     *     allowed object is
     *     {@link Temporada }
     *     
     */
    public void setTemporada(Temporada value) {
        this.temporada = value;
    }

    /**
     * Gets the value of the actor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Actor }
     * 
     * 
     */
    public List<Actor> getActor() {
        if (actor == null) {
            actor = new ArrayList<Actor>();
        }
        return this.actor;
    }

    /**
     * Gets the value of the director property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the director property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Director }
     * 
     * 
     */
    public List<Director> getDirector() {
        if (director == null) {
            director = new ArrayList<Director>();
        }
        return this.director;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

	public void setActor(List<Actor> actor) {
		this.actor = actor;
	}

	public void setDirector(List<Director> director) {
		this.director = director;
	}

    
    
}
