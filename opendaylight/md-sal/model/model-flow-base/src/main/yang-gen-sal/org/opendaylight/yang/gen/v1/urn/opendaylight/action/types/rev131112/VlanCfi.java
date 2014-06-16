package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112;
import java.beans.ConstructorProperties;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;


public class VlanCfi
 {
    final private Integer _value;

    @ConstructorProperties("value")
    public VlanCfi(Integer _value) {
        if (_value != null) {
            boolean isValidRange = false;
            List<Range<Integer>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Integer("-2147483648"), new Integer("2147483647")));
            for (Range<Integer> r : rangeConstraints) {
                if (r.contains(_value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", _value, rangeConstraints));
            }
        }
        this._value = _value;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VlanCfi(VlanCfi source) {
        this._value = source._value;
    }
    
    public static VlanCfi getDefaultInstance(String defaultValue) {
        return new VlanCfi(new Integer(defaultValue));
    }

    public Integer getValue() {
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
        VlanCfi other = (VlanCfi) obj;
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
        StringBuilder builder = new StringBuilder("VlanCfi [");
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


    public static List<Range<Integer>> range() {
        final List<Range<Integer>> result = new ArrayList<>();
        result.add(Range.closed(new Integer("-2147483648"), new Integer("2147483647")));
        return result;
    }

}
