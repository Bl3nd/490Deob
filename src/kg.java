import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Calendar;

abstract class kg {
   static int a = 0;
   static int b;
   static int c;
   static jg[] d = new jg[6];
   static ob e = rf.a(40, "(Y<)4col>");
   static int f = 0;
   int width;
   static int h;
   static int i;
   int height;
   private static ob k = rf.a(40, "You need a members account to login to this world)3");
   static int l;
   static ob m;
   static int n;
   static int[] o;
   static ob p = rf.a(40, "Ung-Ultige Session)2ID)3");
   Image image;
   static Calendar r;
   int[] s;

   static final void a(int var0, int var1, int var2, byte[] var3, int var4, int var5, hi[] var6, int var7, int var8, int var9) {
      int var15 = client.anInt_wb;

      try {
         int var10 = 0;
         int var11;
         int var12;
         int var13;
         int var14;
         og var17;
         if(var15 != 0) {
            var11 = 0;
            if(var15 != 0) {
               if(~(var10 + var4) < -1 && ~(var10 + var4) > -104 && ~(var11 + var8) < -1 && var8 + var11 < 103) {
                  var6[var5].i[var10 + var4][var8 - -var11] = bd.b(var6[var5].i[var10 + var4][var8 - -var11], -16777217);
               }

               ++var11;
            }
         } else {
            if(~var10 <= -9) {
               if(var2 != 17606) {
                  k = null;
               }

               ++l;
               var17 = new og(var3);
               var12 = 0;
               if(var15 == 0 && ~var12 <= -5) {
                  return;
               }

               do {
                  var13 = 0;
                  if(var15 != 0 || ~var13 > -65) {
                     do {
                        var14 = 0;
                        if(var15 != 0 || var14 < 64) {
                           do {
                              if(var7 == var12 && ~var9 >= ~var13 && ~(8 + var9) < ~var13 && var0 <= var14 && 8 + var0 > var14) {
                                 kf.a(0, var2 + -17506, var4 + jb.a((byte)64, var13 & 7, var1, 7 & var14), pa.a(var14 & 7, var13 & 7, var1, 0) + var8, var5, 0, var17, var1);
                                 if(var15 == 0) {
                                    ++var14;
                                    continue;
                                 }
                              }

                              kf.a(0, 93, -1, -1, 0, 0, var17, 0);
                              ++var14;
                           } while(var14 < 64);
                        }

                        ++var13;
                     } while(~var13 > -65);
                  }

                  ++var12;
               } while(~var12 > -5);

               return;
            }

            var11 = 0;
            if(var15 != 0) {
               if(~(var10 + var4) < -1 && ~(var10 + var4) > -104 && ~(var11 + var8) < -1 && var8 + var11 < 103) {
                  var6[var5].i[var10 + var4][var8 - -var11] = bd.b(var6[var5].i[var10 + var4][var8 - -var11], -16777217);
               }

               ++var11;
            }
         }

         while(true) {
            for(; ~var11 > -9; ++var11) {
               if(~(var10 + var4) < -1 && ~(var10 + var4) > -104 && ~(var11 + var8) < -1 && var8 + var11 < 103) {
                  var6[var5].i[var10 + var4][var8 - -var11] = bd.b(var6[var5].i[var10 + var4][var8 - -var11], -16777217);
               }
            }

            ++var10;
            if(~var10 <= -9) {
               if(var2 != 17606) {
                  k = null;
               }

               ++l;
               var17 = new og(var3);
               var12 = 0;
               if(var15 == 0 && ~var12 <= -5) {
                  return;
               }

               do {
                  var13 = 0;
                  if(var15 != 0 || ~var13 > -65) {
                     do {
                        var14 = 0;
                        if(var15 != 0 || var14 < 64) {
                           do {
                              if(var7 == var12 && ~var9 >= ~var13 && ~(8 + var9) < ~var13 && var0 <= var14 && 8 + var0 > var14) {
                                 kf.a(0, var2 + -17506, var4 + jb.a((byte)64, var13 & 7, var1, 7 & var14), pa.a(var14 & 7, var13 & 7, var1, 0) + var8, var5, 0, var17, var1);
                                 if(var15 == 0) {
                                    ++var14;
                                    continue;
                                 }
                              }

                              kf.a(0, 93, -1, -1, 0, 0, var17, 0);
                              ++var14;
                           } while(var14 < 64);
                        }

                        ++var13;
                     } while(~var13 > -65);
                  }

                  ++var12;
               } while(~var12 > -5);

               return;
            }

            var11 = 0;
            if(var15 != 0) {
               if(~(var10 + var4) < -1 && ~(var10 + var4) > -104 && ~(var11 + var8) < -1 && var8 + var11 < 103) {
                  var6[var5].i[var10 + var4][var8 - -var11] = bd.b(var6[var5].i[var10 + var4][var8 - -var11], -16777217);
               }

               ++var11;
            }
         }
      } catch (RuntimeException var16) {
         throw bc.a(var16, "kg.J(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ',' + var4 + ',' + var5 + ',' + (var6 != null?"{...}":"null") + ',' + var7 + ',' + var8 + ',' + var9 + ')');
      }
   }

   static final boolean a(int var0, int var1, int var2, long var3) {
      pd var5 = nb.oc[var0][var1][var2];
      if(var5 == null) {
         return false;
      } else if(var5.x != null && var5.x.j == var3) {
         return true;
      } else if(var5.r != null && var5.r.m == var3) {
         return true;
      } else if(var5.u != null && var5.u.o == var3) {
         return true;
      } else {
         for(int var6 = 0; var6 < var5.B; ++var6) {
            if(var5.D[var6].b == var3) {
               return true;
            }
         }

         return false;
      }
   }

   static final int a(int var0, int var1, boolean var2, int var3) {
      try {
         ++c;
         if(!var2) {
            a(-73, 49, false, -115);
         }

         return ~var0 >= ~var3?(var1 < var3?var1:var3):var0;
      } catch (RuntimeException var5) {
         throw bc.a(var5, "kg.G(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   final void a(int var1) {
      try {
         oi.a(this.s, this.width, this.height);
         ++h;
         if(var1 != -5) {
            i = -77;
         }
      } catch (RuntimeException var3) {
         throw bc.a(var3, "kg.H(" + var1 + ')');
      }
   }

   static final void a(byte var0) {
      try {
         ++n;
         ji.p.b((int)9946);
         if(var0 != -86) {
            a = -11;
         }
      } catch (RuntimeException var2) {
         throw bc.a(var2, "kg.L(" + var0 + ')');
      }
   }

   abstract void a(int var1, Graphics graphics, int var3, int var4);

   abstract void a(int var1, int var2, Component var3, int var4);

   public static void b(int var0) {
      try {
         m = null;
         r = null;
         if(var0 == -5218) {
            p = null;
            k = null;
            d = null;
            e = null;
            o = null;
         }
      } catch (RuntimeException var2) {
         throw bc.a(var2, "kg.K(" + var0 + ')');
      }
   }

   abstract void a(int var1, int var2, int var3, Graphics var4, int var5, int var6);

   static {
      m = k;
      o = new int[50];
      i = 0;
      r = Calendar.getInstance();
   }
}
