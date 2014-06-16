package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface GroupFeatures
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:types","2013-10-18","group-features")
    ;

    /**
      Bitmap number OFPAT_* that are supported
    **/
    List<Long> getActions();
    
    /**
    **/
    List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupCapability>> getGroupCapabilitiesSupported();
    
    /**
    **/
    List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupType>> getGroupTypesSupported();
    
    /**
      Maximum number of groups for each type
    **/
    List<Long> getMaxGroups();

}

