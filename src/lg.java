import java.awt.Component;

class lg {
	
	static int anInt_a;
	static int b;
	static int c;
	static int d = 0;
	static int e;
	static int f;
	static int g;
	static ph h;
	static int i;
	static dg[] j = new dg[2048];
	static int k;
	static boolean displayFPS = false;
	static int m;
	static int n;
	static int o;
	static int[][][] ints_p = new int[4][13][13];
	int[] q;
	static int r;
	private int s = 32;
	static int t;
	private long u = a.a((byte) -61);
	static ob sl_flags = rf.a(40, "sl_flags");
	static int w;
	static int x;
	private sg y;
	private sg[] z = new sg[8];
	private long A = 0L;
	private int B = 0;
	private boolean C = true;
	private int D = 0;
	private sg[] E = new sg[8];
	private long F = 0L;
	int G;
	private int H = 0;
	private int I = 0;
	private int J;
	int K;
	
	int a() throws Exception {
		try {
			++m;
			return this.K;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "lg.E(" + ')');
		}
	}
	
	private void a(int[] var1, int var2) {
		int var3 = var2;
		if (be.forceSend) {
			var3 = var2 << 1;
		}
		
		p.a(var1, 0, var3);
		this.H -= var2;
		if (this.y != null && this.H <= 0) {
			this.H += ki.sampleRate >> 4;
			qh.a(this.y, (byte) 108);
			this.a(-3, this.y.a(), this.y);
			int var4 = 0;
			int var5 = 255;
			
			int var7;
			label103:
			for (int var6 = 7; var5 != 0; --var6) {
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}
				
				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						sg var10 = null;
						sg var11 = this.E[var7];
						
						label97:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label97;
								}
								
								ti var12 = var11.o;
								if (var12 != null && var12.o > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.r;
								} else {
									var11.p = true;
									int var13 = var11.b();
									var4 += var13;
									if (var12 != null) {
										var12.o += var13;
									}
									
									if (var4 >= this.s) {
										break label103;
									}
									
									sg var14 = var11.c();
									if (var14 != null) {
										for (int var15 = var11.q; var14 != null; var14 = var11.d()) {
											this.a(-3, var15 * var14.a() >> 8, var14);
										}
									}
									
									sg var18 = var11.r;
									var11.r = null;
									if (var10 == null) {
										this.E[var7] = var18;
									} else {
										var10.r = var18;
									}
									
									if (var18 == null) {
										this.z[var7] = var10;
									}
									
									var11 = var18;
								}
							}
						}
					}
					
					var7 += 4;
					++var8;
				}
			}
			
			for (var7 = 0; var7 < 8; ++var7) {
				sg var16 = this.E[var7];
				
				sg var17;
				for (this.E[var7] = this.z[var7] = null; var16 != null; var16 = var17) {
					var17 = var16.r;
					var16.r = null;
				}
			}
		}
		
		if (this.H < 0) {
			this.H = 0;
		}
		
		if (this.y != null) {
			this.y.a(var1, 0, var2);
		}
		
		this.u = a.a((byte) -74);
	}
	
	public static void a(int var0) {
		try {
			ints_p = null;
			j = null;
			if (var0 == 0) {
				sl_flags = null;
				h = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "lg.I(" + var0 + ')');
		}
	}
	
	void b() throws Exception {
		try {
			++i;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "lg.A(" + ')');
		}
	}
	
	final synchronized void a(sg class_sg, int unused) {
		try {
			++n;
			this.y = class_sg;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "lg.L(" + (class_sg != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
	
	private void a(int var1, int var2, sg var3) {
		try {
			++anInt_a;
			int var4 = var2 >> 5;
			sg var5 = this.z[var4];
			if (var1 != -3) {
				ints_p = null;
			}
			
			label25:
			{
				if (var5 != null) {
					var5.r = var3;
					if (client.anInt_wb == 0) {
						break label25;
					}
				}
				
				this.E[var4] = var3;
			}
			
			this.z[var4] = var3;
			var3.q = var2;
		} catch (RuntimeException var6) {
			throw bc.a(var6, "lg.J(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	final void b(int var1) {
		try {
			++k;
			this.C = true;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "lg.Q(" + var1 + ')');
		}
	}
	
	final synchronized void a(byte var1) {
		try {
			++t;
			this.C = true;
			if (var1 == -47) {
				try {
					this.d();
				} catch (Exception var3) {
					this.c();
					this.F = 2000L + a.a((byte) -96);
				}
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "lg.P(" + var1 + ')');
		}
	}
	
	private void a(byte var1, int var2) {
		try {
			this.H -= var2;
			if (var1 < 72) {
				sl_flags = null;
			}
			
			if (this.H < 0) {
				this.H = 0;
			}
			
			if (this.y != null) {
				this.y.d(var2);
			}
			
			++g;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "lg.O(" + var1 + ',' + var2 + ')');
		}
	}
	
	void c() {
		try {
			++e;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "lg.F(" + ')');
		}
	}
	
	void a(Component component) throws Exception {
		try {
			++r;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "lg.C(" + (component != null ? "{...}" : "null") + ')');
		}
	}
	
	void c(int var1) throws Exception {
		try {
			++o;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "lg.D(" + var1 + ')');
		}
	}
	
	final synchronized void d(int var1) {
		int var7 = client.anInt_wb;
		
		try {
			++w;
			if (this.q != null) {
				long var2 = a.a((byte) -123);
				
				try {
					if (this.F != 0L) {
						if (this.F > var2) {
							return;
						}
						
						this.c(this.K);
						this.C = true;
						this.F = 0L;
					}
					
					int var4 = this.a();
					int var6 = -94 / ((var1 - 25) / 56);
					if (this.D < this.I + -var4) {
						this.D = this.I + -var4;
					}
					
					int var5 = this.G + this.J;
					if (256 + var5 > 16384) {
						var5 = 16128;
					}
					
					label81:
					{
						if (~(var5 + 256) < ~this.K) {
							this.K += 1024;
							if (~this.K < -16385) {
								this.K = 16384;
							}
							
							this.c();
							this.c(this.K);
							if (256 + var5 > this.K) {
								var5 = this.K + -256;
								this.J = var5 + -this.G;
							}
							
							this.C = true;
							var4 = 0;
							if (/*var7 == 0 && */var5 <= var4) {
								break label81;
							}
						} else if (var5 <= var4) {
							break label81;
						}
						
						do {
							var4 += 256;
							this.a((int[]) this.q, 256);
							this.b();
						} while (var5 > var4);
					}
					
					if (this.A < var2) {
						label108:
						{
							if (this.C) {
								this.C = false;
							}
							
							if (this.D == 0 && ~this.B == -1) {
								this.c();
								this.F = 2000L + var2;
								return;
							}
							
							this.J = Math.min(this.B, this.D);
							this.B = this.D;
						}
						
						this.D = 0;
						this.A = var2 + 2000L;
					}
					
					this.I = var4;
				} catch (Exception e) {
					e.printStackTrace();
					this.c();
					this.F = var2 - -2000L;
				}
				
				try {
					if (~(this.u - -500000L) > ~var2) {
						var2 = this.u;
						if (var7 != 0) {
							this.a((byte) 74, 256);
							this.u += (long) (256000 / ki.sampleRate);
						}
					}
					
					while (this.u - -5000L < var2) {
						this.a((byte) 74, 256);
						this.u += (long) (256000 / ki.sampleRate);
					}
					
				} catch (Exception var9) {
					this.u = var2;
				}
			}
		} catch (RuntimeException var10) {
			throw bc.a(var10, "lg.R(" + var1 + ')');
		}
	}
	
	void d() throws Exception {
		try {
			++b;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "lg.B(" + ')');
		}
	}
	
	final synchronized void b(byte var1) {
		int var4 = client.anInt_wb;
		
		try {
			++f;
			if (var1 == -25) {
				if (l.p != null) {
					boolean var2 = true;
					int var3 = 0;
					if (var4 != 0 || ~var3 > -3) {
						do {
							if (this == l.p.i[var3]) {
								l.p.i[var3] = null;
							}
							
							if (l.p.i[var3] != null) {
								var2 = false;
							}
							
							++var3;
						} while (~var3 > -3);
					}
					
					if (var2) {
						l.p.k = true;
						if (var4 != 0) {
							jd.a(50L, (byte) -8);
						}
						
						while (l.p.m) {
							jd.a(50L, (byte) -8);
						}
						
						l.p = null;
					}
				}
				
				this.c();
				this.q = null;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "lg.H(" + var1 + ')');
		}
	}
	
	static void a(hi[] var0, int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9) {
		int var26 = client.anInt_wb;
		
		try {
			og var10 = new og(var7);
			int var11 = -1;
			
			do {
				int var12 = var10.r(-2);
				if (var12 == 0) {
					break;
				}
				
				int var13 = 0;
				var11 += var12;
				
				while (true) {
					int var14 = var10.r(-2);
					if (var14 == 0) {
						break;
					}
					
					var13 += var14 + -1;
					int var15 = 63 & var13;
					int var16 = 63 & var13 >> 6;
					int var17 = var13 >> 12;
					int var18 = var10.readUnsignedByte(255);
					int var19 = var18 >> 2;
					int var20 = var18 & 3;
					if (var5 == var17 && ~var16 <= ~var2 && 8 + var2 > var16 && var6 <= var15 && ~(8 + var6) < ~var15) {
						fc var21 = rf.b(-14098, var11);
						int var22 = var4 + qg.a(var16 & 7, var3, var15 & 7, var20, var21.Gb, var21.Mb, -3);
						int var23 = ii.a(var21.Mb, 7 & var15, var20, var3, var21.Gb, (byte) -127, var16 & 7) + var1;
						if (~var22 < -1 && ~var23 < -1 && var22 < 103 && var23 < 103) {
							int var24 = var8;
							hi var25 = null;
							if (~(qe.r[1][var22][var23] & 2) == -3) {
								var24 = var8 - 1;
							}
							
							if (~var24 <= -1) {
								var25 = var0[var24];
							}
							
							af.a(3 & var20 - -var3, var22, (byte) 70, var11, var8, ag.forceSend, var23, var8, var19, true, var25);
							if (var26 != 0) {
								break;
							}
						}
					}
				}
			} while (var26 == 0);
			
			if (var9 <= 38) {
				displayFPS = true;
			}
			
			++c;
		} catch (RuntimeException var27) {
			throw bc.a(var27, "lg.K(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + (var7 != null ? "{...}" : "null") + ',' + var8 + ',' + var9 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3) {
		pd var4 = nb.oc[var0][var1][var2];
		if (var4 != null) {
			nb.oc[var0][var1][var2].F = var3;
		}
	}
}
