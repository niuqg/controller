package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925;


public enum QueueProperties {
    MinRate(0),
    MaxRate(1);

    int value;
    static java.util.Map<java.lang.Integer, QueueProperties> valueMap;

    static {
        valueMap = new java.util.HashMap<>();
        for (QueueProperties enumItem : QueueProperties.values())
        {
            valueMap.put(enumItem.value, enumItem);
        }
    }

    private QueueProperties(int value) {
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
     * @return corresponding QueueProperties item
     */
    public static QueueProperties forValue(int valueArg) {
        return valueMap.get(valueArg);
    }
}
