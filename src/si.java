final class si extends af {
   private int R = 1365;
   static int S = 0;
   private int T = 0;
   static int U;
   static ob[] V = new ob[200];
   private int W = 0;
   private int X = 20;
   private static ob Y = rf.a(40, "glow1:");
   static ob Z;
   static ob ab;
   static int bb;
   static int[] cb;
   static int db;

   final void a(int var1, int var2, og var3) {
      int var6 = client.anInt_wb;

      try {
         label44: {
            label43: {
               label42: {
                  label41: {
                     int var4 = -48 % ((66 - var2) / 57);
                     if(~var1 != -1) {
                        if(~var1 == -2) {
                           break label41;
                        }

                        if(var1 == 2) {
                           break label42;
                        }

                        if(var1 != 3) {
                           break label44;
                        }

                        if(var6 == 0) {
                           break label43;
                        }
                     }

                     this.R = var3.readShort(127);
                     if(var6 == 0) {
                        break label44;
                     }
                  }

                  this.X = var3.readShort(123);
                  if(var6 == 0) {
                     break label44;
                  }
               }

               this.T = var3.readShort(46);
               if(var6 == 0) {
                  break label44;
               }
            }

            this.W = var3.readShort(84);
         }

         ++bb;
      } catch (RuntimeException var7) {
         throw bc.a(var7, "si.B(" + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

   public static void b(boolean var0) {
      try {
         if(var0) {
            Z = null;
            V = null;
            Y = null;
            cb = null;
            ab = null;
         }
      } catch (RuntimeException var2) {
         throw bc.a(var2, "si.A(" + var0 + ')');
      }
   }

   public si() {
      super(0, true);
   }

   final int[] a(byte var1, int var2) {
      int var14 = client.anInt_wb;

      try {
         if(var1 <= 13) {
            this.a(41, -21, (og)null);
         }

         ++U;
         int[] var3 = super.nd_v.a(var2, 12);
         if(super.nd_v.n) {
            int var4 = 0;
            if(var14 != 0 || ~var4 > ~lh.eb) {
               do {
                  int var5 = this.T + (bd.J[var4] << 401548972) / this.R;
                  int var6 = (rh.r[var2] << -1613536084) / this.R - -this.W;
                  int var7 = var5;
                  int var8 = var6;
                  int var9 = var5;
                  int var11 = var5 * var5 >> 1161734412;
                  int var12 = var6 * var6 >> 1757066156;
                  int var13 = 0;
                  int var10 = var6;
                  if(var14 != 0 || var11 + var12 < 16384 && ~var13 > ~this.X) {
                     do {
                        ++var13;
                        var10 = (var9 * var10 >> -1906423444) * 2 + var8;
                        var9 = var7 + -var12 + var11;
                        var12 = var10 * var10 >> -1465346900;
                        var11 = var9 * var9 >> 1940009228;
                     } while(var11 + var12 < 16384 && ~var13 > ~this.X);
                  }

                  var3[var4] = ~var13 <= ~(this.X + -1)?0:(var13 << 1913800684) / this.X;
                  ++var4;
               } while(~var4 > ~lh.eb);
            }
         }

         return var3;
      } catch (RuntimeException var15) {
         throw bc.a(var15, "si.F(" + var1 + ',' + var2 + ')');
      }
   }

   static {
      Z = Y;
      ab = Y;
      db = 0;
      cb = new int[2048];
   }
}
