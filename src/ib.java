final class ib {
   private static ob a = rf.a(40, "Login");
   static qb b;
   static ob c;
   static ob d = rf.a(40, "<img=1>");
   static int e;
   static ra f;
   static int g;
   static ob h;
   static int i;

   static final boolean a(int var0, int var1, int var2, int var3, int var4, int var5, aa var6, int var7, long var8) {
      if(var6 == null) {
         return true;
      } else {
         int var10 = var1 * 128 + 64 * var4;
         int var11 = var2 * 128 + 64 * var5;
         return jf.a(var0, var1, var2, var4, var5, var10, var11, var3, var6, var7, false, var8);
      }
   }

   public static void a(int var0) {
      try {
         h = null;
         f = null;
         a = null;
         if(var0 != 128) {
            i = -122;
         }

         b = null;
         c = null;
         d = null;
      } catch (RuntimeException var2) {
         throw bc.a(var2, "ib.A(" + var0 + ')');
      }
   }

   static final void b(int var0) {
      int var2 = client.anInt_wb;

      try {
         ++e;
         if(var0 >= -2) {
            b = null;
         }

         gh var1 = (gh)nf.ib.a((byte)-9);
         if(var2 != 0 || var1 != null) {
            do {
               label54: {
                  if(~gf.G != ~var1.Y || var1.cb) {
                     var1.c(128);
                     if(var2 == 0) {
                        break label54;
                     }
                  }

                  if(var1.nb <= bi.f) {
                     label53: {
                        var1.a(dc.k, false);
                        if(var1.cb) {
                           var1.c(128);
                           if(var2 == 0) {
                              break label53;
                           }
                        }

                        ki.a(var1.Y, var1.db, var1.bb, var1.P, 60, var1, 0, -1L, false);
                     }
                  }
               }

               var1 = (gh)nf.ib.b((byte)122);
            } while(var1 != null);

         }
      } catch (RuntimeException var3) {
         throw bc.a(var3, "ib.C(" + var0 + ')');
      }
   }

   static final boolean a(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6;
      int var7;
      if(var1 == var2 && var3 == var4) {
         if(!bd.b(var0, var1, var3)) {
            return false;
         } else {
            var6 = var1 << 7;
            var7 = var3 << 7;
            return ve.a(var6 + 1, la.v[var0][var1][var3] + var5, var7 + 1) && ve.a(var6 + 128 - 1, la.v[var0][var1 + 1][var3] + var5, var7 + 1) && ve.a(var6 + 128 - 1, la.v[var0][var1 + 1][var3 + 1] + var5, var7 + 128 - 1) && ve.a(var6 + 1, la.v[var0][var1][var3 + 1] + var5, var7 + 128 - 1);
         }
      } else {
         for(var6 = var1; var6 <= var2; ++var6) {
            for(var7 = var3; var7 <= var4; ++var7) {
               if(ob.Y[var0][var6][var7] == -v.M) {
                  return false;
               }
            }
         }

         var7 = (var1 << 7) + 1;
         int var8 = (var3 << 7) + 2;
         int var9 = la.v[var0][var1][var3] + var5;
         if(!ve.a(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var2 << 7) - 1;
            if(!ve.a(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var4 << 7) - 1;
               if(!ve.a(var7, var9, var11)) {
                  return false;
               } else if(!ve.a(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   static {
      c = a;
      h = rf.a(40, "null");
      b = new qb();
   }
}
