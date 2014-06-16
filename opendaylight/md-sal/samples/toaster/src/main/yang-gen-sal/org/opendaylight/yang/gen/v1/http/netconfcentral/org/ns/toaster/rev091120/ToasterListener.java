package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterOutOfBread;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterRestocked;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
**/
public interface ToasterListener
    extends
    NotificationListener
{




    /**
      Indicates that the toaster has run of out bread.
    **/
    void onToasterOutOfBread(ToasterOutOfBread notification);
    
    /**
      Indicates that the toaster has run of out bread.
    **/
    void onToasterRestocked(ToasterRestocked notification);

}

