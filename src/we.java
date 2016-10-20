final class we {
   int[] a = new int[2];
   private static float[][] b = new float[2][8];
   private int[][][] c = new int[2][2][4];
   private static float d;
   private int[][][] e = new int[2][2][4];
   static int[][] f = new int[2][8];
   private int[] g = new int[2];
   static int h;

   private final float a(int var1, int var2, float var3) {
      float var4 = (float)this.e[var1][0][var2] + var3 * (float)(this.e[var1][1][var2] - this.e[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return a(var4);
   }

   private static final float a(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }

   final int a(int var1, float var2) {
      float var3;
      if(var1 == 0) {
         var3 = (float)this.g[0] + (float)(this.g[1] - this.g[0]) * var2;
         var3 *= 0.0030517578F;
         d = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         h = (int)(d * 65536.0F);
      }

      if(this.a[var1] == 0) {
         return 0;
      } else {
         var3 = this.b(var1, 0, var2);
         b[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.a(var1, 0, var2));
         b[var1][1] = var3 * var3;

         for(int var4 = 1; var4 < this.a[var1]; ++var4) {
            var3 = this.b(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.a(var1, var4, var2));
            float var6 = var3 * var3;
            b[var1][var4 * 2 + 1] = b[var1][var4 * 2 - 1] * var6;
            b[var1][var4 * 2] = b[var1][var4 * 2 - 1] * var5 + b[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               b[var1][var7] += b[var1][var7 - 1] * var5 + b[var1][var7 - 2] * var6;
            }

            b[var1][1] += b[var1][0] * var5 + var6;
            b[var1][0] += var5;
         }

         int var8;
         if(var1 == 0) {
            for(var8 = 0; var8 < this.a[0] * 2; ++var8) {
               b[0][var8] *= d;
            }
         }

         for(var8 = 0; var8 < this.a[var1] * 2; ++var8) {
            f[var1][var8] = (int)(b[var1][var8] * 65536.0F);
         }

         return this.a[var1] * 2;
      }
   }

   public static void a() {
      b = null;
      f = null;
   }

   final void a(og var1, j var2) {
      int var3 = var1.readUnsignedByte(255);
      this.a[0] = var3 >> 4;
      this.a[1] = var3 & 15;
      if(var3 == 0) {
         this.g[0] = this.g[1] = 0;
      } else {
         this.g[0] = var1.readShort(86);
         this.g[1] = var1.readShort(121);
         int var4 = var1.readUnsignedByte(255);

         int var6;
         for(int var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.a[var5]; ++var6) {
               this.e[var5][0][var6] = var1.readShort(61);
               this.c[var5][0][var6] = var1.readShort(118);
            }
         }

         for(var6 = 0; var6 < 2; ++var6) {
            for(int var7 = 0; var7 < this.a[var6]; ++var7) {
               if((var4 & 1 << var6 * 4 << var7) != 0) {
                  this.e[var6][1][var7] = var1.readShort(50);
                  this.c[var6][1][var7] = var1.readShort(77);
               } else {
                  this.e[var6][1][var7] = this.e[var6][0][var7];
                  this.c[var6][1][var7] = this.c[var6][0][var7];
               }
            }
         }

         if(var4 != 0 || this.g[1] != this.g[0]) {
            var2.b(var1);
         }

      }
   }

   private final float b(int var1, int var2, float var3) {
      float var4 = (float)this.c[var1][0][var2] + var3 * (float)(this.c[var1][1][var2] - this.c[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }
}
