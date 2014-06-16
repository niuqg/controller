package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterFeaturesReply;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface GetMeterFeaturesOutput
    extends
    TransactionAware,
    MeterFeaturesReply,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.GetMeterFeaturesOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:statistics","2013-11-11","output")
    ;


}

