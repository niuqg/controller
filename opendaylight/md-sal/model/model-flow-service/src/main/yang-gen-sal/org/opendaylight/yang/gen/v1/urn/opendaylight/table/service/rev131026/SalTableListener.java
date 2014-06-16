package org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdated;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
**/
public interface SalTableListener
    extends
    NotificationListener
{




    void onTableUpdated(TableUpdated notification);

}

