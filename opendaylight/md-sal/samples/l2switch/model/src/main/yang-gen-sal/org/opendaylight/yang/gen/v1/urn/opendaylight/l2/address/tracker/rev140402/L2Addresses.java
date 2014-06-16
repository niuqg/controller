package org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2Address;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2AddressTrackerData;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface L2Addresses
    extends
    ChildOf<L2AddressTrackerData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Addresses>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:l2-address-tracker","2014-04-02","l2-addresses")
    ;

    List<L2Address> getL2Address();

}

