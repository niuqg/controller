package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match;
import java.math.BigInteger;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Tunnel
    extends
    ChildOf<Match>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","tunnel")
    ;

    /**
      Metadata associated in the logical port
    **/
    BigInteger getTunnelId();
    
    /**
    **/
    BigInteger getTunnelMask();

}

