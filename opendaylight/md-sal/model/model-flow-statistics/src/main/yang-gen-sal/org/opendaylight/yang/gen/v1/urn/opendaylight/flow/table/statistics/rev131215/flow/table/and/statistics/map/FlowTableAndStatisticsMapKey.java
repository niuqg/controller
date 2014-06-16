package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableId;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map.FlowTableAndStatisticsMap;


/**
**/
public class FlowTableAndStatisticsMapKey
 implements Identifier<FlowTableAndStatisticsMap> {
    private static final long serialVersionUID = -7334829098556580475L; 
    final private TableId _tableId;

    public FlowTableAndStatisticsMapKey(TableId _tableId) {
        this._tableId = _tableId;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public FlowTableAndStatisticsMapKey(FlowTableAndStatisticsMapKey source) {
        this._tableId = source._tableId;
    }
    

    public TableId getTableId() {
        return _tableId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_tableId == null) ? 0 : _tableId.hashCode());
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
        FlowTableAndStatisticsMapKey other = (FlowTableAndStatisticsMapKey) obj;
        if (_tableId == null) {
            if (other._tableId != null) {
                return false;
            }
        } else if(!_tableId.equals(other._tableId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("FlowTableAndStatisticsMapKey [");
        boolean first = true;
    
        if (_tableId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_tableId=");
            builder.append(_tableId);
         }
        return builder.append(']').toString();
    }



}
