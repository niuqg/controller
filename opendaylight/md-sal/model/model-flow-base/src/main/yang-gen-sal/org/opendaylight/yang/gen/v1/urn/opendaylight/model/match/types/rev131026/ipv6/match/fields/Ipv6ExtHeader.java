package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Ipv6MatchFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Ipv6ExtHeader
    extends
    ChildOf<Ipv6MatchFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","ipv6-ext-header")
    ;

    /**
      IPv6 Extension Header field
    **/
    Integer getIpv6Exthdr();
    
    /**
    **/
    Integer getIpv6ExthdrMask();

}

