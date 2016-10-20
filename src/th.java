final class th extends af {
   static ob R = rf.a(40, "Lade Wordpack )2 ");
   private int S = 1;
   static ob T = rf.a(40, "<col=00ff00>");
   static int[] U = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
   static int V;
   private int W = 204;
   static int X;
   static int Y;
   private int Z = 1;
   static int ab;
   static int bb;
   static int cb;

   final void a(int var1, int var2, og var3) {
      try {
         ++V;
         int var4 = -24 % ((var2 - 66) / 57);
         if(var1 != 0) {
            if(var1 == 1) {
               this.Z = var3.readUnsignedByte(255);
               return;
            }

            if(var1 != 2) {
               return;
            }

            if(client.anInt_wb == 0) {
               this.W = var3.readShort(39);
               return;
            }
         }

         this.S = var3.readUnsignedByte(255);
      } catch (RuntimeException var6) {
         throw bc.a(var6, "th.B(" + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

   public static void b(byte var0) {
      try {
         T = null;
         U = null;
         int var1 = -125 % ((4 - var0) / 52);
         R = null;
      } catch (RuntimeException var2) {
         throw bc.a(var2, "th.C(" + var0 + ')');
      }
   }

   static final int a(int var0, int var1, int var2, int var3, int var4) {
      try {
         ++ab;
         int var5 = 65536 - ec.L[var0 * var2 / var3] >> 274375137;
         return ((-var5 + 65536) * var4 >> -1345080432) + (var1 * var5 >> -612019536);
      } catch (RuntimeException var6) {
         throw bc.a(var6, "th.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   public th() {
      super(0, true);
   }

   final int[] a(byte var1, int var2) {
      int var11 = client.anInt_wb;

      try {
         int[] var3 = super.nd_v.a(var2, 12);
         ++Y;
         if(var1 < 13) {
            return null;
         } else {
            if(super.nd_v.n) {
               int var4 = 0;
               if(var11 != 0 || var4 < lh.eb) {
                  do {
                     int var6 = rh.r[var2];
                     int var5 = bd.J[var4];
                     int var7 = var5 * this.S >> -1973269044;
                     int var8 = this.Z * var6 >> -1423264340;
                     int var9 = var5 % (4096 / this.S) * this.S;
                     int var10 = var6 % (4096 / this.Z) * this.Z;
                     if(this.W > var10) {
                        var7 -= var8;
                        if(var11 != 0) {
                           var7 += 4;
                        }

                        while(var7 < 0) {
                           var7 += 4;
                        }

                        if(var11 != 0) {
                           var7 -= 4;
                        }

                        while(var7 > 3) {
                           var7 -= 4;
                        }

                        if(var7 != 1) {
                           var3[var4] = 0;
                           if(var11 == 0) {
                              ++var4;
                              continue;
                           }
                        }

                        if(~var9 > ~this.W) {
                           var3[var4] = 0;
                           if(var11 == 0) {
                              ++var4;
                              continue;
                           }
                        }
                     }

                     if(~this.W >= ~var9) {
                        var3[var4] = 4096;
                        ++var4;
                     } else {
                        var7 -= var8;
                        if(var11 != 0) {
                           var7 += 4;
                        }

                        while(var7 < 0) {
                           var7 += 4;
                        }

                        if(var11 != 0) {
                           var7 -= 4;
                        }

                        while(var7 > 3) {
                           var7 -= 4;
                        }

                        if(var7 > 0) {
                           var3[var4] = 0;
                           if(var11 != 0) {
                              var3[var4] = 4096;
                              ++var4;
                           } else {
                              ++var4;
                           }
                        } else {
                           var3[var4] = 4096;
                           ++var4;
                        }
                     }
                  } while(var4 < lh.eb);
               }
            }

            return var3;
         }
      } catch (RuntimeException var12) {
         throw bc.a(var12, "th.F(" + var1 + ',' + var2 + ')');
      }
   }
}
