package org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2AddressKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Addresses;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface L2Address
    extends
    ChildOf<L2Addresses>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2Address>,
    org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Address,
    Identifiable<L2AddressKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:l2-address-tracker","2014-04-02","l2-address")
    ;

    /**
      Returns Primary Key of Yang List Type
    **/
    L2AddressKey getKey();

}

