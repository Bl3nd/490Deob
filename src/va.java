import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.image.ImageObserver;

final class va {
   int a;
   int b;
   static int c;
   int d;
   static long[] e = new long[256];
   static ob f = rf.a(40, " zuerst von Ihrer Freunde)2Liste(Q");
   static int g;
   static pi h;
   static ob i;
   static int j;
   static int k;

   static final void a(ob var0, Color var1, byte var2, int var3) {
      try {
         try {
            if(var2 >= -122) {
               j = 122;
            }

            Graphics graphics = rg.canvas_t.getGraphics();
            if(hf.F == null) {
               hf.F = new Font("Helvetica", 1, 13);
               ee.g = rg.canvas_t.getFontMetrics(hf.F);
            }

            if(ke.sb) {
               ke.sb = false;
               graphics.setColor(Color.black);
               graphics.fillRect(0, 0, l.m, bg.anInt_d);
            }

            if(var1 == null) {
               var1 = new Color(140, 17, 17);
            }

            try {
               if(od.ab == null) {
                  od.ab = rg.canvas_t.createImage(304, 34);
               }

               Graphics graphics1 = od.ab.getGraphics();
               graphics1.setColor(var1);
               graphics1.drawRect(0, 0, 303, 33);
               graphics1.fillRect(2, 2, var3 * 3, 30);
               graphics1.setColor(Color.black);
               graphics1.drawRect(1, 1, 301, 31);
               graphics1.fillRect(2 - -(var3 * 3), 2, 300 - var3 * 3, 30);
               graphics1.setFont(hf.F);
               graphics1.setColor(Color.white);
               var0.a(graphics1, 114, 22, (-var0.a((FontMetrics)ee.g, (int)0) + 304) / 2);
               graphics.drawImage(od.ab, -152 + l.m / 2, bg.anInt_d / 2 - 18, (ImageObserver)null);
            } catch (Exception var7) {
               int var5 = l.m / 2 - 152;
               int var6 = -18 + bg.anInt_d / 2;
               graphics.setColor(var1);
               graphics.drawRect(var5, var6, 303, 33);
               graphics.fillRect(2 + var5, var6 - -2, var3 * 3, 30);
               graphics.setColor(Color.black);
               graphics.drawRect(var5 - -1, 1 + var6, 301, 31);
               graphics.fillRect(var3 * 3 + 2 + var5, var6 + 2, 300 + -(var3 * 3), 30);
               graphics.setFont(hf.F);
               graphics.setColor(Color.white);
               var0.a(graphics, 102, var6 + 22, (304 + -var0.a((FontMetrics)ee.g, (int)0)) / 2 + var5);
            }
         } catch (Exception var8) {
            rg.canvas_t.repaint();
         }

         ++k;
      } catch (RuntimeException var9) {
         throw bc.a(var9, "va.B(" + (var0 != null?"{...}":"null") + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   public static void a(int var0) {
      try {
         if(var0 != 2) {
            i = null;
         }

         i = null;
         e = null;
         h = null;
         f = null;
      } catch (RuntimeException var2) {
         throw bc.a(var2, "va.A(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, byte var3, int var4, int var5) {
      int var14 = client.anInt_wb;

      try {
         ++c;
         int var6 = -var5 + var4;
         int var7 = -var1 + var2;
         if(~var6 == -1) {
            if(var7 != 0) {
               qb.a(var1, var0, var5, (int)27908, var2);
            }

         } else if(~var7 == -1) {
            hi.a(var1, 114, var5, var4, var0);
         } else {
            if(var3 < 105) {
               j = -71;
            }

            int var9;
            int var11;
            int var12;
            int var13;
            label68: {
               var12 = (var7 << 115351756) / var6;
               var13 = -(var12 * var5 >> 1919722860) + var1;
               if(gh.R <= var4) {
                  if(ng.u < var4) {
                     var9 = ng.u;
                     var11 = (ng.u * var12 >> -119001140) + var13;
                     if(var14 == 0) {
                        break label68;
                     }
                  }

                  var11 = var2;
                  var9 = var4;
                  if(var14 == 0) {
                     break label68;
                  }
               }

               var9 = gh.R;
               var11 = (gh.R * var12 >> -1546797588) + var13;
            }

            label60: {
               if(~var11 <= ~dd.a) {
                  if(na.anInt_m >= var11) {
                     break label60;
                  }

                  var9 = (na.anInt_m + -var13 << 1307393804) / var12;
                  var11 = na.anInt_m;
                  if(var14 == 0) {
                     break label60;
                  }
               }

               var9 = (-var13 + dd.a << 1634226476) / var12;
               var11 = dd.a;
            }

            int var8;
            int var10;
            label53: {
               if(gh.R <= var5) {
                  if(~var5 >= ~ng.u) {
                     var10 = var1;
                     var8 = var5;
                     if(var14 == 0) {
                        break label53;
                     }
                  }

                  var8 = ng.u;
                  var10 = (var12 * ng.u >> -2091805940) + var13;
                  if(var14 == 0) {
                     break label53;
                  }
               }

               var8 = gh.R;
               var10 = (var12 * gh.R >> -1401524148) + var13;
            }

            label45: {
               if(~dd.a >= ~var10) {
                  if(na.anInt_m >= var10) {
                     break label45;
                  }

                  var8 = (na.anInt_m - var13 << 473316140) / var12;
                  var10 = na.anInt_m;
                  if(var14 == 0) {
                     break label45;
                  }
               }

               var8 = (-var13 + dd.a << -1380652852) / var12;
               var10 = dd.a;
            }

            sb.b(var11, var10, -638213620, var0, var8, var9);
         }
      } catch (RuntimeException var15) {
         throw bc.a(var15, "va.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   static {
      for(int var2 = 0; ~var2 > -257; ++var2) {
         long var0 = (long)var2;

         for(int var3 = 0; ~var3 > -9; ++var3) {
            if((1L & var0) == 1L) {
               var0 = var0 >>> -438800703 ^ -3932672073523589310L;
            } else {
               var0 >>>= 1;
            }
         }

         e[var2] = var0;
      }

      h = new pi();
      i = rf.a(40, "Mem:");
   }
}
