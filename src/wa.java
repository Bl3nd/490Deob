final class wa extends vd {
	
	int[] o;
	static boolean p = false;
	int q;
	byte[][][] r;
	static int[][] s = new int[104][104];
	static int t;
	fd[] u;
	static int sl_arrowsValue = -1;
	static int w = 0;
	int[] x;
	int[] y;
	int z;
	static fa A;
	fd[] B;
	
	public static void d(int var0) {
		try {
			s = null;
			A = null;
			if (var0 <= 66) {
				a(74, 96, -89, 96, (aa) null, 21L, (aa) null, (aa) null);
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "wa.B(" + var0 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, aa var4, long var5, aa var7, aa var8) {
		de var9 = new de();
		var9.o = var4;
		var9.f = var1 * 128 + 64;
		var9.i = var2 * 128 + 64;
		var9.a = var3;
		var9.q = var5;
		var9.s = var7;
		var9.l = var8;
		int var10 = 0;
		pd var11 = nb.oc[var0][var1][var2];
		if (var11 != null) {
			for (int var12 = 0; var12 < var11.B; ++var12) {
				ah var13 = var11.D[var12];
				if ((var13.b & 4194304L) == 4194304L) {
					int var14 = var13.h.b();
					if (var14 != -32768 && var14 < var10) {
						var10 = var14;
					}
				}
			}
		}
		
		var9.m = -var10;
		if (nb.oc[var0][var1][var2] == null) {
			nb.oc[var0][var1][var2] = new pd(var0, var1, var2);
		}
		
		nb.oc[var0][var1][var2].E = var9;
	}
	
	@SuppressWarnings("SynchronizeOnNonFinalField")
	static void b(int i, int unused) {
		try {
			synchronized (vc.g) {
				ni.ab = i;
			}
			
			++t;
		} catch (RuntimeException var6) {
			throw bc.a(var6, "wa.A(" + i + ',' + unused + ')');
		}
	}
}
