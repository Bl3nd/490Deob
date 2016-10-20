final class vh {
   private int a = cg.f(24);
   private int b = cg.f(24);
   private int c = cg.f(6) + 1;
   private int[] d;
   private int e = cg.f(8);
   private int f = cg.f(16);
   private int g = cg.f(24) + 1;

   final void a(float[] var1, int var2, boolean var3) {
      for(int var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if(!var3) {
         int var5 = cg.E[this.e].d;
         int var6 = this.b - this.a;
         int var7 = var6 / this.g;
         int[] var8 = new int[var7];

         for(int var9 = 0; var9 < 8; ++var9) {
            int var10 = 0;

            while(var10 < var7) {
               int var11;
               int var12;
               if(var9 == 0) {
                  var11 = cg.E[this.e].c();

                  for(var12 = var5 - 1; var12 >= 0; --var12) {
                     if(var10 + var12 < var7) {
                        var8[var10 + var12] = var11 % this.c;
                     }

                     var11 /= this.c;
                  }
               }

               for(var11 = 0; var11 < var5; ++var11) {
                  var12 = var8[var10];
                  int var13 = this.d[var12 * 8 + var9];
                  if(var13 >= 0) {
                     int var14 = this.a + var10 * this.g;
                     hd var15 = cg.E[var13];
                     int var16;
                     if(this.f == 0) {
                        var16 = this.g / var15.d;

                        for(int var20 = 0; var20 < var16; ++var20) {
                           float[] var21 = var15.a();

                           for(int var19 = 0; var19 < var15.d; ++var19) {
                              var1[var14 + var20 + var19 * var16] += var21[var19];
                           }
                        }
                     } else {
                        var16 = 0;

                        while(var16 < this.g) {
                           float[] var17 = var15.a();

                           for(int var18 = 0; var18 < var15.d; ++var18) {
                              var1[var14 + var16] += var17[var18];
                              ++var16;
                           }
                        }
                     }
                  }

                  ++var10;
                  if(var10 >= var7) {
                     break;
                  }
               }
            }
         }

      }
   }

   vh() {
      int[] var1 = new int[this.c];

      int var3;
      for(int var2 = 0; var2 < this.c; ++var2) {
         var3 = 0;
         int var4 = cg.f(3);
         boolean var5 = cg.b() != 0;
         if(var5) {
            var3 = cg.f(5);
         }

         var1[var2] = var3 << 3 | var4;
      }

      this.d = new int[this.c * 8];

      for(var3 = 0; var3 < this.c * 8; ++var3) {
         this.d[var3] = (var1[var3 >> 3] & 1 << (var3 & 7)) != 0?cg.f(8):-1;
      }

   }
}
