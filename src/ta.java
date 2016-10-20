final class ta extends aa {
   static int O;
   int P;
   static int Q;
   static boolean[] R = new boolean[5];
   static ob drop2;
   private static ob drop = rf.a(40, "Drop");
   static int U;
   static int V;
   private int W = -32768;
   static ob X = rf.a(40, "Lade Titelbild )2 ");
   int Y;
   static boolean Z;
   static int ab;
   static ob bb;

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      try {
         ++V;
         fe var11 = jg.a((byte)-61, this.P).a(-121, (ce)null, this.Y, 0);
         if(var11 != null) {
            var11.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
            this.W = var11.b();
         }
      } catch (RuntimeException var12) {
         throw bc.a(var12, "ta.B(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
      }
   }

   static final void c(int var0, int var1, int var2) {
      try {
         ++ab;
         pi var3 = hf.C[gf.G][var2][var1];
         if(var3 == null) {
            fg.a(gf.G, var2, var1);
         } else {
            int var4 = -99999999;
            ta var5 = null;

            ta var6;
            for(var6 = (ta)var3.a((byte)-9); var6 != null; var6 = (ta)var3.b((byte)-111)) {
               ei var7 = jg.a((byte)-61, var6.P);
               int var8 = var7.Gb;
               if(var7.X == 1) {
                  var8 *= var6.Y - -1;
               }

               if(var4 < var8) {
                  var4 = var8;
                  var5 = var6;
               }
            }

            if(var5 == null) {
               fg.a(gf.G, var2, var1);
            } else {
               var3.a(var5, true);
               if(var0 != 0) {
                  h(-11);
               }

               long var9 = (long)(1610612736 + (var1 << 1589888007) + var2);
               ta var12 = null;
               ta var13 = null;

               for(var6 = (ta)var3.a((byte)-9); var6 != null; var6 = (ta)var3.b((byte)109)) {
                  if(~var6.P != ~var5.P) {
                     if(var12 == null) {
                        var12 = var6;
                     }

                     if(var12.P != var6.P && var13 == null) {
                        var13 = var6;
                     }
                  }
               }

               wa.a(gf.G, var2, var1, ug.a(gf.G, 64 + 128 * var2, (byte)40, var1 * 128 + 64), var5, var9, var12, var13);
            }
         }
      } catch (RuntimeException var11) {
         throw bc.a(var11, "ta.E(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   static final void g(int var0) {
      int var2 = client.anInt_wb;

      try {
         af.P.p(45, 12885);
         ++ki.a;
         ++U;
         re var1 = (re)rd.J.b((byte)117);
         if(var2 != 0) {
            if(var1.B == 0) {
               ba.a(var1, var0 ^ 108015569, true);
            }

            var1 = (re)rd.J.a((byte)-33);
         }

         for(; var1 != null; var1 = (re)rd.J.a((byte)-33)) {
            if(var1.B == 0) {
               ba.a(var1, var0 ^ 108015569, true);
            }
         }

         if(var0 == 108015568) {
            if(sb.Z != null) {
               dg.a(sb.Z, -105);
               sb.Z = null;
            }
         }
      } catch (RuntimeException var3) {
         throw bc.a(var3, "ta.A(" + var0 + ')');
      }
   }

   public static void h(int var0) {
      try {
         R = null;
         drop = null;
         X = null;
         drop2 = null;
         if(var0 == 1610612736) {
            bb = null;
         }
      } catch (RuntimeException var2) {
         throw bc.a(var2, "ta.F(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         ++Q;
         int var8 = -var1 + 2048 & 2047;
         int var7 = 2047 & 2048 - var3;
         int var9 = 0;
         int var10 = 0;
         int var11 = var4;
         int var12;
         int var13;
         int var14;
         if(var7 != 0) {
            var12 = ec.W[var7];
            var13 = ec.L[var7];
            var14 = -(var4 * var12) + var13 * var10 >> 224497520;
            var11 = var10 * var12 - -(var13 * var4) >> 374032912;
            var10 = var14;
         }

         if(~var8 != -1) {
            var13 = ec.L[var8];
            var12 = ec.W[var8];
            var14 = var11 * var12 + var9 * var13 >> -1698560560;
            var11 = var11 * var13 + -(var9 * var12) >> 108015568;
            var9 = var14;
         }

         rf.x = var1;
         if(var6 < 2) {
            bb = null;
         }

         tb.b = -var10 + var0;
         ri.b = var5 - var9;
         bh.l = var3;
         se.d = -var11 + var2;
      } catch (RuntimeException var15) {
         throw bc.a(var15, "ta.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   final int b() {
      try {
         ++O;
         return this.W;
      } catch (RuntimeException var2) {
         throw bc.a(var2, "ta.C(" + ')');
      }
   }

   static {
      drop2 = drop;
      Z = false;
      bb = rf.a(40, "Konfig geladen)3");
   }
}
