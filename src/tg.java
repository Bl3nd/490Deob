final class tg {
	
	static int a = 0;
	static int b;
	static int c;
	private int d;
	private static ob e = rf.a(40, " ");
	static int f;
	static ob g = rf.a(40, " loggt sich aus)3");
	static int h;
	static int i;
	static int j;
	static ob k;
	static int l;
	static int anInt_m;
	static int n;
	private int[][] o;
	private int p;
	static int q;
	static ob r;
	
	final byte[] a(byte[] var1, int var2) {
		int var12 = client.anInt_wb;
		
		try {
			if (var2 != 32767) {
				return null;
			} else {
				++j;
				if (this.o != null) {
					int var3 = (int) ((long) var1.length * (long) this.d / (long) this.p) + 14;
					int[] var4 = new int[var3];
					int var6 = 0;
					int var5 = 0;
					int var7 = 0;
					if (var12 != 0 || var7 < var1.length) {
						do {
							byte var8 = var1[var7];
							int[] var9 = this.o[var6];
							int var10 = 0;
							if (var12 != 0 || ~var10 > -15) {
								do {
									var4[var5 + var10] += var9[var10] * var8;
									++var10;
								} while (~var10 > -15);
							}
							
							var6 += this.d;
							int var11 = var6 / this.p;
							var6 -= this.p * var11;
							var5 += var11;
							++var7;
						} while (var7 < var1.length);
					}
					
					var1 = new byte[var3];
					int var14 = 0;
					if (var12 != 0 || ~var14 > ~var3) {
						do {
							int var15 = '耀' + var4[var14] >> 16;
							if (var15 < -128) {
								var1[var14] = -128;
								if (var12 == 0) {
									++var14;
									continue;
								}
							}
							
							if (~var15 >= -128) {
								var1[var14] = (byte) var15;
								if (var12 != 0) {
									var1[var14] = 127;
									++var14;
								} else {
									++var14;
								}
							} else {
								var1[var14] = 127;
								++var14;
							}
						} while (~var14 > ~var3);
					}
				}
				
				return var1;
			}
		} catch (RuntimeException var13) {
			throw bc.a(var13, "tg.G(" + "{...}" + ',' + var2 + ')');
		}
	}
	
	final int a(int var1, int var2) {
		try {
			if (var1 != 6) {
				return 40;
			} else {
				++f;
				if (this.o != null) {
					var2 = (int) ((long) this.d * (long) var2 / (long) this.p);
				}
				
				return var2;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "tg.D(" + var1 + ',' + var2 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, hi var4, int var5, int var6) {
		try {
			++l;
			long var7 = 0L;
			if (~var5 == -1) {
				var7 = wg.d(var1, var3, var6);
			}
			
			if (var0 == 1177) {
				boolean var10 = false;
				if (var5 == 1) {
					var7 = ld.b(var1, var3, var6);
				}
				
				if (~var5 == -3) {
					var7 = di.a(var1, var3, var6);
				}
				
				boolean var11 = false;
				if (var5 == 3) {
					var7 = rh.a(var1, var3, var6);
				}
				
				boolean var9 = true;
				if (var7 != 0L) {
					int var15 = 31 & (int) var7 >> 14;
					int var16 = 3 & (int) var7 >> 20;
					int var14 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
					fc var12 = rf.b(-14098, var14);
					if (~var5 == -1) {
						ei.b(var1, var3, var6);
						if (~var12.ub != -1) {
							var4.a(var6, var16, true, var15, var12.V, var3);
						}
					}
					
					if (~var5 == -2) {
						ja.a(var1, var3, var6);
					}
					
					if (var5 == 2) {
						me.a(var1, var3, var6);
						if (~var12.ub != -1 && var3 - -var12.Mb < 104 && var6 + var12.Mb < 104 && ~(var12.Gb + var3) > -105 && ~(var12.Gb + var6) > -105) {
							var4.a(var6, var12.V, var3, true, var12.Mb, var12.Gb, var16);
						}
					}
					
					if (~var5 == -4) {
						ji.a(var1, var3, var6);
						if (var12.ub == 1) {
							var4.a(var0 ^ 32389, var3, var6);
							return;
						}
					}
				}
				
			}
		} catch (RuntimeException var13) {
			throw bc.a(var13, "tg.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ',' + var6 + ')');
		}
	}
	
	final int b(int var1, int var2) {
		try {
			if (var2 != 6) {
				return 36;
			} else {
				++anInt_m;
				if (this.o != null) {
					var1 = (int) ((long) var1 * (long) this.d / (long) this.p) + 6;
				}
				
				return var1;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "tg.A(" + var1 + ',' + var2 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var12 = client.anInt_wb;
		
		try {
			++n;
			if (var5 < 20) {
				a(1);
			}
			
			gf var10 = null;
			gf var11 = (gf) vg.X.a((byte) -9);
			if (var12 != 0 || var11 != null) {
				do {
					if (~var11.v == ~var8 && ~var1 == ~var11.E && var11.J == var7 && var11.M == var4) {
						var10 = var11;
						break;
					}
					
					var11 = (gf) vg.X.b((byte) 91);
				} while (var11 != null);
			}
			
			if (var10 == null) {
				var10 = new gf();
				var10.v = var8;
				var10.J = var7;
				var10.M = var4;
				var10.E = var1;
				sh.a(8, var10);
				vg.X.a(0, var10);
			}
			
			var10.K = var2;
			var10.N = var3;
			var10.r = var0;
			var10.w = var9;
			var10.q = var6;
		} catch (RuntimeException var13) {
			throw bc.a(var13, "tg.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
		}
	}
	
	public static void a(int var0) {
		try {
			e = null;
			if (var0 != -1) {
				e = null;
			}
			
			g = null;
			k = null;
			r = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "tg.B(" + var0 + ')');
		}
	}
	
	static void a(int i, pe cacheFile6, boolean unused, int i1, int unused2, int unused3, int unused4) {
		try {
			ca.Pb = 2;
			uc.jb = 1;
			sc.m = false;
			fb.S = 0;
			++tg.i;
			fc.ab = i1;
			m.cacheFile6 = cacheFile6;
			sa.g = i;
		} catch (RuntimeException e) {
			throw bc.a(e, "tg.C(" + i + ',' + (cacheFile6 != null ? "{...}" : "null") + ',' + unused + ',' + i1
					+ ',' + unused2 + ',' + unused3 + ',' + unused4 + ')');
		}
	}
	
	tg(int var1, int sampleRate) {
		try {
			if (~sampleRate != ~var1) {
				int i = client.a(490, sampleRate, var1);
				sampleRate /= i;
				this.d = sampleRate;
				var1 /= i;
				this.p = var1;
				this.o = new int[var1][14];
				int i1 = 0;
				if (~i1 > ~var1) {
					do {
						double var6 = (double) i1 / (double) var1 + 6.0D;
						int[] var5 = this.o[i1];
						int var8 = (int) Math.floor(-7.0D + var6 + 1.0D);
						double var10 = (double) sampleRate / (double) var1;
						int var9 = (int) Math.ceil(7.0D + var6);
						if (~var8 > -1) {
							var8 = 0;
						}
						
						label53:
						{
							if (~var9 < -15) {
								var9 = 14;
								if (var9 <= var8) {
									break label53;
								}
							} else if (var9 <= var8) {
								break label53;
							}
							
							do {
								double var12 = 3.141592653589793D * ((double) var8 - var6);
								double var14 = var10;
								if (var12 >= -1.0E-4D) {
									if (var12 > 1.0E-4D) {
										var14 = var10 * (Math.sin(var12) / var12);
									}
								} else {
									var14 = var10 * (Math.sin(var12) / var12);
								}
								
								var14 *= Math.cos(((double) var8 - var6) * 0.2243994752564138D) * 0.46D + 0.54D;
								var5[var8] = (int) Math.floor(0.5D + var14 * 65536.0D);
								++var8;
							} while (var9 > var8);
						}
						
						++i1;
					} while (~i1 > ~var1);
					
				}
			}
		} catch (RuntimeException var17) {
			throw bc.a(var17, "tg.<init>(" + var1 + ',' + sampleRate + ')');
		}
	}
	
	static {
		k = e;
		q = 0;
		r = rf.a(40, " zuerst von Ihrer Ignorieren)2Liste(Q");
	}
}
