final class ni extends af {
	
	private int R;
	static boolean S;
	private int T;
	static int U = 0;
	private int V = 0;
	static ob W;
	private int X = 0;
	private static ob welcomeToRuneScape = rf.a(40, "Welcome to RuneScape");
	private int Z;
	static volatile int ab;
	static ob challengeRequest;
	private int cb = 0;
	private int db;
	static ob welcomeToRuneScape2;
	static int fb;
	private int gb;
	static int hb;
	static int ib;
	private static ob jb;
	static int kb;
	static ob lb;
	static ob mb;
	private int anInt_nb;
	static int ob;
	
	public ni() {
		super(1, false);
	}
	
	private void a(int var1, int var2, int var3, int var4) {
		try {
			++ob;
			if (var2 != -1) {
				this.a(-88, 67, (og) null);
			}
			
			int var5 = ~var3 >= -2049 ? var3 * (var4 + 4096) >> 12 : -(var4 * var3 >> 12) + var4 + var3;
			if (var5 <= 0) {
				this.anInt_nb = this.T = this.db = var3;
			} else {
				int var6 = var3 - -var3 + -var5;
				int var7 = (-var6 + var5 << 12) / var5;
				var1 *= 6;
				int var8 = var1 >> 12;
				int var9 = var1 - (var8 << 12);
				int var10 = var7 * var5 >> 12;
				var10 = var9 * var10 >> 12;
				int var11 = var10 + var6;
				int var12 = -var10 + var5;
				if (var8 != 0) {
					if (~var8 == -2) {
						this.anInt_nb = var12;
						this.T = var5;
						this.db = var6;
						return;
					}
					
					if (var8 == 2) {
						this.anInt_nb = var6;
						this.T = var5;
						this.db = var11;
						return;
					}
					
					if (var8 == 3) {
						this.anInt_nb = var6;
						this.T = var12;
						this.db = var5;
						return;
					}
					
					if (~var8 == -5) {
						this.db = var5;
						this.anInt_nb = var11;
						this.T = var6;
						return;
					}
					
					if (var8 != 5) {
						return;
					}
					
					if (client.anInt_wb == 0) {
						this.anInt_nb = var5;
						this.T = var6;
						this.db = var12;
						return;
					}
				}
				
				this.T = var11;
				this.anInt_nb = var5;
				this.db = var6;
			}
		} catch (RuntimeException var14) {
			throw bc.a(var14, "ni.D(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	final void a(int var1, int var2, og var3) {
		int var5 = client.anInt_wb;
		
		try {
			label37:
			{
				label36:
				{
					label35:
					{
						++kb;
						if (~var1 != -1) {
							if (var1 == 1) {
								break label35;
							}
							
							if (var1 != 2) {
								break label37;
							}
							
							if (var5 == 0) {
								break label36;
							}
						}
						
						this.X = var3.readSignedShort((byte) -67);
						if (var5 == 0) {
							break label37;
						}
					}
					
					this.V = (var3.readByte(1064893128) << 12) / 100;
					if (var5 == 0) {
						break label37;
					}
				}
				
				this.cb = (var3.readByte(1064893128) << 12) / 100;
			}
			
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ni.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	private void b(int var1, int var2, int var3, int var4) {
		int var11 = client.anInt_wb;
		
		try {
			int var5;
			int var6;
			int var7;
			label74:
			{
				++hb;
				var5 = ~var3 < ~var4 ? var3 : var4;
				var5 = ~var2 >= ~var5 ? var5 : var2;
				var6 = ~var4 >= ~var3 ? var4 : var3;
				var6 = ~var2 > ~var6 ? var2 : var6;
				this.Z = (var6 - -var5) / var1;
				var7 = -var6 + var5;
				if (~this.Z < -1 && ~this.Z > -4097) {
					this.gb = (var7 << 12) / (~this.Z >= -2049 ? 2 * this.Z : -(2 * this.Z) + 8192);
					if (var11 == 0) {
						break label74;
					}
				}
				
				this.gb = 0;
			}
			
			if (~var7 >= -1) {
				this.R = 0;
			} else {
				label80:
				{
					int var8 = (-var3 + var5 << 12) / var7;
					int var10 = (-var2 + var5 << 12) / var7;
					int var9 = (-var4 + var5 << 12) / var7;
					if (~var5 != ~var3) {
						if (var5 != var4) {
							this.R = ~var6 != ~var3 ? -var8 + 20480 : 12288 + var9;
							if (var11 == 0) {
								break label80;
							}
						}
						
						this.R = var2 == var6 ? var8 + 4096 : -var10 + 12288;
						if (var11 == 0) {
							break label80;
						}
					}
					
					this.R = var6 == var4 ? var10 + 20480 : -var9 + 4096;
				}
				
				this.R /= 6;
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "ni.C(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	static ah d(int var0, int var1, int var2) {
		pd var3 = nb.oc[var0][var1][var2];
		if (var3 == null) {
			return null;
		} else {
			for (int var4 = 0; var4 < var3.B; ++var4) {
				ah var5 = var3.D[var4];
				if ((var5.b >> 29 & 3L) == 2L && var5.q == var1 && var5.d == var2) {
					return var5;
				}
			}
			
			return null;
		}
	}
	
	public static void i(int var0) {
		try {
			mb = null;
			welcomeToRuneScape = null;
			lb = null;
			jb = null;
			W = null;
			if (var0 != 0) {
				U = 24;
			}
			
			challengeRequest = null;
			welcomeToRuneScape2 = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ni.E(" + var0 + ')');
		}
	}
	
	static void j(int var0) {
		int var6 = client.anInt_wb;
		
		try {
			int var1 = -1;
			int var2;
			if (var6 != 0 || se.b > var1) {
				do {
					if (~var1 != 0) {
						var2 = si.cb[var1];
						if (var6 != 0) {
							var2 = 2047;
						}
					} else {
						var2 = 2047;
					}
					
					dg var3 = lg.j[var2];
					if (var3 != null && ~var3.Vb < -1) {
						--var3.Vb;
						if (~var3.Vb == -1) {
							var3.Bb = null;
						}
					}
					
					++var1;
				} while (se.b > var1);
			}
			
			var2 = 0;
			if (var6 == 0 && ~tf.n >= ~var2) {
				++ib;
			} else {
				do {
					int var4 = ud.Xb[var2];
					nb var5 = ai.M[var4];
					if (var5 != null && var5.Vb > 0) {
						--var5.Vb;
						if (var5.Vb == 0) {
							var5.Bb = null;
						}
					}
					
					++var2;
				} while (~tf.n < ~var2);
				
				++ib;
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ni.H(" + var0 + ')');
		}
	}
	
	final int[][] b(int var1, byte var2) {
		int var12 = client.anInt_wb;
		
		try {
			int[][] var3 = super.ve_s.a(var1, (byte) 45);
			if (super.ve_s.u) {
				int[][] var4 = this.b(var1, -12, 0);
				int[] var5 = var4[0];
				int[] var6 = var4[1];
				int[] var7 = var4[2];
				int[] var8 = var3[0];
				int[] var10 = var3[2];
				int[] var9 = var3[1];
				int var11 = 0;
				if (var12 != 0 || var11 < lh.eb) {
					do {
						this.b(2, var7[var11], var5[var11], var6[var11]);
						this.gb += this.V;
						if (~this.gb > -1) {
							this.gb = 0;
						}
						
						this.R += this.X;
						this.Z += this.cb;
						if (~this.gb < -4097) {
							this.gb = 4096;
							if (var12 != 0) {
								this.R += 4096;
							}
						}
						
						while (~this.R > -1) {
							this.R += 4096;
						}
						
						if (var12 != 0 || ~this.R < -4097) {
							do {
								this.R -= 4096;
							} while (~this.R < -4097);
						}
						
						if (~this.Z > -1) {
							this.Z = 0;
						}
						
						if (this.Z > 4096) {
							this.Z = 4096;
						}
						
						this.a(this.R, -1, this.Z, this.gb);
						var8[var11] = this.anInt_nb;
						var9[var11] = this.T;
						var10[var11] = this.db;
						++var11;
					} while (var11 < lh.eb);
				}
			}
			
			++fb;
			return var3;
		} catch (RuntimeException var13) {
			throw bc.a(var13, "ni.G(" + var1 + ',' + var2 + ')');
		}
	}
	
	static {
		welcomeToRuneScape2 = welcomeToRuneScape;
		S = false;
		ab = 0;
		jb = rf.a(40, "We suspect someone knows your password)3");
		challengeRequest = rf.a(40, ":chalreq:");
		lb = rf.a(40, " steht bereits auf Ihrer Freunde)2Liste(Q");
		W = jb;
		mb = rf.a(40, " Sekunde(Xn(Y -Ubertragen)3");
	}
}
