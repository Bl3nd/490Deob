final class fg {
   int a;
   static int[] b = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   int c;
   static int d;
   static ob e;
   static int f;
   static int g;
   static int h;
   int i;
   int j;
   private static ob k = rf.a(40, "glow3:");
   static int l = 0;
   long m = 0L;
   static ob n;
   aa o;
   int p;
   int q;
   int r;
   aa s;
   static ob headicons_prayer;
   static ob u;
   static i v;

   static void a(int var0, ob var1, boolean var2) {
      int var9 = client.anInt_wb;

      try {
         int var4 = var0;
         var1 = var1.c((byte)-78);
         short[] var3 = new short[16];
         ++f;
         int var5 = 0;
         if(var9 != 0 || ~gf.B < ~var5) {
            do {
               ei var6 = jg.a((byte)-61, var5);
               if(var2 && !var6.F) {
                  ++var5;
               } else if(~var6.name.c((byte)37).b((ob)var1, (byte)124) == 0) {
                  ++var5;
               } else {
                  if(~var4 <= -251) {
                     jf.Z = -1;
                     ii.q = null;
                     return;
                  }

                  if(var4 < var3.length) {
                     var3[var4++] = (short)var5;
                     ++var5;
                  } else {
                     short[] var7 = new short[var3.length * 2];
                     int var8 = 0;
                     if(var9 != 0) {
                        var7[var8] = var3[var8];
                        ++var8;
                     }

                     while(~var8 > ~var4) {
                        var7[var8] = var3[var8];
                        ++var8;
                     }

                     var3 = var7;
                     var7[var4++] = (short)var5;
                     ++var5;
                  }
               }
            } while(~gf.B < ~var5);
         }

         ve.anInt_r = 0;
         ii.q = var3;
         jf.Z = var4;
         ob[] var11 = new ob[jf.Z];
         int var12 = 0;
         if(var9 != 0) {
            var11[var12] = jg.a((byte)-61, var3[var12]).name;
            ++var12;
         }

         while(~var12 > ~jf.Z) {
            var11[var12] = jg.a((byte)-61, var3[var12]).name;
            ++var12;
         }

         ki.a(var11, ii.q, true);
      } catch (RuntimeException var10) {
         throw bc.a(var10, "fg.D(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   static int a(boolean unused, byte[] data, int length) {
      try {
         ++h;
         return cd.a(data, length, -17062, 0);
      } catch (RuntimeException var4) {
         throw bc.a(var4, "fg.C(" + unused + ',' + (data != null?"{...}":"null") + ',' + length + ')');
      }
   }

   public static void a(int var0) {
      try {
         e = null;
         if(var0 != 24711) {
            u = null;
         }

         headicons_prayer = null;
         n = null;
         k = null;
         v = null;
         b = null;
         u = null;
      } catch (RuntimeException var2) {
         throw bc.a(var2, "fg.A(" + var0 + ')');
      }
   }

   static void a(int var0, int var1, int var2) {
      pd var3 = nb.oc[var0][var1][var2];
      if(var3 != null) {
         var3.E = null;
      }
   }

   static boolean a(int var0, int var1) {
      try {
         ++d;
         if(var0 < var1) {
            return false;
         } else {
            int var2 = ph.i[var0];
            if(var2 >= 2000) {
               var2 -= 2000;
            }

            return ~var2 == -1004;
         }
      } catch (RuntimeException var3) {
         throw bc.a(var3, "fg.E(" + var0 + ',' + var1 + ')');
      }
   }

   static void a(int var0, int var1, byte var2) {
      try {
         int var3 = -90 / ((var2 - 70) / 36);
         ++bf.U;
         ++g;
         af.P.p(131, 12885);
         af.P.m(-117, var0);
         af.P.writeInt_V2(var1, false);
      } catch (RuntimeException var4) {
         throw bc.a(var4, "fg.B(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   static {
      e = k;
      n = k;
      headicons_prayer = rf.a(40, "headicons_prayer");
      u = rf.a(40, "Benutzen");
   }
}
