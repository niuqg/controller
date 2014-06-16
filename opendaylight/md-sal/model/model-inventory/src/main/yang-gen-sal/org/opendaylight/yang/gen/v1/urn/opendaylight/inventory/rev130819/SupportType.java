package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;


public enum SupportType {
    Native(0),
    Emulated(1),
    NotSupported(2);

    int value;
    static java.util.Map<java.lang.Integer, SupportType> valueMap;

    static {
        valueMap = new java.util.HashMap<>();
        for (SupportType enumItem : SupportType.values())
        {
            valueMap.put(enumItem.value, enumItem);
        }
    }

    private SupportType(int value) {
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
     * @return corresponding SupportType item
     */
    public static SupportType forValue(int valueArg) {
        return valueMap.get(valueArg);
    }
}
