package ABS.SmartDeploy;
// abs/lang/abslang.abs:1222:38: 
public final class DeployParamSpecification_List extends DeployParamSpecification {
    public final org.abs_models.backend.java.lib.types.ABSInteger arg0;
    public org.abs_models.backend.java.lib.types.ABSInteger getArg0() { return arg0; }
    public DeployParamSpecification_List(final org.abs_models.backend.java.lib.types.ABSInteger arg0) {
        this.arg0 = arg0;
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] { this.arg0 }; }
    public java.lang.String getConstructorName() { return "List";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof DeployParamSpecification_List)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        DeployParamSpecification_List other = (DeployParamSpecification_List) o;
        if (!this.arg0.eq(other.arg0).toBoolean()) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        if (!c.subpattern[0].match(this.arg0, b)) return false;
        return true;
    }
}
