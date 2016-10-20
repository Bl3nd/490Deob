final class sa {
   private static ob a = rf.a(40, "Please check your message)2centre for details)3");
   static boolean b = false;
   static int[] c = new int[2000];
   static ob mapflag = rf.a(40, "mapflag");
   static int[] e = new int[]{-1, -1, 1, 1};
   static vf[] f;
   static int g;
   static ob h;
   static int i;
   static ob j = rf.a(40, "Lade Texturen )2 ");
   static int k;

   static final void a(int var0, byte var1, int var2, int var3, int[] var4) {
      int var6 = client.anInt_wb;

      try {
         if(var1 == 52) {
            --var2;
            --var0;
            int var5 = -7 + var0;
            if(var6 != 0 || var5 > var2) {
               do {
                  ++var2;
                  var4[var2] = var3;
                  ++var2;
                  var4[var2] = var3;
                  ++var2;
                  var4[var2] = var3;
                  ++var2;
                  var4[var2] = var3;
                  ++var2;
                  var4[var2] = var3;
                  ++var2;
                  var4[var2] = var3;
                  ++var2;
                  var4[var2] = var3;
                  ++var2;
                  var4[var2] = var3;
               } while(var5 > var2);
            }

            if(var6 != 0) {
               ++var2;
               var4[var2] = var3;
            }

            while(~var2 > ~var0) {
               ++var2;
               var4[var2] = var3;
            }

            ++k;
         }
      } catch (RuntimeException var7) {
         throw bc.a(var7, "sa.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null?"{...}":"null") + ')');
      }
   }

   public static void a(int var0) {
      try {
         j = null;
         f = null;
         c = null;
         mapflag = null;
         int var1 = -31 / ((-13 - var0) / 62);
         a = null;
         h = null;
         e = null;
      } catch (RuntimeException var2) {
         throw bc.a(var2, "sa.C(" + var0 + ')');
      }
   }

   static final void a(byte var0) {
      int var2 = client.anInt_wb;

      try {
         if(var0 == 94) {
            ++i;
            gf var1 = (gf)vg.X.a((byte)-9);
            if(var2 != 0 || var1 != null) {
               do {
                  if(var1.K > 0) {
                     --var1.K;
                  }

                  label91: {
                     if(var1.K != 0) {
                        if(~var1.q < -1) {
                           --var1.q;
                        }

                        if(~var1.q != -1 || var1.E < 1 || ~var1.J > -2 || ~var1.E < -103 || var1.J > 102 || ~var1.w <= -1 && !ie.b(23616, var1.r, var1.w)) {
                           break label91;
                        }

                        oc.a(var1.r, var1.M, var1.N, var1.E, var1.v, false, var1.w, var1.J);
                        var1.q = -1;
                        if(~var1.w != ~var1.p || var1.p != -1) {
                           if(~var1.w != ~var1.p || var1.N != var1.D || ~var1.H != ~var1.r) {
                              break label91;
                           }

                           var1.c(128);
                           if(var2 == 0) {
                              break label91;
                           }
                        }

                        var1.c(128);
                        if(var2 == 0) {
                           break label91;
                        }
                     }

                     if(~var1.p > -1 || ie.b(23616, var1.H, var1.p)) {
                        oc.a(var1.H, var1.M, var1.D, var1.E, var1.v, false, var1.p, var1.J);
                        var1.c(128);
                     }
                  }

                  var1 = (gf)vg.X.b((byte)95);
               } while(var1 != null);

            }
         }
      } catch (RuntimeException var3) {
         throw bc.a(var3, "sa.A(" + var0 + ')');
      }
   }

   static {
      h = a;
   }
}
