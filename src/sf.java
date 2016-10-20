final class sf {
	
	static ca cacheFile_17;
	static ob b = rf.a(40, "<)4col>");
	static int c;
	static int[] d = new int[] {2, 0, 0, 2, 0, 0, 0, 4, 4};
	static pe cacheFile8;
	static boolean f = false;
	static ob g = null;
	static int h = 0;
	static ob i = rf.a(40, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");
	static int j;
	static ob k = rf.a(40, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");
	static int l;
	
	static final int a(int var0, int var1, boolean var2) {
		int var4 = client.anInt_wb;
		
		try {
			++j;
			int var3 = 1;
			if (var4 != 0) {
				if ((1 & var1) != 0) {
					var3 *= var0;
				}
				
				var1 >>= 1;
				var0 *= var0;
			}
			
			while (var1 > 1) {
				if ((1 & var1) != 0) {
					var3 *= var0;
				}
				
				var1 >>= 1;
				var0 *= var0;
			}
			
			if (~var1 == -2) {
				return var3 * var0;
			} else {
				if (!var2) {
					cacheFile8 = null;
				}
				
				return var3;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "sf.B(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}
	
	public static void a(boolean var0) {
		try {
			d = null;
			b = null;
			k = null;
			cacheFile_17 = null;
			i = null;
			if (var0) {
				f = true;
			}
			
			g = null;
			cacheFile8 = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "sf.A(" + var0 + ')');
		}
	}
	
	static final fg a(int var0, int var1, int var2) {
		pd var3 = nb.oc[var0][var1][var2];
		return var3 == null ? null : var3.r;
	}
	
	static final void b(boolean var0) {
		try {
			if (pa.a != null) {
				synchronized (pa.a) {
					pa.a = null;
				}
			}
			
			++c;
			if (var0) {
				cacheFile_17 = null;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "sf.D(" + var0 + ')');
		}
	}
}
