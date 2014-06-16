package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.ordered.container;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.ordered.container.OrderedList;


/**
**/
public class OrderedListKey
 implements Identifier<OrderedList> {
    private static final long serialVersionUID = -6041381712785826235L; 
    final private String _name;

    public OrderedListKey(String _name) {
        this._name = _name;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public OrderedListKey(OrderedListKey source) {
        this._name = source._name;
    }
    

    public String getName() {
        return _name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_name == null) ? 0 : _name.hashCode());
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
        OrderedListKey other = (OrderedListKey) obj;
        if (_name == null) {
            if (other._name != null) {
                return false;
            }
        } else if(!_name.equals(other._name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("OrderedListKey [");
        boolean first = true;
    
        if (_name != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_name=");
            builder.append(_name);
         }
        return builder.append(']').toString();
    }



}
