package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv6Prefix;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.Address;
import org.opendaylight.yangtools.yang.common.QName;


public interface Ipv6
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>,
    Address
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:action:types","2013-11-12","ipv6")
    ;

    /**
    **/
    Ipv6Prefix getIpv6Address();

}

