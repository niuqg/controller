package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import java.beans.ConstructorProperties;


/**
**/
public class NodeConnectorId extends Uri
 {

    @ConstructorProperties("value")
    public NodeConnectorId(String _value) {
        super(_value);
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NodeConnectorId(NodeConnectorId source) {
        super(source);
    }
    /**
     * Creates a new instance from Uri
     *
     * @param source Source object
     */
    public NodeConnectorId(Uri source) {
            super(source);
    }
    
    public static NodeConnectorId getDefaultInstance(String defaultValue) {
        return new NodeConnectorId(defaultValue);
    }







}
