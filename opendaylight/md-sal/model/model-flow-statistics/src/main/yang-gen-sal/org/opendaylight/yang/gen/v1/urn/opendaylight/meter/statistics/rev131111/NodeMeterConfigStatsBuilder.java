package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.meter.MeterConfigStats;



public class NodeMeterConfigStatsBuilder {

    private MeterConfigStats _meterConfigStats;


    public NodeMeterConfigStatsBuilder() {
    } 


    public MeterConfigStats getMeterConfigStats() {
        return _meterConfigStats;
    }

    public NodeMeterConfigStatsBuilder setMeterConfigStats(MeterConfigStats value) {
    
        this._meterConfigStats = value;
        return this;
    }

    public NodeMeterConfigStats build() {
        return new NodeMeterConfigStatsImpl(this);
    }

    private static final class NodeMeterConfigStatsImpl implements NodeMeterConfigStats {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.NodeMeterConfigStats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.NodeMeterConfigStats.class;
        }

        private final MeterConfigStats _meterConfigStats;


        private NodeMeterConfigStatsImpl(NodeMeterConfigStatsBuilder builder) {
            this._meterConfigStats = builder.getMeterConfigStats();
        }

        @Override
        public MeterConfigStats getMeterConfigStats() {
            return _meterConfigStats;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_meterConfigStats == null) ? 0 : _meterConfigStats.hashCode());
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
            NodeMeterConfigStatsImpl other = (NodeMeterConfigStatsImpl) obj;
            if (_meterConfigStats == null) {
                if (other._meterConfigStats != null) {
                    return false;
                }
            } else if(!_meterConfigStats.equals(other._meterConfigStats)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("NodeMeterConfigStats [");
            boolean first = true;
        
            if (_meterConfigStats != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterConfigStats=");
                builder.append(_meterConfigStats);
             }
            return builder.append(']').toString();
        }
    }

}
