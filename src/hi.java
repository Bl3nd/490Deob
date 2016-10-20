final class hi {
	
	static ob ob_a = rf.a(40, "me");
	static int b;
	static int c;
	static int d;
	static int e;
	static ob f;
	static int g;
	static ob loadedUpdateList2;
	int[][] i;
	static int j;
	static int k;
	private int l;
	static int anInt_m;
	static int n;
	static ob o = rf.a(40, "sch-Utteln:");
	private static ob p = rf.a(40, "Error loading your profile)3");
	static int q;
	static int anInt_r;
	static int s;
	static int t;
	static int u;
	private static ob v = rf.a(40, "Members only world");
	private int w;
	static int x;
	static ob y;
	static int z;
	static int A;
	private static ob loadedUpdateList;
	static ca cacheFile_4;
	private int D;
	static ob E;
	private int F;
	static int G;
	
	final void a(byte unused) {
		try {
			int i = 0;
			if (i >= this.w) {
				++g;
			} else {
				do {
					int var4 = 0;
					if (~this.D < ~var4) {
						do {
							if (~i != -1 && var4 != 0 && ~(this.w + -5) < ~i && ~var4 > ~(-5 + this.D)) {
								this.i[i][var4] = 16777216;
								++var4;
							} else {
								this.i[i][var4] = 16777215;
								++var4;
							}
						} while (~this.D < ~var4);
					}
					
					++i;
				} while (i < this.w);
				
				++g;
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "hi.N(" + unused + ')');
		}
	}
	
	public static void b(byte var0) {
		try {
			f = null;
			loadedUpdateList = null;
			v = null;
			o = null;
			E = null;
			loadedUpdateList2 = null;
			p = null;
			y = null;
			cacheFile_4 = null;
			ob_a = null;
			if (var0 > -58) {
				ob_a = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "hi.P(" + var0 + ')');
		}
	}
	
	static void a(int[] data, int unused, int unused2, int unused3, int unused4, int unused5, int unused6) {
		ba.a = 25;
		a.d = new boolean[8][32][ba.a + ba.a + 1][ba.a + ba.a + 1];
		ci.y = 0;
		ai.anInt_cb = 0;
		r.db = 512;
		lg.x = 334;
		va.j = 256;
		ad.T = 167;
		boolean[][][][] bools = new boolean[9][32][ba.a + ba.a + 3][ba.a + ba.a + 3];
		int i;
		int i1;
		int i2;
		int i3;
		int i4;
		int i5;
		for (int i6 = 128; i6 <= 384; i6 += 32) {
			for (i = 0; i < 2048; i += 64) {
				ke.kb = ec.W[i6];
				m.r = ec.L[i6];
				vf.p = ec.W[i];
				pb.anInt_d = ec.L[i];
				i1 = (i6 - 128) / 32;
				i2 = i / 64;
				for (i3 = -(ba.a + 1); i3 <= ba.a + 1; ++i3) {
					for (int i7 = -(ba.a + 1); i7 <= ba.a + 1; ++i7) {
						i4 = i3 * 128;
						i5 = i7 * 128;
						boolean flag = false;
						for (int i8 = -500; i8 <= 800; i8 += 128) {
							if (rc.a(i4, data[i1] + i8, i5, 3500)) {
								flag = true;
								break;
							}
						}
						
						bools[i1][i2][i3 + ba.a + 1][i7 + ba.a + 1] = flag;
					}
				}
			}
		}
		
		for (i = 0; i < 8; ++i) {
			for (i1 = 0; i1 < 32; ++i1) {
				for (i2 = -ba.a; i2 < ba.a; ++i2) {
					for (i3 = -ba.a; i3 < ba.a; ++i3) {
						boolean flag = false;
						label76:
						for (i4 = -1; i4 <= 1; ++i4) {
							for (i5 = -1; i5 <= 1; ++i5) {
								if (bools[i][i1][i2 + i4 + ba.a + 1][i3 + i5 + ba.a + 1]) {
									flag = true;
									break label76;
								}
								
								if (bools[i][(i1 + 1) % 31][i2 + i4 + ba.a + 1][i3 + i5 + ba.a + 1]) {
									flag = true;
									break label76;
								}
								
								if (bools[i + 1][i1][i2 + i4 + ba.a + 1][i3 + i5 + ba.a + 1]) {
									flag = true;
									break label76;
								}
								
								if (bools[i + 1][(i1 + 1) % 31][i2 + i4 + ba.a + 1][i3 + i5 + ba.a + 1]) {
									flag = true;
									break label76;
								}
							}
						}
						
						a.d[i][i1][i2 + ba.a][i3 + ba.a] = flag;
					}
				}
			}
		}
	}
	
	private void a(int var1, int var2, int var3, int var4) {
		try {
			this.i[var1][var3] = bd.b(this.i[var1][var3], ~var2);
			++x;
		} catch (RuntimeException var6) {
			throw bc.a(var6, "hi.F(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	final void a(byte var1, int var2, int var3) {
		try {
			++u;
			var2 -= this.F;
			if (var1 != 70) {
				this.w = 63;
			}
			
			var3 -= this.l;
			this.i[var2][var3] = ff.b(this.i[var2][var3], 262144);
		} catch (RuntimeException var5) {
			throw bc.a(var5, "hi.M(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	final void a(int var1, int var2, boolean var3, int var4, int var5, byte var6) {
		try {
			var4 -= this.l;
			var5 -= this.F;
			int var7 = 256;
			if (var3) {
				var7 += 131072;
			}
			
			++A;
			if (var6 >= -14) {
				this.a(-44, -59, true, -107, -37, (int) -61);
			}
			
			for (int var8 = var5; ~(var1 + var5) < ~var8; ++var8) {
				if (~var8 <= -1 && ~var8 > ~this.w) {
					for (int var9 = var4; ~(var2 + var4) < ~var9; ++var9) {
						if (var9 >= 0 && ~var9 > ~this.D) {
							this.a((byte) -86, var7, var8, var9);
						}
					}
				}
			}
			
		} catch (RuntimeException var10) {
			throw bc.a(var10, "hi.D(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}
	
	final void a(int var1, boolean var2, int var3, boolean var4, int var5, int var6, int var7) {
		int var11 = client.anInt_wb;
		
		try {
			var3 -= this.F;
			++q;
			int var9;
			if (~var7 == -2 || ~var7 == -4) {
				var9 = var5;
				var5 = var6;
				var6 = var9;
			}
			
			int var8 = 256;
			if (var2) {
				var8 += 131072;
			}
			
			var1 -= this.l;
			if (!var4) {
				k = 29;
			}
			
			var9 = var3;
			if (var11 != 0 || ~(var3 + var5) < ~var3) {
				do {
					if (~var9 > -1) {
						++var9;
					} else if (var9 >= this.w) {
						++var9;
					} else {
						int var10 = var1;
						if (var11 != 0) {
							if (var1 >= 0 && ~var1 > ~this.D) {
								this.a((int) var9, var8, var1, -11);
							}
							
							var10 = var1 + 1;
						}
						
						for (; var6 + var1 > var10; ++var10) {
							if (var10 >= 0 && ~var10 > ~this.D) {
								this.a((int) var9, var8, var10, -11);
							}
						}
						
						++var9;
					}
				} while (~(var3 + var5) < ~var9);
				
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "hi.G(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}
	
	final boolean a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		try {
			++anInt_r;
			if (var4 != 16816) {
				this.a(103, -42, false, -46, -86, (byte) -78);
			}
			
			if (~var5 == ~var1 && var3 == var7) {
				return true;
			} else {
				var5 -= this.F;
				var3 -= this.l;
				var1 -= this.F;
				var7 -= this.l;
				if (var6 == 6 || ~var6 == -8) {
					if (var6 == 7) {
						var2 = 3 & 2 + var2;
					}
					
					if (~var2 == -1) {
						if (var1 == 1 + var5 && ~var3 == ~var7 && (128 & this.i[var1][var3]) == 0) {
							return true;
						}
						
						if (~var1 == ~var5 && -1 + var7 == var3 && (this.i[var1][var3] & 2) == 0) {
							return true;
						}
					} else if (var2 != 1) {
						if (~var2 != -3) {
							if (var2 == 3) {
								if (1 + var5 == var1 && var3 == var7 && ~(128 & this.i[var1][var3]) == -1) {
									return true;
								}
								
								if (var1 == var5 && 1 + var7 == var3 && ~(this.i[var1][var3] & 32) == -1) {
									return true;
								}
							}
						} else {
							if (~(-1 + var5) == ~var1 && var3 == var7 && (this.i[var1][var3] & 8) == 0) {
								return true;
							}
							
							if (var5 == var1 && var3 == var7 - -1 && ~(32 & this.i[var1][var3]) == -1) {
								return true;
							}
						}
					} else {
						if (var5 - 1 == var1 && var7 == var3 && (this.i[var1][var3] & 8) == 0) {
							return true;
						}
						
						if (var5 == var1 && var7 - 1 == var3 && (this.i[var1][var3] & 2) == 0) {
							return true;
						}
					}
				}
				
				if (var6 == 8) {
					if (~var5 == ~var1 && ~var3 == ~(1 + var7) && (this.i[var1][var3] & 32) == 0) {
						return true;
					}
					
					if (var1 == var5 && var3 == var7 + -1 && (this.i[var1][var3] & 2) == 0) {
						return true;
					}
					
					if (~(var5 - 1) == ~var1 && ~var7 == ~var3 && ~(this.i[var1][var3] & 8) == -1) {
						return true;
					}
					
					if (var5 - -1 == var1 && ~var7 == ~var3 && ~(this.i[var1][var3] & 128) == -1) {
						return true;
					}
				}
				
				return false;
			}
		} catch (RuntimeException var9) {
			throw bc.a(var9, "hi.B(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}
	
	final boolean a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		try {
			++e;
			int var10 = var1 + var8 + var5;
			int var9 = var4 + var2 + -1;
			return var3 >= var4 && var3 <= var9 && ~var5 >= ~var6 && ~var10 <= ~var6 ? true : (~(-1 + var4) == ~var3 && ~var6 <= ~var5 && var6 <= var10 && ~(8 & this.i[var3 - this.F][-this.l + var6]) == -1 && (var7 & 8) == 0 ? true : (var9 + 1 == var3 && var5 <= var6 && ~var6 >= ~var10 && (this.i[var3 + -this.F][-this.l + var6] & 128) == 0 && (2 & var7) == 0 ? true : (~(-1 + var5) == ~var6 && var4 <= var3 && var9 >= var3 && (2 & this.i[var3 + -this.F][var6 - this.l]) == 0 && ~(4 & var7) == -1 ? true : 1 + var10 == var6 && ~var4 >= ~var3 && ~var9 <= ~var3 && (this.i[-this.F + var3][var6 + -this.l] & 32) == 0 && ~(1 & var7) == -1)));
		} catch (RuntimeException var11) {
			throw bc.a(var11, "hi.C(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ')');
		}
	}
	
	private void a(byte var1, int var2, int var3, int var4) {
		try {
			++d;
			this.i[var3][var4] = ff.b(this.i[var3][var4], var2);
			if (var1 > -42) {
				a((int[]) null, -122, -55, -72, 86, -36, 79);
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "hi.Q(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	static int a(int var0, ob var1) {
		try {
			++anInt_m;
			return var1.a(false) + 1;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "hi.I(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	final void a(int var1, int var2, boolean var3, int var4, int var5, int var6) {
		try {
			var4 -= this.F;
			++s;
			var5 -= this.l;
			if (var1 == 0) {
				if (var2 == 0) {
					this.a((byte) -120, 128, var4, var5);
					this.a((byte) -62, 8, -1 + var4, var5);
				}
				
				if (~var2 == -2) {
					this.a((byte) -76, 2, var4, var5);
					this.a((byte) -86, 32, var4, 1 + var5);
				}
				
				if (var2 == 2) {
					this.a((byte) -97, 8, var4, var5);
					this.a((byte) -126, 128, 1 + var4, var5);
				}
				
				if (var2 == 3) {
					this.a((byte) -76, 32, var4, var5);
					this.a((byte) -64, 2, var4, var5 + -1);
				}
			}
			
			if (~var1 == -2 || ~var1 == -4) {
				if (~var2 == -1) {
					this.a((byte) -125, 1, var4, var5);
					this.a((byte) -88, 16, -1 + var4, var5 - -1);
				}
				
				if (~var2 == -2) {
					this.a((byte) -76, 4, var4, var5);
					this.a((byte) -85, 64, var4 + 1, var5 - -1);
				}
				
				if (var2 == 2) {
					this.a((byte) -44, 16, var4, var5);
					this.a((byte) -105, 1, var4 + 1, -1 + var5);
				}
				
				if (~var2 == -4) {
					this.a((byte) -72, 64, var4, var5);
					this.a((byte) -46, 4, -1 + var4, var5 - 1);
				}
			}
			
			if (var6 != -4) {
				v = null;
			}
			
			if (~var1 == -3) {
				if (~var2 == -1) {
					this.a((byte) -110, 130, var4, var5);
					this.a((byte) -102, 8, var4 + -1, var5);
					this.a((byte) -127, 32, var4, var5 + 1);
				}
				
				if (var2 == 1) {
					this.a((byte) -92, 10, var4, var5);
					this.a((byte) -100, 32, var4, var5 + 1);
					this.a((byte) -126, 128, 1 + var4, var5);
				}
				
				if (~var2 == -3) {
					this.a((byte) -125, 40, var4, var5);
					this.a((byte) -76, 128, var4 + 1, var5);
					this.a((byte) -52, 2, var4, -1 + var5);
				}
				
				if (var2 == 3) {
					this.a((byte) -50, 160, var4, var5);
					this.a((byte) -73, 2, var4, var5 + -1);
					this.a((byte) -95, 8, -1 + var4, var5);
				}
			}
			
			if (var3) {
				if (~var1 == -1) {
					if (~var2 == -1) {
						this.a((byte) -66, 65536, var4, var5);
						this.a((byte) -50, 4096, -1 + var4, var5);
					}
					
					if (var2 == 1) {
						this.a((byte) -93, 1024, var4, var5);
						this.a((byte) -111, 16384, var4, 1 + var5);
					}
					
					if (var2 == 2) {
						this.a((byte) -74, 4096, var4, var5);
						this.a((byte) -113, 65536, 1 + var4, var5);
					}
					
					if (var2 == 3) {
						this.a((byte) -120, 16384, var4, var5);
						this.a((byte) -105, 1024, var4, -1 + var5);
					}
				}
				
				if (var1 == 1 || var1 == 3) {
					if (~var2 == -1) {
						this.a((byte) -43, 512, var4, var5);
						this.a((byte) -64, 8192, var4 + -1, var5 + 1);
					}
					
					if (var2 == 1) {
						this.a((byte) -59, 2048, var4, var5);
						this.a((byte) -124, '耀', var4 - -1, var5 - -1);
					}
					
					if (~var2 == -3) {
						this.a((byte) -115, 8192, var4, var5);
						this.a((byte) -64, 512, 1 + var4, -1 + var5);
					}
					
					if (~var2 == -4) {
						this.a((byte) -52, '耀', var4, var5);
						this.a((byte) -59, 2048, var4 + -1, -1 + var5);
					}
				}
				
				if (~var1 == -3) {
					if (var2 == 0) {
						this.a((byte) -106, 66560, var4, var5);
						this.a((byte) -100, 4096, -1 + var4, var5);
						this.a((byte) -124, 16384, var4, var5 - -1);
					}
					
					if (~var2 == -2) {
						this.a((byte) -82, 5120, var4, var5);
						this.a((byte) -53, 16384, var4, var5 + 1);
						this.a((byte) -125, 65536, 1 + var4, var5);
					}
					
					if (var2 == 2) {
						this.a((byte) -117, 20480, var4, var5);
						this.a((byte) -99, 65536, var4 - -1, var5);
						this.a((byte) -45, 1024, var4, -1 + var5);
					}
					
					if (~var2 == -4) {
						this.a((byte) -45, 81920, var4, var5);
						this.a((byte) -84, 1024, var4, var5 - 1);
						this.a((byte) -62, 4096, var4 - 1, var5);
					}
				}
			}
			
		} catch (RuntimeException var8) {
			throw bc.a(var8, "hi.K(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}
	
	final void a(int var1, int var2, int var3) {
		try {
			var2 -= this.F;
			++G;
			var3 -= this.l;
			this.i[var2][var3] = bd.b(this.i[var2][var3], -262145);
			if (var1 != 31260) {
				E = null;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "hi.A(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	final void a(int var1, int var2, boolean var3, int var4, boolean var5, int var6) {
		try {
			var1 -= this.l;
			if (!var3) {
				this.a((byte) 29);
			}
			
			++b;
			var6 -= this.F;
			if (~var4 == -1) {
				if (var2 == 0) {
					this.a((int) var6, 128, var1, 15);
					this.a((int) (var6 - 1), 8, var1, 37);
				}
				
				if (~var2 == -2) {
					this.a((int) var6, 2, var1, -27);
					this.a((int) var6, 32, 1 + var1, -101);
				}
				
				if (var2 == 2) {
					this.a((int) var6, 8, var1, 120);
					this.a((int) (var6 + 1), 128, var1, 126);
				}
				
				if (~var2 == -4) {
					this.a((int) var6, 32, var1, 122);
					this.a((int) var6, 2, var1 + -1, 115);
				}
			}
			
			if (~var4 == -2 || var4 == 3) {
				if (var2 == 0) {
					this.a((int) var6, 1, var1, -66);
					this.a((int) (-1 + var6), 16, 1 + var1, -127);
				}
				
				if (var2 == 1) {
					this.a((int) var6, 4, var1, 22);
					this.a((int) (1 + var6), 64, var1 + 1, -24);
				}
				
				if (~var2 == -3) {
					this.a((int) var6, 16, var1, -92);
					this.a((int) (var6 + 1), 1, var1 - 1, 123);
				}
				
				if (~var2 == -4) {
					this.a((int) var6, 64, var1, 25);
					this.a((int) (var6 + -1), 4, var1 + -1, 117);
				}
			}
			
			if (var4 == 2) {
				if (~var2 == -1) {
					this.a((int) var6, 130, var1, -99);
					this.a((int) (var6 + -1), 8, var1, -23);
					this.a((int) var6, 32, var1 - -1, -127);
				}
				
				if (~var2 == -2) {
					this.a((int) var6, 10, var1, 122);
					this.a((int) var6, 32, var1 - -1, -24);
					this.a((int) (1 + var6), 128, var1, -107);
				}
				
				if (var2 == 2) {
					this.a((int) var6, 40, var1, -83);
					this.a((int) (1 + var6), 128, var1, -103);
					this.a((int) var6, 2, var1 - 1, 116);
				}
				
				if (~var2 == -4) {
					this.a((int) var6, 160, var1, 121);
					this.a((int) var6, 2, var1 - 1, 127);
					this.a((int) (var6 - 1), 8, var1, -35);
				}
			}
			
			if (var5) {
				if (var4 == 0) {
					if (~var2 == -1) {
						this.a((int) var6, 65536, var1, -118);
						this.a((int) (-1 + var6), 4096, var1, 115);
					}
					
					if (~var2 == -2) {
						this.a((int) var6, 1024, var1, 122);
						this.a((int) var6, 16384, var1 + 1, -84);
					}
					
					if (var2 == 2) {
						this.a((int) var6, 4096, var1, 123);
						this.a((int) (1 + var6), 65536, var1, 124);
					}
					
					if (~var2 == -4) {
						this.a((int) var6, 16384, var1, 118);
						this.a((int) var6, 1024, var1 - 1, -114);
					}
				}
				
				if (var4 == 1 || var4 == 3) {
					if (var2 == 0) {
						this.a((int) var6, 512, var1, 125);
						this.a((int) (-1 + var6), 8192, var1 - -1, 123);
					}
					
					if (~var2 == -2) {
						this.a((int) var6, 2048, var1, -118);
						this.a((int) (var6 - -1), '耀', var1 + 1, 121);
					}
					
					if (var2 == 2) {
						this.a((int) var6, 8192, var1, 125);
						this.a((int) (var6 + 1), 512, -1 + var1, -54);
					}
					
					if (~var2 == -4) {
						this.a((int) var6, '耀', var1, -46);
						this.a((int) (var6 + -1), 2048, -1 + var1, -76);
					}
				}
				
				if (var4 == 2) {
					if (~var2 == -1) {
						this.a((int) var6, 66560, var1, 119);
						this.a((int) (-1 + var6), 4096, var1, 121);
						this.a((int) var6, 16384, 1 + var1, 119);
					}
					
					if (var2 == 1) {
						this.a((int) var6, 5120, var1, 118);
						this.a((int) var6, 16384, 1 + var1, -18);
						this.a((int) (var6 - -1), 65536, var1, -5);
					}
					
					if (var2 == 2) {
						this.a((int) var6, 20480, var1, -115);
						this.a((int) (var6 + 1), 65536, var1, 117);
						this.a((int) var6, 1024, -1 + var1, 114);
					}
					
					if (~var2 == -4) {
						this.a((int) var6, 81920, var1, -43);
						this.a((int) var6, 1024, var1 + -1, 113);
						this.a((int) (-1 + var6), 4096, var1, 34);
					}
				}
			}
			
		} catch (RuntimeException var8) {
			throw bc.a(var8, "hi.J(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}
	
	final void a(int var1, boolean var2, int var3) {
		try {
			if (!var2) {
				var3 -= this.F;
				++t;
				var1 -= this.l;
				this.i[var3][var1] = ff.b(this.i[var3][var1], 2097152);
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "hi.L(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, int var4) {
		try {
			if (dd.a <= var0 && ~var0 >= ~na.anInt_m) {
				var2 = kg.a(gh.R, ng.u, true, var2);
				var3 = kg.a(gh.R, ng.u, true, var3);
				fh.a(var0, var3, true, var2, var4);
			}
			
			++z;
			if (var1 <= 111) {
				y = null;
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "hi.H(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	final boolean a(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		try {
			++c;
			if (var1 == var4 && var2 == var6) {
				return true;
			} else {
				var2 -= this.l;
				if (!var7) {
					loadedUpdateList2 = null;
				}
				
				var1 -= this.F;
				var6 -= this.l;
				var4 -= this.F;
				if (var3 == 0) {
					if (~var5 == -1) {
						if (~var4 == ~(-1 + var1) && var2 == var6) {
							return true;
						}
						
						if (var1 == var4 && ~var2 == ~(1 + var6) && ~(19661088 & this.i[var4][var2]) == -1) {
							return true;
						}
						
						if (var4 == var1 && ~var2 == ~(-1 + var6) && (this.i[var4][var2] & 19661058) == 0) {
							return true;
						}
					} else if (var5 != 1) {
						if (var5 == 2) {
							if (~(var1 - -1) == ~var4 && ~var6 == ~var2) {
								return true;
							}
							
							if (var4 == var1 && ~var2 == ~(1 + var6) && (this.i[var4][var2] & 19661088) == 0) {
								return true;
							}
							
							if (~var1 == ~var4 && var6 - 1 == var2 && (this.i[var4][var2] & 19661058) == 0) {
								return true;
							}
						} else if (~var5 == -4) {
							if (var1 == var4 && var2 == var6 - 1) {
								return true;
							}
							
							if (~(-1 + var1) == ~var4 && var6 == var2 && ~(19661064 & this.i[var4][var2]) == -1) {
								return true;
							}
							
							if (~(var1 + 1) == ~var4 && ~var2 == ~var6 && (19661184 & this.i[var4][var2]) == 0) {
								return true;
							}
						}
					} else {
						if (~var4 == ~var1 && var6 - -1 == var2) {
							return true;
						}
						
						if (var4 == -1 + var1 && var2 == var6 && (this.i[var4][var2] & 19661064) == 0) {
							return true;
						}
						
						if (var4 == 1 + var1 && var6 == var2 && ~(this.i[var4][var2] & 19661184) == -1) {
							return true;
						}
					}
				}
				
				if (var3 == 2) {
					if (~var5 == -1) {
						if (~(var1 + -1) == ~var4 && var6 == var2) {
							return true;
						}
						
						if (var1 == var4 && 1 + var6 == var2) {
							return true;
						}
						
						if (var4 == var1 + 1 && var2 == var6 && (this.i[var4][var2] & 19661184) == 0) {
							return true;
						}
						
						if (~var1 == ~var4 && -1 + var6 == var2 && ~(this.i[var4][var2] & 19661058) == -1) {
							return true;
						}
					} else if (var5 == 1) {
						if (var4 == -1 + var1 && var6 == var2 && ~(this.i[var4][var2] & 19661064) == -1) {
							return true;
						}
						
						if (~var1 == ~var4 && var2 == var6 + 1) {
							return true;
						}
						
						if (~var4 == ~(1 + var1) && ~var2 == ~var6) {
							return true;
						}
						
						if (var4 == var1 && var2 == -1 + var6 && ~(this.i[var4][var2] & 19661058) == -1) {
							return true;
						}
					} else if (var5 == 2) {
						if (var4 == -1 + var1 && var2 == var6 && (this.i[var4][var2] & 19661064) == 0) {
							return true;
						}
						
						if (~var1 == ~var4 && ~var2 == ~(1 + var6) && ~(19661088 & this.i[var4][var2]) == -1) {
							return true;
						}
						
						if (var4 == var1 - -1 && var2 == var6) {
							return true;
						}
						
						if (var4 == var1 && var2 == -1 + var6) {
							return true;
						}
					} else if (~var5 == -4) {
						if (~var4 == ~(var1 + -1) && var2 == var6) {
							return true;
						}
						
						if (var1 == var4 && ~(1 + var6) == ~var2 && ~(19661088 & this.i[var4][var2]) == -1) {
							return true;
						}
						
						if (~var4 == ~(1 + var1) && ~var2 == ~var6 && (19661184 & this.i[var4][var2]) == 0) {
							return true;
						}
						
						if (var4 == var1 && var2 == var6 - 1) {
							return true;
						}
					}
				}
				
				if (var3 == 9) {
					if (var1 == var4 && var6 + 1 == var2 && (32 & this.i[var4][var2]) == 0) {
						return true;
					}
					
					if (var1 == var4 && ~(-1 + var6) == ~var2 && ~(2 & this.i[var4][var2]) == -1) {
						return true;
					}
					
					if (var4 == -1 + var1 && ~var2 == ~var6 && ~(this.i[var4][var2] & 8) == -1) {
						return true;
					}
					
					if (var4 == var1 + 1 && var6 == var2 && ~(128 & this.i[var4][var2]) == -1) {
						return true;
					}
				}
				
				return false;
			}
		} catch (RuntimeException var9) {
			throw bc.a(var9, "hi.E(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}
	
	hi(int chunk1, int chunk2) {
		try {
			this.F = 0;
			this.l = 0;
			this.w = chunk1;
			this.D = chunk2;
			this.i = new int[this.w][this.D];
			this.a((byte) -107);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "hi.<init>(" + chunk1 + ',' + chunk2 + ')');
		}
	}
	
	static {
		y = p;
		loadedUpdateList = rf.a(40, "Loaded update list");
		f = v;
		loadedUpdateList2 = loadedUpdateList;
		E = rf.a(40, "Bitte versuchen Sie es in ");
	}
}
