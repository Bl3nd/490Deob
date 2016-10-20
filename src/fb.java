import java.awt.Graphics;

final class fb extends af {
	
	static int R;
	static int S;
	static int T;
	static int U;
	static int V = 0;
	static int W;
	private static ob youHaveOnlyJustLeftAnotherWorld = rf.a(40, "You have only just left another world)3");
	static int Y;
	static ob youHaveOnlyJustLeftAnotherWorld2;
	static ob compass = rf.a(40, "compass");
	static int bb;
	static int cb;
	static int db;
	
	static boolean a(int var0, int id, pe var2, int var3) {
		try {
			if (var0 >= -84) {
				youHaveOnlyJustLeftAnotherWorld = null;
			}
			
			++Y;
			byte[] var4 = var2.a((byte) 36, var3, id);
			if (var4 == null) {
				return false;
			} else {
				b.a(var4, (byte) -69);
				return true;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "fb.H(" + var0 + ',' + id + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}
	
	private int b(byte var1, int var2, int var3) {
		try {
			if (var1 <= 114) {
				return -18;
			} else {
				++cb;
				int var4 = var2 * 57 + var3;
				var4 ^= var4 << 1;
				return 4096 - (Integer.MAX_VALUE & var4 * (15731 * var4 * var4 + 789221) + 1376312589) / 262144;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "fb.E(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	public static void i(int var0) {
		try {
			youHaveOnlyJustLeftAnotherWorld = null;
			if (var0 > -76) {
				youHaveOnlyJustLeftAnotherWorld2 = null;
			}
			
			compass = null;
			youHaveOnlyJustLeftAnotherWorld2 = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "fb.I(" + var0 + ')');
		}
	}
	
	static void j(int var0) {
		int var9 = client.anInt_wb;
		
		try {
			++T;
			if (var0 != -630) {
				c(-8, -121);
			}
			
			boolean var1 = false;
			if (var9 != 0 || !var1) {
				do {
					var1 = true;
					int var2 = 0;
					if (var9 != 0 || ~var2 > ~(si.S + -1)) {
						do {
							if (ph.i[var2] < 1000 && ~ph.i[var2 - -1] < -1001) {
								ob var3 = wf.e[var2];
								wf.e[var2] = wf.e[1 + var2];
								wf.e[var2 - -1] = var3;
								var1 = false;
								ob var4 = ca.Nb[var2];
								ca.Nb[var2] = ca.Nb[1 + var2];
								ca.Nb[1 + var2] = var4;
								int var5 = ae.Rb[var2];
								ae.Rb[var2] = ae.Rb[var2 + 1];
								ae.Rb[var2 - -1] = var5;
								var5 = nd.i[var2];
								nd.i[var2] = nd.i[var2 - -1];
								nd.i[1 + var2] = var5;
								short var6 = ph.i[var2];
								ph.i[var2] = ph.i[1 + var2];
								ph.i[1 + var2] = var6;
								long var7 = qb.G[var2];
								qb.G[var2] = qb.G[var2 - -1];
								qb.G[var2 + 1] = var7;
							}
							
							++var2;
						} while (~var2 > ~(si.S + -1));
					}
				} while (!var1);
				
			}
		} catch (RuntimeException var10) {
			throw bc.a(var10, "fb.C(" + var0 + ')');
		}
	}
	
	final int[] a(byte var1, int var2) {
		int var6 = client.anInt_wb;
		
		try {
			++bb;
			if (var1 <= 13) {
				return null;
			} else {
				int[] var3 = super.nd_v.a(var2, 12);
				if (super.nd_v.n) {
					int var4 = rh.r[var2];
					int var5 = 0;
					if (var6 != 0 || var5 < lh.eb) {
						do {
							var3[var5] = this.b((byte) 123, var4, bd.J[var5]) % 4096;
							++var5;
						} while (var5 < lh.eb);
					}
				}
				
				return var3;
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "fb.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	static void a(int unused, boolean var1, ob gameString) {
		try {
			++db;
			byte b = 4;
			int yOffset = b + 6;
			int xOffset2 = mf.i_gb.b(gameString, 250);
			int xOffset = 6 + b;
			int yOffset2 = mf.i_gb.a(gameString, 250) * 13;
			oi.d(-b + xOffset, -b + yOffset, b + xOffset2 + b, b + yOffset2 + b, 0);
			oi.a(-b + xOffset, -b + yOffset, xOffset2 - (-b - b), yOffset2 - (-b - b), 16777215);
			mf.i_gb.a(gameString, xOffset, yOffset, xOffset2, yOffset2, 0xffffff, -1, 1, 1, 0);
			od.a(-b + yOffset, xOffset - b, b + xOffset2 - -b, b + yOffset2 + b, 2);
			if (!var1) {
				rc.a(false, yOffset2, xOffset2, xOffset, yOffset);
			} else {
				try {
					Graphics graphics = rg.canvas_t.getGraphics();
					wb.V.a(0, graphics, 0, -62);
				} catch (Exception var9) {
					rg.canvas_t.repaint();
				}
			}
		} catch (RuntimeException var10) {
			throw bc.a(var10, "fb.A(" + unused + ',' + var1 + ',' + (gameString != null ? "{...}" : "null") + ')');
		}
	}
	
	public fb() {
		super(0, true);
	}
	
	static int c(int id, int var1) {
		try {
			if (var1 != 127) {
				c(-120, -116);
			}
			
			++R;
			return 127 & id;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "fb.D(" + id + ',' + var1 + ')');
		}
	}
	
	static {
		youHaveOnlyJustLeftAnotherWorld2 = youHaveOnlyJustLeftAnotherWorld;
		U = 0;
	}
}
