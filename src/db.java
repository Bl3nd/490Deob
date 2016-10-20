final class db {
	
	private static short[] a = new short[500];
	private static short[] b = new short[500];
	ii c = null;
	short[] d;
	short[] e;
	private static short[] f = new short[500];
	short[] g;
	short[] h;
	boolean i = false;
	short[] j;
	int k = -1;
	private static short[] l = new short[500];
	private static short[] m = new short[500];
	
	public static void a() {
		a = null;
		b = null;
		m = null;
		l = null;
		f = null;
	}
	
	db(byte[] var1, ii var2) {
		this.c = var2;
		og var3 = new og(var1);
		og var4 = new og(var1);
		var3.pointer = 2;
		int var5 = var3.readUnsignedByte(255);
		int var6 = 0;
		int var7 = -1;
		int var8 = -1;
		var4.pointer = var3.pointer + var5;
		
		int var10;
		for (int var9 = 0; var9 < var5; ++var9) {
			if (this.c.F[var9] == 0) {
				var7 = var9;
			}
			
			var10 = var3.readUnsignedByte(255);
			if (var10 > 0) {
				if (this.c.F[var9] == 0) {
					var8 = var9;
				}
				
				a[var6] = (short) var9;
				short var11 = 0;
				if (this.c.F[var9] == 3) {
					var11 = 128;
				}
				
				if ((var10 & 1) != 0) {
					b[var6] = (short) var4.e((byte) 77);
				} else {
					b[var6] = var11;
				}
				
				if ((var10 & 2) != 0) {
					m[var6] = (short) var4.e((byte) 76);
				} else {
					m[var6] = var11;
				}
				
				if ((var10 & 4) != 0) {
					l[var6] = (short) var4.e((byte) 123);
				} else {
					l[var6] = var11;
				}
				
				if (this.c.F[var9] == 2) {
					b[var6] = (short) (((b[var6] & 255) << 3) + (b[var6] >> 8 & 7));
					m[var6] = (short) (((m[var6] & 255) << 3) + (m[var6] >> 8 & 7));
					l[var6] = (short) (((l[var6] & 255) << 3) + (l[var6] >> 8 & 7));
				}
				
				f[var6] = -1;
				if (this.c.F[var9] >= 1 && this.c.F[var9] <= 3 && var7 > var8) {
					f[var6] = (short) var7;
					var8 = var7;
				}
				
				++var6;
				if (this.c.F[var9] == 5) {
					this.i = true;
				}
			}
		}
		
		if (var4.pointer != var1.length) {
			throw new RuntimeException();
		} else {
			this.k = var6;
			this.j = new short[var6];
			this.h = new short[var6];
			this.d = new short[var6];
			this.g = new short[var6];
			this.e = new short[var6];
			
			for (var10 = 0; var10 < var6; ++var10) {
				this.j[var10] = a[var10];
				this.h[var10] = b[var10];
				this.d[var10] = m[var10];
				this.g[var10] = l[var10];
				this.e[var10] = f[var10];
			}
			
		}
	}
}
