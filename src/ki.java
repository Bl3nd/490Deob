final class ki {
	
	static int a;
	static ob b = rf.a(40, "Anmelde)2Limit -Uberschritten)3");
	int c;
	int d;
	int e;
	int f;
	int g;
	static kc h;
	static int sampleRate;
	int j;
	int k;
	static ca cacheFile_18;
	static int m;
	int n;
	static int o;
	static vc p = new vc(64);
	static ob q = rf.a(40, "60 Sekunden noch einmal)3)3)3");
	static int[] r = new int[100];
	static int s;
	static ob t;
	static int u = 0;
	static pe v;
	private static ob w = rf.a(40, " from your friend list first)3");
	
	public static void a(int var0) {
		try {
			cacheFile_18 = null;
			r = null;
			q = null;
			p = null;
			t = null;
			v = null;
			if (var0 != 3073) {
				b = null;
			}
			
			b = null;
			h = null;
			w = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ki.B(" + var0 + ')');
		}
	}
	
	static boolean a(int var0, int var1, int var2, int var3, int var4, aa var5, int var6, long var7, boolean var9) {
		if (var5 == null) {
			return true;
		} else {
			int var10 = var1 - var4;
			int var11 = var2 - var4;
			int var12 = var1 + var4;
			int var13 = var2 + var4;
			if (var9) {
				if (var6 > 640 && var6 < 1408) {
					var13 += 128;
				}
				
				if (var6 > 1152 && var6 < 1920) {
					var12 += 128;
				}
				
				if (var6 > 1664 || var6 < 384) {
					var11 -= 128;
				}
				
				if (var6 > 128 && var6 < 896) {
					var10 -= 128;
				}
			}
			
			var10 /= 128;
			var11 /= 128;
			var12 /= 128;
			var13 /= 128;
			return jf.a(var0, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var1, var2, var3, var5, var6, true, var7);
		}
	}
	
	static void a(int unused, long millis) {
		try {
			++m;
			
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ki.D(" + unused + ',' + millis + ')');
		}
	}
	
	static void a(ob[] var0, short[] var1, boolean var2) {
		try {
			if (!var2) {
				u = -9;
			}
			
			++o;
			be.a(0, var0, var0.length + -1, var1, -129);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ki.C(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	
	static {
		t = w;
	}
}
