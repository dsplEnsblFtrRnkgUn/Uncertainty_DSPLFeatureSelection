package ABS.StdLib;
// abs/lang/abslang.abs:623:20: 
public final class NullableType_Nonnull extends NullableType {
    public NullableType_Nonnull() {
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] {  }; }
    public java.lang.String getConstructorName() { return "Nonnull";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof NullableType_Nonnull)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        NullableType_Nonnull other = (NullableType_Nonnull) o;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        return true;
    }
}
