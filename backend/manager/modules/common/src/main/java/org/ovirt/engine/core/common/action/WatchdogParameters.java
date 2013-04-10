package org.ovirt.engine.core.common.action;

import org.ovirt.engine.core.common.businessentities.VmWatchdogAction;
import org.ovirt.engine.core.common.businessentities.VmWatchdogType;
import org.ovirt.engine.core.compat.Guid;

public class WatchdogParameters extends VdcActionParametersBase {
    private static final long serialVersionUID = 8564973734004518462L;
    /**
     * true if the watchog must be set in the VM, false if it must be set in a template
     */
    boolean vm = true;
    Guid id = Guid.Empty;
    VmWatchdogAction action;
    VmWatchdogType model;

    public VmWatchdogAction getAction() {
        return action;
    }

    public void setAction(VmWatchdogAction action) {
        this.action = action;
    }

    public VmWatchdogType getModel() {
        return model;
    }

    public void setModel(VmWatchdogType model) {
        this.model = model;
    }

    public boolean isVm() {
        return vm;
    }

    public void setVm(boolean vm) {
        this.vm = vm;
    }

    public Guid getId() {
        return id;
    }

    public void setId(Guid id) {
        this.id = id;
    }
}
