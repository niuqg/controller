package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.BandId;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader;


/**
**/
public class MeterBandHeaderKey
 implements Identifier<MeterBandHeader> {
    private static final long serialVersionUID = 152871423184362180L; 
    final private BandId _bandId;

    public MeterBandHeaderKey(BandId _bandId) {
        this._bandId = _bandId;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public MeterBandHeaderKey(MeterBandHeaderKey source) {
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
        MeterBandHeaderKey other = (MeterBandHeaderKey) obj;
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
        StringBuilder builder = new StringBuilder("MeterBandHeaderKey [");
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
