package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.meter.MeterStatistics;



public class NodeMeterStatisticsBuilder {

    private MeterStatistics _meterStatistics;


    public NodeMeterStatisticsBuilder() {
    } 


    public MeterStatistics getMeterStatistics() {
        return _meterStatistics;
    }

    public NodeMeterStatisticsBuilder setMeterStatistics(MeterStatistics value) {
    
        this._meterStatistics = value;
        return this;
    }

    public NodeMeterStatistics build() {
        return new NodeMeterStatisticsImpl(this);
    }

    private static final class NodeMeterStatisticsImpl implements NodeMeterStatistics {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.NodeMeterStatistics> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.NodeMeterStatistics.class;
        }

        private final MeterStatistics _meterStatistics;


        private NodeMeterStatisticsImpl(NodeMeterStatisticsBuilder builder) {
            this._meterStatistics = builder.getMeterStatistics();
        }

        @Override
        public MeterStatistics getMeterStatistics() {
            return _meterStatistics;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_meterStatistics == null) ? 0 : _meterStatistics.hashCode());
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
            NodeMeterStatisticsImpl other = (NodeMeterStatisticsImpl) obj;
            if (_meterStatistics == null) {
                if (other._meterStatistics != null) {
                    return false;
                }
            } else if(!_meterStatistics.equals(other._meterStatistics)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("NodeMeterStatistics [");
            boolean first = true;
        
            if (_meterStatistics != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterStatistics=");
                builder.append(_meterStatistics);
             }
            return builder.append(']').toString();
        }
    }

}
