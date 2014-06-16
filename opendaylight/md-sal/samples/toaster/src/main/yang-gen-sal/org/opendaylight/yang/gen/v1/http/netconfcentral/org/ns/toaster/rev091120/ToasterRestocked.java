package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Notification;
import org.opendaylight.yangtools.yang.common.QName;


/**
  Indicates that the toaster has run of out bread.
**/
public interface ToasterRestocked
    extends
    ChildOf<DataObject>,
    Augmentable<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterRestocked>,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://netconfcentral.org/ns/toaster","2009-11-20","toasterRestocked")
    ;

    /**
      Indicates the amount of bread that was re-stocked
    **/
    Long getAmountOfBread();

}

