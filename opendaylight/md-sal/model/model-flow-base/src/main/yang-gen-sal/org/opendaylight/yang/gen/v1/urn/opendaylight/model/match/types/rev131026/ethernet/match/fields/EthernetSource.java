package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.EthernetMatchFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.MacAddressFilter;
import org.opendaylight.yangtools.yang.common.QName;


/**
  Ethernet source address.
**/
public interface EthernetSource
    extends
    ChildOf<EthernetMatchFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetSource>,
    MacAddressFilter
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","ethernet-source")
    ;


}

