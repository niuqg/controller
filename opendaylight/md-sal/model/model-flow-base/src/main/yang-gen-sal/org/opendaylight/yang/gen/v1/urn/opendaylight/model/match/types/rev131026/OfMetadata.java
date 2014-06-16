package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import java.math.BigInteger;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface OfMetadata
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","of-metadata")
    ;

    /**
    **/
    BigInteger getMetadata();
    
    /**
    **/
    BigInteger getMetadataMask();

}

