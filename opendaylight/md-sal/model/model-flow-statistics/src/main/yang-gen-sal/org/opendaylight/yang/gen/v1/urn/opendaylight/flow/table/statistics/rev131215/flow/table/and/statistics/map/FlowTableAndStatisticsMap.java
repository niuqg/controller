package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map.FlowTableAndStatisticsMapKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericTableStatistics;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface FlowTableAndStatisticsMap
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.FlowTableAndStatisticsMap>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map.FlowTableAndStatisticsMap>,
    GenericTableStatistics,
    Identifiable<FlowTableAndStatisticsMapKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:table:statistics","2013-12-15","flow-table-and-statistics-map")
    ;

    /**
    **/
    TableId getTableId();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    FlowTableAndStatisticsMapKey getKey();

}

