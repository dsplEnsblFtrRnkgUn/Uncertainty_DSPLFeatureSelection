package ABS.StdLib;
// abs/lang/abslang.abs:623:30: 
public final class NullableType_Nullable extends NullableType {
    public NullableType_Nullable() {
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] {  }; }
    public java.lang.String getConstructorName() { return "Nullable";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof NullableType_Nullable)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        NullableType_Nullable other = (NullableType_Nullable) o;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        return true;
    }
}
