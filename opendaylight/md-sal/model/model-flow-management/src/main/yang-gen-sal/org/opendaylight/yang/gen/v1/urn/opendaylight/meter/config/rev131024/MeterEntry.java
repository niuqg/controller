package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter;
import org.opendaylight.yangtools.yang.common.QName;


public interface MeterEntry
    extends
    DataObject,
    Meter
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:config","2013-10-24","meter-entry")
    ;

    /**
    **/
    NodeRef getNode();

}

