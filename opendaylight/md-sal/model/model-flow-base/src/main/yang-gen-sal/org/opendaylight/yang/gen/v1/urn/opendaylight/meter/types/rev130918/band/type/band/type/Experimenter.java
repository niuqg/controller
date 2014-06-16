package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.BandType;
import org.opendaylight.yangtools.yang.common.QName;


public interface Experimenter
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>,
    BandType
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","experimenter")
    ;

    /**
      Experimenter id
    **/
    Long getExperimenter();
    
    /**
      Size of bursts
    **/
    Long getExperimenterBurstSize();
    
    /**
      Rate for remarking packets
    **/
    Long getExperimenterRate();

}

