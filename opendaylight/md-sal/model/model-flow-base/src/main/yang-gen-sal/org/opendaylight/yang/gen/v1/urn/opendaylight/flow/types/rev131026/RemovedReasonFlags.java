package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026;
import java.util.List;
import com.google.common.collect.Lists;


/**
**/
public class RemovedReasonFlags
 {
    final private Boolean _iDLETIMEOUT;
    final private Boolean _hARDTIMEOUT;
    final private Boolean _dELETE;
    final private Boolean _gROUPDELETE;

    public RemovedReasonFlags(Boolean _dELETE, Boolean _gROUPDELETE, Boolean _hARDTIMEOUT, Boolean _iDLETIMEOUT) {
        this._iDLETIMEOUT = _iDLETIMEOUT;
        this._hARDTIMEOUT = _hARDTIMEOUT;
        this._dELETE = _dELETE;
        this._gROUPDELETE = _gROUPDELETE;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public RemovedReasonFlags(RemovedReasonFlags source) {
        this._iDLETIMEOUT = source._iDLETIMEOUT;
        this._hARDTIMEOUT = source._hARDTIMEOUT;
        this._dELETE = source._dELETE;
        this._gROUPDELETE = source._gROUPDELETE;
    }
    
    public static RemovedReasonFlags getDefaultInstance(String defaultValue) {
        List<String> properties = Lists.newArrayList("dELETE",
        "gROUPDELETE",
        "hARDTIMEOUT",
        "iDLETIMEOUT"
        );
        if (!properties.contains(defaultValue)) {
            throw new IllegalArgumentException("invalid default parameter");
        }
        int i = 0;
        return new RemovedReasonFlags(
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null
        );
    }

    public Boolean isIDLETIMEOUT() {
        return _iDLETIMEOUT;
    }
    
    public Boolean isHARDTIMEOUT() {
        return _hARDTIMEOUT;
    }
    
    public Boolean isDELETE() {
        return _dELETE;
    }
    
    public Boolean isGROUPDELETE() {
        return _gROUPDELETE;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_iDLETIMEOUT == null) ? 0 : _iDLETIMEOUT.hashCode());
        result = prime * result + ((_hARDTIMEOUT == null) ? 0 : _hARDTIMEOUT.hashCode());
        result = prime * result + ((_dELETE == null) ? 0 : _dELETE.hashCode());
        result = prime * result + ((_gROUPDELETE == null) ? 0 : _gROUPDELETE.hashCode());
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
        RemovedReasonFlags other = (RemovedReasonFlags) obj;
        if (_iDLETIMEOUT == null) {
            if (other._iDLETIMEOUT != null) {
                return false;
            }
        } else if(!_iDLETIMEOUT.equals(other._iDLETIMEOUT)) {
            return false;
        }
        if (_hARDTIMEOUT == null) {
            if (other._hARDTIMEOUT != null) {
                return false;
            }
        } else if(!_hARDTIMEOUT.equals(other._hARDTIMEOUT)) {
            return false;
        }
        if (_dELETE == null) {
            if (other._dELETE != null) {
                return false;
            }
        } else if(!_dELETE.equals(other._dELETE)) {
            return false;
        }
        if (_gROUPDELETE == null) {
            if (other._gROUPDELETE != null) {
                return false;
            }
        } else if(!_gROUPDELETE.equals(other._gROUPDELETE)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("RemovedReasonFlags [");
        boolean first = true;
    
        if (_iDLETIMEOUT != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_iDLETIMEOUT=");
            builder.append(_iDLETIMEOUT);
         }
        if (_hARDTIMEOUT != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_hARDTIMEOUT=");
            builder.append(_hARDTIMEOUT);
         }
        if (_dELETE != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_dELETE=");
            builder.append(_dELETE);
         }
        if (_gROUPDELETE != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_gROUPDELETE=");
            builder.append(_gROUPDELETE);
         }
        return builder.append(']').toString();
    }



}
