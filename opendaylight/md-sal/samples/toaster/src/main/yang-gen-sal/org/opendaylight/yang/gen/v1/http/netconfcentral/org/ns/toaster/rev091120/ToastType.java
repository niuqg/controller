package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yangtools.yang.binding.BaseIdentity;
import org.opendaylight.yangtools.yang.common.QName;


/**
  Base for all bread types supported by the toaster.
             New bread types not listed here nay be added in the 
             future.
**/
public abstract class ToastType extends BaseIdentity
 {
    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://netconfcentral.org/ns/toaster","2009-11-20","toast-type")
    ;

    public ToastType() {
    }
    







}
