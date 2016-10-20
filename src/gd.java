import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class gd {
   private long a;
   private long b;
   private RandomAccessFile randomAccessFile;
   private File d;

   public final File a(byte var1) {
      try {
         int var2 = -60 % ((var1 - 52) / 42);
         return this.d;
      } catch (RuntimeException var3) {
         throw var3;
      }
   }

   public final void a(byte var1, long var2) throws IOException {
      try {
         this.randomAccessFile.seek(var2);
         this.b = var2;
         int var4 = -122 % ((66 - var1) / 50);
      } catch (RuntimeException var5) {
         throw var5;
      }
   }

   public final void b(byte unused) throws IOException {
      if(this.randomAccessFile != null) {
		 this.randomAccessFile.close();
		 this.randomAccessFile = null;
	  }
   }

   public final long a(int var1) throws IOException {
      try {
         if(var1 != 0) {
            this.a((byte)-69);
         }

         return this.randomAccessFile.length();
      } catch (RuntimeException var3) {
         throw var3;
      }
   }

   public final void a(int var1, int var2, byte[] var3, int var4) throws IOException {
      try {
         if(~this.a > ~((long)var1 - -this.b)) {
            this.randomAccessFile.seek(1L + this.a);
            this.randomAccessFile.write(1);
            throw new EOFException();
         } else {
            this.randomAccessFile.write(var3, var2, var1);
            this.b += (long)var1;
            if(var4 != 1) {
               this.a((byte)-38);
            }
         }
      } catch (RuntimeException var6) {
         throw var6;
      }
   }

   protected final void finalize() throws Throwable {
      try {
         if(this.randomAccessFile != null) {
            System.out.println("Warning! fileondisk " + this.d + " not closed correctly using close(). Auto-closing instead. ");
            this.b((byte)102);
         }
      } catch (RuntimeException var2) {
         throw var2;
      }
   }

   public final int a(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if(var4 != 0) {
            return -11;
         } else {
            int var5 = this.randomAccessFile.read(var1, var2, var3);
            if(~var5 < -1) {
               this.b += (long)var5;
            }

            return var5;
         }
      } catch (RuntimeException var6) {
         throw var6;
      }
   }

   @SuppressWarnings("ResultOfMethodCallIgnored")
   gd(File file, String mode, long l) throws IOException {
      if(~l == 0L) {
		 l = Long.MAX_VALUE;
	  }
   
      if(~l >= ~file.length()) {
		 file.delete();
	  }
   
      this.randomAccessFile = new RandomAccessFile(file, mode);
      this.a = l;
      this.d = file;
      this.b = 0L;
      int read = this.randomAccessFile.read();
      if(read != -1 && !mode.equals("r")) {
		 this.randomAccessFile.seek(0L);
		 this.randomAccessFile.write(read);
	  }
   
      this.randomAccessFile.seek(0L);
   }
}
