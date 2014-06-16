package org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface TableProperties
    extends
    ChildOf<TableFeatures>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.TableProperties>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:table:types","2013-10-26","table-properties")
    ;

    List<TableFeatureProperties> getTableFeatureProperties();

}

