final class j {
   private int[] a = new int[2];
   int b;
   private int[] c = new int[2];
   private int d = 2;
   int e;
   int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;

   final void a() {
      this.k = 0;
      this.h = 0;
      this.j = 0;
      this.g = 0;
      this.i = 0;
   }

   final void a(og var1) {
      this.e = var1.readUnsignedByte(255);
      this.b = var1.readInt(1029109968);
      this.f = var1.readInt(1029109968);
      this.b(var1);
   }

   final int a(int var1) {
      if(this.i >= this.k) {
         this.g = this.a[this.h++] << 15;
         if(this.h >= this.d) {
            this.h = this.d - 1;
         }

         this.k = (int)((double)this.c[this.h] / 65536.0D * (double)var1);
         if(this.k > this.i) {
            this.j = ((this.a[this.h] << 15) - this.g) / (this.k - this.i);
         }
      }

      this.g += this.j;
      ++this.i;
      return this.g - this.j >> 15;
   }

   final void b(og var1) {
      this.d = var1.readUnsignedByte(255);
      this.c = new int[this.d];
      this.a = new int[this.d];

      for(int var2 = 0; var2 < this.d; ++var2) {
         this.c[var2] = var1.readShort(113);
         this.a[var2] = var1.readShort(31);
      }

   }

   public j() {
      this.c[0] = 0;
      this.c[1] = '\uffff';
      this.a[0] = 0;
      this.a[1] = '\uffff';
   }
}
