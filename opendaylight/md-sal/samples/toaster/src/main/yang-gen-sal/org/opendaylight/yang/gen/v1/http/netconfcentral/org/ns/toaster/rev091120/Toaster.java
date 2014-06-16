package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.DisplayString;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterData;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


/**
  Top-level container for all toaster database objects.
**/
public interface Toaster
    extends
    ChildOf<ToasterData>,
    Augmentable<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>
{


    public enum ToasterStatus {
        Up(1),
        Down(2);
    
        int value;
        static java.util.Map<java.lang.Integer, ToasterStatus> valueMap;
    
        static {
            valueMap = new java.util.HashMap<>();
            for (ToasterStatus enumItem : ToasterStatus.values())
            {
                valueMap.put(enumItem.value, enumItem);
            }
        }
    
        private ToasterStatus(int value) {
            this.value = value;
        }
        
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg
         * @return corresponding ToasterStatus item
         */
        public static ToasterStatus forValue(int valueArg) {
            return valueMap.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://netconfcentral.org/ns/toaster","2009-11-20","toaster")
    ;

    /**
      The darkness factor. Basically, the number of ms to multiple the doneness value by.
    **/
    Long getDarknessFactor();
    
    /**
      The name of the toaster's manufacturer. For instance, 
                      Microsoft Toaster.
    **/
    DisplayString getToasterManufacturer();
    
    /**
      The name of the toaster's model. For instance,
                     Radiant Automatic.
    **/
    DisplayString getToasterModelNumber();
    
    /**
      This variable indicates the current state of 
                     the toaster.
    **/
    ToasterStatus getToasterStatus();

}

