import java.nio.ByteBuffer;

final class lc extends ee {
   private ByteBuffer o;

   final byte[] a(int var1) {
      try {
         if(var1 < 91) {
            return (byte[])null;
         } else {
            byte[] var2 = new byte[this.o.capacity()];
            this.o.position(0);
            this.o.get(var2);
            return var2;
         }
      } catch (RuntimeException var3) {
         throw var3;
      }
   }

   final void a(byte[] var1, int var2) {
      try {
         this.o = ByteBuffer.allocateDirect(var1.length);
         this.o.position(var2);
         this.o.put(var1);
      } catch (RuntimeException var4) {
         throw var4;
      }
   }
}
