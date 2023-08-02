package ABS.DC;
// abs/lang/abslang.abs:772:2: 
public final class Resourcetype_CostPerInterval extends Resourcetype {
    public Resourcetype_CostPerInterval() {
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] {  }; }
    public java.lang.String getConstructorName() { return "CostPerInterval";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof Resourcetype_CostPerInterval)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        Resourcetype_CostPerInterval other = (Resourcetype_CostPerInterval) o;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        return true;
    }
}
