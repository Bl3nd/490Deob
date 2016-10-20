final class jg {
	
	static md a;
	static ob[] b = new ob[100];
	static ob c;
	int anInt_d;
	private static ob e = rf.a(40, "Examine");
	int f;
	static int g;
	static int h;
	int i;
	static int j;
	int k;
	static int l;
	static int m;
	private byte n;
	static int o;
	int p;
	static ob q;
	static int r;
	static int s;
	static ca cacheFile_12;
	
	static void a(int var0, int var1, int var2, int var3) {
		int var6 = client.anInt_wb;
		
		try {
			int var4 = 0;
			int var5;
			if (var6 != 0) {
				var5 = 0;
				if (var6 != 0) {
					d.D[var0][var1 + var4][var3 - -var5] = 0;
					++var5;
				}
			} else {
				if (var4 >= 8) {
					if (var1 > 0) {
						var5 = 1;
						if (var6 != 0 || ~var5 > -9) {
							do {
								d.D[var0][var1][var5 + var3] = d.D[var0][var1 - 1][var3 + var5];
								++var5;
							} while (~var5 > -9);
						}
					}
					
					if (~var3 < -1) {
						var5 = 1;
						if (var6 != 0 || var5 < 8) {
							do {
								d.D[var0][var1 - -var5][var3] = d.D[var0][var1 - -var5][var3 - 1];
								++var5;
							} while (var5 < 8);
						}
					}
					
					if (var2 != 8) {
						return;
					}
					
					label196:
					{
						if (~var1 >= -1 || d.D[var0][var1 + -1][var3] == 0) {
							if (~var3 < -1 && d.D[var0][var1][-1 + var3] != 0) {
								d.D[var0][var1][var3] = d.D[var0][var1][-1 + var3];
								if (var6 == 0) {
									break label196;
								}
							}
							
							if (~var1 >= -1 || ~var3 >= -1 || ~d.D[var0][-1 + var1][var3 - 1] == -1) {
								break label196;
							}
							
							d.D[var0][var1][var3] = d.D[var0][var1 - 1][var3 + -1];
							if (var6 == 0) {
								break label196;
							}
						}
						
						d.D[var0][var1][var3] = d.D[var0][-1 + var1][var3];
					}
					
					++m;
					return;
				}
				
				var5 = 0;
				if (var6 != 0) {
					d.D[var0][var1 + var4][var3 - -var5] = 0;
					++var5;
				}
			}
			
			while (true) {
				while (~var5 > -9) {
					d.D[var0][var1 + var4][var3 - -var5] = 0;
					++var5;
				}
				
				++var4;
				if (var4 >= 8) {
					if (var1 > 0) {
						var5 = 1;
						if (var6 != 0 || ~var5 > -9) {
							do {
								d.D[var0][var1][var5 + var3] = d.D[var0][var1 - 1][var3 + var5];
								++var5;
							} while (~var5 > -9);
						}
					}
					
					if (~var3 < -1) {
						var5 = 1;
						if (var6 != 0 || var5 < 8) {
							do {
								d.D[var0][var1 - -var5][var3] = d.D[var0][var1 - -var5][var3 - 1];
								++var5;
							} while (var5 < 8);
						}
					}
					
					if (var2 != 8) {
						return;
					}
					
					label197:
					{
						if (~var1 >= -1 || d.D[var0][var1 + -1][var3] == 0) {
							if (~var3 < -1 && d.D[var0][var1][-1 + var3] != 0) {
								d.D[var0][var1][var3] = d.D[var0][var1][-1 + var3];
								if (var6 == 0) {
									break label197;
								}
							}
							
							if (~var1 >= -1 || ~var3 >= -1 || ~d.D[var0][-1 + var1][var3 - 1] == -1) {
								break label197;
							}
							
							d.D[var0][var1][var3] = d.D[var0][var1 - 1][var3 + -1];
							if (var6 == 0) {
								break label197;
							}
						}
						
						d.D[var0][var1][var3] = d.D[var0][-1 + var1][var3];
					}
					
					++m;
					return;
				}
				
				var5 = 0;
				if (var6 != 0) {
					d.D[var0][var1 + var4][var3 - -var5] = 0;
					++var5;
				}
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "jg.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	static ei a(byte unused, int id) {
		try {
			ei var2 = (ei) df.s.a((long) id, (byte) -111);
			++o;
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = gg.cacheFile19.a((byte) 2, oe.a(-111, id), sb.b((byte) 33, id));
				var2 = new ei();
				var2.jb = id;
				if (var3 != null) {
					var2.a(new og(var3), -1);
				}
				
				var2.h(0);
				if (~var2.ab != 0) {
					var2.a(1, a((byte) -61, var2.ab), a((byte) -61, var2.T));
				}
				
				if (!ef.members && var2.xb) {
					var2.name = dd.membersObject2;
					var2.groundOption = null;
					var2.Hb = 0;
					var2.inventoryOption = null;
					var2.F = false;
				}
				
				df.s.a(var2, (byte) -29, (long) id);
				return var2;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "jg.B(" + unused + ',' + id + ')');
		}
	}
	
	static void a(byte var0) {
		try {
			if (var0 != 26) {
				s = -33;
			}
			
			if (rg.z != null) {
				rg.z.b(-2);
			}
			
			++j;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "jg.E(" + var0 + ')');
		}
	}
	
	public static void a(int var0) {
		try {
			a = null;
			if (var0 != 21528) {
				a((int) 63);
			}
			
			e = null;
			b = null;
			cacheFile_12 = null;
			q = null;
			c = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "jg.F(" + var0 + ')');
		}
	}
	
	final int b(byte var1) {
		try {
			if (var1 > -57) {
				this.anInt_d = -40;
			}
			
			++l;
			return this.n & 7;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "jg.D(" + var1 + ')');
		}
	}
	
	static void a(byte var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		try {
			if (var0 == -19) {
				++r;
				if (gf.a(true, var7)) {
					da.a(var6, var3, (byte) -116, var2, -1, var1, var5, wg.cb[var7], var4);
				}
			}
		} catch (RuntimeException var9) {
			throw bc.a(var9, "jg.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}
	
	final int b(int var1) {
		try {
			if (var1 < 39) {
				a((byte) 106);
			}
			
			++g;
			return ~(this.n & 8) != -9 ? 0 : 1;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "jg.G(" + var1 + ')');
		}
	}
	
	public jg() {}
	
	jg(og var1) {
		try {
			this.n = var1.readByte(1064893128);
			this.anInt_d = var1.readShort(66);
			this.i = var1.readInt(1029109968);
			this.f = var1.readInt(1029109968);
			this.p = var1.readInt(1029109968);
			this.k = var1.readInt(1029109968);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "jg.<init>(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	static {
		c = e;
		h = 0;
		s = 0;
		q = rf.a(40, "Bitte starten Sie eine Mitgliedschaft");
		a = new md(32);
	}
}
