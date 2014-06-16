package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.BucketId;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounterKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.Buckets;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface BucketCounter
    extends
    ChildOf<Buckets>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>,
    Identifiable<BucketCounterKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:types","2013-10-18","bucket-counter")
    ;

    /**
    **/
    BucketId getBucketId();
    
    /**
    **/
    Counter64 getByteCount();
    
    /**
    **/
    Counter64 getPacketCount();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    BucketCounterKey getKey();

}

