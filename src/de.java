final class de {
	
	int a;
	static int b;
	static ob c = rf.a(40, "leuchten2:");
	static ob duelFriendly = rf.a(40, ":duelfriend:");
	private static ob ob_e = rf.a(40, "Please try again)3");
	int f;
	static ob assist = rf.a(40, ":assist:");
	static ob h;
	int i;
	static ob qa_op_testCommand = rf.a(40, "::qa_op_test");
	static ob k = rf.a(40, "Fertigkeit)2");
	aa l;
	int m;
	static ob trade = rf.a(40, ":trade:");
	aa o;
	static ob p = rf.a(40, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");
	long q;
	static int[] r = new int[25];
	aa s;
	static int t;
	
	static void a(int unused, int interfaceId) {
		int var4 = client.anInt_wb;
		
		try {
			
			++b;
			if (~interfaceId != 0) {
				if (gi.F[interfaceId]) {
					qi.cacheFile3.c(-3 + 385, interfaceId);
					if (wg.cb[interfaceId] != null) {
						boolean var2 = true;
						int var3 = 0;
						if (var4 == 0 && ~var3 <= ~wg.cb[interfaceId].length) {
							if (var2) {
								wg.cb[interfaceId] = null;
							} else {
								gi.F[interfaceId] = false;
							}
						} else {
							while (~var3 > ~wg.cb[interfaceId].length) {
								if (wg.cb[interfaceId][var3] != null) {
									if (~wg.cb[interfaceId][var3].Ac == -3) {
										var2 = false;
										if (var4 != 0) {
											wg.cb[interfaceId][var3] = null;
											++var3;
										} else {
											++var3;
										}
									} else {
										wg.cb[interfaceId][var3] = null;
										++var3;
									}
								} else {
									++var3;
								}
							}
							
							if (var2) {
								wg.cb[interfaceId] = null;
							} else {
								gi.F[interfaceId] = false;
							}
						}
					}
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "de.A(" + unused + ',' + interfaceId + ')');
		}
	}
	
	public static void a(int var0) {
		try {
			r = null;
			ob_e = null;
			k = null;
			duelFriendly = null;
			assist = null;
			p = null;
			if (var0 != -23) {
				a(-22);
			}
			
			c = null;
			qa_op_testCommand = null;
			h = null;
			trade = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "de.C(" + var0 + ')');
		}
	}
	
	static void a(int[][] var0, int var1) {
		try {
			++t;
			e.ints_b = var0;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "de.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}
	
	static {
		h = ob_e;
	}
}
