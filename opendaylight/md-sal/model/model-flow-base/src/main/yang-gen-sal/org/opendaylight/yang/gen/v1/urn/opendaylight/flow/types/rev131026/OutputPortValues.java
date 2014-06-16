package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026;


public enum OutputPortValues {
    MAX(1),
    INPORT(2),
    TABLE(3),
    NORMAL(4),
    FLOOD(5),
    ALL(6),
    CONTROLLER(7),
    LOCAL(8),
    ANY(9),
    NONE(10);

    int value;
    static java.util.Map<java.lang.Integer, OutputPortValues> valueMap;

    static {
        valueMap = new java.util.HashMap<>();
        for (OutputPortValues enumItem : OutputPortValues.values())
        {
            valueMap.put(enumItem.value, enumItem);
        }
    }

    private OutputPortValues(int value) {
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
     * @return corresponding OutputPortValues item
     */
    public static OutputPortValues forValue(int valueArg) {
        return valueMap.get(valueArg);
    }
}
