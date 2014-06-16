package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.DataChangedNotification;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
**/
public interface SalRemoteListener
    extends
    NotificationListener
{




    /**
      Data change notification.
    **/
    void onDataChangedNotification(DataChangedNotification notification);

}

