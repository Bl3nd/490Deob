final class qg implements Runnable {
	
	static int a;
	static int b;
	static int c;
	static ob d;
	private static ob e = rf.a(40, "Connecting to server)3)3)3");
	static int[] f;
	static int g;
	static int h;
	static ob[] i;
	static vc j;
	static ob k;
	static ob ob_l;
	static int m;
	
	@SuppressWarnings("SynchronizeOnNonFinalField")
	public final void run() {
		System.err.println("Method run() [Class qg]");
		try {
			++a;
			
			try {
				while (true) {
					qc var1;
					synchronized (l.pi_c) {
						var1 = (qc) l.pi_c.a((byte) -9);
					}
					
					if (var1 != null) {
						if (~var1.t == -1) {
							var1.o.a(true, var1.bytes_r.length, var1.bytes_r, (int) var1.clientScriptId);
							synchronized (l.pi_c) {
								var1.c(128);
							}
						} else if (var1.t == 1) {
							var1.bytes_r = var1.o.a(112, (int) var1.clientScriptId);
							synchronized (l.pi_c) {
								ob.s.a(0, var1);
							}
						}
						
						synchronized (md.e) {
							if (~pi.s < -2) {
								pi.s = 600;
								continue;
							}
							
							pi.s = 0;
							md.e.notifyAll();
							return;
						}
						
					} else {
						jd.a(100L, (byte) -8);
						synchronized (md.e) {
							if (pi.s <= 1) {
								pi.s = 0;
								md.e.notifyAll();
							} else {
								--pi.s;
								continue;
							}
							
							return;
						}
					}
				}
			} catch (Exception var44) {
				ra.a(null, var44, (byte) -100);
			}
		} catch (RuntimeException var45) {
			throw bc.a(var45, "qg.run(" + ')');
		}
	}
	
	static int a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		try {
			if ((1 & var3) == 1) {
				int var7 = var5;
				var5 = var4;
				var4 = var7;
			}
			
			++h;
			var1 &= 3;
			return ~var1 == -1 ? var0 : (var1 == 1 ? var2 : (~var1 == var6 ? 1 + -var5 + 7 - var0 : -var4 - (-1 - -var2) + 7));
		} catch (RuntimeException var8) {
			throw bc.a(var8, "qg.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}
	
	public static void a(boolean var0) {
		try {
			k = null;
			ob_l = null;
			f = null;
			j = null;
			e = null;
			i = null;
			d = null;
			if (var0) {
				a();
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "qg.C(" + var0 + ')');
		}
	}
	
	static void a() {
		int var1;
		int var2;
		for (int var0 = 0; var0 < ki.s; ++var0) {
			for (var1 = 0; var1 < qd.L; ++var1) {
				for (var2 = 0; var2 < wc.J; ++var2) {
					nb.oc[var0][var1][var2] = null;
				}
			}
		}
		
		for (var1 = 0; var1 < qa.w; ++var1) {
			for (var2 = 0; var2 < qa.d[var1]; ++var2) {
				qa.h[var1][var2] = null;
			}
			
			qa.d[var1] = 0;
		}
		
		for (var2 = 0; var2 < bf.ab; ++var2) {
			ld.ahs_q[var2] = null;
		}
		
		bf.ab = 0;
		
		for (int var3 = 0; var3 < pi.h.length; ++var3) {
			pi.h[var3] = null;
		}
		
	}
	
	static ob a(int var0, int var1, boolean var2) {
		try {
			if (var2) {
				return null;
			} else {
				++b;
				int var3 = var0 - var1;
				return ~var3 > 8 ? se.i : (var3 < -6 ? le.gb : (var3 < -3 ? mg.c : (var3 < 0 ? md.x : (var3 > 9 ? th.T : (~var3 < -7 ? bd.D : (var3 > 3 ? ce.D : (~var3 < -1 ? jf.U : bh.f)))))));
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "qg.D(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}
	
	static void a(aa var0, int var1, int var2, int var3) {
		pd var4;
		if (var2 < qd.L) {
			var4 = nb.oc[var1][var2 + 1][var3];
			if (var4 != null && var4.u != null && var4.u.c.a()) {
				var0.a(var4.u.c, 128, 0, 0, true);
			}
		}
		
		if (var3 < qd.L) {
			var4 = nb.oc[var1][var2][var3 + 1];
			if (var4 != null && var4.u != null && var4.u.c.a()) {
				var0.a(var4.u.c, 0, 0, 128, true);
			}
		}
		
		if (var2 < qd.L && var3 < wc.J) {
			var4 = nb.oc[var1][var2 + 1][var3 + 1];
			if (var4 != null && var4.u != null && var4.u.c.a()) {
				var0.a(var4.u.c, 128, 0, 128, true);
			}
		}
		
		if (var2 < qd.L && var3 > 0) {
			var4 = nb.oc[var1][var2 + 1][var3 - 1];
			if (var4 != null && var4.u != null && var4.u.c.a()) {
				var0.a(var4.u.c, 128, 0, -128, true);
			}
		}
		
	}
	
	static {
		d = e;
		f = new int[256];
		c = 0;
		i = new ob[100];
		
		for (int var1 = 0; ~var1 > -257; ++var1) {
			int var0 = var1;
			
			for (int var2 = 0; var2 < 8; ++var2) {
				if ((1 & var0) != 1) {
					var0 >>>= 1;
				} else {
					var0 = -306674912 ^ var0 >>> 1;
				}
			}
			
			f[var1] = var0;
		}
		
		j = new vc(50);
		k = rf.a(40, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");
		ob_l = rf.a(40, "RuneScape wird geladen )2 bitte warten)3)3)3");
	}
}
