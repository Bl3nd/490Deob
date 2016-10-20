final class ka extends qi {
   static int[][] x = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   static int y;
   static int z;
   static ob A = rf.a(40, "Geben Sie Ihren Benutzernamen");
   static ob mapfunction = rf.a(40, "mapfunction");
   static ob C = rf.a(40, "Suche nach Updates )2 ");
   static int D;
   static pe cacheFile2;
   static ob F = rf.a(40, "Lade Sprites )2 ");
   static int G;

   public static void d(byte var0) {
      try {
         A = null;
         if(var0 == 117) {
            x = null;
            mapfunction = null;
            cacheFile2 = null;
            F = null;
            C = null;
         }
      } catch (RuntimeException var2) {
         throw bc.a(var2, "ka.B(" + var0 + ')');
      }
   }

   static final void e(byte var0) {
      int var2 = client.anInt_wb;

      try {
         ++G;
         if(var0 == -65) {
            qf var1 = (qf)va.h.a((byte)-9);
            if(var2 != 0 || var1 != null) {
               do {
                  if(var1.x != null) {
                     var1.d(0);
                  }

                  var1 = (qf)va.h.b((byte)94);
               } while(var1 != null);

            }
         }
      } catch (RuntimeException var3) {
         throw bc.a(var3, "ka.A(" + var0 + ')');
      }
   }
}
