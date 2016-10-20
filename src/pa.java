final class pa {
	
	static tb a = new tb();
	static ob b = rf.a(40, "RuneScape wurde aktualisiert(Q");
	static int c;
	static int d;
	static int e = 0;
	static int f;
	static int g;
	static int h = 0;
	static int i;
	static int j;
	static ca cacheFile_9;
	
	static fa[] a(int id, pe var1, int var2, int var3) {
		try {
			if (var3 != 865) {
				a(-70);
			}
			
			++g;
			return !fb.a(-95, id, var1, var2) ? null : cc.a(false);
		} catch (RuntimeException var5) {
			throw bc.a(var5, "pa.D(" + id + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	static void a(int unused, pe cacheFile22) {
		try {
			++f;
			ga.cacheFile22 = cacheFile22;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "pa.E(" + unused + ',' + (cacheFile22 != null ? "{...}" : "null") + ')');
		}
	}
	
	public static void a(int var0) {
		try {
			cacheFile_9 = null;
			a = null;
			if (var0 <= 65) {
				cacheFile_9 = null;
			}
			
			b = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "pa.C(" + var0 + ')');
		}
	}
	
	static void b(int var0) {
		try {
			++c;
			eh.T = new pi();
			if (var0 != 3) {
				e = -33;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "pa.B(" + var0 + ')');
		}
	}
	
	static int a(int var0, int var1, int var2, int var3) {
		try {
			++i;
			var2 &= 3;
			return var3 == var2 ? var0 : (~var2 == -2 ? 7 + -var1 : (~var2 == -3 ? -var0 + 7 : var1));
		} catch (RuntimeException var5) {
			throw bc.a(var5, "pa.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
}
