package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018;


public enum GroupCapabilities {
    SelectWeight(0),
    SelectLiveness(1),
    Chaining(2),
    ChainingChecks(3);

    int value;
    static java.util.Map<java.lang.Integer, GroupCapabilities> valueMap;

    static {
        valueMap = new java.util.HashMap<>();
        for (GroupCapabilities enumItem : GroupCapabilities.values())
        {
            valueMap.put(enumItem.value, enumItem);
        }
    }

    private GroupCapabilities(int value) {
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
     * @return corresponding GroupCapabilities item
     */
    public static GroupCapabilities forValue(int valueArg) {
        return valueMap.get(valueArg);
    }
}
