package ABS.StdLib;
// abs/lang/abslang.abs:632:27: 
public final class ClassKindAnnotation_COG extends ClassKindAnnotation {
    public ClassKindAnnotation_COG() {
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] {  }; }
    public java.lang.String getConstructorName() { return "COG";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof ClassKindAnnotation_COG)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        ClassKindAnnotation_COG other = (ClassKindAnnotation_COG) o;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        return true;
    }
}
