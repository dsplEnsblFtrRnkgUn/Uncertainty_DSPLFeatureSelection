package ABS.StdLib;
// abs/lang/abslang.abs:197:14: 
public final class Set_EmptySet<A extends org.abs_models.backend.java.lib.types.ABSValue> extends Set<A> {
    public Set_EmptySet() {
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] {  }; }
    public java.lang.String getConstructorName() { return "EmptySet";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof Set_EmptySet)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        Set_EmptySet other = (Set_EmptySet) o;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        return true;
    }
}
