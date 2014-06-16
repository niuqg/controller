package org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortUpdate;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortMod;
import org.opendaylight.yangtools.yang.common.QName;


public interface OriginalPort
    extends
    ChildOf<PortUpdate>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update.OriginalPort>,
    PortMod
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:port:service","2013-11-07","original-port")
    ;


}

