final class qh {
   static ra a;
   static int b;
   static ob[] c;
   private static ob d = rf.a(40, "flash3:");
   static int[] e;
   static int f;
   static int g;
   static int h;
   static ob i;
   static ob j;
   static int k;

   static int a(int value, int unused) {
      try {
         ++g;
         --value;
         value |= value >>> 1;
         value |= value >>> 2;
         value |= value >>> 4;
         value |= value >>> 8;
         value |= value >>> 16;
         return value +1;
      } catch (RuntimeException var3) {
         throw bc.a(var3, "qh.D(" + value + ',' + unused + ')');
      }
   }

   static void a(int var0) {
      try {
         if(var0 == 0) {
            ++f;
            if(ag.forceSend && gf.G != fc.ob) {
               md.a(gf.G, rh.regionY, (byte)-103, le.T.regionLocalX[0], le.T.regionLocalY[0], ci.regionX);
            } else if(~gf.G != ~rh.t) {
               rh.t = gf.G;
               lh.c(gf.G, var0 ^ -4);
            }
         }
      } catch (RuntimeException var2) {
         throw bc.a(var2, "qh.A(" + var0 + ')');
      }
   }

   static void a(sg var0, byte var1) {
      int var3 = client.anInt_wb;

      try {
         if(var1 < 12) {
            a(-54, 10, -61, -51, -84, -126);
         }

         ++b;
         var0.p = false;
         if(var0.o != null) {
            var0.o.o = 0;
         }

         sg var2 = var0.c();
         if(var3 != 0 || var2 != null) {
            do {
               a(var2, (byte)105);
               var2 = var0.d();
            } while(var2 != null);

         }
      } catch (RuntimeException var4) {
         throw bc.a(var4, "qh.B(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   static int b(int var0, int var1) {
      try {
         if(var1 >= -87) {
            d = null;
         }

         ++h;
         return var0 >>> 8;
      } catch (RuntimeException var3) {
         throw bc.a(var3, "qh.F(" + var0 + ',' + var1 + ')');
      }
   }

   public static void a(boolean var0) {
      try {
         j = null;
         e = null;
         if(!var0) {
            d = null;
         }

         c = null;
         a = null;
         i = null;
         d = null;
      } catch (RuntimeException var2) {
         throw bc.a(var2, "qh.E(" + var0 + ')');
      }
   }

   static void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         ke.lb[0].b(var3, var1);
         ke.lb[1].b(var3, var0 + var1 + -16);
         ++k;
         int var6 = (var0 + -32) * var0 / var4;
         if(var6 < 8) {
            var6 = 8;
         }

         int var7 = (-var6 + var0 + -32) * var2 / (var4 - var0);
         oi.d(var3, var1 + 16, 16, -32 + var0, wd.t);
         oi.d(var3, var1 - (-16 - var7), 16, var6, mg.i);
         oi.c(var3, 16 + var1 + var7, var6, na.anInt_c);
         oi.c(var3 + 1, 16 + var1 + var7, var6, na.anInt_c);
         oi.d(var3, 16 + var1 - -var7, 16, na.anInt_c);
         oi.d(var3, var7 + var1 + 17, 16, na.anInt_c);
         oi.c(var3 + 15, var7 + 16 + var1, var6, n.anInt_d);
         if(var5 != 18768) {
            a((sg)null, (byte)106);
         }

         oi.c(14 + var3, var1 + 17 - -var7, -1 + var6, n.anInt_d);
         oi.d(var3, var6 + var7 + 15 + var1, 16, n.anInt_d);
         oi.d(1 + var3, var7 + 14 + var1 + var6, 15, n.anInt_d);
      } catch (RuntimeException var8) {
         throw bc.a(var8, "qh.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   static {
      j = d;
      i = d;
   }
}
