package org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatchKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface SetFieldMatch
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.SetFieldMatch>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatch>,
    Identifiable<SetFieldMatchKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:table:types","2013-10-26","set-field-match")
    ;

    /**
    **/
    Boolean isHasMask();
    
    /**
    **/
    Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.MatchField> getMatchType();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    SetFieldMatchKey getKey();

}

