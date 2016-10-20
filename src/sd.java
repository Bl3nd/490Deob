import java.applet.Applet;
import netscape.javascript.JSObject;

final class sd {
   static final void a(int var0, String var1, Applet var2) throws Throwable {
      try {
         JSObject.getWindow(var2).eval(var1);
         if(var0 == 621) {
            ;
         }
      } catch (RuntimeException var4) {
         throw var4;
      }
   }
}
