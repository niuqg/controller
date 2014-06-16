package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterId;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats;


/**
**/
public class MeterConfigStatsKey
 implements Identifier<MeterConfigStats> {
    private static final long serialVersionUID = 4729991942588377006L; 
    final private MeterId _meterId;

    public MeterConfigStatsKey(MeterId _meterId) {
        this._meterId = _meterId;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public MeterConfigStatsKey(MeterConfigStatsKey source) {
        this._meterId = source._meterId;
    }
    

    public MeterId getMeterId() {
        return _meterId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_meterId == null) ? 0 : _meterId.hashCode());
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
        MeterConfigStatsKey other = (MeterConfigStatsKey) obj;
        if (_meterId == null) {
            if (other._meterId != null) {
                return false;
            }
        } else if(!_meterId.equals(other._meterId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("MeterConfigStatsKey [");
        boolean first = true;
    
        if (_meterId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_meterId=");
            builder.append(_meterId);
         }
        return builder.append(']').toString();
    }



}
