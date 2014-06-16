package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface MeterFeatures
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","meter-features")
    ;

    /**
    **/
    Short getMaxBands();
    
    /**
    **/
    Short getMaxColor();
    
    /**
    **/
    Counter32 getMaxMeter();
    
    /**
    **/
    List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterBand>> getMeterBandSupported();
    
    /**
    **/
    List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterCapability>> getMeterCapabilitiesSupported();

}

