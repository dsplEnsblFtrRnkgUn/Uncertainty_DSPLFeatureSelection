package SmartHome;
// reconf05.abs:4:0: 
public interface Reconfiguration_i extends org.abs_models.backend.java.lib.types.ABSInterface, ABS.StdLib.Object_i {
    // reconf05.abs:5:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_setCurrentProduct(ABS.Meta.Product_i p);
    // reconf05.abs:5:4: 
    public  org.abs_models.backend.java.lib.types.ABSUnit setCurrentProduct(ABS.Meta.Product_i p);
    // reconf05.abs:6:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<SmartHome.StateUpdate_i> async_getStateUpdate();
    // reconf05.abs:6:4: 
    public  SmartHome.StateUpdate_i getStateUpdate();
    // reconf05.abs:7:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_setStateUpdate(SmartHome.StateUpdate_i u);
    // reconf05.abs:7:4: 
    public  org.abs_models.backend.java.lib.types.ABSUnit setStateUpdate(SmartHome.StateUpdate_i u);
    boolean __ABS_isSameCOG();
}
