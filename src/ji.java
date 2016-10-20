final class ji extends dc {
   static int n;
   static int o;
   static vc p;
   private final int q;
   static int r;
   private final int s;
   private static ob t = rf.a(40, "Unexpected loginserver response)3");
   private final int u;
   private final int v;
   private final int w;
   static int x;
   private final int y;
   private final int z;
   private final int A;
   static ob B;
   static ob loadingFonts2;
   static vc D;
   private static ob loadingFonts;
   static ob F;
   static ob G;
   static ob H;
   static ob I;
   static ob clientDropCommand;
   static int[] K;

   final void a(int var1, byte var2, int var3) {
      try {
         if(var2 == 114) {
            ++r;
         }
      } catch (RuntimeException var5) {
         throw bc.a(var5, "ji.D(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final kc[] a(ob var0, pe var1, int var2, ob var3) {
      try {
         int var4 = var1.a((byte)-115, var3);
         int var5 = var1.a(var4, true, var0);
         ++o;
         if(var2 != -72515348) {
            loadingFonts2 = null;
         }

         return ie.a(var4, var2 + 72515384, var5, var1);
      } catch (RuntimeException var6) {
         throw bc.a(var6, "ji.H(" + (var0 != null?"{...}":"null") + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

   ji(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      super(-1, var9, var10);

      try {
         this.w = var8;
         this.u = var4;
         this.z = var1;
         this.q = var2;
         this.s = var3;
         this.y = var7;
         this.v = var5;
         this.A = var6;
      } catch (RuntimeException var12) {
         throw bc.a(var12, "ji.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ')');
      }
   }

   public static void b(byte var0) {
      try {
         p = null;
         B = null;
         F = null;
         K = null;
         if(var0 >= 101) {
            H = null;
            clientDropCommand = null;
            loadingFonts2 = null;
            D = null;
            I = null;
            G = null;
            t = null;
            loadingFonts = null;
         }
      } catch (RuntimeException var2) {
         throw bc.a(var2, "ji.J(" + var0 + ')');
      }
   }

   final void a(int var1, int var2, boolean var3) {
      try {
         ++n;
         if(!var3) {
            this.a((int)17, (byte)48, 49);
         }
      } catch (RuntimeException var5) {
         throw bc.a(var5, "ji.A(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   final void a(byte var1, int var2, int var3) {
      try {
         ++x;
         int var4 = var3 * this.z >> 817206796;
         int var5 = this.q * var2 >> -72515348;
         int var6 = this.s * var3 >> -903564404;
         int var7 = this.u * var2 >> -1932261876;
         int var10 = var3 * this.y >> -1991981908;
         int var8 = this.v * var3 >> -204405460;
         int var11 = var2 * this.w >> -1563386580;
         if(var1 != 94) {
            loadingFonts = null;
         }

         int var9 = var2 * this.A >> 170560524;
         ng.a((byte)42, var9, var10, var7, var6, var4, super.e, var5, var11, var8);
      } catch (RuntimeException var12) {
         throw bc.a(var12, "ji.B(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void a(int var0, int var1, int var2) {
      pd var3 = nb.oc[var0][var1][var2];
      if(var3 != null) {
         var3.u = null;
      }
   }

   static {
      B = t;
      p = new vc(64);
      loadingFonts = rf.a(40, "Loading fonts )2 ");
      F = rf.a(40, "da dieser Computer gegen unsere ");
      loadingFonts2 = loadingFonts;
      G = rf.a(40, "(Y");
      D = new vc(16);
      H = rf.a(40, "Freie Welt");
      clientDropCommand = rf.a(40, "::clientdrop");
      K = new int[2000];
      I = rf.a(40, "Ihr Spielkonto wird bereits benutzt)3");
   }
}
