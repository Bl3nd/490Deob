abstract class sg extends vd {
   ti o;
   volatile boolean p = true;
   int q;
   sg r;

   abstract void d(int var1);

   int a() {
      return 255;
   }

   abstract int b();

   abstract void a(int[] var1, int var2, int var3);

   abstract sg c();

   abstract sg d();

   final void b(int[] var1, int var2, int var3) {
      if(this.p) {
         this.a(var1, var2, var3);
      } else {
         this.d(var3);
      }
   }
}
