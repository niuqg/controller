package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStatsKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatisticsRequest;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface GroupStats
    extends
    ChildOf<GroupStatisticsRequest>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStats>,
    Identifiable<GroupStatsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:types","2013-10-18","group-stats")
    ;

    /**
    **/
    GroupId getGroupId();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    GroupStatsKey getKey();

}

