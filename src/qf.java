final class qf extends vd {
   int[] o;
   int p;
   int q;
   int r;
   static int s;
   td t;
   static hb u = new hb(0, 0);
   static int v;
   int w;
   fc x;
   static int[] y;
   int z;
   td A;
   int B;
   int C;
   int D;
   int F;
   static byte[] G = new byte[520];
   static i H;
   static int I = 0;
   static ja J;
   int K;
   static int L = 127;
   static ob M = rf.a(40, "Null");
   static int N = 0;
   static ob O = rf.a(40, "<br>(X");
   static ob P = rf.a(40, "Diese Welt ist voll)3");
   static int Q;
   static int R = 0;

   static final void a(int var0, byte[] var1, int var2, int var3, hi[] var4) {
      int var20 = client.anInt_wb;

      try {
         ++s;
         og var5 = new og(var1);
         int var6 = -1;

         do {
            int var7 = var5.o(-87);
            if(~var7 == -1) {
               break;
            }

            var6 += var7;
            int var8 = 0;

            while(true) {
               int var9 = var5.r(-2);
               if(var9 == 0) {
                  break;
               }

               var8 += -1 + var9;
               int var10 = var8 & 63;
               int var11 = 63 & var8 >> 992982630;
               int var12 = var8 >> 1331688108;
               int var13 = var5.readUnsignedByte(255);
               int var14 = var13 >> 1608047554;
               int var16 = var11 - -var2;
               int var15 = 3 & var13;
               int var17 = var3 + var10;
               if(~var16 < -1 && ~var17 < -1 && ~var16 > -104 && ~var17 > -104) {
                  int var18 = var12;
                  if(~(qe.r[1][var16][var17] & 2) == -3) {
                     var18 = var12 - 1;
                  }

                  hi var19 = null;
                  if(~var18 <= -1) {
                     var19 = var4[var18];
                  }

                  af.a(var15, var16, (byte)70, var6, var12, ag.forceSend, var17, var12, var14, true, var19);
                  if(var20 != 0) {
                     break;
                  }
               }
            }
         } while(var20 == 0);

         if(var0 != -15497) {
            u = null;
         }
      } catch (RuntimeException var21) {
         throw bc.a(var21, "qf.B(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ',' + (var4 != null?"{...}":"null") + ')');
      }
   }

   final void d(int var1) {
      try {
         ++v;
         int var2 = this.r;
         fc var3 = this.x.e((byte)-3);
         if(var1 != 0) {
            a(9, 2, 0, 48, 116, 17, 54, 20, 82, -53, -36, -60, 19, -23, -76, -79, 107, 108, -58, 108);
         }

         if(var3 == null) {
            this.o = null;
            this.z = 0;
            this.r = -1;
            this.D = 0;
            this.w = 0;
         } else {
            this.w = var3.sb;
            this.r = var3.Hb;
            this.D = var3.Bb;
            this.o = var3.nb;
            this.z = 128 * var3.xb;
         }

         if(~var2 != ~this.r && this.t != null) {
            ub.d.a((sg)this.t);
            this.t = null;
         }
      } catch (RuntimeException var4) {
         throw bc.a(var4, "qf.C(" + var1 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19) {
      hf var20;
      int var21;
      if(var3 == 0) {
         var20 = new hf(var10, var11, var12, var13, -1, var18, false);

         for(var21 = var0; var21 >= 0; --var21) {
            if(nb.oc[var21][var1][var2] == null) {
               nb.oc[var21][var1][var2] = new pd(var21, var1, var2);
            }
         }

         nb.oc[var0][var1][var2].H = var20;
      } else if(var3 != 1) {
         kb var22 = new kb(var3, var4, var5, var1, var2, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19);

         for(var21 = var0; var21 >= 0; --var21) {
            if(nb.oc[var21][var1][var2] == null) {
               nb.oc[var21][var1][var2] = new pd(var21, var1, var2);
            }
         }

         nb.oc[var0][var1][var2].A = var22;
      } else {
         var20 = new hf(var14, var15, var16, var17, var5, var19, var6 == var7 && var6 == var8 && var6 == var9);

         for(var21 = var0; var21 >= 0; --var21) {
            if(nb.oc[var21][var1][var2] == null) {
               nb.oc[var21][var1][var2] = new pd(var21, var1, var2);
            }
         }

         nb.oc[var0][var1][var2].H = var20;
      }
   }

   public static void e(int var0) {
      try {
         P = null;
         y = null;
         H = null;
         O = null;
         J = null;
         G = null;
         if(var0 < -99) {
            u = null;
            M = null;
         }
      } catch (RuntimeException var2) {
         throw bc.a(var2, "qf.A(" + var0 + ')');
      }
   }
}
