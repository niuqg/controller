package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.arp.match.fields;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.MacAddressFilter;
import org.opendaylight.yangtools.yang.common.QName;


/**
  ARP source hardware address.
**/
public interface ArpSourceHardwareAddress
    extends
    ChildOf<ArpMatchFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.arp.match.fields.ArpSourceHardwareAddress>,
    MacAddressFilter
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","arp-source-hardware-address")
    ;


}

