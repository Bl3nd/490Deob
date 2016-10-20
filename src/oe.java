final class oe {
	
	private static ob a = rf.a(40, "Unable to find ");
	private pe b;
	static int c;
	static int d;
	static ra e;
	static int f;
	static hc g;
	static int h;
	static int i;
	static int j;
	private pe k;
	static int anInt_l;
	static int m;
	static ob n;
	private md o = new md(256);
	static int p;
	private md q = new md(256);
	static int r;
	static ob s;
	private static ob t;
	static ob u;
	
	public static void a(int var0) {
		try {
			n = null;
			g = null;
			s = null;
			t = null;
			u = null;
			e = null;
			a = null;
			if (var0 != -5079) {
				s = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "oe.H(" + var0 + ')');
		}
	}
	
	static kc a(pe var0, int var1, int var2, int var3) {
		try {
			++m;
			if (var2 > -101) {
				e = null;
			}
			
			return !fb.a(-103, var1, var0, var3) ? null : ug.c((byte) -44);
		} catch (RuntimeException var5) {
			throw bc.a(var5, "oe.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	final oa a(int[] var1, byte var2, int var3) {
		try {
			++i;
			if (~this.k.getLength((int) -3853) == -2) {
				return this.a(var1, var3, false, 0);
			} else if (~this.k.b(var3, (byte) -59) == -2) {
				return this.a(var1, 0, false, var3);
			} else {
				int var4 = -122 % ((var2 - 1) / 61);
				throw new RuntimeException();
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "oe.F(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	private oa a(int[] var1, int var2, boolean var3, int var4) {
		try {
			if (var3) {
				n = null;
			}
			
			++d;
			int var5 = var2 ^ ((var4 & -1342173185) << 4 | var4 >>> 12);
			var5 |= var4 << 16;
			long var6 = 4294967296L ^ (long) var5;
			oa var8 = (oa) this.q.a(var6, 22346);
			if (var8 != null) {
				return var8;
			} else if (var1 != null && var1[0] <= 0) {
				return null;
			} else {
				cg var9 = (cg) this.o.a(var6, 22346);
				if (var9 == null) {
					var9 = cg.a(this.k, var4, var2);
					if (var9 == null) {
						return null;
					}
					
					this.o.a(var9, var6, true);
				}
				
				var8 = var9.a(var1);
				if (var8 == null) {
					return null;
				} else {
					var9.c(128);
					this.q.a(var8, var6, true);
					return var8;
				}
			}
		} catch (RuntimeException var10) {
			var10.printStackTrace();
			throw bc.a(var10, "oe.B(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	static void a(int clientScriptId, qe var1, int var2, byte[] var3) {
		try {
			++p;
			qc var4 = new qc();
			var4.clientScriptId = (long) clientScriptId;
			var4.bytes_r = var3;
			var4.o = var1;
			var4.t = 0;
			synchronized (l.pi_c) {
				l.pi_c.a(0, var4);
			}
			
			rg.d(-9748);
		} catch (RuntimeException var10) {
			throw bc.a(var10, "oe.A(" + clientScriptId + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	final oa b(int[] var1, byte var2, int var3) {
		try {
			++h;
			if (this.b.getLength(-3853) == 1) {
				return this.a(true, var3, var1, 0);
			} else if (this.b.b(var3, (byte) -59) == 1) {
				return this.a(true, 0, var1, var3);
			} else {
				if (var2 > -34) {
					this.b(null, (byte) -54, -124);
				}
				
				throw new RuntimeException();
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "oe.D(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	private oa a(boolean var1, int var2, int[] var3, int var4) {
		try {
			int var5 = (var4 >>> 12 | '\ufff1' & var4 << 4) ^ var2;
			var5 |= var4 << 16;
			long var6 = (long) var5;
			++f;
			oa var8 = (oa) this.q.a(var6, 22346);
			if (var8 != null) {
				return var8;
			} else if (var3 != null && ~var3[0] >= -1) {
				return null;
			} else {
				eg var9 = eg.a(this.b, var4, var2);
				if (var9 == null) {
					return null;
				} else {
					var8 = var9.a();
					this.q.a(var8, var6, var1);
					if (var3 != null) {
						var3[0] -= var8.t.length;
					}
					
					return var8;
				}
			}
		} catch (RuntimeException var10) {
			throw bc.a(var10, "oe.E(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ')');
		}
	}
	
	static int a(int var0, int var1) {
		try {
			++j;
			if (var0 >= -43) {
				a(-9, (qe) null, -70, (byte[]) null);
			}
			
			return var1 & 255;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "oe.G(" + var0 + ',' + var1 + ')');
		}
	}
	
	oe(pe var1, pe var2) {
		try {
			this.k = var2;
			this.b = var1;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "oe.<init>(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	static {
		n = a;
		g = new hc();
		t = rf.a(40, "The server is being updated)3");
		s = rf.a(40, "<col=ffff00>*V");
		u = t;
	}
}
