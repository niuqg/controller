package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Dscp;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpVersion;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface IpMatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","ip-match-fields")
    ;

    /**
      IP DSCP (6 bits in ToS field).
    **/
    Dscp getIpDscp();
    
    /**
      IP ECN (2 bits in ToS field).
    **/
    Short getIpEcn();
    
    /**
      IP Proto (IPv4 or IPv6 Protocol Number).
    **/
    IpVersion getIpProto();
    
    /**
      IP protocol.
    **/
    Short getIpProtocol();

}

