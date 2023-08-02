package ABS.SmartDeploy;
// abs/lang/abslang.abs:1222:68: 
public final class DeployParamSpecification_User extends DeployParamSpecification {
    public DeployParamSpecification_User() {
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] {  }; }
    public java.lang.String getConstructorName() { return "User";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof DeployParamSpecification_User)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        DeployParamSpecification_User other = (DeployParamSpecification_User) o;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        return true;
    }
}
