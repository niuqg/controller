package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEventKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.DataChangedNotification;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface DataChangeEvent
    extends
    ChildOf<DataChangedNotification>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEvent>,
    Identifiable<DataChangeEventKey>
{


    public enum Operation {
        Created(0),
        Updated(1),
        Deleted(2);
    
        int value;
        static java.util.Map<java.lang.Integer, Operation> valueMap;
    
        static {
            valueMap = new java.util.HashMap<>();
            for (Operation enumItem : Operation.values())
            {
                valueMap.put(enumItem.value, enumItem);
            }
        }
    
        private Operation(int value) {
            this.value = value;
        }
        
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg
         * @return corresponding Operation item
         */
        public static Operation forValue(int valueArg) {
            return valueMap.get(valueArg);
        }
    }
    
    public enum Store {
        Config(0),
        Operation(1);
    
        int value;
        static java.util.Map<java.lang.Integer, Store> valueMap;
    
        static {
            valueMap = new java.util.HashMap<>();
            for (Store enumItem : Store.values())
            {
                valueMap.put(enumItem.value, enumItem);
            }
        }
    
        private Store(int value) {
            this.value = value;
        }
        
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg
         * @return corresponding Store item
         */
        public static Store forValue(int valueArg) {
            return valueMap.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:remote","2014-01-14","data-change-event")
    ;

    /**
    **/
    Operation getOperation();
    
    /**
    **/
    InstanceIdentifier<?> getPath();
    
    /**
    **/
    Store getStore();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    DataChangeEventKey getKey();

}

