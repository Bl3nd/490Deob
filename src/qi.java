class qi extends bg {
	
	static int m;
	static pe cacheFile3;
	static tg o;
	private static ob p = rf.a(40, "shake:");
	static int[] q = new int[5];
	static ob r;
	static ca[] s;
	static cb[] t;
	static int u;
	static ob v;
	static ob w;
	
	static void b(byte unused) {
		try {
			++m;
			int[] var1 = new int[gf.B];
			if (unused <= 103) {
				b((byte) -46);
			}
			
			int var2 = 0;
			int id = 0;
			if (gf.B > id) {
				do {
					ei class_ei = jg.a((byte) -61, id);
					if (class_ei != null) {
						if (class_ei.K < 0 && ~class_ei.zb > -1) {
							++id;
						} else {
							var1[var2++] = id++;
						}
					}
				} while (gf.B > id);
			}
			
			kh.Z = new int[var2];
			int var7 = 0;
			if (var7 < var2) {
				do {
					kh.Z[var7] = var1[var7];
					++var7;
				} while (var7 < var2);
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "qi.D(" + unused + ')');
		}
	}
	
	public static void c(byte var0) {
		try {
			r = null;
			t = null;
			p = null;
			q = null;
			if (var0 == -48) {
				s = null;
				w = null;
				cacheFile3 = null;
				v = null;
				o = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "qi.C(" + var0 + ')');
		}
	}
	
	static {
		r = p;
		s = new ca[256];
		v = rf.a(40, "(Z");
		w = p;
		t = new cb[4];
	}
}
