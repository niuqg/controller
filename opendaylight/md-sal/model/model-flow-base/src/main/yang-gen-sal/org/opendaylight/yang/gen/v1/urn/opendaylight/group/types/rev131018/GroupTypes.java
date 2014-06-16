package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018;


public enum GroupTypes {
    GroupAll(0),
    GroupSelect(1),
    GroupIndirect(2),
    GroupFf(3);

    int value;
    static java.util.Map<java.lang.Integer, GroupTypes> valueMap;

    static {
        valueMap = new java.util.HashMap<>();
        for (GroupTypes enumItem : GroupTypes.values())
        {
            valueMap.put(enumItem.value, enumItem);
        }
    }

    private GroupTypes(int value) {
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
     * @return corresponding GroupTypes item
     */
    public static GroupTypes forValue(int valueArg) {
        return valueMap.get(valueArg);
    }
}
