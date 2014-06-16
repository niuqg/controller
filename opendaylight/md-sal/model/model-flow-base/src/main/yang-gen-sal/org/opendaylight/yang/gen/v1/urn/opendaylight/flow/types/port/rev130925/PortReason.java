package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925;


public enum PortReason {
    Add(0),
    Delete(1),
    Update(2);

    int value;
    static java.util.Map<java.lang.Integer, PortReason> valueMap;

    static {
        valueMap = new java.util.HashMap<>();
        for (PortReason enumItem : PortReason.values())
        {
            valueMap.put(enumItem.value, enumItem);
        }
    }

    private PortReason(int value) {
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
     * @return corresponding PortReason item
     */
    public static PortReason forValue(int valueArg) {
        return valueMap.get(valueArg);
    }
}
