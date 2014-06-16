package org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatch;


/**
**/
public class SetFieldMatchKey
 implements Identifier<SetFieldMatch> {
    private static final long serialVersionUID = -9110781582720042164L; 
    final private Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.MatchField> _matchType;

    public SetFieldMatchKey(Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.MatchField> _matchType) {
        this._matchType = _matchType;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SetFieldMatchKey(SetFieldMatchKey source) {
        this._matchType = source._matchType;
    }
    

    public Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.MatchField> getMatchType() {
        return _matchType;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_matchType == null) ? 0 : _matchType.hashCode());
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
        SetFieldMatchKey other = (SetFieldMatchKey) obj;
        if (_matchType == null) {
            if (other._matchType != null) {
                return false;
            }
        } else if(!_matchType.equals(other._matchType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("SetFieldMatchKey [");
        boolean first = true;
    
        if (_matchType != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_matchType=");
            builder.append(_matchType);
         }
        return builder.append(']').toString();
    }



}
