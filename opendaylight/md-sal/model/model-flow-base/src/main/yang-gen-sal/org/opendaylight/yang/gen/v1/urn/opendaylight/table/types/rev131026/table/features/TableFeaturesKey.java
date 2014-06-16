package org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures;


/**
**/
public class TableFeaturesKey
 implements Identifier<TableFeatures> {
    private static final long serialVersionUID = -3227054141154674956L; 
    final private Short _tableId;

    public TableFeaturesKey(Short _tableId) {
        this._tableId = _tableId;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public TableFeaturesKey(TableFeaturesKey source) {
        this._tableId = source._tableId;
    }
    

    public Short getTableId() {
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
        TableFeaturesKey other = (TableFeaturesKey) obj;
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
        StringBuilder builder = new StringBuilder("TableFeaturesKey [");
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
