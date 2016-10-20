final class ig {
   static int a;
   static ob b;
   static og c;
   static int d;
   static int e;
   static int f;
   static boolean g;
   private static ob h = rf.a(40, "M");
   static ob i;
   static int j;
   static ob k;

   static final ic a(int var0, int var1) {
      try {
         ++a;
         ic var2 = (ic)jb.S.a((long)var1, (byte)83);
         if(var0 < 40) {
            a(51, -127);
         }

         if(var2 != null) {
            return var2;
         } else {
            byte[] var3 = li.cacheFile17.a((byte)52, bf.c(-91, var1), dh.b(28905, var1));
            var2 = new ic();
            if(var3 != null) {
               var2.a(15291, new og(var3));
            }

            jb.S.a(var2, (byte)-44, (long)var1);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw bc.a(var4, "ig.A(" + var0 + ',' + var1 + ')');
      }
   }

   static final void a(int var0) {
      try {
         ++e;
         if(tb.d) {
            ie.F = null;
            lb.bb = null;
            nb.nc = null;
            wg.ab = null;
            ic.ab = null;
            b.Y = null;
            jc.U = null;
            tf.b = null;
            ue.R = null;
            ph.f = null;
            ff.kb = null;
            oc.h = null;
            ah.j = null;
            q.Y = null;
            qc.F = null;
            wa.A = null;
            ng.x = null;
            ef.ab = null;
            og.s = null;
            r.R = null;
            lh.ub = null;
            kh.H = null;
            pd.a((byte)121, var0);
            qa.b(true, -8496);
            tb.d = false;
         }
      } catch (RuntimeException var2) {
         throw bc.a(var2, "ig.B(" + var0 + ')');
      }
   }

   public static void b(int var0) {
      try {
         i = null;
         b = null;
         h = null;
         k = null;
         int var1 = 15 % ((var0 - -56) / 53);
         c = null;
      } catch (RuntimeException var2) {
         throw bc.a(var2, "ig.D(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, dg var3) {
      try {
         if(var1 == 0) {
            ++f;
            if(~var3.mb == ~var0 && ~var0 != 0) {
               ce var4 = le.c(var1 + 15619, var0);
               int var5 = var4.T;
               if(var5 == 1) {
                  var3.xb = 0;
                  var3.Kb = 0;
                  var3.cb = 0;
                  var3.wb = var2;
                  ah.a(var3.coordX, var4, false, var3.Kb, le.T == var3, var3.coordY);
               }

               if(~var5 == -3) {
                  var3.xb = 0;
               }
            } else {
               if(~var0 == 0 || ~var3.mb == 0 || le.c(15619, var0).G >= le.c(15619, var3.mb).G) {
                  var3.wb = var2;
                  var3.Kb = 0;
                  var3.xb = 0;
                  var3.cb = 0;
                  var3.cc = var3.T;
                  var3.mb = var0;
                  if(var3.mb == -1) {
                     return;
                  }

                  ah.a(var3.coordX, le.c(15619, var3.mb), false, var3.Kb, var3 == le.T, var3.coordY);
               }

            }
         }
      } catch (RuntimeException var6) {
         throw bc.a(var6, "ig.C(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

   static {
      b = h;
      j = 0;
      k = h;
      i = null;
      g = false;
   }
}
