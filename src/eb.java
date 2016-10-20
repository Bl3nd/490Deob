final class eb extends af {
	
	static int R;
	static og S = new og(new byte[5000]);
	static int T;
	static int U;
	private int V;
	static int W;
	static int X;
	static ob Y = rf.a(40, "auf der Hautpseite)3");
	private int Z;
	private int ab = -1;
	static int bb;
	private int[] cb;
	static int titlebuttonValue;
	
	final int[][] b(int var1, byte var2) {
		int var12 = client.anInt_wb;
		
		try {
			++bb;
			int[][] var3 = super.ve_s.a(var1, (byte) 45);
			if (super.ve_s.u && this.i(-97)) {
				int var5 = this.Z * (~this.V == ~fi.q ? var1 : var1 * this.V / fi.q);
				int[] var6 = var3[0];
				int[] var8 = var3[2];
				int[] var7 = var3[1];
				int var9;
				int var10;
				if (~lh.eb != ~this.Z) {
					var9 = 0;
					if (var12 != 0 || ~lh.eb < ~var9) {
						do {
							var10 = var9 * this.Z / lh.eb;
							int var11 = this.cb[var5 - -var10];
							var8[var9] = bd.b(var11 << 4, (int) 4080);
							var7[var9] = bd.b('\uff00', (int) var11) >> 4;
							var6[var9] = bd.b(4080, (int) (var11 >> 12));
							++var9;
						} while (~lh.eb < ~var9);
					}
					
					if (var12 == 0) {
						return var3;
					}
				}
				
				var9 = 0;
				if (var12 != 0 || var9 < lh.eb) {
					do {
						var10 = this.cb[var5++];
						var8[var9] = bd.b(255, (int) var10) << 4;
						var7[var9] = bd.b(var10, (int) '\uff00') >> 4;
						var6[var9] = bd.b(4080, (int) (var10 >> 12));
						++var9;
					} while (var9 < lh.eb);
				}
			}
			
			return var3;
		} catch (RuntimeException var13) {
			throw bc.a(var13, "eb.G(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void a(int var1, int var2, og var3) {
		try {
			++U;
			if (var1 == 0) {
				this.ab = var3.readShort(46);
			}
			
		} catch (RuntimeException var5) {
			throw bc.a(var5, "eb.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	private boolean i(int var1) {
		try {
			++T;
			if (this.cb != null) {
				return true;
			} else if (~this.ab <= -1) {
				int var3 = lh.eb;
				int var4 = fi.q;
				int var5 = !e.of_h.a(this.ab, (int) 18872) ? 128 : 64;
				this.cb = e.of_h.a(this.ab, (byte) -115);
				this.V = var5;
				this.Z = var5;
				ed.a(var3, var4, -99);
				return this.cb != null;
			} else {
				return false;
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "eb.CA(" + var1 + ')');
		}
	}
	
	public static void b(boolean var0) {
		try {
			if (!var0) {
				b(false);
			}
			
			S = null;
			Y = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "eb.AA(" + var0 + ')');
		}
	}
	
	final int d(int unused) {
		try {
			++W;
			return unused < 50 ? 37 : this.ab;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "eb.DA(" + unused + ')');
		}
	}
	
	static kc[] c(boolean var0) {
		int var7 = client.anInt_wb;
		
		try {
			if (var0) {
				c(true);
			}
			
			kc[] var1 = new kc[th.X];
			++X;
			int var2 = 0;
			if (var7 == 0 && var2 >= th.X) {
				ii.e(-54);
				return var1;
			} else {
				do {
					kc var3 = new kc();
					var3.width = kd.S;
					var3.height = tg.b;
					var3.N = ci.A[var2];
					var3.P = ci.x[var2];
					var3.imageWidth = ub.g[var2];
					var3.imageHeight = le.db[var2];
					int var4 = var3.imageHeight * var3.imageWidth;
					byte[] var5 = wg.V[var2];
					var3.pixels = new int[var4];
					int var6 = 0;
					if (var7 != 0 || var4 > var6) {
						do {
							var3.pixels[var6] = be.h[bd.b(var5[var6], (int) 255)];
							++var6;
						} while (var4 > var6);
					}
					
					var1[var2] = var3;
					++var2;
				} while (var2 < th.X);
				
				ii.e(-54);
				return var1;
			}
		} catch (RuntimeException var8) {
			throw bc.a(var8, "eb.BA(" + var0 + ')');
		}
	}
	
	public eb() {
		super(0, false);
	}
	
	final void a(boolean var1) {
		try {
			super.a(var1);
			++R;
			this.cb = null;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "eb.T(" + var1 + ')');
		}
	}
}
