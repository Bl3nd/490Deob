final class sc {
	
	static int a;
	static ob loadingPleaseWait2;
	static ob c = rf.a(40, ")4slr)3ws?order=LPWM");
	static ob d = rf.a(40, "gleiten:");
	static ob e = rf.a(40, "Keine Antwort vom Anmelde)2Server)3");
	private static ob loadingPleaseWait = rf.a(40, "Loading )2 please wait)3");
	static int g;
	static int h;
	static int i = 1;
	private static ob username_;
	static ob username_2;
	static int l;
	static boolean m;
	
	static ob a(int var0, int var1, byte[] var2, int var3) {
		try {
			++a;
			ob var4 = new ob();
			var4.length = 0;
			var4.buffer = new byte[var3];
			
			for (int var5 = var1; var1 + var3 > var5; ++var5) {
				if (~var2[var5] != -1) {
					var4.buffer[var4.length++] = var2[var5];
				}
			}
			
			if (var0 != 1) {
				a(108, -66);
			}
			
			return var4;
		} catch (RuntimeException var6) {
			throw bc.a(var6, "sc.A(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}
	
	static bh a(byte var0) {
		try {
			++l;
			
			try {
				return (bh) Class.forName("ma").newInstance();
			} catch (Throwable throwable) {
				throwable.printStackTrace();
				return null;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "sc.B(" + var0 + ')');
		}
	}
	
	static void a(int var0, int var1) {
		try {
			++h;
			if (var0 == -16361) {
				if (vb.q == null || vb.q.length < var1) {
					vb.q = new int[var1];
				}
				
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "sc.D(" + var0 + ',' + var1 + ')');
		}
	}
	
	public static void a(int var0) {
		try {
			e = null;
			d = null;
			loadingPleaseWait2 = null;
			username_ = null;
			if (var0 > 113) {
				username_2 = null;
				loadingPleaseWait = null;
				c = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "sc.C(" + var0 + ')');
		}
	}
	
	static {
		loadingPleaseWait2 = loadingPleaseWait;
		username_ = rf.a(40, "Username: ");
		g = -1;
		username_2 = username_;
	}
}
