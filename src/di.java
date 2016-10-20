final class di {
	
	static int a;
	static ob b;
	static int[] c = new int[] {
			0, 0, 0, 0, 10, 6, 0, 0, 2, -1, 0, 0, 0, 0, -2, 0, 0, 0, -2, 0, //20
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 10, 2, //40
			0, 0, 6, 0, -2, 0, -1, 0, 4, 0, 0, -1, 5, 0, 0, 0, 0, 0, 0, 0, //60
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 8, 0, 0, 0, 0, 0, //80
			0, 24, 0, 0, 0, 7, 0, 0, 7, 0, 4, -2, 0, 0, 0, 0, 0, 0, 0, -2, //100
			0, 5, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 5, 0, 0, 0, 6, 0, -2, 2, -2, 0, 4, 4, 0, 2, 4, 0, 0, 0, 0, 0, -1, -2, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 6, 0, 6, 15, 0, 3, 0, -1, 0, 0, 0, 0, 0, 20, 0, 0, 6, 0, 12, 0, -2, 0, 0, 3, 0, 0, 3, 0, 0, 7, 6, 0, -1, 0, 0, 0, 0, 6, 6, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, -2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, -2, 0, 5, 6, 5, 0, 0, 0, 3, 0, 0, 0, 0, -2, -1, 2, 6, 2, 0, 6, 2, 0, 0, 7, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0};
	private static ob d = rf.a(40, " more options");
	static int e;
	static int f;
	static vc g;
	static int h;
	static int i;
	static pi j;
	
	public static void a(int var0) {
		try {
			j = null;
			d = null;
			b = null;
			c = null;
			g = null;
			if (var0 != -1155) {
				b = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "di.C(" + var0 + ')');
		}
	}
	
	static long a(int var0, int var1, int var2) {
		pd var3 = nb.oc[var0][var1][var2];
		if (var3 == null) {
			return 0L;
		} else {
			for (int var4 = 0; var4 < var3.B; ++var4) {
				ah var5 = var3.D[var4];
				if ((var5.b >> 29 & 3L) == 2L && var5.q == var1 && var5.d == var2) {
					return var5.b;
				}
			}
			
			return 0L;
		}
	}
	
	static int b(int var0, int var1, int var2) {
		try {
			ng var3 = (ng) jg.a.a((long) var1, 22346);
			++e;
			return var3 == null ? -1 : (~var0 <= -1 && var0 < var3.q.length ? (var2 != 0 ? -93 : var3.q[var0]) : -1);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "di.D(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}
	
	static void a(int unused, pe cacheFile17) {
		try {
			++h;
			li.cacheFile17 = cacheFile17;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "di.B(" + unused + ',' + (cacheFile17 != null ? "{...}" : "null") + ')');
		}
	}
	
	static void a(pe cacheFile7, pe cacheFile19, boolean members, i class_i, byte unused) {
		try {
			++a;
			gg.cacheFile19 = cacheFile19;
			ef.members = members;
			cc.cacheFile7 = cacheFile7;
			int length = gg.cacheFile19.getLength(-3853) - 1;
			gf.B = length * 256 + gg.cacheFile19.b(length, (byte) -59);
			pc.l = class_i;
		} catch (RuntimeException e) {
			throw bc.a(e, "di.E(" + (cacheFile7 != null ? "{...}" : "null") + ',' + (cacheFile19 != null ? "{...}" : "null") + ',' + members + ',' + (class_i != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
	
	static {
		b = d;
		g = new vc(30);
		i = 0;
		j = new pi();
	}
}
