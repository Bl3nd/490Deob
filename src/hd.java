final class hd {
   private int[] a;
   private int b;
   private float[][] c;
   int d;
   private int[] e;
   private int[] f;

   final float[] a() {
      return this.c[this.c()];
   }

   private final void b() {
      int[] var1 = new int[this.b];
      int[] var2 = new int[33];

      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      for(int var3 = 0; var3 < this.b; ++var3) {
         var4 = this.a[var3];
         if(var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            if((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if(var9 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if(var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.f = new int[8];
      var4 = 0;

      for(var5 = 0; var5 < this.b; ++var5) {
         var6 = this.a[var5];
         if(var6 != 0) {
            var7 = var1[var5];
            var8 = 0;

            for(var9 = 0; var9 < var6; ++var9) {
               var10 = Integer.MIN_VALUE >>> var9;
               if((var7 & var10) != 0) {
                  if(this.f[var8] == 0) {
                     this.f[var8] = var4;
                  }

                  var8 = this.f[var8];
               } else {
                  ++var8;
               }

               if(var8 >= this.f.length) {
                  int[] var11 = new int[this.f.length * 2];

                  for(int var12 = 0; var12 < this.f.length; ++var12) {
                     var11[var12] = this.f[var12];
                  }

                  this.f = var11;
               }

               var10 >>>= 1;
            }

            this.f[var8] = ~var5;
            if(var8 >= var4) {
               var4 = var8 + 1;
            }
         }
      }

   }

   private static final int a(int var0, int var1) {
      int var2;
      for(var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; sf.a(var2, var1, true) > var0; --var2) {
         ;
      }

      return var2;
   }

   final int c() {
      int var1;
      for(var1 = 0; this.f[var1] >= 0; var1 = cg.b() != 0?this.f[var1]:var1 + 1) {
         ;
      }

      return ~this.f[var1];
   }

   hd() {
      cg.f(24);
      this.d = cg.f(16);
      this.b = cg.f(24);
      this.a = new int[this.b];
      boolean var1 = cg.b() != 0;
      int var2;
      int var3;
      int var5;
      if(var1) {
         var2 = 0;

         for(var3 = cg.f(5) + 1; var2 < this.b; ++var3) {
            int var4 = cg.f(ld.b(this.b - var2, 16));

            for(var5 = 0; var5 < var4; ++var5) {
               this.a[var2++] = var3;
            }
         }
      } else {
         boolean var15 = cg.b() != 0;

         for(var3 = 0; var3 < this.b; ++var3) {
            if(var15 && cg.b() == 0) {
               this.a[var3] = 0;
            } else {
               this.a[var3] = cg.f(5) + 1;
            }
         }
      }

      this.b();
      var2 = cg.f(4);
      if(var2 > 0) {
         float var16 = cg.e(cg.f(32));
         float var17 = cg.e(cg.f(32));
         var5 = cg.f(4) + 1;
         boolean var6 = cg.b() != 0;
         int var7;
         if(var2 == 1) {
            var7 = a(this.b, this.d);
         } else {
            var7 = this.b * this.d;
         }

         this.e = new int[var7];

         for(int var8 = 0; var8 < var7; ++var8) {
            this.e[var8] = cg.f(var5);
         }

         this.c = new float[this.b][this.d];
         int var9;
         float var10;
         int var11;
         int var12;
         if(var2 == 1) {
            for(var9 = 0; var9 < this.b; ++var9) {
               var10 = 0.0F;
               var11 = 1;

               for(var12 = 0; var12 < this.d; ++var12) {
                  int var18 = var9 / var11 % var7;
                  float var14 = (float)this.e[var18] * var17 + var16 + var10;
                  this.c[var9][var12] = var14;
                  if(var6) {
                     var10 = var14;
                  }

                  var11 *= var7;
               }
            }

            return;
         }

         for(var9 = 0; var9 < this.b; ++var9) {
            var10 = 0.0F;
            var11 = var9 * this.d;

            for(var12 = 0; var12 < this.d; ++var12) {
               float var13 = (float)this.e[var11] * var17 + var16 + var10;
               this.c[var9][var12] = var13;
               if(var6) {
                  var10 = var13;
               }

               ++var11;
            }
         }
      }

   }
}
