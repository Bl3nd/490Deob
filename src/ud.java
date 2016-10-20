abstract class ud extends aa {
	
	int O = -1;
	int P = -1;
	int Q;
	int R = -1;
	static int S;
	int T = 0;
	int U;
	static int V;
	int W;
	static ob X;
	int Y = -1;
	int Z = 0;
	int ab = 32;
	private static ob bb = rf.a(40, "To play on this world move to a free area first)3");
	int cb = 0;
	static int db;
	int eb;
	static int fb;
	int gb;
	int hb = -32768;
	int ib;
	int jb = -1;
	int[] kb = new int[4];
	int anInt_lb = 0;
	int mb = -1;
	int nb;
	int anInt_ob = 0;
	int coordY;
	static int qb;
	int rb = 0;
	int sb = 0;
	int tb = -1;
	int ub = -1;
	int vb = -1;
	int wb = 0;
	int xb = 0;
	int yb;
	int zb;
	static int Ab = 10;
	ob Bb = null;
	static int Cb;
	int[] Db = new int[4];
	boolean[] Eb = new boolean[10];
	int[] regionLocalX = new int[10];
	int Gb = 1;
	int Hb;
	int Ib = 0;
	int Jb = -1;
	int Kb = 0;
	boolean Lb = false;
	int Mb = -1;
	static int Nb;
	int Ob = 0;
	int Pb = -1000;
	int Qb;
	int Rb = -1;
	int Sb = 0;
	int Tb;
	int Ub = 0;
	int Vb = 100;
	int Wb = 0;
	static int[] Xb;
	int coordX;
	static int Zb;
	int ac = 0;
	int[] regionLocalY = new int[10];
	int cc = 0;
	int dc;
	static ob ob_ec;
	int[] fc = new int[4];
	static int[] gc;
	
	boolean b(byte var1) {
		try {
			if (var1 <= 67) {
				this.b(125, -89, -87, false);
			}
			
			++Nb;
			return false;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ud.H(" + var1 + ')');
		}
	}
	
	final void a(int localX, int localY, int unused, boolean flag) {
		try {
			++V;
			if (~this.mb != 0 && le.c(15619, this.mb).Y == 1) {
				this.mb = -1;
			}
			
			if (!flag) {
				int i2 = -this.regionLocalX[0] + localX;
				int i3 = localY - this.regionLocalY[0];
				if (~i2 <= 7 && ~i2 >= -9 && i3 >= -8 && ~i3 >= -9) {
					if (~this.T > -10) {
						++this.T;
					}
					
					int i4 = this.T;
					if (~i4 >= -1) {
						this.Eb[0] = false;
						this.regionLocalX[0] = localX;
						this.regionLocalY[0] = localY;
						return;
					}
					
					while (~i4 < -1) {
						this.regionLocalX[i4] = this.regionLocalX[i4 + -1];
						this.regionLocalY[i4] = this.regionLocalY[-1 + i4];
						this.Eb[i4] = this.Eb[-1 + i4];
						--i4;
					}
					
					this.Eb[0] = false;
					this.regionLocalX[0] = localX;
					this.regionLocalY[0] = localY;
					return;
				}
			}
			
			this.regionLocalX[0] = localX;
			this.cc = 0;
			this.regionLocalY[0] = localY;
			this.coordY = this.regionLocalY[0] * 128 + 64 * this.Gb;
			this.rb = 0;
			this.T = 0;
			this.coordX = 128 * this.regionLocalX[0] + (64 * this.Gb);
		} catch (RuntimeException var9) {
			throw bc.a(var9, "ud.A(" + localX + ',' + localY + ',' + unused + ',' + flag + ')');
		}
	}
	
	public static void a(boolean var0) {
		try {
			bb = null;
			gc = null;
			ob_ec = null;
			X = null;
			Xb = null;
			if (var0) {
				a(false);
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ud.D(" + var0 + ')');
		}
	}
	
	final int c(byte var1) {
		try {
			++S;
			if (var1 <= 53) {
				this.c((byte) -17);
			}
			
			return ~this.hb == 32767 ? 200 : -this.hb;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ud.E(" + var1 + ')');
		}
	}
	
	final void b(int var1, int var2, int var3, boolean var4) {
		int var6 = client.anInt_wb;
		
		try {
			if (var4) {
				this.Pb = 58;
			}
			
			++qb;
			int var5 = 0;
			if (var6 != 0 || var5 < 4) {
				do {
					if (~this.kb[var5] >= ~var2) {
						this.Db[var5] = var1;
						this.fc[var5] = var3;
						this.kb[var5] = 70 + var2;
						return;
					}
					
					++var5;
				} while (var5 < 4);
				
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ud.F(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	final void a(boolean unused, int direction, boolean flag) {
		try {
			++fb;
			int x = this.regionLocalX[0];
			int y = this.regionLocalY[0];
			if (direction == 0) {
				++y;
				--x;
			}
			
			if (~this.mb != 0 && le.c(15619, this.mb).Y == 1) {
				this.mb = -1;
			}
			
			if (direction == 1) {
				++y;
			} else if (direction == 2) {
				++y;
				++x;
			} else if (direction == 3) {
				--x;
			}
			
			if (this.T < 9) {
				++this.T;
			}
			
			if (direction == 4) {
				++x;
			}
			
			int index = this.T;
			while (~index < -1) {
				this.regionLocalX[index] = this.regionLocalX[-1 + index];
				this.regionLocalY[index] = this.regionLocalY[-1 + index];
				this.Eb[index] = this.Eb[-1 + index];
				--index;
			}
			
			if (direction == 5) {
				--x;
				--y;
			}
			
			this.Eb[0] = flag;
			if (direction == 6) {
				--y;
			} else if (direction == 7) {
				++x;
				--y;
			}
			
			this.regionLocalX[0] = x;
			this.regionLocalY[0] = y;
		} catch (RuntimeException var8) {
			throw bc.a(var8, "ud.I(" + unused + ',' + direction + ',' + flag + ')');
		}
	}
	
	final void d(byte var1) {
		try {
			++Cb;
			int var2 = 26 / ((var1 - -36) / 61);
			this.T = 0;
			this.cc = 0;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ud.G(" + var1 + ')');
		}
	}
	
	static {
		X = bb;
		Xb = new int['耀'];
		ob_ec = rf.a(40, "Art");
		gc = new int[200];
	}
}
