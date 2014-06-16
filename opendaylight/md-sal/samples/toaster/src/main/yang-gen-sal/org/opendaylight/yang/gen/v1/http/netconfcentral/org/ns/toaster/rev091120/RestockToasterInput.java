package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface RestockToasterInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://netconfcentral.org/ns/toaster","2009-11-20","input")
    ;

    /**
      Indicates the amount of bread to re-stock
    **/
    Long getAmountOfBreadToStock();

}

