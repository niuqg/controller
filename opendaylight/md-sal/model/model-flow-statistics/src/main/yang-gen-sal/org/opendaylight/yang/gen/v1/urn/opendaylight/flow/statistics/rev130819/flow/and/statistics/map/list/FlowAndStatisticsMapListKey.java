package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.flow.and.statistics.map.list;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.FlowId;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.flow.and.statistics.map.list.FlowAndStatisticsMapList;


/**
**/
public class FlowAndStatisticsMapListKey
 implements Identifier<FlowAndStatisticsMapList> {
    private static final long serialVersionUID = 5825993952015829017L; 
    final private FlowId _flowId;

    public FlowAndStatisticsMapListKey(FlowId _flowId) {
        this._flowId = _flowId;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public FlowAndStatisticsMapListKey(FlowAndStatisticsMapListKey source) {
        this._flowId = source._flowId;
    }
    

    public FlowId getFlowId() {
        return _flowId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_flowId == null) ? 0 : _flowId.hashCode());
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
        FlowAndStatisticsMapListKey other = (FlowAndStatisticsMapListKey) obj;
        if (_flowId == null) {
            if (other._flowId != null) {
                return false;
            }
        } else if(!_flowId.equals(other._flowId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("FlowAndStatisticsMapListKey [");
        boolean first = true;
    
        if (_flowId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_flowId=");
            builder.append(_flowId);
         }
        return builder.append(']').toString();
    }



}
