
package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.BackupFile;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BackupFiles" type="{http://www.onvif.org/ver10/schema}BackupFile" maxOccurs="unbounded"/>
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
    "backupFiles"
})
@XmlRootElement(name = "GetSystemBackupResponse")
public class GetSystemBackupResponse {

    @XmlElement(name = "BackupFiles", required = true)
    protected List<BackupFile> backupFiles;

    /**
     * Gets the value of the backupFiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backupFiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackupFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BackupFile }
     * 
     * 
     */
    public List<BackupFile> getBackupFiles() {
        if (backupFiles == null) {
            backupFiles = new ArrayList<BackupFile>();
        }
        return this.backupFiles;
    }

}