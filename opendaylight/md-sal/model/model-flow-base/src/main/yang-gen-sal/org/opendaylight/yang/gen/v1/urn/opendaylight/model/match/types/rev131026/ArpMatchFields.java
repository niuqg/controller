package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.arp.match.fields.ArpSourceHardwareAddress;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv4Prefix;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.arp.match.fields.ArpTargetHardwareAddress;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface ArpMatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","arp-match-fields")
    ;

    /**
    **/
    Integer getArpOp();
    
    /**
      ARP source hardware address.
    **/
    ArpSourceHardwareAddress getArpSourceHardwareAddress();
    
    /**
      ARP source IPv4 address.
    **/
    Ipv4Prefix getArpSourceTransportAddress();
    
    /**
      ARP target hardware address.
    **/
    ArpTargetHardwareAddress getArpTargetHardwareAddress();
    
    /**
      ARP target IPv4 address.
    **/
    Ipv4Prefix getArpTargetTransportAddress();

}

