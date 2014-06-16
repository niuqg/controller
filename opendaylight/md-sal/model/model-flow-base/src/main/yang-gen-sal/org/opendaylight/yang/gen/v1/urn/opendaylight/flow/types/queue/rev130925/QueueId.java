package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import java.beans.ConstructorProperties;


/**
**/
public class QueueId extends Counter32
 {

    @ConstructorProperties("value")
    public QueueId(Long _value) {
        super(_value);
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public QueueId(QueueId source) {
        super(source);
    }
    /**
     * Creates a new instance from Counter32
     *
     * @param source Source object
     */
    public QueueId(Counter32 source) {
            super(source);
    }
    
    public static QueueId getDefaultInstance(String defaultValue) {
        return new QueueId(new Long(defaultValue));
    }







}
