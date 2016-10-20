final class rc {
	
	static int a;
	aa b;
	static int c = 0;
	static int d = -1;
	static byte[][] bytes_e;
	static int[] f;
	int g;
	static ob h;
	int i;
	long j = 0L;
	aa k;
	static ob ob_l = rf.a(40, "Bitte entfernen Sie ");
	static oe oe_m;
	int n;
	int o;
	int p;
	static ob loadedInputHandler2;
	private static ob ob_r = rf.a(40, "Your profile will be transferred in:");
	static ob s = rf.a(40, "Fehler bei der Verbindung zum Server)3");
	static int[] t = new int[32];
	private static ob loadedInputHandler;
	static ob v;
	static int w;
	
	static boolean a(int i, int i1, int i2, int unused) {
		int i3 = i2 * vf.p + i * pb.anInt_d >> 16;
		int i4 = i2 * pb.anInt_d - i * vf.p >> 16;
		int i5 = i1 * ke.kb + i4 * m.r >> 16;
		int i6 = i1 * m.r - i4 * ke.kb >> 16;
		if (i5 >= 50 && i5 <= 3500) {
			int i7 = va.j + (i3 << 9) / i5;
			int i8 = ad.T + (i6 << 9) / i5;
			return i7 >= ci.y && i7 <= r.db && i8 >= ai.anInt_cb && i8 <= lg.x;
		} else {
			return false;
		}
	}
	
	static void a(boolean var0, int var1, int var2, int var3, int var4) {
		int var6 = client.anInt_wb;
		
		try {
			++a;
			int var5 = 0;
			if (var6 == 0 && ~e.anInt_d >= ~var5) {
				if (var0) {
					ob_l = null;
				}
			} else {
				do {
					if (df.v[var5] + l.o[var5] > var3 && ~(var3 + var2) < ~df.v[var5] && ~var4 > ~(be.f[var5] + ki.r[var5]) && ~(var4 + var1) < ~be.f[var5]) {
						wf.f[var5] = true;
					}
					
					++var5;
				} while (~e.anInt_d < ~var5);
				
				if (var0) {
					ob_l = null;
				}
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "rc.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	public static void a(int var0) {
		try {
			t = null;
			loadedInputHandler2 = null;
			if (var0 == 24147) {
				f = null;
				s = null;
				loadedInputHandler = null;
				ob_r = null;
				bytes_e = null;
				v = null;
				h = null;
				oe_m = null;
				ob_l = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "rc.B(" + var0 + ')');
		}
	}
	
	static {
		h = ob_r;
		loadedInputHandler = rf.a(40, "Loaded input handler");
		loadedInputHandler2 = loadedInputHandler;
		v = rf.a(40, "<)4col>");
	}
}
