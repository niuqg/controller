package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv4Prefix;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface Ipv4MatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","ipv4-match-fields")
    ;

    /**
      IPv4 destination address.
    **/
    Ipv4Prefix getIpv4Destination();
    
    /**
      IPv4 source address.
    **/
    Ipv4Prefix getIpv4Source();

}

