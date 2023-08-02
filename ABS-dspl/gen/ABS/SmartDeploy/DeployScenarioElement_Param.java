package ABS.SmartDeploy;
// abs/lang/abslang.abs:1225:1: 
public final class DeployScenarioElement_Param extends DeployScenarioElement {
    public final org.abs_models.backend.java.lib.types.ABSString arg0;
    public org.abs_models.backend.java.lib.types.ABSString getArg0() { return arg0; }
    public final ABS.SmartDeploy.DeployParamSpecification arg1;
    public ABS.SmartDeploy.DeployParamSpecification getArg1() { return arg1; }
    public DeployScenarioElement_Param(final org.abs_models.backend.java.lib.types.ABSString arg0, final ABS.SmartDeploy.DeployParamSpecification arg1) {
        this.arg0 = arg0;
        this.arg1 = arg1;
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] { this.arg0, this.arg1 }; }
    public java.lang.String getConstructorName() { return "Param";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof DeployScenarioElement_Param)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        DeployScenarioElement_Param other = (DeployScenarioElement_Param) o;
        if (!this.arg0.eq(other.arg0).toBoolean()) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        if (!this.arg1.eq(other.arg1).toBoolean()) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        if (!c.subpattern[0].match(this.arg0, b)) return false;
        if (!c.subpattern[1].match(this.arg1, b)) return false;
        return true;
    }
}
