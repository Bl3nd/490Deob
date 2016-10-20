final class ie extends sg {
   static int s;
   static int t;
   static h u;
   static int v;
   private h w;
   static int x;
   static int y;
   static int z;
   static int A;
   static int B;
   static int C;
   static int D;
   static ob E = rf.a(40, "Welt");
   static int[] F;
   static int G;
   static int H;
   pi I = new pi();
   static int J;
   u K = new u();

   static final boolean b(int var0, int var1, int var2) {
      try {
         ++z;
         if(~var1 == -12) {
            var1 = 10;
         }

         if(var1 >= 5 && var1 <= 8) {
            var1 = 4;
         }

         if(var0 != 23616) {
            a(91, false, -108, 120, 12, 8);
         }

         fc var3 = rf.b(var0 + -37714, var2);
         return var3.b(-36, var1);
      } catch (RuntimeException var4) {
         throw bc.a(var4, "ie.F(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   private final void a(int var1, int[] var2, int var3, int var4, lf var5, int var6) {
      int var12 = client.anInt_wb;

      try {
         ++J;
         if(~(this.w.mb[var5.t] & 4) != -1 && var5.q < 0) {
            int var7 = this.w.Ab[var5.t] / ki.sampleRate;

            while(true) {
               int var8 = (var7 + 1048575 + -var5.P) / var7;
               if(var8 > var4) {
                  break;
               }

               var5.L.a(var2, var1, var8);
               int var9 = ki.sampleRate / 100;
               var5.P += var7 * var8 + -1048576;
               var4 -= var8;
               int var10 = 262144 / var7;
               var1 += var8;
               if(~var10 > ~var9) {
                  var9 = var10;
               }

               td var11;
               label56: {
                  var11 = var5.L;
                  if(~this.w.N[var5.t] != -1) {
                     var5.L = td.a(var5.E, var11.j(), 0, var11.g());
                     this.w.a(-27, var5, var5.r.F[var5.s] < 0);
                     var5.L.c(var9, var11.e());
                     if(var12 == 0) {
                        break label56;
                     }
                  }

                  var5.L = td.a(var5.E, var11.j(), var11.e(), var11.g());
               }

               if(var5.r.F[var5.s] < 0) {
                  var5.L.g(-1);
               }

               var11.i(var9);
               var11.a(var2, var1, -var1 + var3);
               if(var11.k()) {
                  this.K.b(var11);
                  if(var12 != 0) {
                     break;
                  }
               }
            }

            var5.P += var4 * var7;
         }

         var5.L.a(var2, var1, var4);
         if(var6 != 0) {
            this.I = null;
         }
      } catch (RuntimeException var13) {
         throw bc.a(var13, "ie.H(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ',' + var4 + ',' + (var5 != null?"{...}":"null") + ',' + var6 + ')');
      }
   }

   static final kc[] a(int var0, int var1, int var2, pe var3) {
      try {
         if(var1 != 36) {
            F = null;
         }

         ++B;
         return !fb.a(var1 ^ -65, var0, var3, var2)?null:eb.c(false);
      } catch (RuntimeException var5) {
         throw bc.a(var5, "ie.E(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

   final void a(int[] var1, int var2, int var3) {
      int var7 = client.anInt_wb;

      try {
         ++s;
         this.K.a(var1, var2, var3);
         lf var6 = (lf)this.I.a((byte)-9);
         if(var7 != 0 || var6 != null) {
            do {
               if(!this.w.a(var6, (byte)74)) {
                  int var4 = var2;
                  int var5 = var3;
                  if(var7 == 0 && ~var6.A <= ~var3) {
                     this.a(var2, var1, var2 + var3, var3, var6, 0);
                     var6.A -= var3;
                  } else {
                     while(true) {
                        this.a(var4, var1, var5 + var4, var6.A, var6, 0);
                        var5 -= var6.A;
                        var4 += var6.A;
                        if(this.w.a(var4, var6, 2, var1, var5) && var7 == 0) {
                           break;
                        }

                        if(~var6.A <= ~var5) {
                           this.a(var4, var1, var4 + var5, var5, var6, 0);
                           var6.A -= var5;
                           break;
                        }
                     }
                  }
               }

               var6 = (lf)this.I.b((byte)-87);
            } while(var6 != null);

         }
      } catch (RuntimeException var8) {
         throw bc.a(var8, "ie.I(" + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void a(og var0, byte var1) {
      try {
         ++t;
         if(var1 != -101) {
            F = null;
         }

         if(qf.J != null) {
            try {
               qf.J.a((byte)14, 0L);
               qf.J.a(var0.buffer, var1 ^ 3725, var0.pointer, 24);
            } catch (Exception var3) {
               var3.printStackTrace();
            }
         }

         var0.pointer += 24;
      } catch (RuntimeException var4) {
         throw bc.a(var4, "ie.D(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   static final kc a(int var0, boolean var1, int var2, int var3, int var4, int var5) {
      int var19 = client.anInt_wb;

      try {
         ++C;
         long var6 = ((long)var5 << 246755816) + ((long)var0 << -927660506) + ((long)var4 << -317732784) + (long)var2;
         kc var8;
         if(!var1) {
            var8 = (kc)jf.T.a(var6, (byte)120);
            if(var8 != null) {
               return var8;
            }
         }

         ei var9 = jg.a((byte)-61, var2);
         if(~var4 < -2 && var9.P != null) {
            int var10 = -1;
            int var11 = 0;
            if(var19 != 0 || var11 < 10) {
               do {
                  if(var4 >= var9.H[var11] && ~var9.H[var11] != -1) {
                     var10 = var9.P[var11];
                  }

                  ++var11;
               } while(var11 < 10);
            }

            if(~var10 != 0) {
               var9 = jg.a((byte)-61, var10);
            }
         }

         he var21 = var9.g(128);
         if(var21 == null) {
            return null;
         } else {
            kc var22 = null;
            if(var9.ab != -1) {
               var22 = a(1, true, var9.T, -93, 10, 0);
               if(var22 == null) {
                  return null;
               }
            }

            int[] var12 = oi.D;
            int var13 = oi.E;
            int var14 = oi.H;
            int[] var15 = new int[4];
            oi.b(var15);
            var8 = new kc(36, 32);
            if(var3 >= -48) {
               a((og)null, (byte)60);
            }

            int var16;
            label78: {
               oi.a(var8.pixels, 36, 32);
               oi.a();
               ec.e();
               ec.d(16, 16);
               var16 = var9.L;
               ec.eb = false;
               if(var1) {
                  var16 = (int)((double)var16 * 1.5D);
                  if(var19 == 0) {
                     break label78;
                  }
               }

               if(~var0 == -3) {
                  var16 = (int)((double)var16 * 1.04D);
               }
            }

            int var17 = ec.W[var9.wb] * var16 >> -1403163216;
            int var18 = ec.L[var9.wb] * var16 >> -1042609200;
            var21.a(0, var9.lb, var9.yb, var9.wb, var9.tb, var17 - (var21.b() / 2 - var9.N), var18 - -var9.N);
            if(~var0 <= -2) {
               var8.f(1);
            }

            if(var0 >= 2) {
               var8.f(16777215);
            }

            if(~var5 != -1) {
               var8.g(var5);
            }

            oi.a(var8.pixels, 36, 32);
            if(var22 != null) {
               var22.c(0, 0);
            }

            if(!var1 && (var9.X == 1 || var4 != 1) && ~var4 != 0) {
               pc.l.a(vc.a(var4, true), 0, 9, 16776960, 1);
            }

            if(!var1) {
               jf.T.a(var8, (byte)-81, var6);
            }

            oi.a(var12, var13, var14);
            oi.a(var15);
            ec.e();
            ec.eb = true;
            return var8;
         }
      } catch (RuntimeException var20) {
         throw bc.a(var20, "ie.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   final int b() {
      try {
         ++A;
         return 0;
      } catch (RuntimeException var2) {
         throw bc.a(var2, "ie.FA(" + ')');
      }
   }

   final sg c() {
      try {
         ++x;
         lf var1 = (lf)this.I.a((byte)-9);
         return (sg)(var1 == null?null:(var1.L != null?var1.L:this.d()));
      } catch (RuntimeException var2) {
         throw bc.a(var2, "ie.U(" + ')');
      }
   }

   final sg d() {
      try {
         ++D;

         lf var1;
         do {
            var1 = (lf)this.I.b((byte)105);
            if(var1 == null) {
               return null;
            }
         } while(var1.L == null);

         return var1.L;
      } catch (RuntimeException var2) {
         throw bc.a(var2, "ie.B(" + ')');
      }
   }

   private final void a(byte var1, int var2, lf var3) {
      try {
         ++G;
         if((4 & this.w.mb[var3.t]) != 0 && var3.q < 0) {
            int var4 = this.w.Ab[var3.t] / ki.sampleRate;
            int var5 = (1048575 + (var4 - var3.P)) / var4;
            var3.P = 1048575 & var2 * var4 + var3.P;
            if(~var2 <= ~var5) {
               label39: {
                  if(this.w.N[var3.t] != 0) {
                     var3.L = td.a(var3.E, var3.L.j(), 0, var3.L.g());
                     this.w.a(-50, var3, ~var3.r.F[var3.s] > -1);
                     if(client.anInt_wb == 0) {
                        break label39;
                     }
                  }

                  var3.L = td.a(var3.E, var3.L.j(), var3.L.e(), var3.L.g());
               }

               if(~var3.r.F[var3.s] > -1) {
                  var3.L.g(-1);
               }

               var2 = var3.P / var4;
            }
         }

         var3.L.d(var2);
         if(var1 <= 24) {
            this.K = null;
         }
      } catch (RuntimeException var6) {
         throw bc.a(var6, "ie.G(" + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

   public static void a(boolean var0) {
      try {
         E = null;
         if(!var0) {
            F = null;
            u = null;
         }
      } catch (RuntimeException var2) {
         throw bc.a(var2, "ie.C(" + var0 + ')');
      }
   }

   final void d(int var1) {
      int var4 = client.anInt_wb;

      try {
         this.K.d(var1);
         ++H;
         lf var3 = (lf)this.I.a((byte)-9);
         if(var4 != 0 || var3 != null) {
            do {
               if(!this.w.a(var3, (byte)74)) {
                  int var2 = var1;
                  if(var4 == 0 && var1 <= var3.A) {
                     this.a((byte)102, var1, var3);
                     var3.A -= var1;
                  } else {
                     while(true) {
                        this.a((byte)104, var3.A, var3);
                        var2 -= var3.A;
                        if(this.w.a(0, var3, 2, (int[])null, var2) && var4 == 0) {
                           break;
                        }

                        if(var2 <= var3.A) {
                           this.a((byte)102, var2, var3);
                           var3.A -= var2;
                           break;
                        }
                     }
                  }
               }

               var3 = (lf)this.I.b((byte)-127);
            } while(var3 != null);

         }
      } catch (RuntimeException var5) {
         throw bc.a(var5, "ie.GA(" + var1 + ')');
      }
   }

   ie(h var1) {
      try {
         this.w = var1;
      } catch (RuntimeException var3) {
         throw bc.a(var3, "ie.<init>(" + (var1 != null?"{...}":"null") + ')');
      }
   }
}
