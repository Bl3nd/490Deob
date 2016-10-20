import java.util.zip.CRC32;

final class oh extends rg {
   int D;
   ob E;
   static ob F = rf.a(40, "Benutzeroberfl-=che geladen)3");
   int[] G;
   md[] H;
   static int I;
   int J;
   ob[] K;
   int[] L;
   static int M = 0;
   static int N;
   int O;
   int P;
   static int Q;
   static int R;
   static CRC32 S = new CRC32();

   static final ob a(byte var0, boolean var1, int var2) {
      try {
         ++R;
         int var3 = -34 / ((4 - var0) / 53);
         return kh.a((byte)104, var2, 10, var1);
      } catch (RuntimeException var4) {
         throw bc.a(var4, "oh.A(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   public static void f(int var0) {
      try {
         S = null;
         if(var0 == -1) {
            F = null;
         }
      } catch (RuntimeException var2) {
         throw bc.a(var2, "oh.C(" + var0 + ')');
      }
   }

   static final void a(int var0, ud var1) {
      int var7 = client.anInt_wb;

      try {
         ++N;
         if(~var1.ab != -1) {
            int var3;
            int var4;
            if(var1.Mb != -1 && ~var1.Mb > -32769) {
               nb var2 = ai.M[var1.Mb];
               if(var2 != null) {
                  var3 = -var2.coordX + var1.coordX;
                  var4 = var1.coordY + -var2.coordY;
                  if(var3 != 0 || ~var4 != -1) {
                     var1.U = (int)(325.949D * Math.atan2((double)var3, (double)var4)) & 2047;
                  }
               }
            }

            int var9 = -78 % ((-73 - var0) / 39);
            if(~var1.Mb <= -32769) {
               var3 = var1.Mb - '耀';
               if(jh.c == var3) {
                  var3 = 2047;
               }

               dg var10 = lg.j[var3];
               if(var10 != null) {
                  int var5 = var1.coordX + -var10.coordX;
                  int var6 = -var10.coordY + var1.coordY;
                  if(var5 != 0 || var6 != 0) {
                     var1.U = (int)(325.949D * Math.atan2((double)var5, (double)var6)) & 2047;
                  }
               }
            }

            if((~var1.Ob != -1 || var1.anInt_lb != 0) && (~var1.T == -1 || var1.rb > 0)) {
               var3 = -(64 * (-ic.entityXPosition + var1.Ob - ic.entityXPosition)) + var1.coordX;
               var4 = var1.coordY + -(64 * (var1.anInt_lb + -ic.entityYPosition + -ic.entityYPosition));
               if(var3 != 0 || var4 != 0) {
                  var1.U = 2047 & (int)(325.949D * Math.atan2((double)var3, (double)var4));
               }

               var1.Ob = 0;
               var1.anInt_lb = 0;
            }

            var3 = 2047 & -var1.gb + var1.U;
            if(~var3 == -1) {
               var1.sb = 0;
            } else {
               label146: {
                  ++var1.sb;
                  boolean var11;
                  if(var3 > 1024) {
                     var1.gb -= var1.ab;
                     var11 = true;
                     if(~var3 > ~var1.ab || var3 > 2048 - var1.ab) {
                        var1.gb = var1.U;
                        var11 = false;
                     }

                     if(~var1.Jb != ~var1.P || ~var1.sb >= -26 && !var11) {
                        break label146;
                     }

                     if(var1.Rb != -1) {
                        var1.P = var1.Rb;
                        if(var7 == 0) {
                           break label146;
                        }
                     }

                     var1.P = var1.Y;
                     if(var7 == 0) {
                        break label146;
                     }
                  }

                  var1.gb += var1.ab;
                  var11 = true;
                  if(~var1.ab < ~var3 || ~var3 < ~(-var1.ab + 2048)) {
                     var11 = false;
                     var1.gb = var1.U;
                  }

                  if(~var1.Jb == ~var1.P && (~var1.sb < -26 || var11)) {
                     label142: {
                        if(var1.R != -1) {
                           var1.P = var1.R;
                           if(var7 == 0) {
                              break label142;
                           }
                        }

                        var1.P = var1.Y;
                     }
                  }
               }

               var1.gb &= 2047;
            }
         }
      } catch (RuntimeException var8) {
         throw bc.a(var8, "oh.B(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }
}
