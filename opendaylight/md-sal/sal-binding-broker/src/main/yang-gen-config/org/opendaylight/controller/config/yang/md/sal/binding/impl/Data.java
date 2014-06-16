package org.opendaylight.controller.config.yang.md.sal.binding.impl;
public class Data {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private org.opendaylight.controller.config.yang.md.sal.binding.impl.Transactions transactions;

    public Data () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public org.opendaylight.controller.config.yang.md.sal.binding.impl.Transactions getTransactions() {
        return transactions;
    }

    public void setTransactions(org.opendaylight.controller.config.yang.md.sal.binding.impl.Transactions transactions) {
        this.transactions = transactions;
    }

}
