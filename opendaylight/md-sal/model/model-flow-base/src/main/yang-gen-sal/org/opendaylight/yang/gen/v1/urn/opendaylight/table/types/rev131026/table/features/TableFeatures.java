package org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableConfig;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.TableProperties;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeaturesKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface TableFeatures
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeatures>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>,
    Identifiable<TableFeaturesKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:table:types","2013-10-26","table-features")
    ;

    /**
      Bitmap of OFPTC_ values
    **/
    TableConfig getConfig();
    
    /**
      Max number of entries supported
    **/
    Long getMaxEntries();
    
    /**
      Bits of metadata table can match
    **/
    BigInteger getMetadataMatch();
    
    /**
      Bits of metadata table can write
    **/
    BigInteger getMetadataWrite();
    
    /**
      Name of the table
    **/
    String getName();
    
    /**
    **/
    Short getTableId();
    
    TableProperties getTableProperties();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    TableFeaturesKey getKey();

}

