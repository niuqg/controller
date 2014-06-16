package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.BucketId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.BucketKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.Buckets;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Bucket
    extends
    ChildOf<Buckets>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>,
    ActionList,
    Identifiable<BucketKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:types","2013-10-18","bucket")
    ;

    /**
    **/
    BucketId getBucketId();
    
    /**
    **/
    Long getWatchGroup();
    
    /**
    **/
    Long getWatchPort();
    
    /**
    **/
    Integer getWeight();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    BucketKey getKey();

}

