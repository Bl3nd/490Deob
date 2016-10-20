class rh extends bg {
   static md m = new md(4096);
   static ob n = rf.a(40, "Unerwartete Antwort vom Anmelde)2Server)3");
   static int o = 0;
   static ca cacheFile_1;
   static long aLong_q;
   static int[] r;
   static int regionY;
   static int t = -1;
   static kc[] u;

   static final long a(int var0, int var1, int var2) {
      pd var3 = nb.oc[var0][var1][var2];
      return var3 != null && var3.u != null?var3.u.o:0L;
   }

   public static void a(int var0) {
      try {
         u = null;
         m = null;
         r = null;
         cacheFile_1 = null;
         if(var0 != -25070) {
            n = null;
         }

         n = null;
      } catch (RuntimeException var2) {
         throw bc.a(var2, "rh.A(" + var0 + ')');
      }
   }
}
