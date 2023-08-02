package ABS.StdLib;
// abs/lang/abslang.abs:170:16: 
public final class Maybe_Nothing<A extends org.abs_models.backend.java.lib.types.ABSValue> extends Maybe<A> {
    public Maybe_Nothing() {
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] {  }; }
    public java.lang.String getConstructorName() { return "Nothing";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof Maybe_Nothing)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        Maybe_Nothing other = (Maybe_Nothing) o;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        return true;
    }
}
