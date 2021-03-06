package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import java.beans.ConstructorProperties;


public class MeterRef
 {
    final private InstanceIdentifier<?> _value;

    @ConstructorProperties("value")
    public MeterRef(InstanceIdentifier<?> _value) {
        this._value = _value;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public MeterRef(MeterRef source) {
        this._value = source._value;
    }
    

    public InstanceIdentifier<?> getValue() {
        return _value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_value == null) ? 0 : _value.hashCode());
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
        MeterRef other = (MeterRef) obj;
        if (_value == null) {
            if (other._value != null) {
                return false;
            }
        } else if(!_value.equals(other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("MeterRef [");
        boolean first = true;
    
        if (_value != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_value=");
            builder.append(_value);
         }
        return builder.append(']').toString();
    }



}
