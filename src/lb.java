final class lb extends af {
	
	private static ob R = rf.a(40, "Jul");
	static int S;
	static ob T = rf.a(40, "");
	private static ob U = rf.a(40, "Aug");
	private int V = 12288;
	static ob[] W;
	private static ob X = rf.a(40, "Nov");
	private static ob Y;
	static int Z;
	private static ob ab;
	static int[] bb;
	private static ob cb = rf.a(40, "Jun");
	static ob db;
	private int eb = 0;
	private static ob fb;
	static ob gb;
	static int hb;
	static int ib = 0;
	private int jb = 8192;
	private int kb = 2048;
	private static ob lb;
	static int mb;
	static boolean nb;
	static int ob;
	private static ob pb = rf.a(40, "Sep");
	private int qb = 0;
	private static ob rb = rf.a(40, "Dec");
	static int sb;
	private static ob tb;
	static int ub;
	static int vb;
	private static ob wb;
	static int xb;
	static int yb;
	private int zb = 2048;
	private int Ab = 4096;
	
	static void c(int i, int unused) {
		try {
			++vb;
			if (i != -1) {
				if (gf.a(true, i)) {
					ra[] ras = wg.cb[i];
					int i1 = 0;
					while (~i1 > ~ras.length) {
						ra class_ra = ras[i1];
						if (class_ra.db != null) {
							wc class_wc = new wc();
							class_wc.P = class_ra.db;
							class_wc.E = class_ra;
							ve.a(class_wc, 2000000, 26186);
						}
						++i1;
					}
				}
			}
		} catch (RuntimeException var8) {
			throw bc.a(var8, "lb.A(" + i + ',' + unused + ')');
		}
	}
	
	final int[] a(byte var1, int var2) {
		int var11 = client.anInt_wb;
		
		try {
			++mb;
			int[] var3 = super.nd_v.a(var2, 12);
			if (var1 < 13) {
				this.kb = -126;
			}
			
			if (super.nd_v.n) {
				int var4 = rh.r[var2] - 2048;
				int var5 = 0;
				if (var11 != 0 || ~var5 > ~lh.eb) {
					do {
						int var6 = -2048 + bd.J[var5];
						int var8 = var4 - -this.eb;
						var8 = ~var8 <= 2047 ? var8 : var8 + 4096;
						var8 = ~var8 >= -2049 ? var8 : var8 + -4096;
						int var10 = this.kb + var4;
						int var9 = var6 - -this.qb;
						var9 = ~var9 <= 2047 ? var9 : var9 - -4096;
						int var7 = var6 + this.zb;
						var10 = ~var10 <= 2047 ? var10 : var10 + 4096;
						var9 = ~var9 < -2049 ? -4096 + var9 : var9;
						var10 = var10 <= 2048 ? var10 : -4096 + var10;
						var7 = ~var7 > 2047 ? var7 - -4096 : var7;
						var7 = ~var7 >= -2049 ? var7 : -4096 + var7;
						var3[var5] = !this.a(var8, var7, true) ? (this.a(var9, (byte) -119, var10) ? 4096 : 0) : 4096;
						++var5;
					} while (~var5 > ~lh.eb);
				}
			}
			
			return var3;
		} catch (RuntimeException var12) {
			throw bc.a(var12, "lb.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	public static void b(boolean var0) {
		try {
			wb = null;
			rb = null;
			pb = null;
			bb = null;
			Y = null;
			cb = null;
			ab = null;
			fb = null;
			if (!var0) {
				Z = 20;
			}
			
			U = null;
			T = null;
			tb = null;
			R = null;
			X = null;
			lb = null;
			db = null;
			gb = null;
			W = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "lb.H(" + var0 + ')');
		}
	}
	
	final void a(int var1, int var2, og var3) {
		try {
			int var4 = -51 % ((var2 - 66) / 57);
			++ob;
			if (~var1 != -1) {
				if (~var1 == -2) {
					this.eb = var3.readShort(84);
					return;
				}
				
				if (~var1 == -3) {
					this.qb = var3.readShort(75);
					return;
				}
				
				if (var1 == 3) {
					this.kb = var3.readShort(97);
					return;
				}
				
				if (var1 == 4) {
					this.V = var3.readShort(97);
					return;
				}
				
				if (~var1 == -6) {
					this.Ab = var3.readShort(60);
					return;
				}
				
				if (~var1 != -7) {
					return;
				}
				
				if (client.anInt_wb == 0) {
					this.jb = var3.readShort(61);
					return;
				}
			}
			
			this.zb = var3.readShort(44);
		} catch (RuntimeException var6) {
			throw bc.a(var6, "lb.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	private final boolean a(int var1, int var2, boolean var3) {
		try {
			++hb;
			int var4 = this.V * (-var2 + var1) >> 1841343948;
			int var5 = nf.Y[255 & 255 * var4 >> -667018356];
			var5 = (var5 << -1773992788) / this.V;
			var5 = (var5 << 734736908) / this.jb;
			if (!var3) {
				return false;
			} else {
				var5 = this.Ab * var5 >> -225269460;
				return var5 > var2 - -var1 && -var5 < var1 + var2;
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "lb.D(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	final void f(int var1) {
		try {
			++yb;
			fc.f(var1);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "lb.L(" + var1 + ')');
		}
	}
	
	public lb() {
		super(0, true);
	}
	
	private final boolean a(int var1, byte var2, int var3) {
		try {
			if (var2 >= -118) {
				return false;
			} else {
				++sb;
				int var4 = this.V * (var3 - -var1) >> 183280940;
				int var5 = nf.Y[(1048289 & var4 * 255) >> 1517285228];
				var5 = (var5 << -1446799124) / this.V;
				var5 = (var5 << 664439020) / this.jb;
				var5 = this.Ab * var5 >> 871131372;
				return -var1 + var3 < var5 && -var1 + var3 > -var5;
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "lb.E(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	static final kh d(int var0, int var1) {
		try {
			kh var2 = (kh) qc.vc_v.a((long) var0, (byte) 88);
			++xb;
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = jc.cacheFile21.a((byte) 46, ee.a(var0, (int) 22511), qh.b(var0, -102));
				var2 = new kh();
				if (var1 >= -39) {
					return null;
				} else {
					var2.T = var0;
					if (var3 != null) {
						var2.a(13737, new og(var3));
					}
					
					qc.vc_v.a(var2, (byte) -77, (long) var0);
					return var2;
				}
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "lb.C(" + var0 + ',' + var1 + ')');
		}
	}
	
	static {
		db = T;
		S = 20;
		fb = rf.a(40, "May");
		lb = rf.a(40, "Apr");
		Y = rf.a(40, "Mar");
		tb = rf.a(40, "Feb");
		ab = rf.a(40, "Oct");
		gb = rf.a(40, "Benutzen Sie die (WPasswort -=ndern(W Option");
		wb = rf.a(40, "Jan");
		W = new ob[] {wb, tb, Y, lb, fb, cb, R, U, pb, ab, X, rb};
	}
}
