final class hb extends vd {
	
	static int o;
	static int p;
	private static ob q = rf.a(40, "You are standing in a members)2only area)3");
	int anInt_r;
	static ob s;
	static g t;
	int u;
	static int v;
	static ob assistRequest;
	static boolean x;
	
	static boolean a(boolean var0, int var1) {
		try {
			if (!var0) {
				x = false;
			}
			
			++v;
			return var1 < 32 ? false : (var1 == 127 ? false : var1 < 129 || var1 > 159);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "hb.C(" + var0 + ',' + var1 + ')');
		}
	}
	
	public static void a(byte var0) {
		try {
			s = null;
			t = null;
			q = null;
			assistRequest = null;
			if (var0 > -78) {
				x = true;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "hb.B(" + var0 + ')');
		}
	}
	
	static int loadingTitleScreen(pe cacheFile8, boolean unused, pe cacheFile10) {
		try {
			++p;
			int count = 0;
			if (cacheFile10.d(-99, rf.titleJPGValue)) {
				++count;
			}
			
			if (cacheFile8.d(-120, sh.logoValue)) {
				++count;
			}
			
			if (cacheFile8.d(124, fc.titleboxValue)) {
				++count;
			}
			
			if (cacheFile8.d(84, eb.titlebuttonValue)) {
				++count;
			}
			
			if (cacheFile8.d(-74, r.runesValue)) {
				++count;
			}
			
			if (cacheFile8.d(-92, ug.title_muteValue)) {
				++count;
			}
			
			cacheFile8.d(57, fc.sl_backValue);
			cacheFile8.d(58, oc.sl_flagsValue);
			cacheFile8.d(67, wa.sl_arrowsValue);
			cacheFile8.d(44, mi.sl_starsValue);
			cacheFile8.d(-96, mi.sl_buttonValue);
			return count;
		} catch (RuntimeException e) {
			throw bc.a(e, "hb.A(" + (cacheFile8 != null ? "{...}" : "null") + ',' + unused
					+ ',' + (cacheFile10 != null ? "{...}" : "null") + ')');
		}
	}
	
	hb(int var1, int var2) {
		try {
			this.anInt_r = var2;
			this.u = var1;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "hb.<init>(" + var1 + ',' + var2 + ')');
		}
	}
	
	static {
		s = q;
		x = false;
		assistRequest = rf.a(40, ":assistreq:");
	}
}
