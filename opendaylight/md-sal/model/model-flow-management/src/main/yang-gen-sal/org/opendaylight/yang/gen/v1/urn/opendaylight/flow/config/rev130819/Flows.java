package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.flows.Flow;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.FlowManagementData;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Flows
    extends
    ChildOf<FlowManagementData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.Flows>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:config","2013-08-19","flows")
    ;

    List<Flow> getFlow();

}

