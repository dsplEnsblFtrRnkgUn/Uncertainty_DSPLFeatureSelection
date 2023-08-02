package ABS.SmartDeploy;
// abs/lang/abslang.abs:1223:29: 
public final class DeployScenarioElement_MaxUse extends DeployScenarioElement {
    public final org.abs_models.backend.java.lib.types.ABSInteger arg0;
    public org.abs_models.backend.java.lib.types.ABSInteger getArg0() { return arg0; }
    public DeployScenarioElement_MaxUse(final org.abs_models.backend.java.lib.types.ABSInteger arg0) {
        this.arg0 = arg0;
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] { this.arg0 }; }
    public java.lang.String getConstructorName() { return "MaxUse";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof DeployScenarioElement_MaxUse)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        DeployScenarioElement_MaxUse other = (DeployScenarioElement_MaxUse) o;
        if (!this.arg0.eq(other.arg0).toBoolean()) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        if (!c.subpattern[0].match(this.arg0, b)) return false;
        return true;
    }
}
