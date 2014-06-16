package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface MakeToastInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://netconfcentral.org/ns/toaster","2009-11-20","input")
    ;

    /**
      This variable controls how well-done is the 
                         ensuing toast. It should be on a scale of 1 to 10.
                         Toast made at 10 generally is considered unfit 
                         for human consumption; toast made at 1 is warmed 
                         lightly.
    **/
    Long getToasterDoneness();
    
    /**
      This variable informs the toaster of the type of 
                         material that is being toasted. The toaster 
                         uses this information, combined with 
                         toasterDoneness, to compute for how 
                         long the material must be toasted to achieve 
                         the required doneness.
    **/
    Class<? extends org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToastType> getToasterToastType();

}

