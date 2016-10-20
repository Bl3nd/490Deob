final class jc extends af {
	
	static int R;
	static boolean S = false;
	static int T;
	static fa[] U;
	static int V;
	private int W;
	private int X;
	static int Y;
	static vc Z = new vc(500);
	private int ab;
	static int[] bb = new int[1000];
	static int cb;
	static ob db = rf.a(40, " loggt sich ein)3");
	static int eb;
	static int anInt_fb = 1;
	static pe cacheFile21;
	static int hb;
	static int anInt_ib = 0;
	
	private jc(int var1) {
		super(0, false);
		
		try {
			this.c(10863, var1);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "jc.<init>(" + var1 + ')');
		}
	}
	
	final void a(int var1, int var2, og var3) {
		try {
			if (~var1 == -1) {
				this.c(10863, var3.readUnsignedMedInt(-120));
			}
			
			++cb;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "jc.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	public static void i(int var0) {
		try {
			db = null;
			Z = null;
			U = null;
			bb = null;
			cacheFile21 = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "jc.H(" + var0 + ')');
		}
	}
	
	public jc() {
		this(0);
	}
	
	private void c(int var1, int var2) {
		try {
			this.X = (var2 & 255) << 4;
			++V;
			if (var1 == 10863) {
				this.ab = var2 >> 4 & 4080;
				this.W = var2 >> 12 & 4080;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "jc.I(" + var1 + ',' + var2 + ')');
		}
	}
	
	static void j(int var0) {
		try {
			if (var0 == 0) {
				hf.F = null;
				ee.g = null;
				++Y;
				od.ab = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "jc.C(" + var0 + ')');
		}
	}
	
	final int[][] b(int var1, byte var2) {
		int var9 = client.anInt_wb;
		
		try {
			++R;
			int[][] var4 = super.ve_s.a(var1, (byte) 45);
			if (super.ve_s.u) {
				int[] var6 = var4[1];
				int[] var7 = var4[2];
				int[] var5 = var4[0];
				int var8 = 0;
				if (var9 != 0 || ~var8 > ~lh.eb) {
					do {
						var5[var8] = this.W;
						var6[var8] = this.ab;
						var7[var8] = this.X;
						++var8;
					} while (~var8 > ~lh.eb);
				}
			}
			
			return var4;
		} catch (RuntimeException var10) {
			throw bc.a(var10, "jc.G(" + var1 + ',' + var2 + ')');
		}
	}
	
	static boolean k(int var0) {
		try {
			if (var0 != 15734) {
				return true;
			} else {
				++T;
				return ~uc.jb != -1 ? true : ie.u.e(127);
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "jc.A(" + var0 + ')');
		}
	}
	
	static boolean a(int var0, int var1, int var2, int var3) {
		if (!bd.b(var0, var1, var2)) {
			return false;
		} else {
			int var4 = var1 << 7;
			int var5 = var2 << 7;
			int var6 = la.v[var0][var1][var2] - 1;
			int var7 = var6 - 120;
			int var8 = var6 - 230;
			int var9 = var6 - 238;
			if (var3 < 16) {
				if (var3 == 1) {
					if (var4 > bg.b) {
						if (!ve.a(var4, var6, var5)) {
							return false;
						}
						
						if (!ve.a(var4, var6, var5 + 128)) {
							return false;
						}
					}
					
					if (var0 > 0) {
						if (!ve.a(var4, var7, var5)) {
							return false;
						}
						
						if (!ve.a(var4, var7, var5 + 128)) {
							return false;
						}
					}
					
					if (!ve.a(var4, var8, var5)) {
						return false;
					}
					
					if (!ve.a(var4, var8, var5 + 128)) {
						return false;
					}
					
					return true;
				}
				
				if (var3 == 2) {
					if (var5 < dd.m) {
						if (!ve.a(var4, var6, var5 + 128)) {
							return false;
						}
						
						if (!ve.a(var4 + 128, var6, var5 + 128)) {
							return false;
						}
					}
					
					if (var0 > 0) {
						if (!ve.a(var4, var7, var5 + 128)) {
							return false;
						}
						
						if (!ve.a(var4 + 128, var7, var5 + 128)) {
							return false;
						}
					}
					
					if (!ve.a(var4, var8, var5 + 128)) {
						return false;
					}
					
					if (!ve.a(var4 + 128, var8, var5 + 128)) {
						return false;
					}
					
					return true;
				}
				
				if (var3 == 4) {
					if (var4 < bg.b) {
						if (!ve.a(var4 + 128, var6, var5)) {
							return false;
						}
						
						if (!ve.a(var4 + 128, var6, var5 + 128)) {
							return false;
						}
					}
					
					if (var0 > 0) {
						if (!ve.a(var4 + 128, var7, var5)) {
							return false;
						}
						
						if (!ve.a(var4 + 128, var7, var5 + 128)) {
							return false;
						}
					}
					
					if (!ve.a(var4 + 128, var8, var5)) {
						return false;
					}
					
					if (!ve.a(var4 + 128, var8, var5 + 128)) {
						return false;
					}
					
					return true;
				}
				
				if (var3 == 8) {
					if (var5 > dd.m) {
						if (!ve.a(var4, var6, var5)) {
							return false;
						}
						
						if (!ve.a(var4 + 128, var6, var5)) {
							return false;
						}
					}
					
					if (var0 > 0) {
						if (!ve.a(var4, var7, var5)) {
							return false;
						}
						
						if (!ve.a(var4 + 128, var7, var5)) {
							return false;
						}
					}
					
					if (!ve.a(var4, var8, var5)) {
						return false;
					}
					
					if (!ve.a(var4 + 128, var8, var5)) {
						return false;
					}
					
					return true;
				}
			}
			
			return !ve.a(var4 + 64, var9, var5 + 64) ? false : (var3 == 16 ? ve.a(var4, var8, var5 + 128) : (var3 == 32 ? ve.a(var4 + 128, var8, var5 + 128) : (var3 == 64 ? ve.a(var4 + 128, var8, var5) : (var3 == 128 ? ve.a(var4, var8, var5) : true))));
		}
	}
	
	static void l(int var0) {
		int var3 = client.anInt_wb;
		
		try {
			++eb;
			if (!le.X) {
				ca.Nb[0] = ea.cancel2;
				wf.e[0] = lb.T;
				si.S = 1;
				ph.i[0] = 1006;
			}
			
			if (bg.h != -1) {
				hf.b(bg.h, -126);
			}
			
			int var1 = 0;
			if (var3 != 0) {
				if (ob.bb[var1]) {
					wf.f[var1] = true;
				}
				
				tf.q[var1] = ob.bb[var1];
				ob.bb[var1] = false;
				++var1;
			}
			
			while (var1 < e.anInt_d) {
				if (ob.bb[var1]) {
					wf.f[var1] = true;
				}
				
				tf.q[var1] = ob.bb[var1];
				ob.bb[var1] = false;
				++var1;
			}
			
			ob.U = -1;
			ag.e = bi.f;
			ib.f = null;
			rf.y = -1;
			if (var0 <= -23) {
				if (bg.h != -1) {
					e.anInt_d = 0;
					be.a(0, -1, -58, 0, 765, bg.h, 503, 0, 0);
				}
				
				label63:
				{
					oi.c();
					fb.j(-630);
					if (!le.X) {
						if (ob.U == -1) {
							break label63;
						}
						
						nc.a(rf.y, false, ob.U);
						if (var3 == 0) {
							break label63;
						}
					}
					
					ef.i(31970);
				}
				
				if (~rg.anInt_v == -4) {
					int var2 = 0;
					if (var3 != 0 || var2 < e.anInt_d) {
						do {
							if (tf.q[var2]) {
								oi.c(df.v[var2], be.f[var2], l.o[var2], ki.r[var2], 16711935, 128);
								if (var3 == 0) {
									++var2;
									continue;
								}
							}
							
							if (wf.f[var2]) {
								oi.c(df.v[var2], be.f[var2], l.o[var2], ki.r[var2], 16711680, 128);
							}
							
							++var2;
						} while (var2 < e.anInt_d);
					}
				}
				
				bh.a(le.T.coordY, 0, gf.G, le.T.coordX, dc.k);
				dc.k = 0;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "jc.D(" + var0 + ')');
		}
	}
}
