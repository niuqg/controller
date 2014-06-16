package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEvent;


/**
**/
public class DataChangeEventKey
 implements Identifier<DataChangeEvent> {
    private static final long serialVersionUID = -1510231766583606723L; 
    final private InstanceIdentifier<?> _path;

    public DataChangeEventKey(InstanceIdentifier<?> _path) {
        this._path = _path;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public DataChangeEventKey(DataChangeEventKey source) {
        this._path = source._path;
    }
    

    public InstanceIdentifier<?> getPath() {
        return _path;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_path == null) ? 0 : _path.hashCode());
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
        DataChangeEventKey other = (DataChangeEventKey) obj;
        if (_path == null) {
            if (other._path != null) {
                return false;
            }
        } else if(!_path.equals(other._path)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("DataChangeEventKey [");
        boolean first = true;
    
        if (_path != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_path=");
            builder.append(_path);
         }
        return builder.append(']').toString();
    }



}
