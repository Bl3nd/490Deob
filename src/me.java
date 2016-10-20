final class me {
	
	static ob p12_full = rf.a(40, "p12_full");
	static int b;
	aa c;
	static ob d = rf.a(40, "Lade Schrifts-=tze )2 ");
	static int e;
	static byte f;
	static ob checkingForUpdates2;
	static ob h = rf.a(40, "VOLL");
	int i;
	int j;
	static int k;
	private static ob checkingForUpdates = rf.a(40, "Checking for updates )2 ");
	int anInt_m;
	static int[] n = new int[] {16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215};
	long o;
	static int p;
	static ca cacheFile_20;
	
	static void a(int var0, int var1, int var2, byte var3) {
		try {
			++e;
			if (var2 >= 128 && var1 >= 128 && var2 <= 13056 && var1 <= 13056) {
				int var9 = -77 % ((16 - var3) / 32);
				int var4 = -var0 + ug.a(gf.G, var2, (byte) 40, var1);
				int var8 = ec.L[rf.x];
				int var5 = ec.W[bh.l];
				var4 -= tb.b;
				int var7 = ec.W[rf.x];
				int var6 = ec.L[bh.l];
				var1 -= se.d;
				var2 -= ri.b;
				int var10 = var1 * var7 - -(var2 * var8) >> 16;
				var1 = var8 * var1 - var7 * var2 >> 16;
				var2 = var10;
				var10 = var4 * var6 - var5 * var1 >> 16;
				var1 = var5 * var4 - -(var6 * var1) >> 16;
				if (~var1 <= -51) {
					m.B = (var10 << 9) / var1 + 167;
					bd.K = 256 + (var2 << 9) / var1;
				} else {
					m.B = -1;
					bd.K = -1;
				}
			} else {
				m.B = -1;
				bd.K = -1;
			}
		} catch (RuntimeException var11) {
			throw bc.a(var11, "me.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	public static void a(int var0) {
		try {
			cacheFile_20 = null;
			d = null;
			p12_full = null;
			h = null;
			checkingForUpdates2 = null;
			int var1 = 110 % ((38 - var0) / 55);
			n = null;
			checkingForUpdates = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "me.B(" + var0 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2) {
		pd var3 = nb.oc[var0][var1][var2];
		if (var3 != null) {
			for (int var4 = 0; var4 < var3.B; ++var4) {
				ah var5 = var3.D[var4];
				if ((var5.b >> 29 & 3L) == 2L && var5.q == var1 && var5.d == var2) {
					a.a(var5);
					return;
				}
			}
			
		}
	}
	
	static {
		checkingForUpdates2 = checkingForUpdates;
	}
}
