final class je extends af {
   static ob R;
   static ob S;
   private static ob T = rf.a(40, "Please wait 5 minutes before trying again)3");
   private static ob U;
   static int V;
   static ob W;
   private static ob andChooseTheCreateAccount = rf.a(40, "and choose the (Wcreate account(W");
   static ob Y;
   static int Z;
   static int ab;
   private int bb = 4;
   static ob andChooseTheCreateAccount2;
   static int db;
   private int eb = 4;

   final int[][] b(int var1, byte var2) {
      int var17 = client.anInt_wb;

      try {
         int var4 = 84 / ((var2 - -42) / 41);
         int[][] var3 = super.ve_s.a(var1, (byte)45);
         ++db;
         if(super.ve_s.u) {
            int[][] var5;
            int var6;
            label36: {
               var6 = lh.eb / this.eb;
               int var7 = fi.q / this.bb;
               if(var7 > 0) {
                  int var8 = var1 % var7;
                  var5 = this.b(fi.q * var8 / var7, 87, 0);
                  if(var17 == 0) {
                     break label36;
                  }
               }

               var5 = this.b(0, 103, 0);
            }

            int[] var19 = var5[0];
            int[] var9 = var5[1];
            int[] var11 = var3[0];
            int[] var10 = var5[2];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            int var14 = 0;
            if(var17 != 0 || ~lh.eb < ~var14) {
               do {
                  int var15;
                  label29: {
                     if(var6 <= 0) {
                        var15 = 0;
                        if(var17 == 0) {
                           break label29;
                        }
                     }

                     int var16 = var14 % var6;
                     var15 = var16 * lh.eb / var6;
                  }

                  var11[var14] = var19[var15];
                  var12[var14] = var9[var15];
                  var13[var14] = var10[var15];
                  ++var14;
               } while(~lh.eb < ~var14);
            }
         }

         return var3;
      } catch (RuntimeException var18) {
         throw bc.a(var18, "je.G(" + var1 + ',' + var2 + ')');
      }
   }

   public je() {
      super(1, false);
   }

   final int[] a(byte var1, int var2) {
      int var9 = client.anInt_wb;

      try {
         if(var1 < 13) {
            S = null;
         }

         ++ab;
         int[] var3 = super.nd_v.a(var2, 12);
         if(super.nd_v.n) {
            int[] var4;
            int var5;
            int var7;
            label44: {
               var5 = lh.eb / this.eb;
               int var6 = fi.q / this.bb;
               if(var6 > 0) {
                  var7 = var2 % var6;
                  var4 = this.c(var7 * fi.q / var6, 0, 56);
                  if(var9 == 0) {
                     break label44;
                  }
               }

               var4 = this.c(0, 0, 74);
            }

            var7 = 0;
            if(var9 != 0 || ~var7 > ~lh.eb) {
               do {
                  if(var5 > 0) {
                     int var8 = var7 % var5;
                     var3[var7] = var4[lh.eb * var8 / var5];
                     if(var9 != 0) {
                        var3[var7] = var4[0];
                        ++var7;
                     } else {
                        ++var7;
                     }
                  } else {
                     var3[var7] = var4[0];
                     ++var7;
                  }
               } while(~var7 > ~lh.eb);
            }
         }

         return var3;
      } catch (RuntimeException var10) {
         throw bc.a(var10, "je.F(" + var1 + ',' + var2 + ')');
      }
   }

   final void a(int var1, int var2, og var3) {
      int var6 = client.anInt_wb;

      try {
         label30: {
            label29: {
               int var4 = -18 % ((66 - var2) / 57);
               if(~var1 != -1) {
                  if(var1 != 1) {
                     break label30;
                  }

                  if(var6 == 0) {
                     break label29;
                  }
               }

               this.eb = var3.readUnsignedByte(255);
               if(var6 == 0) {
                  break label30;
               }
            }

            this.bb = var3.readUnsignedByte(255);
         }

         ++V;
      } catch (RuntimeException var7) {
         throw bc.a(var7, "je.B(" + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

   public static void i(int var0) {
      try {
         Y = null;
         andChooseTheCreateAccount = null;
         S = null;
         R = null;
         W = null;
         U = null;
         if(var0 != 2) {
            Z = -35;
         }

         andChooseTheCreateAccount2 = null;
         T = null;
      } catch (RuntimeException var2) {
         throw bc.a(var2, "je.A(" + var0 + ')');
      }
   }

   static {
      andChooseTheCreateAccount2 = andChooseTheCreateAccount;
      W = T;
      U = rf.a(40, "flash2:");
      Y = U;
      R = rf.a(40, "Bitte versuchen Sie es erneut)3");
      S = U;
      Z = 0;
   }
}
