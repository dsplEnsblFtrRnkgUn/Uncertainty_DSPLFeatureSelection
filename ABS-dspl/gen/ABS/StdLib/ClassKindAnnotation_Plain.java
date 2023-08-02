package ABS.StdLib;
// abs/lang/abslang.abs:632:33: 
public final class ClassKindAnnotation_Plain extends ClassKindAnnotation {
    public ClassKindAnnotation_Plain() {
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] {  }; }
    public java.lang.String getConstructorName() { return "Plain";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof ClassKindAnnotation_Plain)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        ClassKindAnnotation_Plain other = (ClassKindAnnotation_Plain) o;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        return true;
    }
}
