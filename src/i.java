final class i extends nh {
   i(byte[] var1) {
      super(var1);
   }

   final void f(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * oi.E;
      int var8 = oi.E - var4;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if(var3 < oi.F) {
         var11 = oi.F - var3;
         var5 -= var11;
         var3 = oi.F;
         var10 += var11 * var4;
         var7 += var11 * oi.E;
      }

      if(var3 + var5 > oi.I) {
         var5 -= var3 + var5 - oi.I;
      }

      if(var2 < oi.J) {
         var11 = oi.J - var2;
         var4 -= var11;
         var2 = oi.J;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if(var2 + var4 > oi.G) {
         var11 = var2 + var4 - oi.G;
         var4 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if(var4 > 0 && var5 > 0) {
         nh.a(oi.D, super.jb[var1], var6, var10, var7, var4, var5, var8, var9);
      }
   }

   i(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var3 * oi.E;
      int var9 = oi.E - var4;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if(var3 < oi.F) {
         var12 = oi.F - var3;
         var5 -= var12;
         var3 = oi.F;
         var11 += var12 * var4;
         var8 += var12 * oi.E;
      }

      if(var3 + var5 > oi.I) {
         var5 -= var3 + var5 - oi.I;
      }

      if(var2 < oi.J) {
         var12 = oi.J - var2;
         var4 -= var12;
         var2 = oi.J;
         var11 += var12;
         var8 += var12;
         var10 += var12;
         var9 += var12;
      }

      if(var2 + var4 > oi.G) {
         var12 = var2 + var4 - oi.G;
         var4 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if(var4 > 0 && var5 > 0) {
         nh.a(oi.D, super.jb[var1], var6, var11, var8, var4, var5, var9, var10, var7);
      }
   }
}
