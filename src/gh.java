final class gh extends aa {
	
	static int O;
	int P;
	static ob Q = rf.a(40, "Untersuchen");
	static int R = 0;
	static ob S;
	private static ob T;
	static ob U;
	static int V;
	private static ob W = rf.a(40, "This world is full)3");
	static ob cross = rf.a(40, "cross");
	int Y;
	private ce Z;
	static int[] ab = new int[] {8, 11, 4, 6, 9, 7, 10};
	int bb;
	boolean cb = false;
	int db;
	private int eb = -32768;
	static int fb;
	static ob hitmarks;
	static int hb = 0;
	static int ib;
	private int jb = 0;
	static ob kb = rf.a(40, "Der Anmelde)2Server ist offline)3");
	static ob ob_lb = rf.a(40, "cookieprefix");
	static int[] mb = new int[25];
	int nb;
	private int ob;
	static long pb;
	static int qb;
	static ob fpsCommand;
	static int sb;
	static ob tb;
	private int ub = 0;
	
	private fe b(byte var1) {
		try {
			++ib;
			if (var1 > -52) {
				this.a(-19, true);
			}
			
			kh var2 = lb.d(this.ob, -89);
			fe var3;
			if (!this.cb) {
				var3 = var2.b(13557, this.jb);
				if (client.anInt_wb == 0) {
					return var3 == null ? null : var3;
				}
			}
			
			var3 = var2.b(13557, -1);
			return var3 == null ? null : var3;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "gh.D(" + var1 + ')');
		}
	}
	
	static int b(byte var0, int var1) {
		try {
			if (var0 != -104) {
				S = null;
			}
			
			++V;
			return var1 & 127;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "gh.A(" + var0 + ',' + var1 + ')');
		}
	}
	
	final void a(int var1, boolean var2) {
		int var4 = client.anInt_wb;
		
		try {
			if (var2) {
				this.b((byte) 60);
			}
			
			++sb;
			if (!this.cb) {
				this.ub += var1;
				if (var4 != 0 || this.ub > this.Z.W[this.jb]) {
					do {
						this.ub -= this.Z.W[this.jb];
						++this.jb;
						if (this.jb >= this.Z.Z.length) {
							this.cb = true;
							return;
						}
					} while (this.ub > this.Z.W[this.jb]);
					
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "gh.G(" + var1 + ',' + var2 + ')');
		}
	}
	
	final int b() {
		try {
			++qb;
			return this.eb;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "gh.C(" + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		ih var8 = new ih();
		var8.j = var2 / 128;
		var8.f = var3 / 128;
		var8.o = var4 / 128;
		var8.p = var5 / 128;
		var8.q = var1;
		var8.c = var2;
		var8.k = var3;
		var8.b = var4;
		var8.w = var5;
		var8.a = var6;
		var8.F = var7;
		qa.h[var0][qa.d[var0]++] = var8;
	}
	
	final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		try {
			fe var11 = this.b((byte) -55);
			++O;
			if (var11 != null) {
				var11.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
				this.eb = var11.b();
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "gh.B(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
		}
	}
	
	public static void g(int var0) {
		try {
			cross = null;
			hitmarks = null;
			U = null;
			ob_lb = null;
			S = null;
			fpsCommand = null;
			Q = null;
			kb = null;
			if (var0 <= 117) {
				g(97);
			}
			
			ab = null;
			W = null;
			T = null;
			mb = null;
			tb = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "gh.F(" + var0 + ')');
		}
	}
	
	gh(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		try {
			this.nb = var6 + var7;
			this.Y = var2;
			this.P = var5;
			this.ob = var1;
			this.bb = var4;
			this.db = var3;
			int var8 = lb.d(this.ob, -49).E;
			if (~var8 != 0) {
				this.cb = false;
				this.Z = le.c(15619, var8);
			} else {
				this.cb = true;
			}
		} catch (RuntimeException var9) {
			throw bc.a(var9, "gh.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}
	
	static {
		U = W;
		T = rf.a(40, "Invalid username or password)3");
		fpsCommand = rf.a(40, "::fps ");
		S = T;
		tb = rf.a(40, "Bitte geben Sie Ihr Passwort ein)3");
		hitmarks = rf.a(40, "hitmarks");
	}
}
