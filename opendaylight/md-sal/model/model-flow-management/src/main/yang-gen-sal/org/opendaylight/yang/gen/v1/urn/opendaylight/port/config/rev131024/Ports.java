package org.opendaylight.yang.gen.v1.urn.opendaylight.port.config.rev131024;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.config.rev131024.ports.Port;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.config.rev131024.PortManagementData;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Ports
    extends
    ChildOf<PortManagementData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.port.config.rev131024.Ports>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:port:config","2013-10-24","ports")
    ;

    List<Port> getPort();

}

