package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.actions;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.actions.ActionType;


/**
**/
public class ActionTypeKey
 implements Identifier<ActionType> {
    private static final long serialVersionUID = -4982690669018752470L; 
    final private String _action;

    public ActionTypeKey(String _action) {
        this._action = _action;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ActionTypeKey(ActionTypeKey source) {
        this._action = source._action;
    }
    

    public String getAction() {
        return _action;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_action == null) ? 0 : _action.hashCode());
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
        ActionTypeKey other = (ActionTypeKey) obj;
        if (_action == null) {
            if (other._action != null) {
                return false;
            }
        } else if(!_action.equals(other._action)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("ActionTypeKey [");
        boolean first = true;
    
        if (_action != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_action=");
            builder.append(_action);
         }
        return builder.append(']').toString();
    }



}
