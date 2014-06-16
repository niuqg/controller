package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.BucketId;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter;


/**
**/
public class BucketCounterKey
 implements Identifier<BucketCounter> {
    private static final long serialVersionUID = -4824245750804429800L; 
    final private BucketId _bucketId;

    public BucketCounterKey(BucketId _bucketId) {
        this._bucketId = _bucketId;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public BucketCounterKey(BucketCounterKey source) {
        this._bucketId = source._bucketId;
    }
    

    public BucketId getBucketId() {
        return _bucketId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_bucketId == null) ? 0 : _bucketId.hashCode());
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        BucketCounterKey other = (BucketCounterKey) obj;
        if (_bucketId == null) {
            if (other._bucketId != null) {
                return false;
            }
        } else if(!_bucketId.equals(other._bucketId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("BucketCounterKey [");
        boolean first = true;
    
        if (_bucketId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_bucketId=");
            builder.append(_bucketId);
         }
        return builder.append(']').toString();
    }



}
