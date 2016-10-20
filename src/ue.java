import java.util.zip.CRC32;

final class ue extends af {
   static fa[] R;
   static ob S;
   private static ob T;
   private int U = 4096;
   private static ob V = rf.a(40, "Too many incorrect logins from your address)3");
   static int W;
   static ob X;
   private int Y = 4096;
   private int Z = 4096;
   static int ab;
   private static ob bb = rf.a(40, "Sorry invited players only)3");
   static int cb;
   static ob db;
   static int eb;
   static ob fb;
   static int[] gb;
   static CRC32 hb;
   static ra ib;
   static vc jb;

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if(var1 > -116) {
            fb = null;
         }

         ++cb;
         if(~var7 == ~var0) {
            ca.a(var6, var0, var2, -17360, var5, var4, var3);
         } else if(gh.R <= -var0 + var2 && ng.u >= var0 + var2 && dd.a <= -var7 + var3 && var7 + var3 <= na.anInt_m) {
            na.a(var0, var6, var3, var4, false, var2, var7, var5);
         } else {
            hg.a(var5, var7, (byte)-97, var0, var2, var6, var3, var4);
         }
      } catch (RuntimeException var9) {
         throw bc.a(var9, "ue.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }

   final void a(int var1, int var2, og var3) {
      int var5 = client.anInt_wb;

      try {
         label37: {
            label36: {
               label35: {
                  if(~var1 != -1) {
                     if(var1 == 1) {
                        break label35;
                     }

                     if(~var1 != -3) {
                        break label37;
                     }

                     if(var5 == 0) {
                        break label36;
                     }
                  }

                  this.Z = var3.readShort(66);
                  if(var5 == 0) {
                     break label37;
                  }
               }

               this.Y = var3.readShort(107);
               if(var5 == 0) {
                  break label37;
               }
            }

            this.U = var3.readShort(52);
         }

         ++ab;
         int var4 = 22 / ((var2 - 66) / 57);
      } catch (RuntimeException var6) {
         throw bc.a(var6, "ue.B(" + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

   public ue() {
      super(1, false);
   }

   public static void i(int var0) {
      try {
         gb = null;
         fb = null;
         if(var0 != 4096) {
            X = null;
         }

         hb = null;
         S = null;
         db = null;
         jb = null;
         T = null;
         V = null;
         ib = null;
         X = null;
         bb = null;
         R = null;
      } catch (RuntimeException var2) {
         throw bc.a(var2, "ue.C(" + var0 + ')');
      }
   }

   final int[][] b(int var1, byte var2) {
      int var16 = client.anInt_wb;

      try {
         ++W;
         int var3 = -88 % ((var2 - -42) / 41);
         int[][] var4 = super.ve_s.a(var1, (byte)45);
         if(super.ve_s.u) {
            int[][] var5 = this.b(var1, 100, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var11 = var4[2];
            int[] var10 = var4[1];
            int var12 = 0;
            if(var16 != 0 || lh.eb > var12) {
               do {
                  int var14 = var8[var12];
                  int var15 = var7[var12];
                  int var13 = var6[var12];
                  if(~var13 != ~var14 || var14 != var15) {
                     var9[var12] = this.Z;
                     var10[var12] = this.Y;
                     var11[var12] = this.U;
                     if(var16 == 0) {
                        ++var12;
                        continue;
                     }
                  }

                  var9[var12] = var13 * this.Z >> 153035660;
                  var10[var12] = var14 * this.Y >> 2007276588;
                  var11[var12] = var15 * this.U >> 75331500;
                  ++var12;
               } while(lh.eb > var12);
            }
         }

         return var4;
      } catch (RuntimeException var17) {
         throw bc.a(var17, "ue.G(" + var1 + ',' + var2 + ')');
      }
   }

   static final ra a(int var0, byte var1, int var2) {
      try {
         ++eb;
         ra var3 = tc.b(var2, (int)-92);
         if(var1 != 56) {
            X = null;
         }

         return ~var0 == 0?var3:(var3 != null && var3.xb != null && var0 < var3.xb.length?var3.xb[var0]:null);
      } catch (RuntimeException var4) {
         throw bc.a(var4, "ue.D(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   static {
      S = bb;
      X = V;
      T = rf.a(40, "This computers address has been blocked");
      fb = T;
      gb = new int[1000];
      db = rf.a(40, " (X");
      ib = null;
      hb = new CRC32();
      jb = new vc(5);
   }
}
