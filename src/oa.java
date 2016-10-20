final class oa extends ti {
   int p;
   int q;
   boolean r;
   int s;
   byte[] t;

   final oa a(tg var1) {
      this.t = var1.a(this.t, 32767);
      this.q = var1.a(6, this.q);
      if(this.p == this.s) {
         this.p = this.s = var1.b(this.p, 6);
      } else {
         this.p = var1.b(this.p, 6);
         this.s = var1.b(this.s, 6);
         if(this.p == this.s) {
            --this.p;
         }
      }

      return this;
   }

   oa(int var1, byte[] var2, int var3, int var4) {
      this.q = var1;
      this.t = var2;
      this.p = var3;
      this.s = var4;
   }

   oa(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.q = var1;
      this.t = var2;
      this.p = var3;
      this.s = var4;
      this.r = var5;
   }
}
