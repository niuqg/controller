package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortFeatures;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.Queues;
import org.opendaylight.yangtools.yang.common.QName;


public interface FlowCapablePort
    extends
    DataObject,
    CommonPort,
    Queues
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types:port","2013-09-25","flow-capable-port")
    ;

    /**
      Bit map of OFPPF-* flags
    **/
    PortFeatures getCurrentFeature();
    
    /**
      Current port bit rate in kbps
    **/
    Long getCurrentSpeed();
    
    /**
      Max port bit rate in kbps
    **/
    Long getMaximumSpeed();
    
    /**
      Human readable name of the port
    **/
    String getName();
    
    /**
      Features advertised by peer
    **/
    PortFeatures getPeerFeatures();
    
    /**
      Description of state of port
    **/
    State getState();
    
    /**
      Features supported by the port
    **/
    PortFeatures getSupported();

}

