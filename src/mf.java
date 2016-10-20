final class mf extends af {
	
	private int[] R = new int[3];
	static int S = 0;
	private int T = 3216;
	static int U;
	private int V = 4096;
	static int W;
	static int X;
	static int Y;
	static int Z;
	static int ab;
	private int bb = 3216;
	static vc cb = new vc(100);
	static ob toCreateANewAccountYouNeedTo2;
	static kc[] eb;
	static int fb;
	static i i_gb;
	private static ob toCreateANewAccountYouNeedTo = rf.a(40, "To create a new account you need to");
	static ob ib;
	static ob jb = rf.a(40, "Keine Antwort vom Server)3");
	private static ob kb;
	static ca cacheFile_5;
	static lg mb;
	static int[] nb;
	
	static ob a(int var0, long var1) {
		try {
			++W;
			if (var0 != 28860) {
				a(14, -55L);
			}
			
			return fh.a(var1, 10, false, -15271);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "mf.C(" + var0 + ',' + var1 + ')');
		}
	}
	
	private void b(boolean var1) {
		try {
			++X;
			double var2 = Math.cos((double) ((float) this.bb / 4096.0F));
			this.R[0] = (int) (Math.sin((double) ((float) this.T / 4096.0F)) * var2 * 4096.0D);
			this.R[1] = (int) (Math.cos((double) ((float) this.T / 4096.0F)) * var2 * 4096.0D);
			this.R[2] = (int) (4096.0D * Math.sin((double) ((float) this.bb / 4096.0F)));
			if (var1) {
				b((byte) -103);
			}
			
			int var5 = this.R[1] * this.R[1] >> 12;
			int var4 = this.R[0] * this.R[0] >> 12;
			int var6 = this.R[2] * this.R[2] >> 12;
			int var7 = (int) (Math.sqrt((double) (var5 + var4 + var6 >> 12)) * 4096.0D);
			if (~var7 != -1) {
				this.R[2] = (this.R[2] << 12) / var7;
				this.R[0] = (this.R[0] << 12) / var7;
				this.R[1] = (this.R[1] << 12) / var7;
			}
		} catch (RuntimeException var8) {
			throw bc.a(var8, "mf.E(" + var1 + ')');
		}
	}
	
	final int[] a(byte var1, int var2) {
		int var17 = client.anInt_wb;
		
		try {
			++fb;
			int[] var3 = super.nd_v.a(var2, 12);
			if (super.nd_v.n) {
				int var7 = qd.E * this.V >> 12;
				int[] var8 = this.c(-1 + var2 & fc.jb, 0, 62);
				int[] var9 = this.c(var2, 0, 127);
				int[] var10 = this.c(1 + var2 & fc.jb, 0, 67);
				int var11 = 0;
				if (var17 != 0 || var11 < lh.eb) {
					do {
						int var13 = (var9[kg.b & var11 - 1] - var9[kg.b & var11 + 1]) * var7 >> 12;
						int var12 = (var10[var11] + -var8[var11]) * var7 >> 12;
						int var15 = var12 >> 4;
						if (~var15 > -1) {
							var15 = -var15;
						}
						
						if (~var15 < -256) {
							var15 = 255;
						}
						
						int var14 = var13 >> 4;
						if (~var14 > -1) {
							var14 = -var14;
						}
						
						if (var14 > 255) {
							var14 = 255;
						}
						
						int var16 = gb.db[var14 - -(var15 * (1 + var15) >> 1)] & 255;
						int var5 = var16 * var12 >> 8;
						int var6 = var16 * 4096 >> 8;
						var6 = var6 * this.R[2] >> 12;
						int var4 = var16 * var13 >> 8;
						var4 = var4 * this.R[0] >> 12;
						var5 = var5 * this.R[1] >> 12;
						var3[var11] = var6 + var4 - -var5;
						++var11;
					} while (var11 < lh.eb);
				}
			}
			
			if (var1 < 13) {
				eb = null;
			}
			
			return var3;
		} catch (RuntimeException var18) {
			throw bc.a(var18, "mf.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void a(int var1, int var2, og var3) {
		try {
			++Y;
			if (~var1 != -1) {
				if (~var1 == -2) {
					this.T = var3.readShort(37);
					return;
				}
				
				if (~var1 != -3) {
					return;
				}
				
				if (client.anInt_wb == 0) {
					this.bb = var3.readShort(123);
					return;
				}
			}
			
			this.V = var3.readShort(70);
		} catch (RuntimeException var6) {
			throw bc.a(var6, "mf.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	final void f(int var1) {
		try {
			++ab;
			if (var1 != 1) {
				nb = null;
			}
			
			this.b(false);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "mf.L(" + var1 + ')');
		}
	}
	
	static void a(int var0, ob var1, ob var2, ob var3, int var4) {
		try {
			++U;
			int var5 = 99;
			if (var0 != -11840) {
				eb = null;
			}
			
			while (~var5 < -1) {
				ld.ints_v[var5] = ld.ints_v[var5 + -1];
				jg.b[var5] = jg.b[-1 + var5];
				wf.l[var5] = wf.l[-1 + var5];
				client.V[var5] = client.V[var5 - 1];
				--var5;
			}
			
			ld.ints_v[0] = var4;
			jg.b[0] = var1;
			pc.h = re.D;
			wf.l[0] = var3;
			++ki.u;
			client.V[0] = var2;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "mf.A(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ')');
		}
	}
	
	public static void b(byte var0) {
		try {
			jb = null;
			eb = null;
			kb = null;
			i_gb = null;
			cb = null;
			toCreateANewAccountYouNeedTo2 = null;
			toCreateANewAccountYouNeedTo = null;
			ib = null;
			cacheFile_5 = null;
			if (var0 >= 2) {
				mb = null;
				nb = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "mf.D(" + var0 + ')');
		}
	}
	
	public mf() {
		super(1, true);
	}
	
	static {
		toCreateANewAccountYouNeedTo2 = toCreateANewAccountYouNeedTo;
		kb = rf.a(40, "Please reload this page)3");
		nb = new int[2048];
		ib = kb;
	}
}
