final class oc implements Runnable {
	
	static int a;
	static int[] b = new int[] {1, -1, -1, 1};
	static int c;
	static int d;
	static int e;
	t f;
	static int g = 0;
	static int[] h;
	volatile lg[] i = new lg[2];
	static vc j = new vc(64);
	volatile boolean k = false;
	static int l;
	volatile boolean m = false;
	static int sl_flagsValue = -1;
	static ob o;
	private static ob p = rf.a(40, "Service unavailable)3");
	
	public final void run() {
		System.err.println("Method run() [Class oc]");
		int var5 = client.anInt_wb;
		
		try {
			++c;
			this.m = true;
			
			try {
				if (/*var5 != 0 || */!this.k) {
					do {
						int var3 = 0;
						if (/*var5 != 0 || */var3 < 2) {
							do {
								lg var4 = this.i[var3];
								if (var4 != null) {
									var4.d(-110);
								}
								
								++var3;
							} while (var3 < 2);
						}
						
						jd.a(10L, (byte) -8);
						kd.a(this.f, null, (byte) 2);
					} while (!this.k);
				}
			} catch (Exception var9) {
				ra.a((String) null, var9, (byte) 107);
			} finally {
				this.m = false;
			}
			
		} catch (RuntimeException var11) {
			throw bc.a(var11, "oc.run(" + ')');
		}
	}
	
	public static void a(int var0) {
		try {
			o = null;
			j = null;
			h = null;
			if (var0 != -103) {
				a(-36, -84L);
			}
			
			p = null;
			b = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "oc.B(" + var0 + ')');
		}
	}
	
	static final void a(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6, int var7) {
		try {
			if (var5) {
				j = null;
			}
			
			++l;
			if (var3 >= 1 && var7 >= 1 && ~var3 >= -103 && var7 <= 102) {
				if (ag.forceSend && ~var4 != ~gf.G) {
					return;
				}
				
				int var8 = var4;
				if (~var4 > -4 && ~(2 & qe.r[1][var3][var7]) == -3) {
					var8 = var4 + 1;
				}
				
				tg.a(1177, var4, var8, var3, ef.R[var4], var1, var7);
				if (~var6 <= -1) {
					af.a(var2, var3, (byte) 70, var6, var4, false, var7, var8, var0, false, ef.R[var4]);
					return;
				}
			}
			
		} catch (RuntimeException var9) {
			throw bc.a(var9, "oc.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}
	
	static final boolean a(int var0, int var1) {
		try {
			++a;
			if (var1 != 10) {
				g = 33;
			}
			
			return ~(var0 >> 1820876245 & 1) != -1;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "oc.A(" + var0 + ',' + var1 + ')');
		}
	}
	
	static final void a(int var0, long var1) {
		try {
			++e;
			if (~var1 != -1L) {
				af.P.p(82, 12885);
				if (var0 < -27) {
					af.P.writeLong((int) -110, var1);
					++pi.p;
				}
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "oc.D(" + var0 + ',' + var1 + ')');
		}
	}
	
	static {
		o = p;
	}
}
