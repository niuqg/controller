package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.PortNumber;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface SctpMatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","sctp-match-fields")
    ;

    /**
      SCTP destination port.
    **/
    PortNumber getSctpDestinationPort();
    
    /**
      SCTP source port.
    **/
    PortNumber getSctpSourcePort();

}

