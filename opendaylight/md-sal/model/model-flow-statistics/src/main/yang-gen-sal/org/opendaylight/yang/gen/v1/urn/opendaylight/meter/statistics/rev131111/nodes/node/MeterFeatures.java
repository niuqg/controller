package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.NodeMeterFeatures;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterFeaturesReply;
import org.opendaylight.yangtools.yang.common.QName;


public interface MeterFeatures
    extends
    ChildOf<NodeMeterFeatures>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.MeterFeatures>,
    MeterFeaturesReply
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:statistics","2013-11-11","meter-features")
    ;


}

