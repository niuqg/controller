package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types.MatchTypeKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SupportedMatchTypes;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Feature;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface MatchType
    extends
    ChildOf<SupportedMatchTypes>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types.MatchType>,
    Feature,
    Identifiable<MatchTypeKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:inventory","2013-08-19","match-type")
    ;

    /**
    **/
    String getMatch();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    MatchTypeKey getKey();

}

