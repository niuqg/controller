package org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface TableFeatures
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:table:types","2013-10-26","table-features")
    ;

    List<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures> getTableFeatures();

}

