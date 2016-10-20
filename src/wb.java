final class wb extends af {
	
	static og R = new og(8);
	static int S;
	static int T;
	static int U;
	static kg V;
	static int W;
	static int X = 50;
	
	static ob c(int var0, int var1) {
		int var4 = client.anInt_wb;
		
		try {
			if (var0 < 46) {
				V = null;
			}
			
			ob var2 = hh.a((byte) 93, var1);
			++T;
			int var3 = var2.a(false) + -3;
			if (var4 != 0) {
				var2 = wc.a(new ob[] {var2.a(var3, 0, (byte) 18), jf.X, var2.a((byte) 117, (int) var3)}, -3);
				var3 -= 3;
			}
			
			while (~var3 < -1) {
				var2 = wc.a(new ob[] {var2.a(var3, 0, (byte) 18), jf.X, var2.a((byte) 117, (int) var3)}, -3);
				var3 -= 3;
			}
			
			if (var2.a(false) > 9) {
				return wc.a(new ob[] {ph.e, var2.a(-8 + var2.a(false), 0, (byte) 36), ig.b, ue.db, var2, kg.e}, -3);
			} else if (var2.a(false) > 6) {
				return wc.a(new ob[] {dd.b, var2.a(var2.a(false) + -4, 0, (byte) 92), ca.rb, ue.db, var2, kg.e}, -3);
			} else {
				return wc.a(new ob[] {na.G, var2, sf.b}, -3);
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "wb.E(" + var0 + ',' + var1 + ')');
		}
	}
	
	public wb() {
		super(0, true);
	}
	
	final int[] a(byte var1, int var2) {
		try {
			if (var1 <= 13) {
				c(-112, -19);
			}
			
			++U;
			return bd.J;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "wb.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	static void a(int i, int i1, int id, int unused, int i3) {
		int dummy = client.anInt_wb;
		
		try {
			++W;
			ng class_ng = (ng) jg.a.a((long) id, 22346);
			if (class_ng == null) {
				class_ng = new ng();
				jg.a.a(class_ng, (long) id, true);
			}
			
			if (~i <= ~class_ng.q.length) {
				int[] ints = new int[1 + i];
				int[] ints1 = new int[i + 1];
				int i2 = 0;
				while (~i2 > ~class_ng.q.length) {
					ints[i2] = class_ng.q[i2];
					ints1[i2] = class_ng.y[i2];
					++i2;
				}
				
				int i4 = class_ng.q.length;
				while (i > i4) {
					ints[i4] = -1;
					ints1[i4] = 0;
					++i4;
				}
				
				class_ng.q = ints;
				class_ng.y = ints1;
			}
			
			class_ng.q[i] = i1;
			class_ng.y[i] = i3;
		} catch (RuntimeException var11) {
			throw bc.a(var11, "wb.C(" + i + ',' + i1 + ',' + id + ',' + unused + ',' + i3 + ')');
		}
	}
	
	static int a(int cacheId, boolean unused, int fileId) {
		try {
			++S;
			long id = (long) ((cacheId << 16) + fileId);
			return ff.Z != null && ~id == ~ff.Z.clientScriptId ? 99 * v.Cb.pointer / (-ff.Z.O + v.Cb.buffer.length) + 1 : 0;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "wb.D(" + cacheId + ',' + unused + ',' + fileId + ')');
		}
	}
	
	public static void i(int var0) {
		try {
			R = null;
			V = null;
			if (var0 != -799263056) {
				i(121);
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "wb.A(" + var0 + ')');
		}
	}
}
