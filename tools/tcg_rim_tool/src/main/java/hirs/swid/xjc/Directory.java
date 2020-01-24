//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 08:11:19 AM EDT 
//

package hirs.swid.xjc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Directory complex type.
 * </p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 * <pre>
 * &lt;complexType name="Directory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://standards.iso.org/iso/19770/-2/2015/schema.xsd}FilesystemItem"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="Directory" type="{http://standards.iso.org/iso/19770/-2/2015/schema.xsd}Directory"/&gt;
 *         &lt;element name="File" type="{http://standards.iso.org/iso/19770/-2/2015/schema.xsd}File"/&gt;
 *       &lt;/choice&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Directory", namespace = "http://standards.iso.org/iso/19770/-2/2015/schema.xsd", propOrder = { "directoryOrFile" })
public class Directory extends FilesystemItem {

	@XmlElements({ @XmlElement(name = "Directory", namespace = "http://standards.iso.org/iso/19770/-2/2015/schema.xsd", type = Directory.class, required = false),
			@XmlElement(name = "File", namespace = "http://standards.iso.org/iso/19770/-2/2015/schema.xsd", type = File.class, required = false) })
	protected List<FilesystemItem> directoryOrFile;

	/**
	 * Gets the value of the directoryOrFile property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the directoryOrFile property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDirectoryOrFile().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Directory } {@link File }
	 * 
	 * 
	 */
	public List<FilesystemItem> getDirectoryOrFile() {
		if (directoryOrFile == null) {
			directoryOrFile = new ArrayList<FilesystemItem>();
		}
		return this.directoryOrFile;
	}

}