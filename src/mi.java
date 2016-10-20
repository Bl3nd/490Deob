final class mi extends af {
   static ob R = rf.a(40, "Sprites geladen)3");
   static int S = -1;
   static ob clientscriptErrorIn = rf.a(40, "Clientscript error in: ");
   static int U;
   static int V;
   static vc W = new vc(20);
   static int X;
   static ob Y = rf.a(40, "W-=hlen Sie eine Option");
   static int sl_buttonValue = -1;
   static int sl_starsValue = -1;

   final int[] a(byte var1, int var2) {
      int var6 = client.anInt_wb;

      try {
         ++U;
         if(var1 < 13) {
            this.a((byte)-71, 107);
         }

         int[] var3 = super.nd_v.a(var2, 12);
         if(super.nd_v.n) {
            int[] var4 = this.c(var2, 0, 33);
            int var5 = 0;
            if(var6 != 0 || ~var5 > ~lh.eb) {
               do {
                  var3[var5] = -var4[var5] + 4096;
                  ++var5;
               } while(~var5 > ~lh.eb);
            }
         }

         return var3;
      } catch (RuntimeException var7) {
         throw bc.a(var7, "mi.F(" + var1 + ',' + var2 + ')');
      }
   }

   public static void i(int var0) {
      try {
         Y = null;
         if(var0 == 22817) {
            W = null;
            clientscriptErrorIn = null;
            R = null;
         }
      } catch (RuntimeException var2) {
         throw bc.a(var2, "mi.A(" + var0 + ')');
      }
   }

   public mi() {
      super(1, false);
   }

   final void a(int var1, int var2, og var3) {
      try {
         if(~var1 == -1) {
            super.u = ~var3.readUnsignedByte(255) == -2;
         }

         int var4 = 105 / ((var2 - 66) / 57);
         ++X;
      } catch (RuntimeException var5) {
         throw bc.a(var5, "mi.B(" + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

   final int[][] b(int var1, byte var2) {
      int var13 = client.anInt_wb;

      try {
         int var4 = 105 / ((var2 - -42) / 41);
         ++V;
         int[][] var3 = super.ve_s.a(var1, (byte)45);
         if(super.ve_s.u) {
            int[][] var5 = this.b(var1, 115, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            int[] var9 = var3[0];
            int var12 = 0;
            if(var13 != 0 || var12 < lh.eb) {
               do {
                  var9[var12] = 4096 - var6[var12];
                  var10[var12] = 4096 + -var7[var12];
                  var11[var12] = -var8[var12] + 4096;
                  ++var12;
               } while(var12 < lh.eb);
            }
         }

         return var3;
      } catch (RuntimeException var14) {
         throw bc.a(var14, "mi.G(" + var1 + ',' + var2 + ')');
      }
   }
}
