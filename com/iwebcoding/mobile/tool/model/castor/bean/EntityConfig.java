/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.7</a>, using an XML
 * Schema.
 * $Id$
 */

package com.iwebcoding.mobile.tool.model.castor.bean;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class EntityConfig.
 * 
 * @version $Revision$ $Date$
 */
public class EntityConfig implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _version
     */
    private java.lang.String _version;

    /**
     * Field _platformConfigs
     */
    private com.iwebcoding.mobile.tool.model.castor.bean.PlatformConfigs _platformConfigs;


      //----------------/
     //- Constructors -/
    //----------------/

    public EntityConfig() 
     {
        super();
    } //-- com.hsbc.p2g.mobile.tools.checksum.bean.EntityConfig()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'platformConfigs'.
     * 
     * @return PlatformConfigs
     * @return the value of field 'platformConfigs'.
     */
    public com.iwebcoding.mobile.tool.model.castor.bean.PlatformConfigs getPlatformConfigs()
    {
        return this._platformConfigs;
    } //-- com.hsbc.p2g.mobile.tools.checksum.bean.PlatformConfigs getPlatformConfigs() 

    /**
     * Returns the value of field 'version'.
     * 
     * @return String
     * @return the value of field 'version'.
     */
    public java.lang.String getVersion()
    {
        return this._version;
    } //-- java.lang.String getVersion() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'platformConfigs'.
     * 
     * @param platformConfigs the value of field 'platformConfigs'.
     */
    public void setPlatformConfigs(com.iwebcoding.mobile.tool.model.castor.bean.PlatformConfigs platformConfigs)
    {
        this._platformConfigs = platformConfigs;
    } //-- void setPlatformConfigs(com.hsbc.p2g.mobile.tools.checksum.bean.PlatformConfigs) 

    /**
     * Sets the value of field 'version'.
     * 
     * @param version the value of field 'version'.
     */
    public void setVersion(java.lang.String version)
    {
        this._version = version;
    } //-- void setVersion(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.iwebcoding.mobile.tool.model.castor.bean.EntityConfig) Unmarshaller.unmarshal(com.iwebcoding.mobile.tool.model.castor.bean.EntityConfig.class, reader);
    } //-- java.lang.Object unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
