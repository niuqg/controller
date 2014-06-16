package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.BandType;
import org.opendaylight.yangtools.yang.common.QName;


public interface DscpRemark
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>,
    BandType
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","dscp-remark")
    ;

    /**
      Size of bursts
    **/
    Long getDscpRemarkBurstSize();
    
    /**
      Rate for remarking packets
    **/
    Long getDscpRemarkRate();
    
    /**
      Number of drop precedence level to add
    **/
    Short getPercLevel();

}

