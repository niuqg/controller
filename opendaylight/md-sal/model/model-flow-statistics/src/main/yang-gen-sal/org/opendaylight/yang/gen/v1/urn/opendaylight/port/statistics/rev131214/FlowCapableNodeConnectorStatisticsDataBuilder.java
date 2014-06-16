package org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.flow.capable.node.connector.statistics.FlowCapableNodeConnectorStatistics;
import org.opendaylight.yangtools.yang.binding.DataObject;



public class FlowCapableNodeConnectorStatisticsDataBuilder {

    private FlowCapableNodeConnectorStatistics _flowCapableNodeConnectorStatistics;


    public FlowCapableNodeConnectorStatisticsDataBuilder() {
    } 
    
    public FlowCapableNodeConnectorStatisticsDataBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.FlowCapableNodeConnectorStatistics arg) {
        this._flowCapableNodeConnectorStatistics = arg.getFlowCapableNodeConnectorStatistics();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.FlowCapableNodeConnectorStatistics</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.FlowCapableNodeConnectorStatistics) {
            this._flowCapableNodeConnectorStatistics = ((org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.FlowCapableNodeConnectorStatistics)arg).getFlowCapableNodeConnectorStatistics();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.FlowCapableNodeConnectorStatistics] \n" +
              "but was: " + arg
            );
        }
    }

    public FlowCapableNodeConnectorStatistics getFlowCapableNodeConnectorStatistics() {
        return _flowCapableNodeConnectorStatistics;
    }

    public FlowCapableNodeConnectorStatisticsDataBuilder setFlowCapableNodeConnectorStatistics(FlowCapableNodeConnectorStatistics value) {
    
        this._flowCapableNodeConnectorStatistics = value;
        return this;
    }

    public FlowCapableNodeConnectorStatisticsData build() {
        return new FlowCapableNodeConnectorStatisticsDataImpl(this);
    }

    private static final class FlowCapableNodeConnectorStatisticsDataImpl implements FlowCapableNodeConnectorStatisticsData {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.FlowCapableNodeConnectorStatisticsData> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.FlowCapableNodeConnectorStatisticsData.class;
        }

        private final FlowCapableNodeConnectorStatistics _flowCapableNodeConnectorStatistics;


        private FlowCapableNodeConnectorStatisticsDataImpl(FlowCapableNodeConnectorStatisticsDataBuilder builder) {
            this._flowCapableNodeConnectorStatistics = builder.getFlowCapableNodeConnectorStatistics();
        }

        @Override
        public FlowCapableNodeConnectorStatistics getFlowCapableNodeConnectorStatistics() {
            return _flowCapableNodeConnectorStatistics;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_flowCapableNodeConnectorStatistics == null) ? 0 : _flowCapableNodeConnectorStatistics.hashCode());
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
            FlowCapableNodeConnectorStatisticsDataImpl other = (FlowCapableNodeConnectorStatisticsDataImpl) obj;
            if (_flowCapableNodeConnectorStatistics == null) {
                if (other._flowCapableNodeConnectorStatistics != null) {
                    return false;
                }
            } else if(!_flowCapableNodeConnectorStatistics.equals(other._flowCapableNodeConnectorStatistics)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("FlowCapableNodeConnectorStatisticsData [");
            boolean first = true;
        
            if (_flowCapableNodeConnectorStatistics != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flowCapableNodeConnectorStatistics=");
                builder.append(_flowCapableNodeConnectorStatistics);
             }
            return builder.append(']').toString();
        }
    }

}
