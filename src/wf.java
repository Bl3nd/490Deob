final class wf {
   static int a;
   static pi b;
   static ob c = rf.a(40, ")1j");
   static ob d;
   static ob[] e = new ob[500];
   static boolean[] f = new boolean[100];
   private static ob g = rf.a(40, "Players");
   static ob h = rf.a(40, "<br>(X100(U(Y");
   static ob i;
   static ob wishesToTradeWithYou2;
   static ob k;
   static ob[] l;
   private static ob wishesToTradeWithYou;
   static ra[] n;
   static int[] o;

   static final void a(byte var0) {
      int var4 = client.anInt_wb;

      try {
         ++a;
         da var1 = (da)ci.u.a((byte)-9);
         if(var4 == 0 && var1 == null) {
            if(var0 <= 0) {
               f = null;
            }
         } else {
            do {
               if(~var1.Q == ~gf.G) {
                  if(var1.mb >= bi.f) {
                     if(var1.fb <= bi.f) {
                        if(~var1.S < -1) {
                           nb var2 = ai.M[-1 + var1.S];
                           if(var2 != null && ~var2.coordX <= -1 && var2.coordX < 13312 && ~var2.coordY <= -1 && ~var2.coordY > -13313) {
                              var1.a(bi.f, var2.coordY, ug.a(var1.Q, var2.coordX, (byte)40, var2.coordY) - var1.wb, -110, var2.coordX);
                           }
                        }

                        if(var1.S < 0) {
                           int var3 = -var1.S + -1;
                           dg var6;
                           if(var3 != jh.c) {
                              var6 = lg.j[var3];
                              if(var4 != 0) {
                                 var6 = le.T;
                              }
                           } else {
                              var6 = le.T;
                           }

                           if(var6 != null && ~var6.coordX <= -1 && var6.coordX < 13312 && ~var6.coordY <= -1 && ~var6.coordY > -13313) {
                              var1.a(bi.f, var6.coordY, ug.a(var1.Q, var6.coordX, (byte)40, var6.coordY) - var1.wb, -85, var6.coordX);
                           }
                        }

                        var1.b(2047, dc.k);
                        ki.a(gf.G, (int)var1.V, (int)var1.Y, (int)var1.R, 60, var1, var1.vb, -1L, false);
                        if(var4 != 0) {
                           var1.c(128);
                        }
                     }
                  } else {
                     var1.c(128);
                  }
               } else {
                  var1.c(128);
               }

               var1 = (da)ci.u.b((byte)-123);
            } while(var1 != null);

            if(var0 <= 0) {
               f = null;
            }
         }
      } catch (RuntimeException var5) {
         throw bc.a(var5, "wf.B(" + var0 + ')');
      }
   }

   public static void a(int var0) {
      try {
         if(var0 == 100) {
            g = null;
            k = null;
            wishesToTradeWithYou2 = null;
            h = null;
            wishesToTradeWithYou = null;
            i = null;
            l = null;
            b = null;
            f = null;
            c = null;
            e = null;
            o = null;
            d = null;
            n = null;
         }
      } catch (RuntimeException var2) {
         throw bc.a(var2, "wf.A(" + var0 + ')');
      }
   }

   static {
      d = g;
      i = rf.a(40, "(U0a )2 via: ");
      b = new pi();
      k = rf.a(40, "Stufe)2");
      l = new ob[100];
      wishesToTradeWithYou = rf.a(40, "wishes to trade with you)3");
      o = new int[1000];
      wishesToTradeWithYou2 = wishesToTradeWithYou;
   }
}
