package ABS.JUnit;
// abs/lang/abslang.abs:1385:0: 
public final class writeTestsuites_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private writeTestsuites_f() { }
    public static org.abs_models.backend.java.lib.types.ABSString apply(ABS.JUnit.Testsuites tss) {
        return (org.abs_models.backend.java.lib.types.ABSString.fromString("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n<testsuites>\n").add(ABS.JUnit.iterateTS_f.apply(ABS.JUnit.ttss_f.apply(tss))).add(org.abs_models.backend.java.lib.types.ABSString.fromString("</testsuites>")));
    }
}
