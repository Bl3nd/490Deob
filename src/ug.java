final class ug extends bg {
	
	private static ob m = rf.a(40, "Please wait )2 attempting to reestablish)3");
	static int title_muteValue;
	static int o;
	static int p;
	static ob q;
	static int r;
	static int s;
	static int t;
	static kc[] u;
	static int v = 0;
	private static ob w;
	static ob x;
	static int y;
	static pe cacheFile13;
	
	public static void b(byte var0) {
		try {
			int var1 = 82 / ((51 - var0) / 51);
			x = null;
			cacheFile13 = null;
			m = null;
			q = null;
			w = null;
			u = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ug.E(" + var0 + ')');
		}
	}
	
	static int a(int var0, int var1, byte var2, int var3) {
		try {
			++p;
			if (var2 != 40) {
				x = null;
			}
			
			int var5 = var3 >> 7;
			int var4 = var1 >> 7;
			if (~var4 <= -1 && ~var5 <= -1 && var4 <= 103 && var5 <= 103) {
				int var6 = var0;
				if (~var0 > -4 && ~(2 & qe.r[1][var4][var5]) == -3) {
					var6 = var0 + 1;
				}
				
				int var8 = var3 & 127;
				int var7 = var1 & 127;
				int var9 = d.D[var6][1 + var4][var5] * var7 + (-var7 + 128) * d.D[var6][var4][var5] >> 7;
				int var10 = d.D[var6][1 + var4][1 + var5] * var7 + d.D[var6][var4][var5 + 1] * (128 + -var7) >> 7;
				return var9 * (128 + -var8) + var10 * var8 >> 7;
			} else {
				return 0;
			}
		} catch (RuntimeException var11) {
			throw bc.a(var11, "ug.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	static ob a(long l, int unused) {
		try {
			++y;
			if (~l < -1L && ~l > -6582952005840035282L) {
				if (~(l % 37L) == -1L) {
					return null;
				} else {
					long l1 = l;
					int count;
					for (count = 0; l1 != 0L; l1 /= 37L) {
						++count;
					}
					
					byte[] data;
					long l2;
					for (data = new byte[count]; ~l != -1L; data[count] = dc.bytes_g[(int) (l2 + -(l * 37L))]) {
						l2 = l;
						l /= 37L;
						--count;
					}
					
					ob class_ob = new ob();
					class_ob.buffer = data;
					class_ob.length = data.length;
					return class_ob;
				}
			} else {
				return null;
			}
		} catch (RuntimeException var9) {
			throw bc.a(var9, "ug.C(" + l + ',' + unused + ')');
		}
	}
	
	static kc c(byte var0) {
		int var5 = client.anInt_wb;
		
		try {
			if (var0 >= -35) {
				a(105, 58, (byte) 113, -11);
			}
			
			++t;
			kc var1 = new kc();
			var1.N = ci.A[0];
			var1.width = kd.S;
			var1.imageHeight = le.db[0];
			var1.imageWidth = ub.g[0];
			var1.height = tg.b;
			var1.P = ci.x[0];
			int var2 = var1.imageWidth * var1.imageHeight;
			var1.pixels = new int[var2];
			byte[] var3 = wg.V[0];
			int var4 = 0;
			if (var5 == 0 && var2 <= var4) {
				ii.e(-83);
				return var1;
			} else {
				do {
					var1.pixels[var4] = be.h[bd.b(255, (int) var3[var4])];
					++var4;
				} while (var2 > var4);
				
				ii.e(-83);
				return var1;
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ug.D(" + var0 + ')');
		}
	}
	
	static void d(byte var0) {
		try {
			if (var0 == 106) {
				++o;
				
				while (true) {
					qc var1;
					synchronized (l.pi_c) {
						var1 = (qc) ob.s.a(-12462);
					}
					
					if (var1 == null) {
						return;
					}
					
					var1.x.a((byte) -14, (int) var1.clientScriptId, var1.bytes_r, false, var1.o);
				}
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ug.A(" + var0 + ')');
		}
	}
	
	static {
		x = m;
		s = -1;
		title_muteValue = -1;
		w = rf.a(40, "Bad session id)3");
		q = w;
	}
}
