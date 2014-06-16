package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types.MatchType;


/**
**/
public class MatchTypeKey
 implements Identifier<MatchType> {
    private static final long serialVersionUID = 6535740589726064393L; 
    final private String _match;

    public MatchTypeKey(String _match) {
        this._match = _match;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public MatchTypeKey(MatchTypeKey source) {
        this._match = source._match;
    }
    

    public String getMatch() {
        return _match;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_match == null) ? 0 : _match.hashCode());
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
        MatchTypeKey other = (MatchTypeKey) obj;
        if (_match == null) {
            if (other._match != null) {
                return false;
            }
        } else if(!_match.equals(other._match)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("MatchTypeKey [");
        boolean first = true;
    
        if (_match != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_match=");
            builder.append(_match);
         }
        return builder.append(']').toString();
    }



}
