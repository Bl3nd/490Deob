final class he extends fe {
   private short P;
   private int[] Q;
   private boolean R = false;
   private static he S = new he();
   private byte[] T;
   private int[] U;
   private short V;
   private int[][] W;
   private int[] X;
   private int[] Y;
   private short Z;
   private short ab;
   private int bb = 0;
   private int[] cb;
   private int[] db;
   private int[] eb;
   private int[] fb;
   private int[] gb;
   private int hb = 0;
   private byte ib = 0;
   private byte[] jb;
   private int kb = 0;
   private int[] lb;
   private short[] mb;
   private int[][] nb;
   private short ob;
   private byte[] pb;
   private short qb;
   private int[] rb;
   private short sb;
   private int[] tb;
   private short ub;
   private static he vb = new he();
   private static byte[] wb = new byte[1];
   private static int[] xb = new int[1600];
   private static int[] yb = new int[10];
   private static int zb;
   private static int[] Ab = new int[4096];
   private static boolean[] Bb = new boolean[4096];
   private static int Cb;
   private static int[][] Db = new int[1600][512];
   private static int[] Eb = new int[4096];
   private static int[] Fb = new int[10];
   private static boolean[] Gb = new boolean[4096];
   private static int[] Hb = new int[12];
   private static int[] Ib = new int[10];
   private static int[] Jb = new int[12];
   private static int Kb;
   private static int[] Lb = new int[4096];
   private static int[][] Mb = new int[12][4096];
   private static int[] Nb = new int[4096];
   private static int[] Ob = new int[4096];
   private static byte[] Pb = new byte[1];
   private static int[] Qb = new int[4096];
   private static int[] Rb = new int[4096];
   private static int[] Sb = new int[4096];

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      if(!this.R) {
         this.h();
      }

      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = var12 + (this.ob * var3 + this.V * var2 >> 16);
      if(var13 > 50) {
         int var14 = var12 + (-this.ob * var3 + this.ab * var2 >> 16);
         if(var14 < 3500) {
            int var15 = var8 * var4 + var6 * var5 >> 16;
            int var16 = var15 + this.ob << 9;
            if(var16 / var13 > ec.Y) {
               int var17 = var15 - this.ob << 9;
               if(var17 / var13 < ec.X) {
                  int var18 = var7 * var3 - var11 * var2 >> 16;
                  int var19 = var18 + (this.ob * var2 + this.V * var3 >> 16) << 9;
                  if(var19 / var13 > ec.db) {
                     int var20 = var18 + (-this.ob * var2 + this.ab * var3 >> 16) << 9;
                     if(var20 / var13 < ec.V) {
                        boolean var21 = false;
                        boolean var22 = var14 <= 50;
                        boolean var23 = var22 || this.hb > 0;
                        int var24 = ec.P;
                        int var25 = ec.M;
                        int var26 = 0;
                        int var27 = 0;
                        if(var1 != 0) {
                           var26 = ec.W[var1];
                           var27 = ec.L[var1];
                        }

                        boolean var28 = false;
                        int var29;
                        int var30;
                        int var31;
                        int var32;
                        int var33;
                        if(var9 > 0L && jc.S && var14 > 0) {
                           if(var15 > 0) {
                              var29 = var17 / var13;
                              var31 = var16 / var14;
                           } else {
                              var29 = var17 / var14;
                              var31 = var16 / var13;
                           }

                           if(var18 > 0) {
                              var30 = var20 / var13;
                              var32 = var19 / var14;
                           } else {
                              var30 = var20 / var14;
                              var32 = var19 / var13;
                           }

                           var33 = ug.v - ec.P;
                           int var34 = fi.f - ec.M;
                           if(var33 >= var29 && var33 <= var31 && var34 >= var30 && var34 <= var32) {
                              var29 = 999999;
                              var31 = -999999;
                              var30 = 999999;
                              var32 = -999999;
                              int[] var35 = new int[]{this.qb, this.Z, this.qb, this.Z, this.qb, this.Z, this.qb, this.Z};
                              int[] var36 = new int[]{this.ub, this.ub, this.sb, this.sb, this.ub, this.ub, this.sb, this.sb};
                              int[] var37 = new int[]{this.ab, this.ab, this.ab, this.ab, this.V, this.V, this.V, this.V};

                              for(int var38 = 0; var38 < 8; ++var38) {
                                 int var39 = var35[var38];
                                 int var40 = var37[var38];
                                 int var41 = var36[var38];
                                 int var42;
                                 if(var1 != 0) {
                                    var42 = var41 * var26 + var39 * var27 >> 16;
                                    var41 = var41 * var27 - var39 * var26 >> 16;
                                    var39 = var42;
                                 }

                                 var39 += var6;
                                 var40 += var7;
                                 var41 += var8;
                                 var42 = var41 * var4 + var39 * var5 >> 16;
                                 var41 = var41 * var5 - var39 * var4 >> 16;
                                 var39 = var42;
                                 var42 = var40 * var3 - var41 * var2 >> 16;
                                 var41 = var40 * var2 + var41 * var3 >> 16;
                                 if(var41 > 0) {
                                    int var43 = (var39 << 9) / var41;
                                    int var44 = (var42 << 9) / var41;
                                    if(var43 < var29) {
                                       var29 = var43;
                                    }

                                    if(var43 > var31) {
                                       var31 = var43;
                                    }

                                    if(var44 < var30) {
                                       var30 = var44;
                                    }

                                    if(var44 > var32) {
                                       var32 = var44;
                                    }
                                 }
                              }

                              if(var33 >= var29 && var33 <= var31 && var34 >= var30 && var34 <= var32) {
                                 if(super.O) {
                                    nc.longs_g[ni.U++] = var9;
                                 } else {
                                    var28 = true;
                                 }
                              }
                           }
                        }

                        for(var29 = 0; var29 < this.bb; ++var29) {
                           var30 = this.gb[var29];
                           var31 = this.rb[var29];
                           var32 = this.Y[var29];
                           if(var1 != 0) {
                              var33 = var32 * var26 + var30 * var27 >> 16;
                              var32 = var32 * var27 - var30 * var26 >> 16;
                              var30 = var33;
                           }

                           var30 += var6;
                           var31 += var7;
                           var32 += var8;
                           var33 = var32 * var4 + var30 * var5 >> 16;
                           var32 = var32 * var5 - var30 * var4 >> 16;
                           var30 = var33;
                           var33 = var31 * var3 - var32 * var2 >> 16;
                           var32 = var31 * var2 + var32 * var3 >> 16;
                           Rb[var29] = var32 - var12;
                           if(var32 >= 50) {
                              Lb[var29] = var24 + (var30 << 9) / var32;
                              Ob[var29] = var25 + (var33 << 9) / var32;
                           } else {
                              Lb[var29] = -5000;
                              var21 = true;
                           }

                           if(var23) {
                              Eb[var29] = var30;
                              Qb[var29] = var33;
                              Ab[var29] = var32;
                           }
                        }

                        try {
                           this.a(var21, var28, var9, var12 - var14, var13 - var14 + 2);
                        } catch (Exception var45) {
                           ;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private final void a(boolean var1, boolean var2, long var3, int var5, int var6) {
      if(var6 < 1600) {
         for(int var7 = 0; var7 < var6; ++var7) {
            xb[var7] = 0;
         }

         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var19;
         int var20;
         int var22;
         for(int var8 = 0; var8 < this.kb; ++var8) {
            if(this.X[var8] != -2) {
               var9 = this.U[var8];
               var10 = this.db[var8];
               var11 = this.Q[var8];
               var12 = Lb[var9];
               var13 = Lb[var10];
               var14 = Lb[var11];
               if(var1 && (var12 == -5000 || var13 == -5000 || var14 == -5000)) {
                  var15 = Eb[var9];
                  var16 = Eb[var10];
                  int var17 = Eb[var11];
                  int var18 = Qb[var9];
                  var19 = Qb[var10];
                  var20 = Qb[var11];
                  int var21 = Ab[var9];
                  var22 = Ab[var10];
                  int var23 = Ab[var11];
                  var15 -= var16;
                  var17 -= var16;
                  var18 -= var19;
                  var20 -= var19;
                  var21 -= var22;
                  var23 -= var22;
                  int var24 = var18 * var23 - var21 * var20;
                  int var25 = var21 * var17 - var15 * var23;
                  int var26 = var15 * var20 - var18 * var17;
                  if(var16 * var24 + var19 * var25 + var22 * var26 > 0) {
                     Bb[var8] = true;
                     int var27 = (Rb[var9] + Rb[var10] + Rb[var11]) / 3 + var5;
                     Db[var27][xb[var27]++] = var8;
                  }
               } else {
                  if(var2 && this.b(ug.v, fi.f, Ob[var9], Ob[var10], Ob[var11], var12, var13, var14)) {
                     nc.longs_g[ni.U++] = var3;
                     var2 = false;
                  }

                  if((var12 - var13) * (Ob[var11] - Ob[var10]) - (Ob[var9] - Ob[var10]) * (var14 - var13) > 0) {
                     Bb[var8] = false;
                     if(var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= ec.R && var13 <= ec.R && var14 <= ec.R) {
                        Gb[var8] = false;
                     } else {
                        Gb[var8] = true;
                     }

                     var15 = (Rb[var9] + Rb[var10] + Rb[var11]) / 3 + var5;
                     Db[var15][xb[var15]++] = var8;
                  }
               }
            }
         }

         if(this.jb == null) {
            for(var9 = var6 - 1; var9 >= 0; --var9) {
               var10 = xb[var9];
               if(var10 > 0) {
                  int[] var29 = Db[var9];

                  for(var12 = 0; var12 < var10; ++var12) {
                     this.k(var29[var12]);
                  }
               }
            }

         } else {
            for(var9 = 0; var9 < 12; ++var9) {
               Jb[var9] = 0;
               Hb[var9] = 0;
            }

            for(var10 = var6 - 1; var10 >= 0; --var10) {
               var11 = xb[var10];
               if(var11 > 0) {
                  int[] var28 = Db[var10];

                  for(var13 = 0; var13 < var11; ++var13) {
                     var14 = var28[var13];
                     byte var30 = this.jb[var14];
                     var16 = Jb[var30]++;
                     Mb[var30][var16] = var14;
                     if(var30 < 10) {
                        Hb[var30] += var10;
                     } else if(var30 == 10) {
                        Nb[var16] = var10;
                     } else {
                        Sb[var16] = var10;
                     }
                  }
               }
            }

            var11 = 0;
            if(Jb[1] > 0 || Jb[2] > 0) {
               var11 = (Hb[1] + Hb[2]) / (Jb[1] + Jb[2]);
            }

            var12 = 0;
            if(Jb[3] > 0 || Jb[4] > 0) {
               var12 = (Hb[3] + Hb[4]) / (Jb[3] + Jb[4]);
            }

            var13 = 0;
            if(Jb[6] > 0 || Jb[8] > 0) {
               var13 = (Hb[6] + Hb[8]) / (Jb[6] + Jb[8]);
            }

            var15 = 0;
            var16 = Jb[10];
            int[] var31 = Mb[10];
            int[] var32 = Nb;
            if(var15 == var16) {
               var15 = 0;
               var16 = Jb[11];
               var31 = Mb[11];
               var32 = Sb;
            }

            if(var15 < var16) {
               var14 = var32[var15];
            } else {
               var14 = -1000;
            }

            for(var19 = 0; var19 < 10; ++var19) {
               while(var19 == 0 && var14 > var11) {
                  this.k(var31[var15++]);
                  if(var15 == var16 && var31 != Mb[11]) {
                     var15 = 0;
                     var16 = Jb[11];
                     var31 = Mb[11];
                     var32 = Sb;
                  }

                  if(var15 < var16) {
                     var14 = var32[var15];
                  } else {
                     var14 = -1000;
                  }
               }

               while(var19 == 3 && var14 > var12) {
                  this.k(var31[var15++]);
                  if(var15 == var16 && var31 != Mb[11]) {
                     var15 = 0;
                     var16 = Jb[11];
                     var31 = Mb[11];
                     var32 = Sb;
                  }

                  if(var15 < var16) {
                     var14 = var32[var15];
                  } else {
                     var14 = -1000;
                  }
               }

               while(var19 == 5 && var14 > var13) {
                  this.k(var31[var15++]);
                  if(var15 == var16 && var31 != Mb[11]) {
                     var15 = 0;
                     var16 = Jb[11];
                     var31 = Mb[11];
                     var32 = Sb;
                  }

                  if(var15 < var16) {
                     var14 = var32[var15];
                  } else {
                     var14 = -1000;
                  }
               }

               var20 = Jb[var19];
               int[] var33 = Mb[var19];

               for(var22 = 0; var22 < var20; ++var22) {
                  this.k(var33[var22]);
               }
            }

            while(var14 != -1000) {
               this.k(var31[var15++]);
               if(var15 == var16 && var31 != Mb[11]) {
                  var15 = 0;
                  var31 = Mb[11];
                  var16 = Jb[11];
                  var32 = Sb;
               }

               if(var15 < var16) {
                  var14 = var32[var15];
               } else {
                  var14 = -1000;
               }
            }

         }
      }
   }

   final void e() {
      for(int var1 = 0; var1 < this.bb; ++var1) {
         this.gb[var1] = -this.gb[var1];
         this.Y[var1] = -this.Y[var1];
      }

      this.R = false;
   }

   final fe a(fe var1) {
      return new he(new he[]{this, (he)var1}, 2);
   }

   final void d() {
      for(int var1 = 0; var1 < this.bb; ++var1) {
         int var2 = this.gb[var1];
         this.gb[var1] = this.Y[var1];
         this.Y[var1] = -var2;
      }

      this.R = false;
   }

   final he a(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      if(!this.R) {
         this.h();
      }

      int var7 = var2 + this.qb;
      int var8 = var2 + this.Z;
      int var9 = var4 + this.ub;
      int var10 = var4 + this.sb;
      if(var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if(var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            he var11;
            if(var5) {
               var11 = new he();
               var11.bb = this.bb;
               var11.kb = this.kb;
               var11.hb = this.hb;
               var11.gb = this.gb;
               var11.Y = this.Y;
               var11.U = this.U;
               var11.db = this.db;
               var11.Q = this.Q;
               var11.cb = this.cb;
               var11.lb = this.lb;
               var11.X = this.X;
               var11.jb = this.jb;
               var11.pb = this.pb;
               var11.T = this.T;
               var11.mb = this.mb;
               var11.ib = this.ib;
               var11.tb = this.tb;
               var11.eb = this.eb;
               var11.fb = this.fb;
               var11.W = this.W;
               var11.nb = this.nb;
               var11.O = super.O;
               var11.rb = new int[var11.bb];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if(var6 == 0) {
               for(var12 = 0; var12 < var11.bb; ++var12) {
                  var13 = this.gb[var12] + var2;
                  var14 = this.Y[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.rb[var12] = this.rb[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.bb; ++var12) {
                  var13 = (this.rb[var12] << 16) / this.ab;
                  if(var13 < var6) {
                     var14 = this.gb[var12] + var2;
                     var15 = this.Y[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.rb[var12] = this.rb[var12] + (var22 - var3) * (var6 - var13) / var6;
                  } else {
                     var11.rb[var12] = this.rb[var12];
                  }
               }
            }

            var11.R = false;
            return var11;
         }
      } else {
         return this;
      }
   }

   final void g(int var1) {
      int var2 = ec.W[var1];
      int var3 = ec.L[var1];

      for(int var4 = 0; var4 < this.bb; ++var4) {
         int var5 = this.rb[var4] * var3 - this.Y[var4] * var2 >> 16;
         this.Y[var4] = this.rb[var4] * var2 + this.Y[var4] * var3 >> 16;
         this.rb[var4] = var5;
      }

      this.R = false;
   }

   private static final int i(int var0) {
      if(var0 < 2) {
         var0 = 2;
      } else if(var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   private final fe a(boolean var1, he var2, byte[] var3) {
      var2.bb = this.bb;
      var2.kb = this.kb;
      var2.hb = this.hb;
      if(var2.gb == null || var2.gb.length < this.bb) {
         var2.gb = new int[this.bb + 100];
         var2.rb = new int[this.bb + 100];
         var2.Y = new int[this.bb + 100];
      }

      for(int var4 = 0; var4 < this.bb; ++var4) {
         var2.gb[var4] = this.gb[var4];
         var2.rb[var4] = this.rb[var4];
         var2.Y[var4] = this.Y[var4];
      }

      if(var1) {
         var2.pb = this.pb;
      } else {
         var2.pb = var3;
         int var5;
         if(this.pb == null) {
            for(var5 = 0; var5 < this.kb; ++var5) {
               var2.pb[var5] = 0;
            }
         } else {
            for(var5 = 0; var5 < this.kb; ++var5) {
               var2.pb[var5] = this.pb[var5];
            }
         }
      }

      var2.U = this.U;
      var2.db = this.db;
      var2.Q = this.Q;
      var2.cb = this.cb;
      var2.lb = this.lb;
      var2.X = this.X;
      var2.jb = this.jb;
      var2.T = this.T;
      var2.mb = this.mb;
      var2.ib = this.ib;
      var2.tb = this.tb;
      var2.eb = this.eb;
      var2.fb = this.fb;
      var2.W = this.W;
      var2.nb = this.nb;
      var2.O = super.O;
      var2.R = false;
      return var2;
   }

   private final void j(int var1) {
      int var2 = ec.P;
      int var3 = ec.M;
      int var4 = 0;
      int var5 = this.U[var1];
      int var6 = this.db[var1];
      int var7 = this.Q[var1];
      int var8 = Ab[var5];
      int var9 = Ab[var6];
      int var10 = Ab[var7];
      if(this.pb == null) {
         ec.N = 0;
      } else {
         ec.N = this.pb[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if(var8 >= 50) {
         Fb[var4] = Lb[var5];
         yb[var4] = Ob[var5];
         Ib[var4++] = this.cb[var1];
      } else {
         var11 = Eb[var5];
         var12 = Qb[var5];
         var13 = this.cb[var1];
         if(var10 >= 50) {
            var14 = (50 - var8) * ec.S[var10 - var8];
            Fb[var4] = var2 + (var11 + ((Eb[var7] - var11) * var14 >> 16) << 9) / 50;
            yb[var4] = var3 + (var12 + ((Qb[var7] - var12) * var14 >> 16) << 9) / 50;
            Ib[var4++] = var13 + ((this.X[var1] - var13) * var14 >> 16);
         }

         if(var9 >= 50) {
            var14 = (50 - var8) * ec.S[var9 - var8];
            Fb[var4] = var2 + (var11 + ((Eb[var6] - var11) * var14 >> 16) << 9) / 50;
            yb[var4] = var3 + (var12 + ((Qb[var6] - var12) * var14 >> 16) << 9) / 50;
            Ib[var4++] = var13 + ((this.lb[var1] - var13) * var14 >> 16);
         }
      }

      if(var9 >= 50) {
         Fb[var4] = Lb[var6];
         yb[var4] = Ob[var6];
         Ib[var4++] = this.lb[var1];
      } else {
         var11 = Eb[var6];
         var12 = Qb[var6];
         var13 = this.lb[var1];
         if(var8 >= 50) {
            var14 = (50 - var9) * ec.S[var8 - var9];
            Fb[var4] = var2 + (var11 + ((Eb[var5] - var11) * var14 >> 16) << 9) / 50;
            yb[var4] = var3 + (var12 + ((Qb[var5] - var12) * var14 >> 16) << 9) / 50;
            Ib[var4++] = var13 + ((this.cb[var1] - var13) * var14 >> 16);
         }

         if(var10 >= 50) {
            var14 = (50 - var9) * ec.S[var10 - var9];
            Fb[var4] = var2 + (var11 + ((Eb[var7] - var11) * var14 >> 16) << 9) / 50;
            yb[var4] = var3 + (var12 + ((Qb[var7] - var12) * var14 >> 16) << 9) / 50;
            Ib[var4++] = var13 + ((this.X[var1] - var13) * var14 >> 16);
         }
      }

      if(var10 >= 50) {
         Fb[var4] = Lb[var7];
         yb[var4] = Ob[var7];
         Ib[var4++] = this.X[var1];
      } else {
         var11 = Eb[var7];
         var12 = Qb[var7];
         var13 = this.X[var1];
         if(var9 >= 50) {
            var14 = (50 - var10) * ec.S[var9 - var10];
            Fb[var4] = var2 + (var11 + ((Eb[var6] - var11) * var14 >> 16) << 9) / 50;
            yb[var4] = var3 + (var12 + ((Qb[var6] - var12) * var14 >> 16) << 9) / 50;
            Ib[var4++] = var13 + ((this.lb[var1] - var13) * var14 >> 16);
         }

         if(var8 >= 50) {
            var14 = (50 - var10) * ec.S[var8 - var10];
            Fb[var4] = var2 + (var11 + ((Eb[var5] - var11) * var14 >> 16) << 9) / 50;
            yb[var4] = var3 + (var12 + ((Qb[var5] - var12) * var14 >> 16) << 9) / 50;
            Ib[var4++] = var13 + ((this.cb[var1] - var13) * var14 >> 16);
         }
      }

      var11 = Fb[0];
      var12 = Fb[1];
      var13 = Fb[2];
      var14 = yb[0];
      int var15 = yb[1];
      int var16 = yb[2];
      ec.K = false;
      int var17;
      int var18;
      int var19;
      int var20;
      if(var4 == 3) {
         if(var11 < 0 || var12 < 0 || var13 < 0 || var11 > ec.R || var12 > ec.R || var13 > ec.R) {
            ec.K = true;
         }

         if(this.mb != null && this.mb[var1] != -1) {
            if(this.T != null && this.T[var1] != -1) {
               var20 = this.T[var1] & 255;
               var17 = this.tb[var20];
               var18 = this.eb[var20];
               var19 = this.fb[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            if(this.X[var1] == -1) {
               ec.b(var14, var15, var16, var11, var12, var13, this.cb[var1], this.cb[var1], this.cb[var1], Eb[var17], Eb[var18], Eb[var19], Qb[var17], Qb[var18], Qb[var19], Ab[var17], Ab[var18], Ab[var19], this.mb[var1]);
            } else {
               ec.b(var14, var15, var16, var11, var12, var13, Ib[0], Ib[1], Ib[2], Eb[var17], Eb[var18], Eb[var19], Qb[var17], Qb[var18], Qb[var19], Ab[var17], Ab[var18], Ab[var19], this.mb[var1]);
            }
         } else if(this.X[var1] == -1) {
            ec.a(var14, var15, var16, var11, var12, var13, ec.T[this.cb[var1]]);
         } else {
            ec.a(var14, var15, var16, var11, var12, var13, Ib[0], Ib[1], Ib[2]);
         }
      }

      if(var4 == 4) {
         if(var11 < 0 || var12 < 0 || var13 < 0 || var11 > ec.R || var12 > ec.R || var13 > ec.R || Fb[3] < 0 || Fb[3] > ec.R) {
            ec.K = true;
         }

         if(this.mb == null || this.mb[var1] == -1) {
            if(this.X[var1] == -1) {
               var17 = ec.T[this.cb[var1]];
               ec.a(var14, var15, var16, var11, var12, var13, var17);
               ec.a(var14, var16, yb[3], var11, var13, Fb[3], var17);
               return;
            }

            ec.a(var14, var15, var16, var11, var12, var13, Ib[0], Ib[1], Ib[2]);
            ec.a(var14, var16, yb[3], var11, var13, Fb[3], Ib[0], Ib[2], Ib[3]);
            return;
         }

         if(this.T != null && this.T[var1] != -1) {
            var20 = this.T[var1] & 255;
            var17 = this.tb[var20];
            var18 = this.eb[var20];
            var19 = this.fb[var20];
         } else {
            var17 = var5;
            var18 = var6;
            var19 = var7;
         }

         short var21 = this.mb[var1];
         if(this.X[var1] == -1) {
            ec.b(var14, var15, var16, var11, var12, var13, this.cb[var1], this.cb[var1], this.cb[var1], Eb[var17], Eb[var18], Eb[var19], Qb[var17], Qb[var18], Qb[var19], Ab[var17], Ab[var18], Ab[var19], var21);
            ec.b(var14, var16, yb[3], var11, var13, Fb[3], this.cb[var1], this.cb[var1], this.cb[var1], Eb[var17], Eb[var18], Eb[var19], Qb[var17], Qb[var18], Qb[var19], Ab[var17], Ab[var18], Ab[var19], var21);
            return;
         }

         ec.b(var14, var15, var16, var11, var12, var13, Ib[0], Ib[1], Ib[2], Eb[var17], Eb[var18], Eb[var19], Qb[var17], Qb[var18], Qb[var19], Ab[var17], Ab[var18], Ab[var19], var21);
         ec.b(var14, var16, yb[3], var11, var13, Fb[3], Ib[0], Ib[2], Ib[3], Eb[var17], Eb[var18], Eb[var19], Qb[var17], Qb[var18], Qb[var19], Ab[var17], Ab[var18], Ab[var19], var21);
      }

   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if(!this.R) {
            this.h();
         }

         int var8 = ec.P;
         int var9 = ec.M;
         int var10 = ec.W[var1];
         int var11 = ec.L[var1];
         int var12 = ec.W[var2];
         int var13 = ec.L[var2];
         int var14 = ec.W[var3];
         int var15 = ec.L[var3];
         int var16 = ec.W[var4];
         int var17 = ec.L[var4];
         int var18 = var6 * var16 + var7 * var17 >> 16;

         for(int var19 = 0; var19 < this.bb; ++var19) {
            int var20 = this.gb[var19];
            int var21 = this.rb[var19];
            int var22 = this.Y[var19];
            int var23;
            if(var3 != 0) {
               var23 = var21 * var14 + var20 * var15 >> 16;
               var21 = var21 * var15 - var20 * var14 >> 16;
               var20 = var23;
            }

            if(var1 != 0) {
               var23 = var21 * var11 - var22 * var10 >> 16;
               var22 = var21 * var10 + var22 * var11 >> 16;
               var21 = var23;
            }

            if(var2 != 0) {
               var23 = var22 * var12 + var20 * var13 >> 16;
               var22 = var22 * var13 - var20 * var12 >> 16;
               var20 = var23;
            }

            var20 += var5;
            var21 += var6;
            var22 += var7;
            var23 = var21 * var17 - var22 * var16 >> 16;
            var22 = var21 * var16 + var22 * var17 >> 16;
            Rb[var19] = var22 - var18;
            Lb[var19] = var8 + (var20 << 9) / var22;
            Ob[var19] = var9 + (var23 << 9) / var22;
            if(this.hb > 0) {
               Eb[var19] = var20;
               Qb[var19] = var23;
               Ab[var19] = var22;
            }
         }

         this.a(false, false, 0L, this.P, this.P << 1);
      } catch (RuntimeException var24) {
         ;
      }
   }

   private static final int b(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   final void c() {
      for(int var1 = 0; var1 < this.bb; ++var1) {
         int var2 = this.Y[var1];
         this.Y[var1] = this.gb[var1];
         this.gb[var1] = -var2;
      }

      this.R = false;
   }

   private final boolean b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      return var2 < var3 && var2 < var4 && var2 < var5?false:(var2 > var3 && var2 > var4 && var2 > var5?false:(var1 < var6 && var1 < var7 && var1 < var8?false:var1 <= var6 || var1 <= var7 || var1 <= var8));
   }

   final void a(hh var1, int var2) {
      if(this.W != null) {
         if(var2 != -1) {
            db var3 = var1.E[var2];
            ii var4 = var3.c;
            zb = 0;
            Kb = 0;
            Cb = 0;

            for(int var5 = 0; var5 < var3.k; ++var5) {
               short var6 = var3.j[var5];
               if(var3.e[var5] != -1) {
                  this.a(0, var4.x[var3.e[var5]], 0, 0, 0);
               }

               this.a(var4.F[var6], var4.x[var6], var3.h[var5], var3.d[var5], var3.g[var5]);
            }

            this.R = false;
         }
      }
   }

   final void d(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.bb; ++var4) {
         this.gb[var4] += var1;
         this.rb[var4] += var2;
         this.Y[var4] += var3;
      }

      this.R = false;
   }

   final fe b(boolean var1) {
      if(!var1 && Pb.length < this.kb) {
         Pb = new byte[this.kb + 100];
      }

      return this.a(var1, vb, Pb);
   }

   private final void a(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if(var1 == 0) {
         var7 = 0;
         zb = 0;
         Kb = 0;
         Cb = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var15 = var2[var8];
            if(var15 < this.W.length) {
               int[] var16 = this.W[var15];

               for(var11 = 0; var11 < var16.length; ++var11) {
                  var12 = var16[var11];
                  zb += this.gb[var12];
                  Kb += this.rb[var12];
                  Cb += this.Y[var12];
                  ++var7;
               }
            }
         }

         if(var7 > 0) {
            zb = zb / var7 + var3;
            Kb = Kb / var7 + var4;
            Cb = Cb / var7 + var5;
         } else {
            zb = var3;
            Kb = var4;
            Cb = var5;
         }
      } else {
         int[] var9;
         int var10;
         if(var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.W.length) {
                  var9 = this.W[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     this.gb[var11] += var3;
                     this.rb[var11] += var4;
                     this.Y[var11] += var5;
                  }
               }
            }

         } else if(var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.W.length) {
                  var9 = this.W[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     this.gb[var11] -= zb;
                     this.rb[var11] -= Kb;
                     this.Y[var11] -= Cb;
                     int var13;
                     int var14;
                     if(var5 != 0) {
                        var12 = ec.W[var5];
                        var13 = ec.L[var5];
                        var14 = this.rb[var11] * var12 + this.gb[var11] * var13 + 32767 >> 16;
                        this.rb[var11] = this.rb[var11] * var13 - this.gb[var11] * var12 + 32767 >> 16;
                        this.gb[var11] = var14;
                     }

                     if(var3 != 0) {
                        var12 = ec.W[var3];
                        var13 = ec.L[var3];
                        var14 = this.rb[var11] * var13 - this.Y[var11] * var12 + 32767 >> 16;
                        this.Y[var11] = this.rb[var11] * var12 + this.Y[var11] * var13 + 32767 >> 16;
                        this.rb[var11] = var14;
                     }

                     if(var4 != 0) {
                        var12 = ec.W[var4];
                        var13 = ec.L[var4];
                        var14 = this.Y[var11] * var12 + this.gb[var11] * var13 + 32767 >> 16;
                        this.Y[var11] = this.Y[var11] * var13 - this.gb[var11] * var12 + 32767 >> 16;
                        this.gb[var11] = var14;
                     }

                     this.gb[var11] += zb;
                     this.rb[var11] += Kb;
                     this.Y[var11] += Cb;
                  }
               }
            }

         } else if(var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.W.length) {
                  var9 = this.W[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     this.gb[var11] -= zb;
                     this.rb[var11] -= Kb;
                     this.Y[var11] -= Cb;
                     this.gb[var11] = this.gb[var11] * var3 / 128;
                     this.rb[var11] = this.rb[var11] * var4 / 128;
                     this.Y[var11] = this.Y[var11] * var5 / 128;
                     this.gb[var11] += zb;
                     this.rb[var11] += Kb;
                     this.Y[var11] += Cb;
                  }
               }
            }

         } else if(var1 == 5) {
            if(this.nb != null && this.pb != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if(var8 < this.nb.length) {
                     var9 = this.nb[var8];

                     for(var10 = 0; var10 < var9.length; ++var10) {
                        var11 = var9[var10];
                        var12 = (this.pb[var11] & 255) + var3 * 8;
                        if(var12 < 0) {
                           var12 = 0;
                        } else if(var12 > 255) {
                           var12 = 255;
                        }

                        this.pb[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   final int f() {
      if(!this.R) {
         this.h();
      }

      return this.ob;
   }

   private final void k(int var1) {
      if(Bb[var1]) {
         this.j(var1);
      } else {
         int var2 = this.U[var1];
         int var3 = this.db[var1];
         int var4 = this.Q[var1];
         ec.K = Gb[var1];
         if(this.pb == null) {
            ec.N = 0;
         } else {
            ec.N = this.pb[var1] & 255;
         }

         if(this.mb != null && this.mb[var1] != -1) {
            int var5;
            int var6;
            int var7;
            if(this.T != null && this.T[var1] != -1) {
               int var8 = this.T[var1] & 255;
               var5 = this.tb[var8];
               var6 = this.eb[var8];
               var7 = this.fb[var8];
            } else {
               var5 = var2;
               var6 = var3;
               var7 = var4;
            }

            if(this.X[var1] == -1) {
               ec.b(Ob[var2], Ob[var3], Ob[var4], Lb[var2], Lb[var3], Lb[var4], this.cb[var1], this.cb[var1], this.cb[var1], Eb[var5], Eb[var6], Eb[var7], Qb[var5], Qb[var6], Qb[var7], Ab[var5], Ab[var6], Ab[var7], this.mb[var1]);
            } else {
               ec.b(Ob[var2], Ob[var3], Ob[var4], Lb[var2], Lb[var3], Lb[var4], this.cb[var1], this.lb[var1], this.X[var1], Eb[var5], Eb[var6], Eb[var7], Qb[var5], Qb[var6], Qb[var7], Ab[var5], Ab[var6], Ab[var7], this.mb[var1]);
            }
         } else if(this.X[var1] == -1) {
            ec.a(Ob[var2], Ob[var3], Ob[var4], Lb[var2], Lb[var3], Lb[var4], ec.T[this.cb[var1]]);
         } else {
            ec.a(Ob[var2], Ob[var3], Ob[var4], Lb[var2], Lb[var3], Lb[var4], this.cb[var1], this.lb[var1], this.X[var1]);
         }
      }
   }

   final void c(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.bb; ++var4) {
         this.gb[var4] = this.gb[var4] * var1 / 128;
         this.rb[var4] = this.rb[var4] * var2 / 128;
         this.Y[var4] = this.Y[var4] * var3 / 128;
      }

      this.R = false;
   }

   final void a(hh var1, int var2, hh var3, int var4, int[] var5) {
      if(var2 != -1) {
         if(var5 != null && var4 != -1) {
            db var6 = var1.E[var2];
            db var7 = var3.E[var4];
            ii var8 = var6.c;
            zb = 0;
            Kb = 0;
            Cb = 0;
            byte var9 = 0;
            int var14 = var9 + 1;
            int var10 = var5[var9];

            for(int var11 = 0; var11 < var6.k; ++var11) {
               short var12;
               for(var12 = var6.j[var11]; var12 > var10; var10 = var5[var14++]) {
                  ;
               }

               if(var12 != var10 || var8.F[var12] == 0) {
                  if(var6.e[var11] != -1) {
                     this.a(0, var8.x[var6.e[var11]], 0, 0, 0);
                  }

                  this.a(var8.F[var12], var8.x[var12], var6.h[var11], var6.d[var11], var6.g[var11]);
               }
            }

            zb = 0;
            Kb = 0;
            Cb = 0;
            var9 = 0;
            var14 = var9 + 1;
            var10 = var5[var9];

            for(int var15 = 0; var15 < var7.k; ++var15) {
               short var13;
               for(var13 = var7.j[var15]; var13 > var10; var10 = var5[var14++]) {
                  ;
               }

               if(var13 == var10 || var8.F[var13] == 0) {
                  if(var7.e[var15] != -1) {
                     this.a(0, var8.x[var7.e[var15]], 0, 0, 0);
                  }

                  this.a(var8.F[var13], var8.x[var13], var7.h[var15], var7.d[var15], var7.g[var15]);
               }
            }

            this.R = false;
         } else {
            this.a(var1, var2);
         }
      }
   }

   final fe a(boolean var1) {
      if(!var1 && wb.length < this.kb) {
         wb = new byte[this.kb + 100];
      }

      return this.a(var1, S, wb);
   }

   public static void g() {
      S = null;
      wb = null;
      vb = null;
      Pb = null;
      Gb = null;
      Bb = null;
      Lb = null;
      Ob = null;
      Rb = null;
      Eb = null;
      Qb = null;
      Ab = null;
      xb = null;
      Db = null;
      Jb = null;
      Mb = null;
      Nb = null;
      Sb = null;
      Hb = null;
      Fb = null;
      yb = null;
      Ib = null;
   }

   private final void h() {
      int var1 = 32767;
      int var2 = 32767;
      int var3 = 32767;
      int var4 = -32768;
      int var5 = -32768;
      int var6 = -32768;
      int var7 = 0;
      int var8 = 0;

      for(int var9 = 0; var9 < this.bb; ++var9) {
         int var10 = this.gb[var9];
         int var11 = this.rb[var9];
         int var12 = this.Y[var9];
         if(var10 < var1) {
            var1 = var10;
         }

         if(var10 > var4) {
            var4 = var10;
         }

         if(var11 < var2) {
            var2 = var11;
         }

         if(var11 > var5) {
            var5 = var11;
         }

         if(var12 < var3) {
            var3 = var12;
         }

         if(var12 > var6) {
            var6 = var12;
         }

         int var13 = var10 * var10 + var12 * var12;
         if(var13 > var7) {
            var7 = var13;
         }

         var13 = var10 * var10 + var12 * var12 + var11 * var11;
         if(var13 > var8) {
            var8 = var13;
         }
      }

      this.qb = (short)var1;
      this.Z = (short)var4;
      this.ab = (short)var2;
      this.V = (short)var5;
      this.ub = (short)var3;
      this.sb = (short)var6;
      this.ob = (short)((int)(Math.sqrt((double)var7) + 0.99D));
      this.P = (short)((int)(Math.sqrt((double)var8) + 0.99D));
      this.R = true;
   }

   final int b() {
      if(!this.R) {
         this.h();
      }

      return this.ab;
   }

   final void h(int var1) {
      int var2 = ec.W[var1];
      int var3 = ec.L[var1];

      for(int var4 = 0; var4 < this.bb; ++var4) {
         int var5 = this.rb[var4] * var2 + this.gb[var4] * var3 >> 16;
         this.rb[var4] = this.rb[var4] * var3 - this.gb[var4] * var2 >> 16;
         this.gb[var4] = var5;
      }

      this.R = false;
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         if(!this.R) {
            this.h();
         }

         int var9 = ec.P;
         int var10 = ec.M;
         int var11 = ec.W[var1];
         int var12 = ec.L[var1];
         int var13 = ec.W[var2];
         int var14 = ec.L[var2];
         int var15 = ec.W[var3];
         int var16 = ec.L[var3];
         int var17 = ec.W[var4];
         int var18 = ec.L[var4];
         int var19 = var6 * var17 + var7 * var18 >> 16;

         for(int var20 = 0; var20 < this.bb; ++var20) {
            int var21 = this.gb[var20];
            int var22 = this.rb[var20];
            int var23 = this.Y[var20];
            int var24;
            if(var3 != 0) {
               var24 = var22 * var15 + var21 * var16 >> 16;
               var22 = var22 * var16 - var21 * var15 >> 16;
               var21 = var24;
            }

            if(var1 != 0) {
               var24 = var22 * var12 - var23 * var11 >> 16;
               var23 = var22 * var11 + var23 * var12 >> 16;
               var22 = var24;
            }

            if(var2 != 0) {
               var24 = var23 * var13 + var21 * var14 >> 16;
               var23 = var23 * var14 - var21 * var13 >> 16;
               var21 = var24;
            }

            var21 += var5;
            var22 += var6;
            var23 += var7;
            var24 = var22 * var18 - var23 * var17 >> 16;
            var23 = var22 * var17 + var23 * var18 >> 16;
            Rb[var20] = var23 - var19;
            Lb[var20] = var9 + (var21 << 9) / var8;
            Ob[var20] = var10 + (var24 << 9) / var8;
            if(this.hb > 0) {
               Eb[var20] = var21;
               Qb[var20] = var24;
               Ab[var20] = var23;
            }
         }

         this.a(false, false, 0L, this.P, this.P << 1);
      } catch (RuntimeException var25) {
         ;
      }
   }

   public he() {
   }

   he(cb var1, int var2, int var3, int var4, int var5, int var6) {
      var1.i();
      var1.g();
      this.bb = var1.ob;
      this.gb = var1.db;
      this.rb = var1.jb;
      this.Y = var1.R;
      this.kb = var1.ib;
      this.U = var1.lb;
      this.db = var1.Ab;
      this.Q = var1.xb;
      this.jb = var1.Bb;
      this.pb = var1.Hb;
      this.ib = var1.Fb;
      this.W = var1.P;
      this.nb = var1.zb;
      int var7 = (int)Math.sqrt((double)(var4 * var4 + var5 * var5 + var6 * var6));
      int var8 = var3 * var7 >> 8;
      this.cb = new int[this.kb];
      this.lb = new int[this.kb];
      this.X = new int[this.kb];
      int var9;
      if(var1.fb != null) {
         this.mb = new short[this.kb];

         for(var9 = 0; var9 < this.kb; ++var9) {
            short var10 = var1.fb[var9];
            if(var10 != -1 && ec.Z.b(var10, 66)) {
               this.mb[var9] = var10;
            } else {
               this.mb[var9] = -1;
            }
         }
      } else {
         this.mb = null;
      }

      int var14;
      if(var1.Gb > 0 && var1.ab != null) {
         int[] var16 = new int[var1.Gb];

         for(int var17 = 0; var17 < this.kb; ++var17) {
            if(var1.ab[var17] != -1) {
               ++var16[var1.ab[var17] & 255];
            }
         }

         this.hb = 0;

         for(int var11 = 0; var11 < var1.Gb; ++var11) {
            if(var16[var11] > 0 && var1.O[var11] == 0) {
               ++this.hb;
            }
         }

         this.tb = new int[this.hb];
         this.eb = new int[this.hb];
         this.fb = new int[this.hb];
         int var12 = 0;

         for(int var13 = 0; var13 < var1.Gb; ++var13) {
            if(var16[var13] > 0 && var1.O[var13] == 0) {
               this.tb[var12] = var1.wb[var13] & '\uffff';
               this.eb[var12] = var1.rb[var13] & '\uffff';
               this.fb[var12] = var1.hb[var13] & '\uffff';
               var16[var13] = var12++;
            } else {
               var16[var13] = -1;
            }
         }

         this.T = new byte[this.kb];

         for(var14 = 0; var14 < this.kb; ++var14) {
            if(var1.ab[var14] != -1) {
               this.T[var14] = (byte)var16[var1.ab[var14] & 255];
               if(this.T[var14] == -1 && this.mb != null) {
                  this.mb[var14] = -1;
               }
            } else {
               this.T[var14] = -1;
            }
         }
      }

      for(var9 = 0; var9 < this.kb; ++var9) {
         byte var18;
         if(var1.X == null) {
            var18 = 0;
         } else {
            var18 = var1.X[var9];
         }

         byte var19;
         if(var1.Hb == null) {
            var19 = 0;
         } else {
            var19 = var1.Hb[var9];
         }

         short var20;
         if(this.mb == null) {
            var20 = -1;
         } else {
            var20 = this.mb[var9];
         }

         if(var19 == -2) {
            var18 = 3;
         }

         if(var19 == -1) {
            var18 = 2;
         }

         ba var21;
         va var22;
         if(var20 == -1) {
            if(var18 != 0) {
               if(var18 == 1) {
                  var22 = var1.qb[var9];
                  var14 = var2 + (var4 * var22.d + var5 * var22.b + var6 * var22.a) / (var8 + var8 / 2);
                  this.cb[var9] = b(var1.tb[var9] & '\uffff', var14);
                  this.X[var9] = -1;
               } else if(var18 == 3) {
                  this.cb[var9] = 128;
                  this.X[var9] = -1;
               } else {
                  this.X[var9] = -2;
               }
            } else {
               int var15 = var1.tb[var9] & '\uffff';
               if(var1.Cb != null && var1.Cb[this.U[var9]] != null) {
                  var21 = var1.Cb[this.U[var9]];
               } else {
                  var21 = var1.pb[this.U[var9]];
               }

               var14 = var2 + (var4 * var21.f + var5 * var21.g + var6 * var21.anInt_d) / (var8 * var21.e);
               this.cb[var9] = b(var15, var14);
               if(var1.Cb != null && var1.Cb[this.db[var9]] != null) {
                  var21 = var1.Cb[this.db[var9]];
               } else {
                  var21 = var1.pb[this.db[var9]];
               }

               var14 = var2 + (var4 * var21.f + var5 * var21.g + var6 * var21.anInt_d) / (var8 * var21.e);
               this.lb[var9] = b(var15, var14);
               if(var1.Cb != null && var1.Cb[this.Q[var9]] != null) {
                  var21 = var1.Cb[this.Q[var9]];
               } else {
                  var21 = var1.pb[this.Q[var9]];
               }

               var14 = var2 + (var4 * var21.f + var5 * var21.g + var6 * var21.anInt_d) / (var8 * var21.e);
               this.X[var9] = b(var15, var14);
            }
         } else if(var18 != 0) {
            if(var18 == 1) {
               var22 = var1.qb[var9];
               var14 = var2 + (var4 * var22.d + var5 * var22.b + var6 * var22.a) / (var8 + var8 / 2);
               this.cb[var9] = i(var14);
               this.X[var9] = -1;
            } else {
               this.X[var9] = -2;
            }
         } else {
            if(var1.Cb != null && var1.Cb[this.U[var9]] != null) {
               var21 = var1.Cb[this.U[var9]];
            } else {
               var21 = var1.pb[this.U[var9]];
            }

            var14 = var2 + (var4 * var21.f + var5 * var21.g + var6 * var21.anInt_d) / (var8 * var21.e);
            this.cb[var9] = i(var14);
            if(var1.Cb != null && var1.Cb[this.db[var9]] != null) {
               var21 = var1.Cb[this.db[var9]];
            } else {
               var21 = var1.pb[this.db[var9]];
            }

            var14 = var2 + (var4 * var21.f + var5 * var21.g + var6 * var21.anInt_d) / (var8 * var21.e);
            this.lb[var9] = i(var14);
            if(var1.Cb != null && var1.Cb[this.Q[var9]] != null) {
               var21 = var1.Cb[this.Q[var9]];
            } else {
               var21 = var1.pb[this.Q[var9]];
            }

            var14 = var2 + (var4 * var21.f + var5 * var21.g + var6 * var21.anInt_d) / (var8 * var21.e);
            this.X[var9] = i(var14);
         }
      }

   }

   private he(he[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      this.bb = 0;
      this.kb = 0;
      this.hb = 0;
      this.ib = -1;

      for(int var7 = 0; var7 < var2; ++var7) {
         he var8 = var1[var7];
         if(var8 != null) {
            this.bb += var8.bb;
            this.kb += var8.kb;
            this.hb += var8.hb;
            if(var8.jb != null) {
               var3 = true;
            } else {
               if(this.ib == -1) {
                  this.ib = var8.ib;
               }

               if(this.ib != var8.ib) {
                  var3 = true;
               }
            }

            var4 |= var8.pb != null;
            var5 |= var8.mb != null;
            var6 |= var8.T != null;
         }
      }

      this.gb = new int[this.bb];
      this.rb = new int[this.bb];
      this.Y = new int[this.bb];
      this.U = new int[this.kb];
      this.db = new int[this.kb];
      this.Q = new int[this.kb];
      this.cb = new int[this.kb];
      this.lb = new int[this.kb];
      this.X = new int[this.kb];
      if(var3) {
         this.jb = new byte[this.kb];
      }

      if(var4) {
         this.pb = new byte[this.kb];
      }

      if(var5) {
         this.mb = new short[this.kb];
      }

      if(var6) {
         this.T = new byte[this.kb];
      }

      if(this.hb > 0) {
         this.tb = new int[this.hb];
         this.eb = new int[this.hb];
         this.fb = new int[this.hb];
      }

      this.bb = 0;
      this.kb = 0;
      this.hb = 0;

      for(int var13 = 0; var13 < var2; ++var13) {
         he var9 = var1[var13];
         if(var9 != null) {
            for(int var10 = 0; var10 < var9.kb; ++var10) {
               this.U[this.kb] = var9.U[var10] + this.bb;
               this.db[this.kb] = var9.db[var10] + this.bb;
               this.Q[this.kb] = var9.Q[var10] + this.bb;
               this.cb[this.kb] = var9.cb[var10];
               this.lb[this.kb] = var9.lb[var10];
               this.X[this.kb] = var9.X[var10];
               if(var3) {
                  if(var9.jb != null) {
                     this.jb[this.kb] = var9.jb[var10];
                  } else {
                     this.jb[this.kb] = var9.ib;
                  }
               }

               if(var4 && var9.pb != null) {
                  this.pb[this.kb] = var9.pb[var10];
               }

               if(var5) {
                  if(var9.mb != null) {
                     this.mb[this.kb] = var9.mb[var10];
                  } else {
                     this.mb[this.kb] = -1;
                  }
               }

               if(var6) {
                  if(var9.T != null && var9.T[var10] != -1) {
                     this.T[this.kb] = (byte)(var9.T[var10] + this.hb);
                  } else {
                     this.T[this.kb] = -1;
                  }
               }

               ++this.kb;
            }

            for(int var11 = 0; var11 < var9.hb; ++var11) {
               this.tb[this.hb] = var9.tb[var11] + this.bb;
               this.eb[this.hb] = var9.eb[var11] + this.bb;
               this.fb[this.hb] = var9.fb[var11] + this.bb;
               ++this.hb;
            }

            for(int var12 = 0; var12 < var9.bb; ++var12) {
               this.gb[this.bb] = var9.gb[var12];
               this.rb[this.bb] = var9.rb[var12];
               this.Y[this.bb] = var9.Y[var12];
               ++this.bb;
            }
         }
      }

   }
}
