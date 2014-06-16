package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.Table;


/**
**/
public class TableKey
 implements Identifier<Table> {
    private static final long serialVersionUID = -2668392223442046077L; 
    final private Short _id;

    public TableKey(Short _id) {
        this._id = _id;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public TableKey(TableKey source) {
        this._id = source._id;
    }
    

    public Short getId() {
        return _id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_id == null) ? 0 : _id.hashCode());
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
        TableKey other = (TableKey) obj;
        if (_id == null) {
            if (other._id != null) {
                return false;
            }
        } else if(!_id.equals(other._id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("TableKey [");
        boolean first = true;
    
        if (_id != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_id=");
            builder.append(_id);
         }
        return builder.append(']').toString();
    }



}
