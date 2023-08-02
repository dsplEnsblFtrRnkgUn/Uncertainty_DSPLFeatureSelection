package ABS.StdLib;
// abs/lang/abslang.abs:649:26: 
public final class ReadonlyAnnotation_Readonly extends ReadonlyAnnotation {
    public ReadonlyAnnotation_Readonly() {
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] {  }; }
    public java.lang.String getConstructorName() { return "Readonly";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof ReadonlyAnnotation_Readonly)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        ReadonlyAnnotation_Readonly other = (ReadonlyAnnotation_Readonly) o;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        return true;
    }
}
