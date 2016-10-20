final class d extends rg {
	
	static int[][][] D = new int[4][105][105];
	static ob E = rf.a(40, "leuchten1:");
	int F;
	static ob G = rf.a(40, ":");
	static int H;
	int I;
	static int J;
	int K;
	static int L;
	static int M;
	static int O;
	static pe cacheFile2;
	static int Q;
	static int R;
	static fd S;
	
	static void f(int var0) {
		r.eb = var0;
		
		for (int var1 = 0; var1 < qd.L; ++var1) {
			for (int var2 = 0; var2 < wc.J; ++var2) {
				if (nb.oc[var0][var1][var2] == null) {
					nb.oc[var0][var1][var2] = new pd(var0, var1, var2);
				}
			}
		}
	}
	
	final void a(int var1, og var2) {
		try {
			++L;
			
			while (true) {
				int var4 = var2.readUnsignedByte(255);
				if (var4 == 0) {
					return;
				}
				
				this.a(var2, -31549, var4);
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "d.G(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	public static void g(int unused) {
		try {
			D = null;
			E = null;
			cacheFile2 = null;
			S = null;
			G = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "d.A(" + unused + ')');
		}
	}
	
	static void b(int clientScriptId, int var1) {
		try {
			if (var1 >= -69) {
				a(-73, null, 123);
			}
			
			la var2 = (la) tf.e.b((byte) 117);
			if (var2 == null) {
				++J;
			} else {
				do {
					if (~(var2.clientScriptId >> 48 & 65535L) == ~((long) clientScriptId)) {
						var2.c(128);
					}
					
					var2 = (la) tf.e.a((byte) -33);
				} while (var2 != null);
				
				++J;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "d.D(" + clientScriptId + ',' + var1 + ')');
		}
	}
	
	static void h(int i) {
		try {
			if (~t.javaVendor.toLowerCase().indexOf("microsoft") != i) {
				m.x[221] = 43;
				m.x[223] = 28;
				m.x[219] = 42;
				m.x[186] = 57;
				m.x[220] = 74;
				m.x[222] = 59;
				m.x[192] = 58;
				m.x[190] = 72;
				m.x[188] = 71;
				m.x[187] = 27;
				m.x[191] = 73;
				m.x[189] = 26;
			}
			
			m.x[93] = 43;
			m.x[44] = 71;
			m.x[45] = 26;
			m.x[59] = 57;
			m.x[47] = 73;
			m.x[61] = 27;
			m.x[92] = 74;
			m.x[46] = 72;
			if (t.setFocusTraversalKeysEnabled == null) {
				m.x[192] = 58;
				m.x[222] = 59;
			}
			
			m.x[520] = 59;
			m.x[192] = 28;
			m.x[222] = 58;
			m.x[91] = 42;
			++R;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "d.H(" + i + ')');
		}
	}
	
	static void a(int var0, ob var1, int var2) {
		int var8 = client.anInt_wb;
		
		try {
			ob var3 = var1.f((byte) 34).a(120);
			++H;
			boolean var4 = false;
			int var6 = 0;
			if (var8 != 0 || ~var6 > ~se.b) {
				do {
					dg var7 = lg.j[si.cb[var6]];
					if (var7 != null && var7.Ic != null && var7.Ic.b((byte) -76, var3)) {
						var4 = true;
						qc.a(2, 1, var7.regionLocalX[0], var7.regionLocalY[0], (byte) 82, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
						if (~var0 == -2) {
							af.P.p(90, 12885);
							af.P.i(-118, si.cb[var6]);
							++ic.db;
							if (var8 == 0) {
								break;
							}
						}
						
						if (var0 == 4) {
							af.P.p(200, 12885);
							af.P.i(-120, si.cb[var6]);
							++uc.Z;
							if (var8 == 0) {
								break;
							}
						}
						
						if (~var0 != -7) {
							if (~var0 != -8) {
								break;
							}
							
							af.P.p(232, 12885);
							af.P.m(-125, si.cb[var6]);
							++li.anInt_m;
							if (var8 == 0) {
								break;
							}
						}
						
						af.P.p(37, 12885);
						af.P.k(-121, si.cb[var6]);
						++be.c;
						if (var8 == 0) {
							break;
						}
					}
					
					++var6;
				} while (~var6 > ~se.b);
			}
			
			if (!var4) {
				nb.a(0, (byte) -101, lb.T, wc.a(new ob[] {oe.n, var3}, -3));
			}
		} catch (RuntimeException var9) {
			throw bc.a(var9, "d.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	
	static void a(byte var0, ob var1) {
		try {
			++Q;
			if (sa.f != null) {
				int var2 = 0;
				long clientScriptId = var1.e(var0 + 19784);
				if (clientScriptId != 0L) {
					while (~var2 > ~sa.f.length && sa.f[var2].clientScriptId != clientScriptId) {
						++var2;
					}
					
					if (sa.f.length > var2 && sa.f[var2] != null) {
						++ka.y;
						af.P.p(145, 12885);
						af.P.writeLong(-128, sa.f[var2].clientScriptId);
						if (var0 != 6) {
							E = null;
						}
					}
				}
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "d.F(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	private void a(og og, int unused, int value) {
		try {
			++O;
			if (value == 1) {
				this.I = og.readShort(93);
				this.F = og.readUnsignedByte(255);
				this.K = og.readUnsignedByte(255);
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "d.E(" + (og != null ? "{...}" : "null") + ',' + unused + ',' + value + ')');
		}
	}
}
