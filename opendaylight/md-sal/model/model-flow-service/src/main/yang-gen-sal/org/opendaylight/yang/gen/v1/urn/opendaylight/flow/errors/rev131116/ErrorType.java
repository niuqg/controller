package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116;


public enum ErrorType {
    HelloFailed(0),
    BadRequest(1),
    BadAction(2),
    BadInstruction(3),
    BadMatch(4),
    FlowModFailed(5),
    GroupModFailed(6),
    PortModFailed(7),
    TableModFailed(8),
    QueueOpFailed(9),
    SwitchConfigFailed(10),
    RoleRequestFailed(11),
    MeterModFailed(12),
    TableFeaturesFailed(13),
    Experimenter(65535);

    int value;
    static java.util.Map<java.lang.Integer, ErrorType> valueMap;

    static {
        valueMap = new java.util.HashMap<>();
        for (ErrorType enumItem : ErrorType.values())
        {
            valueMap.put(enumItem.value, enumItem);
        }
    }

    private ErrorType(int value) {
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
     * @return corresponding ErrorType item
     */
    public static ErrorType forValue(int valueArg) {
        return valueMap.get(valueArg);
    }
}
