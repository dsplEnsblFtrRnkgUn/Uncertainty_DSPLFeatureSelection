package ABS.StdLib.Exceptions;
// abs/lang/abslang.abs:703:0: 
public final class Exception_StackOverflowEcxeption extends ABS.StdLib.Exception {
    public Exception_StackOverflowEcxeption() {
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] {  }; }
    public java.lang.String getConstructorName() { return "StackOverflowEcxeption";} 
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof Exception_StackOverflowEcxeption)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        Exception_StackOverflowEcxeption other = (Exception_StackOverflowEcxeption) o;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        return true;
    }
}
