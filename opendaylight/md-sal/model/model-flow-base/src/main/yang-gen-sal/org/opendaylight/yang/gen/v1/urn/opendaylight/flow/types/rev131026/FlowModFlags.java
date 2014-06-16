package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026;
import java.util.List;
import com.google.common.collect.Lists;


/**
**/
public class FlowModFlags
 {
    final private Boolean _cHECKOVERLAP;
    final private Boolean _rESETCOUNTS;
    final private Boolean _nOPKTCOUNTS;
    final private Boolean _nOBYTCOUNTS;
    final private Boolean _sENDFLOWREM;

    public FlowModFlags(Boolean _cHECKOVERLAP, Boolean _nOBYTCOUNTS, Boolean _nOPKTCOUNTS, Boolean _rESETCOUNTS, Boolean _sENDFLOWREM) {
        this._cHECKOVERLAP = _cHECKOVERLAP;
        this._rESETCOUNTS = _rESETCOUNTS;
        this._nOPKTCOUNTS = _nOPKTCOUNTS;
        this._nOBYTCOUNTS = _nOBYTCOUNTS;
        this._sENDFLOWREM = _sENDFLOWREM;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public FlowModFlags(FlowModFlags source) {
        this._cHECKOVERLAP = source._cHECKOVERLAP;
        this._rESETCOUNTS = source._rESETCOUNTS;
        this._nOPKTCOUNTS = source._nOPKTCOUNTS;
        this._nOBYTCOUNTS = source._nOBYTCOUNTS;
        this._sENDFLOWREM = source._sENDFLOWREM;
    }
    
    public static FlowModFlags getDefaultInstance(String defaultValue) {
        List<String> properties = Lists.newArrayList("cHECKOVERLAP",
        "nOBYTCOUNTS",
        "nOPKTCOUNTS",
        "rESETCOUNTS",
        "sENDFLOWREM"
        );
        if (!properties.contains(defaultValue)) {
            throw new IllegalArgumentException("invalid default parameter");
        }
        int i = 0;
        return new FlowModFlags(
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null
        );
    }

    public Boolean isCHECKOVERLAP() {
        return _cHECKOVERLAP;
    }
    
    public Boolean isRESETCOUNTS() {
        return _rESETCOUNTS;
    }
    
    public Boolean isNOPKTCOUNTS() {
        return _nOPKTCOUNTS;
    }
    
    public Boolean isNOBYTCOUNTS() {
        return _nOBYTCOUNTS;
    }
    
    public Boolean isSENDFLOWREM() {
        return _sENDFLOWREM;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_cHECKOVERLAP == null) ? 0 : _cHECKOVERLAP.hashCode());
        result = prime * result + ((_rESETCOUNTS == null) ? 0 : _rESETCOUNTS.hashCode());
        result = prime * result + ((_nOPKTCOUNTS == null) ? 0 : _nOPKTCOUNTS.hashCode());
        result = prime * result + ((_nOBYTCOUNTS == null) ? 0 : _nOBYTCOUNTS.hashCode());
        result = prime * result + ((_sENDFLOWREM == null) ? 0 : _sENDFLOWREM.hashCode());
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
        FlowModFlags other = (FlowModFlags) obj;
        if (_cHECKOVERLAP == null) {
            if (other._cHECKOVERLAP != null) {
                return false;
            }
        } else if(!_cHECKOVERLAP.equals(other._cHECKOVERLAP)) {
            return false;
        }
        if (_rESETCOUNTS == null) {
            if (other._rESETCOUNTS != null) {
                return false;
            }
        } else if(!_rESETCOUNTS.equals(other._rESETCOUNTS)) {
            return false;
        }
        if (_nOPKTCOUNTS == null) {
            if (other._nOPKTCOUNTS != null) {
                return false;
            }
        } else if(!_nOPKTCOUNTS.equals(other._nOPKTCOUNTS)) {
            return false;
        }
        if (_nOBYTCOUNTS == null) {
            if (other._nOBYTCOUNTS != null) {
                return false;
            }
        } else if(!_nOBYTCOUNTS.equals(other._nOBYTCOUNTS)) {
            return false;
        }
        if (_sENDFLOWREM == null) {
            if (other._sENDFLOWREM != null) {
                return false;
            }
        } else if(!_sENDFLOWREM.equals(other._sENDFLOWREM)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("FlowModFlags [");
        boolean first = true;
    
        if (_cHECKOVERLAP != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_cHECKOVERLAP=");
            builder.append(_cHECKOVERLAP);
         }
        if (_rESETCOUNTS != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_rESETCOUNTS=");
            builder.append(_rESETCOUNTS);
         }
        if (_nOPKTCOUNTS != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_nOPKTCOUNTS=");
            builder.append(_nOPKTCOUNTS);
         }
        if (_nOBYTCOUNTS != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_nOBYTCOUNTS=");
            builder.append(_nOBYTCOUNTS);
         }
        if (_sENDFLOWREM != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_sENDFLOWREM=");
            builder.append(_sENDFLOWREM);
         }
        return builder.append(']').toString();
    }



}
