package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface AggregateTopology
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:topology:view","2013-10-30","aggregate-topology")
    ;

    /**
    **/
    List<TopologyId> getOriginalTopology();

}

