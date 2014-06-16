package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv6Prefix;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6Label;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.MacAddress;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv6Address;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface Ipv6MatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","ipv6-match-fields")
    ;

    /**
      IPv6 destination address.
    **/
    Ipv6Prefix getIpv6Destination();
    
    Ipv6ExtHeader getIpv6ExtHeader();
    
    Ipv6Label getIpv6Label();
    
    /**
      Link layer source address for neighbour discovery message
    **/
    MacAddress getIpv6NdSll();
    
    /**
      IPv6 target address for neighbour discovery message
    **/
    Ipv6Address getIpv6NdTarget();
    
    /**
      Link layer target address for neighbour discovery message
    **/
    MacAddress getIpv6NdTll();
    
    /**
      IPv6 source address.
    **/
    Ipv6Prefix getIpv6Source();

}

