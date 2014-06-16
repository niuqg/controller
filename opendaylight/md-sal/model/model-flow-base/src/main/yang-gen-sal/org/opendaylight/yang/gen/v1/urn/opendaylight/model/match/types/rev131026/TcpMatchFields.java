package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.PortNumber;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface TcpMatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","tcp-match-fields")
    ;

    /**
      TCP destination port.
    **/
    PortNumber getTcpDestinationPort();
    
    /**
      TCP source port.
    **/
    PortNumber getTcpSourcePort();

}

