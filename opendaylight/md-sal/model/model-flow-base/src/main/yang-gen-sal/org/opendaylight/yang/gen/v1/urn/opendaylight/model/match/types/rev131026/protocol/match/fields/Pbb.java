package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.protocol.match.fields;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ProtocolMatchFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Pbb
    extends
    ChildOf<ProtocolMatchFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.protocol.match.fields.Pbb>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","pbb")
    ;

    /**
      I-SID in the first PBB service instance tag
    **/
    Long getPbbIsid();
    
    /**
    **/
    Long getPbbMask();

}

