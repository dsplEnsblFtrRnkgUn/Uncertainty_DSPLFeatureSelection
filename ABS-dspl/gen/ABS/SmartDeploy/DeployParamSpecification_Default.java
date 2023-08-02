package ABS.SmartDeploy;
// abs/lang/abslang.abs:1222:50: 
public final class DeployParamSpecification_Default extends DeployParamSpecification {
    public final org.abs_models.backend.java.lib.types.ABSString arg0;
    public org.abs_models.backend.java.lib.types.ABSString getArg0() { return arg0; }
    public DeployParamSpecification_Default(final org.abs_models.backend.java.lib.types.ABSString arg0) {
        this.arg0 = arg0;
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] { this.arg0 }; }
    public java.lang.String getConstructorName() { return "Default";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof DeployParamSpecification_Default)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        DeployParamSpecification_Default other = (DeployParamSpecification_Default) o;
        if (!this.arg0.eq(other.arg0).toBoolean()) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        if (!c.subpattern[0].match(this.arg0, b)) return false;
        return true;
    }
}
