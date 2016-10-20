final class td extends sg {
   private int s;
   private int t;
   private int u;
   private int v;
   private boolean w;
   private int x;
   private int y;
   private int z;
   private int A;
   private int B;
   private int C;
   private int D;
   private int F;
   private int G;
   private int H;

   private final int a(int[] var1, int var2, int var3, int var4, int var5) {
      do {
         if(this.D <= 0) {
            if(this.y == -256 && (this.B & 255) == 0) {
               if(be.forceSend) {
                  return b(0, ((oa)super.o).t, var1, this.B, var2, this.H, this.v, 0, var4, var3, this);
               }

               return a(((oa)super.o).t, var1, this.B, var2, this.z, 0, var4, var3, this);
            }

            if(be.forceSend) {
               return b(0, 0, ((oa)super.o).t, var1, this.B, var2, this.H, this.v, 0, var4, var3, this, this.y, var5);
            }

            return b(0, 0, ((oa)super.o).t, var1, this.B, var2, this.z, 0, var4, var3, this, this.y, var5);
         }

         int var6 = var2 + this.D;
         if(var6 > var4) {
            var6 = var4;
         }

         this.D += var2;
         if(this.y == -256 && (this.B & 255) == 0) {
            if(be.forceSend) {
               var2 = b(0, ((oa)super.o).t, var1, this.B, var2, this.H, this.v, this.x, this.C, 0, var6, var3, this);
            } else {
               var2 = b(((oa)super.o).t, var1, this.B, var2, this.z, this.s, 0, var6, var3, this);
            }
         } else if(be.forceSend) {
            var2 = b(0, 0, ((oa)super.o).t, var1, this.B, var2, this.H, this.v, this.x, this.C, 0, var6, var3, this, this.y, var5);
         } else {
            var2 = d(0, 0, ((oa)super.o).t, var1, this.B, var2, this.z, this.s, 0, var6, var3, this, this.y, var5);
         }

         this.D -= var2;
         if(this.D != 0) {
            return var2;
         }
      } while(!this.i());

      return var4;
   }

   final synchronized int e() {
      return this.A == Integer.MIN_VALUE?0:this.A;
   }

   private static final int a(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, td var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.B = var4;
      return var5;
   }

   private static final int a(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, td var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.B = var3 << 8;
      return var4 >> 1;
   }

   private static final int a(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, td var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.B = var4;
      return var5 >> 1;
   }

   private final int b(int[] var1, int var2, int var3, int var4, int var5) {
      do {
         if(this.D <= 0) {
            if(this.y == 256 && (this.B & 255) == 0) {
               if(be.forceSend) {
                  return a(0, ((oa)super.o).t, var1, this.B, var2, this.H, this.v, 0, var4, var3, this);
               }

               return b(((oa)super.o).t, var1, this.B, var2, this.z, 0, var4, var3, this);
            }

            if(be.forceSend) {
               return a(0, 0, ((oa)super.o).t, var1, this.B, var2, this.H, this.v, 0, var4, var3, this, this.y, var5);
            }

            return a(0, 0, ((oa)super.o).t, var1, this.B, var2, this.z, 0, var4, var3, this, this.y, var5);
         }

         int var6 = var2 + this.D;
         if(var6 > var4) {
            var6 = var4;
         }

         this.D += var2;
         if(this.y == 256 && (this.B & 255) == 0) {
            if(be.forceSend) {
               var2 = a(0, ((oa)super.o).t, var1, this.B, var2, this.H, this.v, this.x, this.C, 0, var6, var3, this);
            } else {
               var2 = a(((oa)super.o).t, var1, this.B, var2, this.z, this.s, 0, var6, var3, this);
            }
         } else if(be.forceSend) {
            var2 = a(0, 0, ((oa)super.o).t, var1, this.B, var2, this.H, this.v, this.x, this.C, 0, var6, var3, this, this.y, var5);
         } else {
            var2 = c(0, 0, ((oa)super.o).t, var1, this.B, var2, this.z, this.s, 0, var6, var3, this, this.y, var5);
         }

         this.D -= var2;
         if(this.D != 0) {
            return var2;
         }
      } while(!this.i());

      return var4;
   }

   private final void f() {
      this.z = this.A;
      this.H = e(this.A, this.F);
      this.v = b(this.A, this.F);
   }

   private static final int a(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, td var13, int var14, int var15) {
      var13.z -= var13.s * var5;
      if(var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.z += var13.s * var5;
      var13.H = var6;
      var13.v = var7;
      var13.B = var4;
      return var5;
   }

   private static final int b(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, td var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.B = var4;
      return var5 >> 1;
   }

   private static final int b(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, td var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.B = var4;
      return var5;
   }

   final synchronized int g() {
      return this.F < 0?-1:this.F;
   }

   static final td a(oa var0, int var1, int var2) {
      return var0.t != null && var0.t.length != 0?new td(var0, (int)((long)var0.q * 256L * (long)var1 / (long)(100 * ki.sampleRate)), var2 << 6):null;
   }

   private static final int b(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, td var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.B = var3 << 8;
      return var4 >> 1;
   }

   final synchronized void b(int var1, int var2, int var3) {
      if(var1 == 0) {
         this.d(var2, var3);
      } else {
         int var4 = e(var2, var3);
         int var5 = b(var2, var3);
         if(this.H == var4 && this.v == var5) {
            this.D = 0;
         } else {
            int var6 = var2 - this.z;
            if(this.z - var2 > var6) {
               var6 = this.z - var2;
            }

            if(var4 - this.H > var6) {
               var6 = var4 - this.H;
            }

            if(this.H - var4 > var6) {
               var6 = this.H - var4;
            }

            if(var5 - this.v > var6) {
               var6 = var5 - this.v;
            }

            if(this.v - var5 > var6) {
               var6 = this.v - var5;
            }

            if(var1 > var6) {
               var1 = var6;
            }

            this.D = var1;
            this.A = var2;
            this.F = var3;
            this.s = (var2 - this.z) / var1;
            this.x = (var4 - this.H) / var1;
            this.C = (var5 - this.v) / var1;
         }
      }
   }

   private static final int b(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, td var13, int var14, int var15) {
      var13.z -= var13.s * var5;
      if(var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.z += var13.s * var5;
      var13.H = var6;
      var13.v = var7;
      var13.B = var4;
      return var5;
   }

   final synchronized void a(int[] var1, int var2, int var3) {
      if(this.A == 0 && this.D == 0) {
         this.d(var3);
      } else {
         oa var4 = (oa)super.o;
         int var5 = this.G << 8;
         int var6 = this.u << 8;
         int var7 = var4.t.length << 8;
         int var8 = var6 - var5;
         if(var8 <= 0) {
            this.t = 0;
         }

         int var9 = var2;
         var3 += var2;
         if(this.B < 0) {
            if(this.y <= 0) {
               this.l();
               this.c(128);
               return;
            }

            this.B = 0;
         }

         if(this.B >= var7) {
            if(this.y >= 0) {
               this.l();
               this.c(128);
               return;
            }

            this.B = var7 - 1;
         }

         if(this.t < 0) {
            if(this.w) {
               if(this.y < 0) {
                  var9 = this.a(var1, var2, var5, var3, var4.t[this.G]);
                  if(this.B >= var5) {
                     return;
                  }

                  this.B = var5 + var5 - 1 - this.B;
                  this.y = -this.y;
               }

               while(true) {
                  var9 = this.b(var1, var9, var6, var3, var4.t[this.u - 1]);
                  if(this.B < var6) {
                     return;
                  }

                  this.B = var6 + var6 - 1 - this.B;
                  this.y = -this.y;
                  var9 = this.a(var1, var9, var5, var3, var4.t[this.G]);
                  if(this.B >= var5) {
                     return;
                  }

                  this.B = var5 + var5 - 1 - this.B;
                  this.y = -this.y;
               }
            } else if(this.y < 0) {
               while(true) {
                  var9 = this.a(var1, var9, var5, var3, var4.t[this.u - 1]);
                  if(this.B >= var5) {
                     return;
                  }

                  this.B = var6 - 1 - (var6 - 1 - this.B) % var8;
               }
            } else {
               while(true) {
                  var9 = this.b(var1, var9, var6, var3, var4.t[this.G]);
                  if(this.B < var6) {
                     return;
                  }

                  this.B = var5 + (this.B - var5) % var8;
               }
            }
         } else {
            if(this.t > 0) {
               if(this.w) {
                  label130: {
                     if(this.y < 0) {
                        var9 = this.a(var1, var2, var5, var3, var4.t[this.G]);
                        if(this.B >= var5) {
                           return;
                        }

                        this.B = var5 + var5 - 1 - this.B;
                        this.y = -this.y;
                        if(--this.t == 0) {
                           break label130;
                        }
                     }

                     do {
                        var9 = this.b(var1, var9, var6, var3, var4.t[this.u - 1]);
                        if(this.B < var6) {
                           return;
                        }

                        this.B = var6 + var6 - 1 - this.B;
                        this.y = -this.y;
                        if(--this.t == 0) {
                           break;
                        }

                        var9 = this.a(var1, var9, var5, var3, var4.t[this.G]);
                        if(this.B >= var5) {
                           return;
                        }

                        this.B = var5 + var5 - 1 - this.B;
                        this.y = -this.y;
                     } while(--this.t != 0);
                  }
               } else {
                  int var10;
                  if(this.y < 0) {
                     while(true) {
                        var9 = this.a(var1, var9, var5, var3, var4.t[this.u - 1]);
                        if(this.B >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.B) / var8;
                        if(var10 >= this.t) {
                           this.B += var8 * this.t;
                           this.t = 0;
                           break;
                        }

                        this.B += var8 * var10;
                        this.t -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.b(var1, var9, var6, var3, var4.t[this.G]);
                        if(this.B < var6) {
                           return;
                        }

                        var10 = (this.B - var5) / var8;
                        if(var10 >= this.t) {
                           this.B -= var8 * this.t;
                           this.t = 0;
                           break;
                        }

                        this.B -= var8 * var10;
                        this.t -= var10;
                     }
                  }
               }
            }

            if(this.y < 0) {
               this.a(var1, var9, 0, var3, 0);
               if(this.B < 0) {
                  this.B = -1;
                  this.l();
                  this.c(128);
                  return;
               }
            } else {
               this.b(var1, var9, var7, var3, 0);
               if(this.B >= var7) {
                  this.B = var7;
                  this.l();
                  this.c(128);
               }
            }

         }
      }
   }

   private static final int a(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, td var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.B = var2 << 8;
      return var3;
   }

   final int a() {
      int var1 = this.z * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if(this.t == 0) {
         var1 -= var1 * this.B / (((oa)super.o).t.length << 8);
      } else if(this.t >= 0) {
         var1 -= var1 * this.G / ((oa)super.o).t.length;
      }

      return var1 > 255?255:var1;
   }

   private static final int b(int var0, int var1) {
      return var1 < 0?-var0:(int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
   }

   final synchronized void c(int var1, int var2) {
      this.b(var1, var2, this.g());
   }

   final synchronized void e(int var1) {
      int var2 = ((oa)super.o).t.length << 8;
      if(var1 < -1) {
         var1 = -1;
      }

      if(var1 > var2) {
         var1 = var2;
      }

      this.B = var1;
   }

   private final synchronized void f(int var1) {
      this.d(var1, this.g());
   }

   private static final int c(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, td var11, int var12, int var13) {
      var11.H -= var11.x * var5;
      var11.v -= var11.C * var5;
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.H += var11.x * var5;
      var11.v += var11.C * var5;
      var11.z = var6;
      var11.B = var4;
      return var5;
   }

   final int b() {
      return this.A == 0 && this.D == 0?0:1;
   }

   private final synchronized void d(int var1, int var2) {
      this.A = var1;
      this.F = var2;
      this.D = 0;
      this.f();
   }

   private static final int d(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, td var11, int var12, int var13) {
      var11.H -= var11.x * var5;
      var11.v -= var11.C * var5;
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.H += var11.x * var5;
      var11.v += var11.C * var5;
      var11.z = var6;
      var11.B = var4;
      return var5;
   }

   final sg d() {
      return null;
   }

   final boolean h() {
      return this.B < 0 || this.B >= ((oa)super.o).t.length << 8;
   }

   final synchronized void g(int var1) {
      this.t = var1;
   }

   static final td a(oa var0, int var1, int var2, int var3) {
      return var0.t != null && var0.t.length != 0?new td(var0, var1, var2, var3):null;
   }

   private static final int a(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, td var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.H += var9.x * (var6 - var3);
      var9.v += var9.C * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.z = var4 >> 2;
      var9.B = var2 << 8;
      return var3;
   }

   private final boolean i() {
      int var1 = this.A;
      int var2;
      int var3;
      if(var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = e(var1, this.F);
         var3 = b(var1, this.F);
      }

      if(this.z == var1 && this.H == var2 && this.v == var3) {
         if(this.A == Integer.MIN_VALUE) {
            this.A = 0;
            this.z = this.H = this.v = 0;
            this.c(128);
            return true;
         } else {
            this.f();
            return false;
         }
      } else {
         if(this.z < var1) {
            this.s = 1;
            this.D = var1 - this.z;
         } else if(this.z > var1) {
            this.s = -1;
            this.D = this.z - var1;
         } else {
            this.s = 0;
         }

         if(this.H < var2) {
            this.x = 1;
            if(this.D == 0 || this.D > var2 - this.H) {
               this.D = var2 - this.H;
            }
         } else if(this.H > var2) {
            this.x = -1;
            if(this.D == 0 || this.D > this.H - var2) {
               this.D = this.H - var2;
            }
         } else {
            this.x = 0;
         }

         if(this.v < var3) {
            this.C = 1;
            if(this.D == 0 || this.D > var3 - this.v) {
               this.D = var3 - this.v;
            }
         } else if(this.v > var3) {
            this.C = -1;
            if(this.D == 0 || this.D > this.v - var3) {
               this.D = this.v - var3;
            }
         } else {
            this.C = 0;
         }

         return false;
      }
   }

   private static final int a(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, td var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.z += var12.s * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.H = var5 >> 2;
      var12.v = var6 >> 2;
      var12.B = var3 << 8;
      return var4 >> 1;
   }

   final synchronized int j() {
      return this.y < 0?-this.y:this.y;
   }

   final synchronized void h(int var1) {
      this.d(var1 << 6, this.g());
   }

   private static final int b(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, td var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.B = var2 << 8;
      return var3;
   }

   final boolean k() {
      return this.D != 0;
   }

   private static final int e(int var0, int var1) {
      return var1 < 0?var0:(int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   private static final int b(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, td var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.H += var9.x * (var6 - var3);
      var9.v += var9.C * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.z = var4 >> 2;
      var9.B = var2 << 8;
      return var3;
   }

   final synchronized void d(int var1) {
      if(this.D > 0) {
         if(var1 >= this.D) {
            if(this.A == Integer.MIN_VALUE) {
               this.A = 0;
               this.z = this.H = this.v = 0;
               this.c(128);
               var1 = this.D;
            }

            this.D = 0;
            this.f();
         } else {
            this.z += this.s * var1;
            this.H += this.x * var1;
            this.v += this.C * var1;
            this.D -= var1;
         }
      }

      oa var2 = (oa)super.o;
      int var3 = this.G << 8;
      int var4 = this.u << 8;
      int var5 = var2.t.length << 8;
      int var6 = var4 - var3;
      if(var6 <= 0) {
         this.t = 0;
      }

      if(this.B < 0) {
         if(this.y <= 0) {
            this.l();
            this.c(128);
            return;
         }

         this.B = 0;
      }

      if(this.B >= var5) {
         if(this.y >= 0) {
            this.l();
            this.c(128);
            return;
         }

         this.B = var5 - 1;
      }

      this.B += this.y * var1;
      if(this.t < 0) {
         if(!this.w) {
            if(this.y < 0) {
               if(this.B < var3) {
                  this.B = var4 - 1 - (var4 - 1 - this.B) % var6;
               }
            } else if(this.B >= var4) {
               this.B = var3 + (this.B - var3) % var6;
            }
         } else {
            if(this.y < 0) {
               if(this.B >= var3) {
                  return;
               }

               this.B = var3 + var3 - 1 - this.B;
               this.y = -this.y;
            }

            while(this.B >= var4) {
               this.B = var4 + var4 - 1 - this.B;
               this.y = -this.y;
               if(this.B >= var3) {
                  return;
               }

               this.B = var3 + var3 - 1 - this.B;
               this.y = -this.y;
            }

         }
      } else {
         if(this.t > 0) {
            if(this.w) {
               label125: {
                  if(this.y < 0) {
                     if(this.B >= var3) {
                        return;
                     }

                     this.B = var3 + var3 - 1 - this.B;
                     this.y = -this.y;
                     if(--this.t == 0) {
                        break label125;
                     }
                  }

                  do {
                     if(this.B < var4) {
                        return;
                     }

                     this.B = var4 + var4 - 1 - this.B;
                     this.y = -this.y;
                     if(--this.t == 0) {
                        break;
                     }

                     if(this.B >= var3) {
                        return;
                     }

                     this.B = var3 + var3 - 1 - this.B;
                     this.y = -this.y;
                  } while(--this.t != 0);
               }
            } else {
               int var7;
               if(this.y < 0) {
                  if(this.B >= var3) {
                     return;
                  }

                  var7 = (var4 - 1 - this.B) / var6;
                  if(var7 < this.t) {
                     this.B += var6 * var7;
                     this.t -= var7;
                     return;
                  }

                  this.B += var6 * this.t;
                  this.t = 0;
               } else {
                  if(this.B < var4) {
                     return;
                  }

                  var7 = (this.B - var3) / var6;
                  if(var7 < this.t) {
                     this.B -= var6 * var7;
                     this.t -= var7;
                     return;
                  }

                  this.B -= var6 * this.t;
                  this.t = 0;
               }
            }
         }

         if(this.y < 0) {
            if(this.B < 0) {
               this.B = -1;
               this.l();
               this.c(128);
               return;
            }
         } else if(this.B >= var5) {
            this.B = var5;
            this.l();
            this.c(128);
         }

      }
   }

   final synchronized void i(int var1) {
      if(var1 == 0) {
         this.f(0);
         this.c(128);
      } else if(this.H == 0 && this.v == 0) {
         this.D = 0;
         this.A = 0;
         this.z = 0;
         this.c(128);
      } else {
         int var2 = -this.z;
         if(this.z > var2) {
            var2 = this.z;
         }

         if(-this.H > var2) {
            var2 = -this.H;
         }

         if(this.H > var2) {
            var2 = this.H;
         }

         if(-this.v > var2) {
            var2 = -this.v;
         }

         if(this.v > var2) {
            var2 = this.v;
         }

         if(var1 > var2) {
            var1 = var2;
         }

         this.D = var1;
         this.A = Integer.MIN_VALUE;
         this.s = -this.z / var1;
         this.x = -this.H / var1;
         this.C = -this.v / var1;
      }
   }

   private static final int b(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, td var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.z += var12.s * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.H = var5 >> 2;
      var12.v = var6 >> 2;
      var12.B = var3 << 8;
      return var4 >> 1;
   }

   final synchronized void j(int var1) {
      if(this.y < 0) {
         this.y = -var1;
      } else {
         this.y = var1;
      }
   }

   private td(oa var1, int var2, int var3) {
      super.o = var1;
      this.G = var1.p;
      this.u = var1.s;
      this.w = var1.r;
      this.y = var2;
      this.A = var3;
      this.F = 8192;
      this.B = 0;
      this.f();
   }

   private td(oa var1, int var2, int var3, int var4) {
      super.o = var1;
      this.G = var1.p;
      this.u = var1.s;
      this.w = var1.r;
      this.y = var2;
      this.A = var3;
      this.F = var4;
      this.B = 0;
      this.f();
   }

   final synchronized void a(boolean var1) {
      this.y = (this.y ^ this.y >> 31) + (this.y >>> 31);
      if(var1) {
         this.y = -this.y;
      }

   }

   final sg c() {
      return null;
   }

   private final void l() {
      if(this.D != 0) {
         if(this.A == Integer.MIN_VALUE) {
            this.A = 0;
         }

         this.D = 0;
         this.f();
      }

   }
}
