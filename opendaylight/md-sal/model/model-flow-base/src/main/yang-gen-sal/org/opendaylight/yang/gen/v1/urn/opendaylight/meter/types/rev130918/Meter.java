package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterFlags;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.MeterBandHeaders;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterId;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface Meter
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","meter")
    ;

    /**
      If true, barrier message is sent
    **/
    Boolean isBarrier();
    
    /**
      Name of container
    **/
    String getContainerName();
    
    /**
      Meter configuration flags
    **/
    MeterFlags getFlags();
    
    MeterBandHeaders getMeterBandHeaders();
    
    /**
      Meter instance
    **/
    MeterId getMeterId();
    
    /**
      Name of meter instance
    **/
    String getMeterName();

}

