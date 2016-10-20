final class nc {
	
	static ob a = rf.a(40, "Sichtbare Karte vorbereitet)3");
	static int b = 0;
	static int c;
	static int d;
	static int anInt_e;
	static int f;
	static long[] longs_g = new long[1000];
	static byte[][][] h;
	static int i = -1;
	
	static hg a(int var0) {
		try {
			++d;
			
			try {
				if (var0 < 91) {
					a(71, 73);
				}
				
				return (hg) Class.forName("te").newInstance();
			} catch (Throwable var2) {
				return new ga();
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "nc.B(" + var0 + ')');
		}
	}
	
	public static void b(int var0) {
		try {
			h = null;
			a = null;
			if (var0 > -84) {
				i = -91;
			}
			
			longs_g = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "nc.C(" + var0 + ')');
		}
	}
	
	static void a(int var0, boolean var1, int var2) {
		int var5 = client.anInt_wb;
		
		try {
			++anInt_e;
			if (si.S >= 2 || ch.cb != 0 || g.O) {
				if (var1) {
					i = -21;
				}
				
				ob var3;
				label51:
				{
					if (ch.cb == 1 && ~si.S > -3) {
						var3 = wc.a(new ob[] {fh.h, tg.k, s.R, ld.ob_r}, -3);
						if (var5 == 0) {
							break label51;
						}
					}
					
					if (!g.O || si.S >= 2) {
						var3 = ee.a(-1 + si.S, (byte) 8);
						if (var5 == 0) {
							break label51;
						}
					}
					
					var3 = wc.a(new ob[] {ac.s, tg.k, sf.g, ld.ob_r}, -3);
				}
				
				if (si.S > 2) {
					var3 = wc.a(new ob[] {var3, e.k, hh.a((byte) 93, si.S + -2), di.b}, -3);
				}
				
				int var4 = ia.Y.a(var3, var2 + 4, var0 + 15, 16777215, 0, wd.k, bc.V);
				od.a(var0, var2 + 4, var4 + ia.Y.b(var3), 15, 2);
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "nc.A(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}
	
	static synchronized byte[] a(int var0, int var1) {
		try {
			++f;
			byte[] var2;
			if (var0 == 100 && pb.f > 0) {
				var2 = nb.mc[--pb.f];
				nb.mc[pb.f] = null;
				return var2;
			} else if (var0 == 5000 && ~qf.R < -1) {
				var2 = qd.F[--qf.R];
				qd.F[qf.R] = null;
				return var2;
			} else {
				if (var1 != 15) {
					c = -100;
				}
				
				if (var0 == 30000 && tg.a > 0) {
					var2 = kh.Y[--tg.a];
					kh.Y[tg.a] = null;
					return var2;
				} else {
					return new byte[var0];
				}
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "nc.D(" + var0 + ',' + var1 + ')');
		}
	}
}
