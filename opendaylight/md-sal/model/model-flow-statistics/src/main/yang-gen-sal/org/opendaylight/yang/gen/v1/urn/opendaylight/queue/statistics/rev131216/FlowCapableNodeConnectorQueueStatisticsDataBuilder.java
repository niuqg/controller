package org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.flow.capable.node.connector.queue.statistics.FlowCapableNodeConnectorQueueStatistics;
import org.opendaylight.yangtools.yang.binding.DataObject;



public class FlowCapableNodeConnectorQueueStatisticsDataBuilder {

    private FlowCapableNodeConnectorQueueStatistics _flowCapableNodeConnectorQueueStatistics;


    public FlowCapableNodeConnectorQueueStatisticsDataBuilder() {
    } 
    
    public FlowCapableNodeConnectorQueueStatisticsDataBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.FlowCapableNodeConnectorQueueStatistics arg) {
        this._flowCapableNodeConnectorQueueStatistics = arg.getFlowCapableNodeConnectorQueueStatistics();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.FlowCapableNodeConnectorQueueStatistics</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.FlowCapableNodeConnectorQueueStatistics) {
            this._flowCapableNodeConnectorQueueStatistics = ((org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.FlowCapableNodeConnectorQueueStatistics)arg).getFlowCapableNodeConnectorQueueStatistics();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.FlowCapableNodeConnectorQueueStatistics] \n" +
              "but was: " + arg
            );
        }
    }

    public FlowCapableNodeConnectorQueueStatistics getFlowCapableNodeConnectorQueueStatistics() {
        return _flowCapableNodeConnectorQueueStatistics;
    }

    public FlowCapableNodeConnectorQueueStatisticsDataBuilder setFlowCapableNodeConnectorQueueStatistics(FlowCapableNodeConnectorQueueStatistics value) {
    
        this._flowCapableNodeConnectorQueueStatistics = value;
        return this;
    }

    public FlowCapableNodeConnectorQueueStatisticsData build() {
        return new FlowCapableNodeConnectorQueueStatisticsDataImpl(this);
    }

    private static final class FlowCapableNodeConnectorQueueStatisticsDataImpl implements FlowCapableNodeConnectorQueueStatisticsData {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.FlowCapableNodeConnectorQueueStatisticsData> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.FlowCapableNodeConnectorQueueStatisticsData.class;
        }

        private final FlowCapableNodeConnectorQueueStatistics _flowCapableNodeConnectorQueueStatistics;


        private FlowCapableNodeConnectorQueueStatisticsDataImpl(FlowCapableNodeConnectorQueueStatisticsDataBuilder builder) {
            this._flowCapableNodeConnectorQueueStatistics = builder.getFlowCapableNodeConnectorQueueStatistics();
        }

        @Override
        public FlowCapableNodeConnectorQueueStatistics getFlowCapableNodeConnectorQueueStatistics() {
            return _flowCapableNodeConnectorQueueStatistics;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_flowCapableNodeConnectorQueueStatistics == null) ? 0 : _flowCapableNodeConnectorQueueStatistics.hashCode());
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
            FlowCapableNodeConnectorQueueStatisticsDataImpl other = (FlowCapableNodeConnectorQueueStatisticsDataImpl) obj;
            if (_flowCapableNodeConnectorQueueStatistics == null) {
                if (other._flowCapableNodeConnectorQueueStatistics != null) {
                    return false;
                }
            } else if(!_flowCapableNodeConnectorQueueStatistics.equals(other._flowCapableNodeConnectorQueueStatistics)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("FlowCapableNodeConnectorQueueStatisticsData [");
            boolean first = true;
        
            if (_flowCapableNodeConnectorQueueStatistics != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flowCapableNodeConnectorQueueStatistics=");
                builder.append(_flowCapableNodeConnectorQueueStatistics);
             }
            return builder.append(']').toString();
        }
    }

}
