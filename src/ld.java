final class ld extends vd {
	
	static int[] o = new int[] {16, 32, 64, 128};
	ob p;
	static ah[] ahs_q = new ah[5000];
	static ob ob_r = rf.a(40, " )2>");
	static ob s;
	private static ob t = rf.a(40, "Please enter your username)3");
	static int u;
	static int[] ints_v = new int[100];
	static int w;
	static int x;
	static ob y;
	
	public static void a(byte var0) {
		try {
			ahs_q = null;
			o = null;
			if (var0 >= -58) {
				ob_r = null;
			}
			
			ob_r = null;
			ints_v = null;
			t = null;
			s = null;
			y = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ld.D(" + var0 + ')');
		}
	}
	
	static long b(int var0, int var1, int var2) {
		pd var3 = nb.oc[var0][var1][var2];
		return var3 != null && var3.r != null ? var3.r.m : 0L;
	}
	
	static int b(int var0, int var1) {
		try {
			++x;
			int var2 = 0;
			if (~var0 > -1 || ~var0 <= -65537) {
				var0 >>>= 16;
				var2 += 16;
			}
			
			if (var1 != 16) {
				b(24, -52);
			}
			
			if (~var0 <= -257) {
				var0 >>>= 8;
				var2 += 8;
			}
			
			if (~var0 <= -17) {
				var2 += 4;
				var0 >>>= 4;
			}
			
			if (~var0 <= -5) {
				var0 >>>= 2;
				var2 += 2;
			}
			
			if (var0 >= 1) {
				var0 >>>= 1;
				++var2;
			}
			
			return var2 + var0;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ld.C(" + var0 + ',' + var1 + ')');
		}
	}
	
	static void b(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 < 0) {
			var0 = 0;
		} else if (var0 >= qd.L * 128) {
			var0 = qd.L * 128 - 1;
		}
		
		if (var2 < 0) {
			var2 = 0;
		} else if (var2 >= wc.J * 128) {
			var2 = wc.J * 128 - 1;
		}
		
		++v.M;
		ke.kb = ec.W[var3];
		m.r = ec.L[var3];
		vf.p = ec.W[var4];
		pb.anInt_d = ec.L[var4];
		dc.j = a.d[(var3 - 128) / 32][var4 / 64];
		bg.b = var0;
		qc.A = var1;
		dd.m = var2;
		vd.anInt_h = var0 / 128;
		hg.d = var2 / 128;
		fb.V = var5;
		ua.d = vd.anInt_h - ba.a;
		if (ua.d < 0) {
			ua.d = 0;
		}
		
		wc.L = hg.d - ba.a;
		if (wc.L < 0) {
			wc.L = 0;
		}
		
		gg.j = vd.anInt_h + ba.a;
		if (gg.j > qd.L) {
			gg.j = qd.L;
		}
		
		oe.r = hg.d + ba.a;
		if (oe.r > wc.J) {
			oe.r = wc.J;
		}
		
		q.a();
		ia.S = 0;
		
		int var8;
		int var9;
		for (int var6 = r.eb; var6 < ki.s; ++var6) {
			pd[][] var7 = nb.oc[var6];
			
			for (var8 = ua.d; var8 < gg.j; ++var8) {
				for (var9 = wc.L; var9 < oe.r; ++var9) {
					pd var10 = var7[var8][var9];
					if (var10 != null) {
						if (var10.F > var5 || !dc.j[var8 - vd.anInt_h + ba.a][var9 - hg.d + ba.a] && la.v[var6][var8][var9] - var1 < 2000) {
							var10.q = false;
							var10.J = false;
							var10.w = 0;
						} else {
							var10.q = true;
							var10.J = true;
							if (var10.B > 0) {
								var10.p = true;
							} else {
								var10.p = false;
							}
							
							++ia.S;
						}
					}
				}
			}
		}
		
		int var11;
		int var12;
		int var13;
		int var14;
		int var20;
		for (int var17 = r.eb; var17 < ki.s; ++var17) {
			pd[][] var18 = nb.oc[var17];
			
			for (var9 = -ba.a; var9 <= 0; ++var9) {
				var20 = vd.anInt_h + var9;
				var11 = vd.anInt_h - var9;
				if (var20 >= ua.d || var11 < gg.j) {
					for (var12 = -ba.a; var12 <= 0; ++var12) {
						var13 = hg.d + var12;
						var14 = hg.d - var12;
						pd var15;
						if (var20 >= ua.d) {
							if (var13 >= wc.L) {
								var15 = var18[var20][var13];
								if (var15 != null && var15.q) {
									nd.a(var15, true);
								}
							}
							
							if (var14 < oe.r) {
								var15 = var18[var20][var14];
								if (var15 != null && var15.q) {
									nd.a(var15, true);
								}
							}
						}
						
						if (var11 < gg.j) {
							if (var13 >= wc.L) {
								var15 = var18[var11][var13];
								if (var15 != null && var15.q) {
									nd.a(var15, true);
								}
							}
							
							if (var14 < oe.r) {
								var15 = var18[var11][var14];
								if (var15 != null && var15.q) {
									nd.a(var15, true);
								}
							}
						}
						
						if (ia.S == 0) {
							cf.Y = false;
							return;
						}
					}
				}
			}
		}
		
		for (var8 = r.eb; var8 < ki.s; ++var8) {
			pd[][] var19 = nb.oc[var8];
			
			for (var20 = -ba.a; var20 <= 0; ++var20) {
				var11 = vd.anInt_h + var20;
				var12 = vd.anInt_h - var20;
				if (var11 >= ua.d || var12 < gg.j) {
					for (var13 = -ba.a; var13 <= 0; ++var13) {
						var14 = hg.d + var13;
						int var21 = hg.d - var13;
						pd var16;
						if (var11 >= ua.d) {
							if (var14 >= wc.L) {
								var16 = var19[var11][var14];
								if (var16 != null && var16.q) {
									nd.a(var16, false);
								}
							}
							
							if (var21 < oe.r) {
								var16 = var19[var11][var21];
								if (var16 != null && var16.q) {
									nd.a(var16, false);
								}
							}
						}
						
						if (var12 < gg.j) {
							if (var14 >= wc.L) {
								var16 = var19[var12][var14];
								if (var16 != null && var16.q) {
									nd.a(var16, false);
								}
							}
							
							if (var21 < oe.r) {
								var16 = var19[var12][var21];
								if (var16 != null && var16.q) {
									nd.a(var16, false);
								}
							}
						}
						
						if (ia.S == 0) {
							cf.Y = false;
							return;
						}
					}
				}
			}
		}
		
		cf.Y = false;
	}
	
	public ld() {
	}
	
	ld(ob var1) {
		try {
			this.p = var1;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ld.<init>(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	static {
		s = t;
		y = rf.a(40, "event_opbase");
		u = 0;
	}
}
