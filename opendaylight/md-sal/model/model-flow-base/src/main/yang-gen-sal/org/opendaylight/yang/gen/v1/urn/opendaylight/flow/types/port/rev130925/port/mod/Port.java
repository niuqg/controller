package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortMod;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Port
    extends
    ChildOf<PortMod>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.Port>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types:port","2013-09-25","port")
    ;

    List<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port> getPort();

}

