package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStatsKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatisticsReply;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface GroupStats
    extends
    ChildOf<GroupStatisticsReply>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats>,
    GroupStatistics,
    Identifiable<GroupStatsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:types","2013-10-18","group-stats")
    ;

    /**
      Returns Primary Key of Yang List Type
    **/
    GroupStatsKey getKey();

}

