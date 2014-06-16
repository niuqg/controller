package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114;
import java.beans.ConstructorProperties;


public class QName
 {
    final private String _value;

    @ConstructorProperties("value")
    public QName(String _value) {
        this._value = _value;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public QName(QName source) {
        this._value = source._value;
    }
    
    public static QName getDefaultInstance(String defaultValue) {
        return new QName(defaultValue);
    }

    public String getValue() {
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
        QName other = (QName) obj;
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
        StringBuilder builder = new StringBuilder("QName [");
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
