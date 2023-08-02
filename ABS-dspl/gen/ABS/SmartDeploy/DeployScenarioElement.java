package ABS.SmartDeploy;
// abs/lang/abslang.abs:1223:0: 
public abstract class DeployScenarioElement extends org.abs_models.backend.java.lib.types.ABSDataType {
    public final boolean isMaxUse() { return this instanceof DeployScenarioElement_MaxUse; }
    public final DeployScenarioElement_MaxUse toMaxUse() { return (DeployScenarioElement_MaxUse) this; }
    public final boolean isCost() { return this instanceof DeployScenarioElement_Cost; }
    public final DeployScenarioElement_Cost toCost() { return (DeployScenarioElement_Cost) this; }
    public final boolean isParam() { return this instanceof DeployScenarioElement_Param; }
    public final DeployScenarioElement_Param toParam() { return (DeployScenarioElement_Param) this; }
    public final boolean isName() { return this instanceof DeployScenarioElement_Name; }
    public final DeployScenarioElement_Name toName() { return (DeployScenarioElement_Name) this; }
}
