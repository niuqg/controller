package org.opendaylight.yang.gen.v1.urn.opendaylight.port.config.rev131024.ports;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.config.rev131024.ports.PortKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.config.rev131024.Ports;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.config.rev131024.PortEntry;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Port
    extends
    ChildOf<Ports>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.port.config.rev131024.ports.Port>,
    PortEntry,
    Identifiable<PortKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:port:config","2013-10-24","port")
    ;

    /**
    **/
    Long getId();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    PortKey getKey();

}

