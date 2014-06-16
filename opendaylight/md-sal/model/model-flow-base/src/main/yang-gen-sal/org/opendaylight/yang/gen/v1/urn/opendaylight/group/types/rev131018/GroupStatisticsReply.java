package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface GroupStatisticsReply
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:types","2013-10-18","group-statistics-reply")
    ;

    List<GroupStats> getGroupStats();

}

