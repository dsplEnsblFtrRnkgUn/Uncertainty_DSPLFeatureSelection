package ABS.FLI;
// abs/lang/abslang.abs:744:21: 
public final class FLIAnnotation_Foreign extends FLIAnnotation {
    public FLIAnnotation_Foreign() {
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] {  }; }
    public java.lang.String getConstructorName() { return "Foreign";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof FLIAnnotation_Foreign)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        FLIAnnotation_Foreign other = (FLIAnnotation_Foreign) o;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        return true;
    }
}
