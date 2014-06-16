package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.BandId;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat;


/**
**/
public class BandStatKey
 implements Identifier<BandStat> {
    private static final long serialVersionUID = 3988577422675095624L; 
    final private BandId _bandId;

    public BandStatKey(BandId _bandId) {
        this._bandId = _bandId;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public BandStatKey(BandStatKey source) {
        this._bandId = source._bandId;
    }
    

    public BandId getBandId() {
        return _bandId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_bandId == null) ? 0 : _bandId.hashCode());
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
        BandStatKey other = (BandStatKey) obj;
        if (_bandId == null) {
            if (other._bandId != null) {
                return false;
            }
        } else if(!_bandId.equals(other._bandId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("BandStatKey [");
        boolean first = true;
    
        if (_bandId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_bandId=");
            builder.append(_bandId);
         }
        return builder.append(']').toString();
    }



}
