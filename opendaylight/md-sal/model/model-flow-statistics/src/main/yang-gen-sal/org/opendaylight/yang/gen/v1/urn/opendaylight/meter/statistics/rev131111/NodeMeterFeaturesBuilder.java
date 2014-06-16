package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.MeterFeatures;



public class NodeMeterFeaturesBuilder {

    private MeterFeatures _meterFeatures;


    public NodeMeterFeaturesBuilder() {
    } 


    public MeterFeatures getMeterFeatures() {
        return _meterFeatures;
    }

    public NodeMeterFeaturesBuilder setMeterFeatures(MeterFeatures value) {
    
        this._meterFeatures = value;
        return this;
    }

    public NodeMeterFeatures build() {
        return new NodeMeterFeaturesImpl(this);
    }

    private static final class NodeMeterFeaturesImpl implements NodeMeterFeatures {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.NodeMeterFeatures> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.NodeMeterFeatures.class;
        }

        private final MeterFeatures _meterFeatures;


        private NodeMeterFeaturesImpl(NodeMeterFeaturesBuilder builder) {
            this._meterFeatures = builder.getMeterFeatures();
        }

        @Override
        public MeterFeatures getMeterFeatures() {
            return _meterFeatures;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_meterFeatures == null) ? 0 : _meterFeatures.hashCode());
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
            NodeMeterFeaturesImpl other = (NodeMeterFeaturesImpl) obj;
            if (_meterFeatures == null) {
                if (other._meterFeatures != null) {
                    return false;
                }
            } else if(!_meterFeatures.equals(other._meterFeatures)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("NodeMeterFeatures [");
            boolean first = true;
        
            if (_meterFeatures != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterFeatures=");
                builder.append(_meterFeatures);
             }
            return builder.append(']').toString();
        }
    }

}
