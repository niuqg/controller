package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.meter.MeterConfigStats;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.meters.Meter;


/**
**/
public interface NodeMeterConfigStats
    extends
    DataObject,
    Augmentation<Meter>
{




    MeterConfigStats getMeterConfigStats();

}

