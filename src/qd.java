final class qd extends rg {
	
	static int E;
	static byte[][] F = new byte[250][];
	static int G;
	private static ob H = rf.a(40, "RuneScape has been updated(Q");
	static ob I;
	static long[] J;
	static int K;
	static int L;
	byte[] M;
	
	static void b(int unused, int index) {
		try {
			++K;
			if (gf.a(true, index)) {
				ra[] ras = wg.cb[index];
				int i = 0;
				ra class_ra;
				for (; ~i > ~ras.length; ++i) {
					class_ra = ras[i];
					if (class_ra != null) {
						class_ra.Fb = 0;
						class_ra.Oc = 0;
					}
				}
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "qd.B(" + unused + ',' + index + ')');
		}
	}
	
	static rd a(boolean unused, int id) {
		try {
			++G;
			rd rd = (rd) sh.f.a((long) id, (byte) -98);
			if (rd != null) {
				return rd;
			} else {
				byte[] buffer = wd.cacheFile2.a((byte) -82, id, 16);
				rd = new rd();
				if (buffer != null) {
					rd.a(true, new og(buffer));
				}
				
				sh.f.a(rd, (byte) -70, (long) id);
				return rd;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "qd.A(" + unused + ',' + id + ')');
		}
	}
	
	public static void f(int var0) {
		try {
			J = null;
			I = null;
			int var1 = -30 % ((-12 - var0) / 44);
			F = null;
			H = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "qd.C(" + var0 + ')');
		}
	}
	
	qd(byte[] var1) {
		try {
			this.M = var1;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "qd.<init>(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	static {
		I = H;
		J = new long[32];
	}
}
