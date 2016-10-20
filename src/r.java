class r extends af {
	
	static int[] R;
	int S;
	static int T;
	static int U;
	static int V;
	static int W;
	static long X;
	static int Y;
	int[] Z;
	int ab;
	static int bb;
	static int cb;
	static int db;
	static int eb = 0;
	private int fb = -1;
	static int gb;
	static int hb;
	static int runesValue = -1;
	
	final void a(boolean var1) {
		try {
			++W;
			super.a(var1);
			this.Z = null;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "r.T(" + var1 + ')');
		}
	}
	
	final int e(int unused) {
		try {
			++bb;
			return unused != -24089 ? 77 : this.fb;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "r.U(" + unused + ')');
		}
	}
	
	int[][] b(int var1, byte var2) {
		int var12 = client.anInt_wb;
		
		try {
			++gb;
			int[][] var4 = super.ve_s.a(var1, (byte) 45);
			if (super.ve_s.u && this.i(26239)) {
				int[] var5 = var4[0];
				int[] var6 = var4[1];
				int var8 = (this.ab != fi.q ? var1 * this.ab / fi.q : var1) * this.S;
				int[] var7 = var4[2];
				int var9;
				int var10;
				if (~lh.eb != ~this.S) {
					var9 = 0;
					if (var12 != 0 || lh.eb > var9) {
						do {
							var10 = this.S * var9 / lh.eb;
							int var11 = this.Z[var8 - -var10];
							var7[var9] = bd.b(var11, (int) 255) << 4;
							var6[var9] = bd.b(var11 >> 4, (int) 4080);
							var5[var9] = bd.b(4080, (int) (var11 >> 12));
							++var9;
						} while (lh.eb > var9);
					}
					
					if (var12 == 0) {
						return var4;
					}
				}
				
				var9 = 0;
				if (var12 != 0 || ~var9 > ~lh.eb) {
					do {
						var10 = this.Z[var8++];
						var7[var9] = bd.b(var10, (int) 255) << 4;
						var6[var9] = bd.b(var10 >> 4, (int) 4080);
						var5[var9] = bd.b(16711680, var10) >> 12;
						++var9;
					} while (~var9 > ~lh.eb);
				}
			}
			
			return var4;
		} catch (RuntimeException var13) {
			throw bc.a(var13, "r.G(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void a(int var1, int var2, og var3) {
		try {
			if (var1 == 0) {
				this.fb = var3.readShort(86);
			}
			
			++U;
			int var4 = 104 % ((66 - var2) / 57);
		} catch (RuntimeException var5) {
			throw bc.a(var5, "r.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	private static kc a(int var0, pe var1, int var2) {
		try {
			if (var2 <= 26) {
				eb = -126;
			}
			
			++V;
			return !ba.a((byte) 98, var1, var0) ? null : ug.c((byte) -118);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "r.V(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	
	public r() {
		super(0, false);
	}
	
	static void a(int var0, long var1) {
		int var6 = client.anInt_wb;
		
		try {
			++T;
			if (~var1 != -1L) {
				if (jg.s >= 100) {
					nb.a(0, (byte) -112, lb.T, client.ob_kb);
				} else {
					ob var3 = ug.a(var1, 0).a((int) 117);
					int var4 = var0;
					if (var6 != 0 || ~var0 > ~jg.s) {
						do {
							if (pe.db[var4] == var1) {
								nb.a(0, (byte) -96, lb.T, wc.a(new ob[] {var3, h.zb}, -3));
								return;
							}
							
							++var4;
						} while (~var4 > ~jg.s);
					}
					
					int var5 = 0;
					if (var6 != 0) {
						if (var1 == nb.hc[var5]) {
							nb.a(0, (byte) -104, lb.T, wc.a(new ob[] {tb.pleaseRemove2, var3, ki.t}, var0 + -3));
							return;
						}
						
						++var5;
					}
					
					while (var5 < ii.o) {
						if (var1 == nb.hc[var5]) {
							nb.a(0, (byte) -104, lb.T, wc.a(new ob[] {tb.pleaseRemove2, var3, ki.t}, var0 + -3));
							return;
						}
						
						++var5;
					}
					
					if (var3.a((byte) 28, le.T.Ic)) {
						nb.a(0, (byte) -107, lb.T, ac.youCantAddYourselfIgnoreList2);
					} else {
						++gf.o;
						pe.db[jg.s] = var1;
						qg.i[jg.s++] = ug.a(var1, 0);
						a.k = re.D;
						af.P.p(10, 12885);
						af.P.writeLong((int) -111, var1);
					}
				}
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "r.S(" + var0 + ',' + var1 + ')');
		}
	}
	
	public static void b(byte var0) {
		try {
			R = null;
			if (var0 != 106) {
				eb = 21;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "r.R(" + var0 + ')');
		}
	}
	
	final boolean i(int var1) {
		try {
			++hb;
			if (this.Z != null) {
				return true;
			} else if (var1 != 26239) {
				return true;
			} else if (~this.fb <= -1) {
				kc var2 = a(this.fb, ki.v, 91);
				var2.h();
				this.ab = var2.imageHeight;
				this.S = var2.imageWidth;
				this.Z = var2.pixels;
				return true;
			} else {
				return false;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "r.W(" + var1 + ')');
		}
	}
}
