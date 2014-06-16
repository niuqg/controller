package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortFeatures;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortConfig;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.MacAddress;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface CommonPort
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types:port","2013-09-25","common-port")
    ;

    /**
      Features being advertised by the port
    **/
    PortFeatures getAdvertisedFeatures();
    
    /**
      Bit map of OFPPC-* flags
    **/
    PortConfig getConfiguration();
    
    /**
      MAC Address of the port
    **/
    MacAddress getHardwareAddress();
    
    /**
    **/
    Long getPortNumber();

}

