final class eh extends af {
	
	static int R;
	static int S;
	static pi T = new pi();
	static int U;
	private static ob green_keyword = rf.a(40, "green:");
	static ob W = rf.a(40, "Schrifts-=tze geladen)3");
	static ob X;
	static int[] Y = new int[50];
	static ob green_keyword2;
	static ob ab;
	private static ob bb;
	static ob cb;
	
	static void a(int unused, pe cacheFile2) {
		try {
			++S;
			wd.cacheFile2 = cacheFile2;
			wd.j = wd.cacheFile2.b(16, (byte) -59);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "eh.C(" + unused + ',' + (cacheFile2 != null ? "{...}" : "null") + ')');
		}
	}
	
	public eh() {
		super(1, true);
	}
	
	static int a(int var0, int var1, byte var2, int var3) {
		try {
			int var4 = -var0 + 256;
			if (var2 >= -22) {
				return 63;
			} else {
				++U;
				return ((16711935 & var1) * var4 - -((16711935 & var3) * var0) & -16711936) + (16711680 & ('\uff00' & var3) * var0 + var4 * (var1 & '\uff00')) >> -685583480;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "eh.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	public static void i(int var0) {
		try {
			T = null;
			green_keyword = null;
			Y = null;
			green_keyword2 = null;
			bb = null;
			W = null;
			cb = null;
			ab = null;
			X = null;
			if (var0 != -23153) {
				a(86, (pe) null);
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "eh.D(" + var0 + ')');
		}
	}
	
	final int[] a(byte var1, int var2) {
		int var9 = client.anInt_wb;
		
		try {
			++R;
			int[] var3 = super.nd_v.a(var2, 12);
			if (var1 < 13) {
				green_keyword = null;
			}
			
			if (super.nd_v.n) {
				int[][] var4 = this.b(var2, 87, 0);
				int[] var6 = var4[1];
				int[] var5 = var4[0];
				int[] var7 = var4[2];
				int var8 = 0;
				if (var9 != 0 || ~var8 > ~lh.eb) {
					do {
						var3[var8] = (var5[var8] + var6[var8] - -var7[var8]) / 3;
						++var8;
					} while (~var8 > ~lh.eb);
				}
			}
			
			return var3;
		} catch (RuntimeException var10) {
			throw bc.a(var10, "eh.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	static {
		green_keyword2 = green_keyword;
		X = green_keyword;
		ab = rf.a(40, "");
		bb = rf.a(40, "Please subscribe)1 or use a different world)3");
		cb = bb;
	}
}
