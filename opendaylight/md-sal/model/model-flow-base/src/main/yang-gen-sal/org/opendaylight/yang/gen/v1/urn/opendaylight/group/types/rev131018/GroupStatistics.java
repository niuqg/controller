package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.Buckets;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.Duration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupId;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface GroupStatistics
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:types","2013-10-18","group-statistics")
    ;

    Buckets getBuckets();
    
    /**
    **/
    Counter64 getByteCount();
    
    Duration getDuration();
    
    /**
    **/
    GroupId getGroupId();
    
    /**
    **/
    Counter64 getPacketCount();
    
    /**
    **/
    Counter32 getRefCount();

}

