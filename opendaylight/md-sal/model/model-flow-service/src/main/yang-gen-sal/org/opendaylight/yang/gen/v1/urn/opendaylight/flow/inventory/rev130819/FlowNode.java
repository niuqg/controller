package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SupportedActions;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SupportedInstructions;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SupportedMatchTypes;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SwitchFeatures;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Tables;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Meters;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Groups;
import org.opendaylight.yangtools.yang.common.QName;


public interface FlowNode
    extends
    DataObject,
    Tables,
    Meters,
    Groups
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:inventory","2013-08-19","flow-node")
    ;

    /**
    **/
    String getDescription();
    
    /**
    **/
    String getHardware();
    
    /**
    **/
    String getManufacturer();
    
    /**
    **/
    String getSerialNumber();
    
    /**
    **/
    String getSoftware();
    
    SupportedActions getSupportedActions();
    
    SupportedInstructions getSupportedInstructions();
    
    SupportedMatchTypes getSupportedMatchTypes();
    
    SwitchFeatures getSwitchFeatures();

}

