package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId;
import org.opendaylight.yangtools.yang.binding.DataObject;



public class AggregatedTopologyBuilder {

    private List<TopologyId> _originalTopology;


    public AggregatedTopologyBuilder() {
    } 
    
    public AggregatedTopologyBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregateTopology arg) {
        this._originalTopology = arg.getOriginalTopology();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregateTopology</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregateTopology) {
            this._originalTopology = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregateTopology)arg).getOriginalTopology();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregateTopology] \n" +
              "but was: " + arg
            );
        }
    }

    public List<TopologyId> getOriginalTopology() {
        return _originalTopology;
    }

    public AggregatedTopologyBuilder setOriginalTopology(List<TopologyId> value) {
    
        this._originalTopology = value;
        return this;
    }

    public AggregatedTopology build() {
        return new AggregatedTopologyImpl(this);
    }

    private static final class AggregatedTopologyImpl implements AggregatedTopology {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregatedTopology> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregatedTopology.class;
        }

        private final List<TopologyId> _originalTopology;


        private AggregatedTopologyImpl(AggregatedTopologyBuilder builder) {
            this._originalTopology = builder.getOriginalTopology();
        }

        @Override
        public List<TopologyId> getOriginalTopology() {
            return _originalTopology;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_originalTopology == null) ? 0 : _originalTopology.hashCode());
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
            AggregatedTopologyImpl other = (AggregatedTopologyImpl) obj;
            if (_originalTopology == null) {
                if (other._originalTopology != null) {
                    return false;
                }
            } else if(!_originalTopology.equals(other._originalTopology)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("AggregatedTopology [");
            boolean first = true;
        
            if (_originalTopology != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_originalTopology=");
                builder.append(_originalTopology);
             }
            return builder.append(']').toString();
        }
    }

}
