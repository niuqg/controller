package org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThrough;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface NetconfNodeFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:netconf-node-inventory","2014-01-08","netconf-node-fields")
    ;

    /**
    **/
    Boolean isConnected();
    
    /**
    **/
    List<String> getCurrentCapability();
    
    /**
    **/
    List<String> getInitialCapability();
    
    /**
      When the underlying node is connected, its NETCONF context
                      is available verbatim under this container through the
                      mount extension.
    **/
    PassThrough getPassThrough();

}

