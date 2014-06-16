package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030;



public class Topology1Builder {



    public Topology1Builder() {
    } 




    public Topology1 build() {
        return new Topology1Impl(this);
    }

    private static final class Topology1Impl implements Topology1 {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.Topology1> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.Topology1.class;
        }



        private Topology1Impl(Topology1Builder builder) {
        }



        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("Topology1 [");
            boolean first = true;
        
            return builder.append(']').toString();
        }
    }

}
