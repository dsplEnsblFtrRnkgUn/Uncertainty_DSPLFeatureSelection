package ABS.StdLib;
// abs/lang/abslang.abs:197:25: 
public final class Set_Insert<A extends org.abs_models.backend.java.lib.types.ABSValue> extends Set<A> {
    public final A arg0;
    public A getArg0() { return arg0; }
    public final ABS.StdLib.Set<A> arg1;
    public ABS.StdLib.Set<A> getArg1() { return arg1; }
    public Set_Insert(final A arg0, final ABS.StdLib.Set<A> arg1) {
        this.arg0 = arg0;
        this.arg1 = arg1;
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] { this.arg0, this.arg1 }; }
    public java.lang.String getConstructorName() { return "Insert";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof Set_Insert)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        Set_Insert other = (Set_Insert) o;
        if (!this.arg0.eq(other.arg0).toBoolean()) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        if (!this.arg1.eq(other.arg1).toBoolean()) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        if (!c.subpattern[0].match(this.arg0, b)) return false;
        if (!c.subpattern[1].match(this.arg1, b)) return false;
        return true;
    }
}
