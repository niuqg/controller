package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.Buckets;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupTypes;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface Group
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:types","2013-10-18","group")
    ;

    /**
    **/
    Boolean isBarrier();
    
    Buckets getBuckets();
    
    /**
    **/
    String getContainerName();
    
    /**
    **/
    GroupId getGroupId();
    
    /**
    **/
    String getGroupName();
    
    /**
    **/
    GroupTypes getGroupType();

}

