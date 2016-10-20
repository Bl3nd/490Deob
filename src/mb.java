final class mb {
   private static byte[] a = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)0, (byte)1, (byte)2, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
   private og b = new og((byte[])null);
   private int c;
   private int[] d;
   private int[] e;
   int[] f;
   int g;
   private int[] h;
   private long i;

   private final int a(int var1, int var2) {
      int var4;
      if(var2 == 255) {
         int var7 = this.b.readUnsignedByte(255);
         var4 = this.b.a(false);
         if(var7 == 47) {
            this.b.pointer += var4;
            return 1;
         } else if(var7 == 81) {
            int var5 = this.b.readUnsignedMedInt(-123);
            var4 -= 3;
            int var6 = this.f[var1];
            this.i += (long)var6 * (long)(this.c - var5);
            this.c = var5;
            this.b.pointer += var4;
            return 2;
         } else {
            this.b.pointer += var4;
            return 3;
         }
      } else {
         byte var3 = a[var2 - 128];
         var4 = var2;
         if(var3 >= 1) {
            var4 = var2 | this.b.readUnsignedByte(255) << 8;
         }

         if(var3 >= 2) {
            var4 |= this.b.readUnsignedByte(255) << 16;
         }

         return var4;
      }
   }

   final void a(int var1) {
      this.b.pointer = this.e[var1];
   }

   final void a() {
      this.b.buffer = null;
      this.d = null;
      this.e = null;
      this.f = null;
      this.h = null;
   }

   public static void b() {
      a = null;
   }

   final boolean c() {
      int var1 = this.e.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if(this.e[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   final void a(long var1) {
      this.i = var1;
      int var3 = this.e.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.f[var4] = 0;
         this.h[var4] = 0;
         this.b.pointer = this.d[var4];
         this.f(var4);
         this.e[var4] = this.b.pointer;
      }

   }

   final void a(byte[] var1) {
      this.b.buffer = var1;
      this.b.pointer = 10;
      int var2 = this.b.readShort(112);
      this.g = this.b.readShort(37);
      this.c = 500000;
      this.d = new int[var2];

      int var4;
      int var5;
      for(int var3 = 0; var3 < var2; this.b.pointer += var5) {
         var4 = this.b.readInt(1029109968);
         var5 = this.b.readInt(1029109968);
         if(var4 == 1297379947) {
            this.d[var3] = this.b.pointer;
            ++var3;
         }
      }

      this.i = 0L;
      this.e = new int[var2];

      for(var4 = 0; var4 < var2; ++var4) {
         this.e[var4] = this.d[var4];
      }

      this.f = new int[var2];
      this.h = new int[var2];
   }

   final int b(int var1) {
      int var2 = this.c(var1);
      return var2;
   }

   final int d() {
      int var1 = this.e.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if(this.e[var4] >= 0 && this.f[var4] < var3) {
            var2 = var4;
            var3 = this.f[var4];
         }
      }

      return var2;
   }

   private final int c(int var1) {
      byte var2 = this.b.buffer[this.b.pointer];
      int var5;
      if(var2 < 0) {
         var5 = var2 & 255;
         this.h[var1] = var5;
         ++this.b.pointer;
      } else {
         var5 = this.h[var1];
      }

      if(var5 != 240 && var5 != 247) {
         return this.a(var1, var5);
      } else {
         int var3 = this.b.a(false);
         if(var5 == 247 && var3 > 0) {
            int var4 = this.b.buffer[this.b.pointer] & 255;
            if(var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               ++this.b.pointer;
               this.h[var1] = var4;
               return this.a(var1, var4);
            }
         }

         this.b.pointer += var3;
         return 0;
      }
   }

   final int e() {
      return this.e.length;
   }

   final void d(int var1) {
      this.e[var1] = this.b.pointer;
   }

   final void f() {
      this.b.pointer = -1;
   }

   final long e(int var1) {
      return this.i + (long)var1 * (long)this.c;
   }

   final boolean g() {
      return this.b.buffer != null;
   }

   final void f(int var1) {
      int var2 = this.b.a(false);
      this.f[var1] += var2;
   }

   public mb() {
   }

   mb(byte[] var1) {
      this.a(var1);
   }
}
