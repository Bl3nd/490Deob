import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

final class wd {
	
	static ca cacheFile_15;
	private fd b;
	private long c;
	private byte[] d;
	static int e = 3;
	private byte[] f = new byte[4];
	static int g = 0;
	static int h;
	private int i;
	static int j;
	static Random k = new Random();
	private int l;
	static int m;
	private DataInputStream n;
	static ob o = rf.a(40, "; Expires=");
	static pe cacheFile2;
	static int q = 0;
	static ob r = rf.a(40, "Standort");
	private int s;
	static int t = 2301979;
	
	static void a(boolean var0, byte var1) {
		int var9 = client.anInt_wb;
		
		try {
			int var2 = 0;
			int var3 = 91 / ((-13 - var1) / 52);
			if (var9 == 0 && tf.n <= var2) {
				++h;
			} else {
				do {
					long var5 = (long) ud.Xb[var2] << 32 | 536870912L;
					nb var4 = ai.M[ud.Xb[var2]];
					if (var4 != null && var4.b((byte) 120) && !var0 != var4.pc.U && var4.pc.f(-5713)) {
						int var7 = var4.coordX >> 7;
						int var8 = var4.coordY >> 7;
						if (var7 >= 0 && ~var7 > -105 && var8 >= 0 && ~var8 > -105) {
							label84:
							{
								if (var4.Gb == 1 && ~(127 & var4.coordX) == -65 && (127 & var4.coordY) == 64) {
									if (ed.d == wa.s[var7][var8]) {
										break label84;
									}
									
									wa.s[var7][var8] = ed.d;
								}
								
								if (!var4.pc.Q) {
									var5 |= Long.MIN_VALUE;
								}
								
								var4.zb = ug.a(gf.G, 64 * var4.Gb + -64 + var4.coordX, (byte) 40, var4.coordY + -64 + 64 * var4.Gb);
								ki.a(gf.G, var4.coordX, var4.coordY, var4.zb, -64 + 64 * var4.Gb + 60, var4, var4.gb, var5, var4.Lb);
							}
						}
					}
					
					++var2;
				} while (tf.n > var2);
				
				++h;
			}
		} catch (RuntimeException var10) {
			throw bc.a(var10, "wd.C(" + var0 + ',' + var1 + ')');
		}
	}
	
	final byte[] a(boolean var1) throws IOException {
		try {
			++m;
			if (this.c < a.a((byte) -53)) {
				throw new IOException("fdt");
			} else {
				if (!var1) {
					e = -125;
				}
				
				if (this.s == 0) {
					if (~this.b.d == -3) {
						throw new IOException("fds");
					}
					
					if (this.b.d == 1) {
						this.s = 1;
						this.n = (DataInputStream) this.b.e;
					}
				}
				
				int var2;
				if (~this.s == -2) {
					var2 = this.n.available();
					if (var2 > 0) {
						if (this.l + var2 > 4) {
							var2 = 4 + -this.l;
						}
						
						this.l += this.n.read(this.f, this.l, var2);
						if (~this.l == -5) {
							int var3 = (new og(this.f)).readInt(1029109968);
							this.s = 2;
							this.d = new byte[var3];
						}
					}
				}
				
				if (~this.s == -3) {
					var2 = this.n.available();
					if (var2 > 0) {
						if (~(var2 - -this.i) < ~this.d.length) {
							var2 = -this.i + this.d.length;
						}
						
						this.i += this.n.read(this.d, this.i, var2);
						if (~this.i == ~this.d.length) {
							return this.d;
						}
					}
				}
				
				return null;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "wd.B(" + var1 + ')');
		}
	}
	
	public static void b(boolean var0) {
		try {
			cacheFile2 = null;
			k = null;
			cacheFile_15 = null;
			if (!var0) {
				e = 30;
			}
			
			r = null;
			o = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "wd.A(" + var0 + ')');
		}
	}
	
	wd(t var1, URL var2) {
		try {
			this.b = var1.a(-84, var2);
			this.s = 0;
			this.c = 30000L + a.a((byte) -47);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "wd.<init>(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
}
