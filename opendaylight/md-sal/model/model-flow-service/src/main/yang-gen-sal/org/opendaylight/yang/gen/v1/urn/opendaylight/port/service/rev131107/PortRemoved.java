package org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.NodePort;
import org.opendaylight.yangtools.yang.binding.Notification;
import org.opendaylight.yangtools.yang.common.QName;


/**
  Helper grouping which contains a reference to node context.
**/
public interface PortRemoved
    extends
    ChildOf<DataObject>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortRemoved>,
    NodePort,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:port:service","2013-11-07","port-removed")
    ;


}

