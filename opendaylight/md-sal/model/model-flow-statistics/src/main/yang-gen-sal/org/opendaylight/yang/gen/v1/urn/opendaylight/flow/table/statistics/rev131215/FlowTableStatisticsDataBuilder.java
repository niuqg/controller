package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.statistics.FlowTableStatistics;
import org.opendaylight.yangtools.yang.binding.DataObject;



public class FlowTableStatisticsDataBuilder {

    private FlowTableStatistics _flowTableStatistics;


    public FlowTableStatisticsDataBuilder() {
    } 
    
    public FlowTableStatisticsDataBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.FlowTableStatistics arg) {
        this._flowTableStatistics = arg.getFlowTableStatistics();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.FlowTableStatistics</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.FlowTableStatistics) {
            this._flowTableStatistics = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.FlowTableStatistics)arg).getFlowTableStatistics();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.FlowTableStatistics] \n" +
              "but was: " + arg
            );
        }
    }

    public FlowTableStatistics getFlowTableStatistics() {
        return _flowTableStatistics;
    }

    public FlowTableStatisticsDataBuilder setFlowTableStatistics(FlowTableStatistics value) {
    
        this._flowTableStatistics = value;
        return this;
    }

    public FlowTableStatisticsData build() {
        return new FlowTableStatisticsDataImpl(this);
    }

    private static final class FlowTableStatisticsDataImpl implements FlowTableStatisticsData {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.FlowTableStatisticsData> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.FlowTableStatisticsData.class;
        }

        private final FlowTableStatistics _flowTableStatistics;


        private FlowTableStatisticsDataImpl(FlowTableStatisticsDataBuilder builder) {
            this._flowTableStatistics = builder.getFlowTableStatistics();
        }

        @Override
        public FlowTableStatistics getFlowTableStatistics() {
            return _flowTableStatistics;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_flowTableStatistics == null) ? 0 : _flowTableStatistics.hashCode());
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
            FlowTableStatisticsDataImpl other = (FlowTableStatisticsDataImpl) obj;
            if (_flowTableStatistics == null) {
                if (other._flowTableStatistics != null) {
                    return false;
                }
            } else if(!_flowTableStatistics.equals(other._flowTableStatistics)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("FlowTableStatisticsData [");
            boolean first = true;
        
            if (_flowTableStatistics != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flowTableStatistics=");
                builder.append(_flowTableStatistics);
             }
            return builder.append(']').toString();
        }
    }

}
