package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.flow.statistics.FlowStatistics;
import org.opendaylight.yangtools.yang.binding.DataObject;



public class FlowStatisticsDataBuilder {

    private FlowStatistics _flowStatistics;


    public FlowStatisticsDataBuilder() {
    } 
    
    public FlowStatisticsDataBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.FlowStatistics arg) {
        this._flowStatistics = arg.getFlowStatistics();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.FlowStatistics</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.FlowStatistics) {
            this._flowStatistics = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.FlowStatistics)arg).getFlowStatistics();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.FlowStatistics] \n" +
              "but was: " + arg
            );
        }
    }

    public FlowStatistics getFlowStatistics() {
        return _flowStatistics;
    }

    public FlowStatisticsDataBuilder setFlowStatistics(FlowStatistics value) {
    
        this._flowStatistics = value;
        return this;
    }

    public FlowStatisticsData build() {
        return new FlowStatisticsDataImpl(this);
    }

    private static final class FlowStatisticsDataImpl implements FlowStatisticsData {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.FlowStatisticsData> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.FlowStatisticsData.class;
        }

        private final FlowStatistics _flowStatistics;


        private FlowStatisticsDataImpl(FlowStatisticsDataBuilder builder) {
            this._flowStatistics = builder.getFlowStatistics();
        }

        @Override
        public FlowStatistics getFlowStatistics() {
            return _flowStatistics;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_flowStatistics == null) ? 0 : _flowStatistics.hashCode());
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
            FlowStatisticsDataImpl other = (FlowStatisticsDataImpl) obj;
            if (_flowStatistics == null) {
                if (other._flowStatistics != null) {
                    return false;
                }
            } else if(!_flowStatistics.equals(other._flowStatistics)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("FlowStatisticsData [");
            boolean first = true;
        
            if (_flowStatistics != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flowStatistics=");
                builder.append(_flowStatistics);
             }
            return builder.append(']').toString();
        }
    }

}
