import java.awt.Component;

abstract class dc {
	
	static int anInt_a;
	int anInt_b;
	static ob c;
	static int d;
	int e;
	static pe cacheFile14;
	static byte[] bytes_g = new byte[] {(byte) 95, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57};
	static ob h;
	static int i;
	static boolean[][] j;
	static int k = 0;
	private static ob l = rf.a(40, "cyan:");
	int anInt_m;
	
	public static void a(int var0) {
		try {
			cacheFile14 = null;
			if (var0 <= -124) {
				c = null;
				l = null;
				bytes_g = null;
				h = null;
				j = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "dc.G(" + var0 + ')');
		}
	}
	
	static void a(byte var0) {
		try {
			v.X = null;
			o.f = null;
			ad.S = null;
			li.g = null;
			rg.C = null;
			ff.nb = null;
			nc.h = null;
			if (var0 != 105) {
				bytes_g = null;
			}
			
			fi.u = null;
			++d;
			tb.bytes_m = null;
			qf.y = null;
			ah.s = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "dc.C(" + var0 + ')');
		}
	}
	
	abstract void a(int var1, byte var2, int var3);
	
	static void a(byte var0, ob var1) {
		try {
			++i;
			if (gi.y.m != null) {
				try {
					ob var4;
					label31:
					{
						ob var2 = gh.ob_lb.b(gi.y.m, (byte) 71);
						ob var3 = qe.f.b(gi.y.m, (byte) 87);
						var4 = wc.a(new ob[] {var2, ae.settings, var1, ah.f, var3}, -3);
						if (~var1.a(false) != -1) {
							var4 = wc.a(new ob[] {var4, wd.o, tf.a(a.a((byte) -95) - -94608000000L, true), cc.P, mf.a(28860, 94608000L)}, -3);
							if (client.anInt_wb == 0) {
								break label31;
							}
						}
						
						var4 = wc.a(new ob[] {var4, ic.cb}, -3);
					}
					
					if (var0 != 103) {
						h = null;
					}
					
					wc.a(new ob[] {aa.K, var4, ag.b}, -3).a(gi.y.m, (byte) 116);
				} catch (Throwable var5) {
					var5.printStackTrace();
				}
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "dc.E(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	abstract void a(byte var1, int var2, int var3);
	
	static void a(int unused, pe cacheFile8, Component component, pe cacheFile10) {
		int dummy = client.anInt_wb;
		
		try {
			++anInt_a;
			if (!tb.d) {
				oi.a();
				byte[] data = cacheFile10.a((byte) 104, 0, rf.titleJPGValue);
				kh.H = new kc(data, component);
				og.s = kh.H.g();
				q.Y = od.a(1, cacheFile8, sh.logoValue);
				ph.f = od.a(1, cacheFile8, fc.titleboxValue);
				wa.A = od.a(1, cacheFile8, eb.titlebuttonValue);
				wg.ab = wh.a(cacheFile8, -23023, r.runesValue);
				ue.R = wh.a(cacheFile8, -23023, ug.title_muteValue);
				
				ie.F = new int[256];
				for (int i = 0; ~i > -65; i++) {
					ie.F[i] = 262144 * i;
				}
				
				for (int i = 0; ~i > -65; i++) {
					ie.F[i + 64] = 16711680 + i * 1024;
				}
				
				for (int i = 0; i < 64; i++) {
					ie.F[128 + i] = i * 4 + 16776960;
				}
				
				for (int i = 0; i < 64; i++) {
					ie.F[i + 192] = 16777215;
				}
				
				tf.b = new int[256];
				for (int i = 0; ~i > -65; i++) {
					tf.b[i] = i * 1024;
				}
				
				for (int i = 0; ~i > -65; i++) {
					tf.b[i + 64] = '\uff00' + 4 * i;
				}
				
				for (int i = 0; ~i > -65; i++) {
					tf.b[128 + i] = 262144 * i + '\uffff';
				}
				
				for (int i = 0; ~i > -65; i++) {
					tf.b[192 + i] = 16777215;
				}
				
				nb.nc = new int[256];
				for (int i = 0; ~i > -65; i++) {
					nb.nc[i] = i * 4;
				}
				
				for (int i = 0; i < 64; i++) {
					nb.nc[i + 64] = i * 262144 + 255;
				}
				
				for (int i = 0; ~i > -65; i++) {
					nb.nc[128 + i] = 1024 * i + 16711935;
				}
				
				for (int i = 0; i < 64; i++) {
					nb.nc[i + 192] = 16777215;
				}
				
				oc.h = new int['耀'];
				ng.x = new int[256];
				lb.bb = new int['耀'];
				ua.a(null, 29499);
				ni.S = bc.mb == 0;
				g.J = 0;
				kf.f = kf.e;
				kf.l = kf.e;
				ah.j = new int['耀'];
				r.R = new int['耀'];
				ih.v = false;
				if (ni.S) {
					pd.a((byte) 108, 2);
				} else {
					tg.a(fc.scapeMainValue, q.cacheFile_6, false, 255, 0, 0, 2);
				}
				
				qa.b(false, -8496);
				tb.d = true;
				kh.H.b(0, 0);
				og.s.b(382, 0);
				q.Y.b(382 + -(q.Y.Q / 2), 18);
				lh.ub = new kc(128, 254);
				b.Y = new kc(128, 254);
			}
		} catch (RuntimeException var18) {
			throw bc.a(var18, "dc.F(" + unused + ',' + (cacheFile8 != null ? "{...}" : "null") + ',' + (component != null ? "{...}" : "null") + ',' + (cacheFile10 != null ? "{...}" : "null") + ')');
		}
	}
	
	abstract void a(int var1, int var2, boolean var3);
	
	dc(int var1, int var2, int var3) {
		try {
			this.anInt_b = var3;
			this.e = var2;
			this.anInt_m = var1;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "dc.<init>(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	static {
		h = l;
		c = l;
	}
}
