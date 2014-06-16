package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.MeterAdded;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.MeterRemoved;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.MeterUpdated;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
**/
public interface SalMeterListener
    extends
    NotificationListener
{




    void onMeterAdded(MeterAdded notification);
    
    void onMeterRemoved(MeterRemoved notification);
    
    void onMeterUpdated(MeterUpdated notification);

}

