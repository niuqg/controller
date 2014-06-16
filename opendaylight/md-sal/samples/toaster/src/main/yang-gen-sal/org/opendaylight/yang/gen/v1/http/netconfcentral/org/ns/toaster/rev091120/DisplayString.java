package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import java.beans.ConstructorProperties;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;


/**
  YANG version of the SMIv2 DisplayString TEXTUAL-CONVENTION.
**/
public class DisplayString
 {
    final private String _value;

    @ConstructorProperties("value")
    public DisplayString(String _value) {
        if (_value != null) {
            boolean isValidLength = false;
            List<Range<Integer>> lengthConstraints = new ArrayList<>(); 
            lengthConstraints.add(Range.closed(0, 255));
            for (Range<Integer> r : lengthConstraints) {
                if (r.contains(_value.length())) {
                isValidLength = true;
                }
            }
            if (!isValidLength) {
                throw new IllegalArgumentException(String.format("Invalid length: {}, expected: {}.", _value, lengthConstraints));
            }
        }
        this._value = _value;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public DisplayString(DisplayString source) {
        this._value = source._value;
    }
    
    public static DisplayString getDefaultInstance(String defaultValue) {
        return new DisplayString(defaultValue);
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
        DisplayString other = (DisplayString) obj;
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
        StringBuilder builder = new StringBuilder("DisplayString [");
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

    public static List<Range<Long>> length() {
        final List<Range<Long>> result = new ArrayList<>();
        result.add(Range.closed(new Long("0"), new Long("255")));
        return result;
    }


}
