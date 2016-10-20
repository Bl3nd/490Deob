final class ng extends vd {
   static fd o;
   static int p;
   int[] q = new int[]{-1};
   static int r;
   private static ob s = rf.a(40, "Malformed login packet)3");
   static int t;
   static int u = 100;
   private static ob connectingToUpdateServer = rf.a(40, "Connecting to update server");
   static ob connectingToUpdateServer2;
   static int[] x;
   int[] y = new int[1];
   static ob z;
   static ob A;
   static int B;
   static ob C;
   static int D;
   static ob E;

   static final void a(byte var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         label49: {
            if(~var5 <= ~gh.R && ~u <= ~var5 && ~var4 <= ~gh.R && ~u <= ~var4 && var9 >= gh.R && u >= var9 && ~gh.R >= ~var2 && ~var2 >= ~u && ~var7 <= ~dd.a && na.anInt_m >= var7 && ~dd.a >= ~var3 && ~na.anInt_m <= ~var3 && dd.a <= var1 && ~var1 >= ~na.anInt_m && dd.a <= var8 && ~var8 >= ~na.anInt_m) {
               pe.a(var7, var1, var4, var3, var6, var5, var9, 121, var8, var2);
               if(client.anInt_wb == 0) {
                  break label49;
               }
            }

            vf.a(var2, var9, var1, var7, var6, (byte)127, var3, var5, var8, var4);
         }

         ++p;
         if(var0 <= 30) {
            a((byte)44);
         }
      } catch (RuntimeException var11) {
         throw bc.a(var11, "ng.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
      }
   }

   static final boolean b(int var0, int var1) {
      try {
         ++t;
         if(var0 > -80) {
            b(102, -121);
         }

         return (var1 & 1555208) >> 240386452 != 0;
      } catch (RuntimeException var3) {
         throw bc.a(var3, "ng.A(" + var0 + ',' + var1 + ')');
      }
   }

   public static void a(byte var0) {
      try {
         if(var0 != 89) {
            connectingToUpdateServer = null;
         }

         connectingToUpdateServer = null;
         E = null;
         x = null;
         C = null;
         s = null;
         z = null;
         connectingToUpdateServer2 = null;
         o = null;
         A = null;
      } catch (RuntimeException var2) {
         throw bc.a(var2, "ng.B(" + var0 + ')');
      }
   }

   static {
      z = s;
      B = 0;
      A = rf.a(40, "Spiel)2Engine wird gestartet)3)3)3");
      C = rf.a(40, " GMT");
      connectingToUpdateServer2 = connectingToUpdateServer;
      E = rf.a(40, "Diese Betatest)2Welt ist nur f-Ur eingeladene");
   }
}
