package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
  List of flow and statistics map
**/
public interface FlowAndStatisticsMapList
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:statistics","2013-08-19","flow-and-statistics-map-list")
    ;

    List<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.flow.and.statistics.map.list.FlowAndStatisticsMapList> getFlowAndStatisticsMapList();

}

