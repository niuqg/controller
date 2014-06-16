package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.aggregate.flow.statistics.AggregateFlowStatistics;
import org.opendaylight.yangtools.yang.binding.DataObject;



public class AggregateFlowStatisticsDataBuilder {

    private AggregateFlowStatistics _aggregateFlowStatistics;


    public AggregateFlowStatisticsDataBuilder() {
    } 
    
    public AggregateFlowStatisticsDataBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.AggregateFlowStatistics arg) {
        this._aggregateFlowStatistics = arg.getAggregateFlowStatistics();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.AggregateFlowStatistics</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.AggregateFlowStatistics) {
            this._aggregateFlowStatistics = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.AggregateFlowStatistics)arg).getAggregateFlowStatistics();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.AggregateFlowStatistics] \n" +
              "but was: " + arg
            );
        }
    }

    public AggregateFlowStatistics getAggregateFlowStatistics() {
        return _aggregateFlowStatistics;
    }

    public AggregateFlowStatisticsDataBuilder setAggregateFlowStatistics(AggregateFlowStatistics value) {
    
        this._aggregateFlowStatistics = value;
        return this;
    }

    public AggregateFlowStatisticsData build() {
        return new AggregateFlowStatisticsDataImpl(this);
    }

    private static final class AggregateFlowStatisticsDataImpl implements AggregateFlowStatisticsData {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.AggregateFlowStatisticsData> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.AggregateFlowStatisticsData.class;
        }

        private final AggregateFlowStatistics _aggregateFlowStatistics;


        private AggregateFlowStatisticsDataImpl(AggregateFlowStatisticsDataBuilder builder) {
            this._aggregateFlowStatistics = builder.getAggregateFlowStatistics();
        }

        @Override
        public AggregateFlowStatistics getAggregateFlowStatistics() {
            return _aggregateFlowStatistics;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_aggregateFlowStatistics == null) ? 0 : _aggregateFlowStatistics.hashCode());
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
            AggregateFlowStatisticsDataImpl other = (AggregateFlowStatisticsDataImpl) obj;
            if (_aggregateFlowStatistics == null) {
                if (other._aggregateFlowStatistics != null) {
                    return false;
                }
            } else if(!_aggregateFlowStatistics.equals(other._aggregateFlowStatistics)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("AggregateFlowStatisticsData [");
            boolean first = true;
        
            if (_aggregateFlowStatistics != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_aggregateFlowStatistics=");
                builder.append(_aggregateFlowStatistics);
             }
            return builder.append(']').toString();
        }
    }

}
