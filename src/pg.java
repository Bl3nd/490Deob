final class pg extends af {
	
	private int R = '耀';
	static int S;
	static int T;
	static int U;
	static int V;
	static int W;
	static int X;
	static int Y;
	static ae packetBuffer = new ae(5000);
	static int ab;
	static ob scrollbar = rf.a(40, "scrollbar");
	static int cb = -1;
	
	final void f(int var1) {
		try {
			++V;
			fc.f(var1);
			if (var1 != 1) {
				d(-111, (byte) -34);
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "pg.L(" + var1 + ')');
		}
	}
	
	final int[][] b(int var1, byte var2) {
		int var18 = client.anInt_wb;
		
		try {
			int[][] var4 = super.ve_s.a(var1, (byte) 45);
			if (super.ve_s.u) {
				int[] var5 = this.c(var1, 1, 36);
				int[] var6 = this.c(var1, 2, 76);
				int[] var8 = var4[1];
				int[] var7 = var4[0];
				int[] var9 = var4[2];
				int var10 = 0;
				if (var18 != 0 || ~lh.eb < ~var10) {
					do {
						int var12 = this.R * var6[var10] >> 12;
						int var11 = 255 & var5[var10] * 255 >> 12;
						int var14 = rc.f[var11] * var12 >> 12;
						int var13 = var12 * nf.Y[var11] >> 12;
						int var15 = kg.b & (var13 >> 12) + var10;
						int var16 = fc.jb & (var14 >> 12) + var1;
						int[][] var17 = this.b(var16, 86, 0);
						var7[var10] = var17[0][var15];
						var8[var10] = var17[1][var15];
						var9[var10] = var17[2][var15];
						++var10;
					} while (~lh.eb < ~var10);
				}
			}
			
			++S;
			return var4;
		} catch (RuntimeException var19) {
			throw bc.a(var19, "pg.G(" + var1 + ',' + var2 + ')');
		}
	}
	
	public static void b(boolean var0) {
		try {
			scrollbar = null;
			packetBuffer = null;
			if (!var0) {
				b(false);
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "pg.E(" + var0 + ')');
		}
	}
	
	static void c(boolean var0) {
		try {
			synchronized (vc.g) {
				++ni.ab;
				mf.S = fi.l;
				og.o = ff.bb;
				re.u = client.anInt_qb;
				qe.k = ra.Eb;
				ia.eb = ja.b;
				tf.m = md.h;
				dg.wc = hf.aLong_e;
				if (var0) {
					cb = 89;
				}
				
				ra.Eb = 0;
			}
			
			++X;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "pg.D(" + var0 + ')');
		}
	}
	
	static void setGameState(int state, byte unused) {
		try {
			++ab;
			if (qb.gameState != state) {
				if (qb.gameState == 0) {
					jc.j(0);
				}
				
				if (state == 20 || state == 40) {
					e.e = 0;
					rc.c = 0;
					ce.F = 0;
				}
				
				if (~state != -21 && ~state != -41 && lg.h != null) {
					lg.h.b(-2);
					lg.h = null;
				}
				
				if (qb.gameState == 25) {
					cc.K = 0;
					sc.i = 1;
					ph.k = 0;
					re.p = 1;
					hh.P = 0;
				}
				
				if (state == 5 || state == 10 || state == 20) {
					dc.a(-6692, l.cacheFile_8, rg.canvas_t, fh.cacheFile_10);
					if (client.anInt_wb == 0) {
						//break label55;
					}
				} else {
					
					ig.a(2);
				}
				
				qb.gameState = state;
				System.out.println(qb.gameState + " state: " + state);
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "pg.C(" + state + ',' + unused + ')');
		}
	}
	
	final void a(int var1, int var2, og var3) {
		int var5 = client.anInt_wb;
		
		try {
			label39:
			{
				label34:
				{
					++W;
					if (var1 != 0) {
						if (~var1 != -2) {
							break label39;
						}
						
						if (var5 == 0) {
							break label34;
						}
					}
					
					this.R = var3.readShort(127) << 4;
					if (var5 == 0) {
						break label39;
					}
				}
				
				super.u = var3.readUnsignedByte(255) == 1;
			}
			
		} catch (RuntimeException var6) {
			throw bc.a(var6, "pg.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	final int[] a(byte var1, int var2) {
		int var14 = client.anInt_wb;
		
		try {
			if (var1 < 13) {
				return null;
			} else {
				int[] var3 = super.nd_v.a(var2, 12);
				++Y;
				if (super.nd_v.n) {
					int[] var4 = this.c(var2, 1, 66);
					int[] var5 = this.c(var2, 2, 90);
					int var6 = 0;
					if (var14 != 0 || ~lh.eb < ~var6) {
						do {
							int var7 = (var4[var6] & 4094) >> 4;
							int var8 = this.R * var5[var6] >> 12;
							int var9 = nf.Y[var7] * var8 >> 12;
							int var10 = rc.f[var7] * var8 >> 12;
							int var12 = (var10 >> 12) + var2 & fc.jb;
							int var11 = var6 - -(var9 >> 12) & kg.b;
							int[] var13 = this.c(var12, 0, 108);
							var3[var6] = var13[var11];
							++var6;
						} while (~lh.eb < ~var6);
					}
				}
				
				return var3;
			}
		} catch (RuntimeException var15) {
			throw bc.a(var15, "pg.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	public pg() {
		super(3, false);
	}
	
	static boolean d(int var0, byte var1) {
		try {
			if (var1 != 42) {
				return false;
			} else {
				++U;
				return (1 & var0) != 0;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "pg.A(" + var0 + ',' + var1 + ')');
		}
	}
}
