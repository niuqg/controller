package org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410;
import org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.BadActionErrorNotification;
import org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.BadInstructionErrorNotification;
import org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.BadMatchErrorNotification;
import org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.BadRequestErrorNotification;
import org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.ExperimenterErrorNotification;
import org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.FlowModErrorNotification;
import org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.GroupModErrorNotification;
import org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.HelloFailedErrorNotification;
import org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.MeterModErrorNotification;
import org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.PortModErrorNotification;
import org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.QueueOpErrorNotification;
import org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.RoleRequestErrorNotification;
import org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.SwitchConfigErrorNotification;
import org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.TableFeaturesErrorNotification;
import org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.TableModErrorNotification;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
**/
public interface NodeErrorListener
    extends
    NotificationListener
{




    /**
      Model for ofp_error-Type=2, Error in action description.
    **/
    void onBadActionErrorNotification(BadActionErrorNotification notification);
    
    /**
      Model for ofp_error-Type=3, Error in instruction list.
    **/
    void onBadInstructionErrorNotification(BadInstructionErrorNotification notification);
    
    /**
      Model for ofp_error-Type=4, Error in match.
    **/
    void onBadMatchErrorNotification(BadMatchErrorNotification notification);
    
    /**
      Model for ofp_error-Type=1, Request was not understood.
    **/
    void onBadRequestErrorNotification(BadRequestErrorNotification notification);
    
    /**
      Model for ofp_error-Type=65535  - Experimenter Error Messages
    **/
    void onExperimenterErrorNotification(ExperimenterErrorNotification notification);
    
    /**
      Model for ofp_error-Type=5 - Problem modifying flow entry.
    **/
    void onFlowModErrorNotification(FlowModErrorNotification notification);
    
    /**
      Model for ofp_error-Type=6 - Problem modifying group entry.
    **/
    void onGroupModErrorNotification(GroupModErrorNotification notification);
    
    /**
      Model for ofp_error-Type=0, Hello protocol failed
    **/
    void onHelloFailedErrorNotification(HelloFailedErrorNotification notification);
    
    /**
      Model for ofp_error-Type=12 - Error in meter.
    **/
    void onMeterModErrorNotification(MeterModErrorNotification notification);
    
    /**
      Model for ofp_error-Type=7 - Port mod request failed.
    **/
    void onPortModErrorNotification(PortModErrorNotification notification);
    
    /**
      Model for ofp_error-Type=9 - Queue operation failed.
    **/
    void onQueueOpErrorNotification(QueueOpErrorNotification notification);
    
    /**
      Model for ofp_error-Type=11 - Controller Role request failed.
    **/
    void onRoleRequestErrorNotification(RoleRequestErrorNotification notification);
    
    /**
      Model for ofp_error-Type=10 - Switch Config request failed.
    **/
    void onSwitchConfigErrorNotification(SwitchConfigErrorNotification notification);
    
    /**
      Model for ofp_error-Type=13 - Setting table features failed.
    **/
    void onTableFeaturesErrorNotification(TableFeaturesErrorNotification notification);
    
    /**
      Model for ofp_error-Type=8 - Table mod request failed.
    **/
    void onTableModErrorNotification(TableModErrorNotification notification);

}

