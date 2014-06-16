package org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.MacAddress;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2Address;


/**
**/
public class L2AddressKey
 implements Identifier<L2Address> {
    private static final long serialVersionUID = -5837212634550685456L; 
    final private MacAddress _mac;

    public L2AddressKey(MacAddress _mac) {
        this._mac = _mac;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public L2AddressKey(L2AddressKey source) {
        this._mac = source._mac;
    }
    

    public MacAddress getMac() {
        return _mac;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_mac == null) ? 0 : _mac.hashCode());
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
        L2AddressKey other = (L2AddressKey) obj;
        if (_mac == null) {
            if (other._mac != null) {
                return false;
            }
        } else if(!_mac.equals(other._mac)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("L2AddressKey [");
        boolean first = true;
    
        if (_mac != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_mac=");
            builder.append(_mac);
         }
        return builder.append(']').toString();
    }



}
