package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918;
import java.util.List;
import com.google.common.collect.Lists;


/**
**/
public class MeterBandType
 {
    final private Boolean _ofpmbtDrop;
    final private Boolean _ofpmbtDscpRemark;
    final private Boolean _ofpmbtExperimenter;

    public MeterBandType(Boolean _ofpmbtDrop, Boolean _ofpmbtDscpRemark, Boolean _ofpmbtExperimenter) {
        this._ofpmbtDrop = _ofpmbtDrop;
        this._ofpmbtDscpRemark = _ofpmbtDscpRemark;
        this._ofpmbtExperimenter = _ofpmbtExperimenter;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public MeterBandType(MeterBandType source) {
        this._ofpmbtDrop = source._ofpmbtDrop;
        this._ofpmbtDscpRemark = source._ofpmbtDscpRemark;
        this._ofpmbtExperimenter = source._ofpmbtExperimenter;
    }
    
    public static MeterBandType getDefaultInstance(String defaultValue) {
        List<String> properties = Lists.newArrayList("ofpmbtDrop",
        "ofpmbtDscpRemark",
        "ofpmbtExperimenter"
        );
        if (!properties.contains(defaultValue)) {
            throw new IllegalArgumentException("invalid default parameter");
        }
        int i = 0;
        return new MeterBandType(
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null
        );
    }

    public Boolean isOfpmbtDrop() {
        return _ofpmbtDrop;
    }
    
    public Boolean isOfpmbtDscpRemark() {
        return _ofpmbtDscpRemark;
    }
    
    public Boolean isOfpmbtExperimenter() {
        return _ofpmbtExperimenter;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_ofpmbtDrop == null) ? 0 : _ofpmbtDrop.hashCode());
        result = prime * result + ((_ofpmbtDscpRemark == null) ? 0 : _ofpmbtDscpRemark.hashCode());
        result = prime * result + ((_ofpmbtExperimenter == null) ? 0 : _ofpmbtExperimenter.hashCode());
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
        MeterBandType other = (MeterBandType) obj;
        if (_ofpmbtDrop == null) {
            if (other._ofpmbtDrop != null) {
                return false;
            }
        } else if(!_ofpmbtDrop.equals(other._ofpmbtDrop)) {
            return false;
        }
        if (_ofpmbtDscpRemark == null) {
            if (other._ofpmbtDscpRemark != null) {
                return false;
            }
        } else if(!_ofpmbtDscpRemark.equals(other._ofpmbtDscpRemark)) {
            return false;
        }
        if (_ofpmbtExperimenter == null) {
            if (other._ofpmbtExperimenter != null) {
                return false;
            }
        } else if(!_ofpmbtExperimenter.equals(other._ofpmbtExperimenter)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("MeterBandType [");
        boolean first = true;
    
        if (_ofpmbtDrop != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_ofpmbtDrop=");
            builder.append(_ofpmbtDrop);
         }
        if (_ofpmbtDscpRemark != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_ofpmbtDscpRemark=");
            builder.append(_ofpmbtDscpRemark);
         }
        if (_ofpmbtExperimenter != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_ofpmbtExperimenter=");
            builder.append(_ofpmbtExperimenter);
         }
        return builder.append(']').toString();
    }



}
