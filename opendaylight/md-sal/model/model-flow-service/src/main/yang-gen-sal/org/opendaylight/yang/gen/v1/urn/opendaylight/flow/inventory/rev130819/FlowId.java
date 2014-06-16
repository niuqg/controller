package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import java.beans.ConstructorProperties;


/**
**/
public class FlowId extends Uri
 {

    @ConstructorProperties("value")
    public FlowId(String _value) {
        super(_value);
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public FlowId(FlowId source) {
        super(source);
    }
    /**
     * Creates a new instance from Uri
     *
     * @param source Source object
     */
    public FlowId(Uri source) {
            super(source);
    }
    
    public static FlowId getDefaultInstance(String defaultValue) {
        return new FlowId(defaultValue);
    }







}
