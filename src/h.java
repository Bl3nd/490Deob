final class h extends sg {
	
	static int s;
	static int t;
	static int u;
	private int[] v = new int[16];
	static int w;
	static int x;
	static int y;
	static int z;
	private static ob A = rf.a(40, " is already on your ignore list)3");
	static int B;
	private int[] C = new int[16];
	static int D;
	static int E;
	static int F;
	private md G;
	private int[] H = new int[16];
	static int I;
	static int J;
	static int K;
	static int L;
	static int M;
	int[] N = new int[16];
	static int O;
	private int[] P = new int[16];
	static int Q;
	private int R = 1000000;
	static int S;
	static int T;
	private int[] U = new int[16];
	private mb V = new mb();
	static int W;
	private lf[][] X = new lf[16][128];
	static int Y;
	static int Z;
	static int ab;
	static int bb;
	private int[] cb = new int[16];
	static int db;
	static int eb;
	private int[] fb = new int[16];
	static ob gb = rf.a(40, "<br>");
	private int[] hb = new int[16];
	static volatile int ib;
	private int[] jb = new int[16];
	private int[] kb = new int[16];
	static int lb;
	int[] mb = new int[16];
	static int nb;
	static int ob;
	private lf[][] pb = new lf[16][128];
	private int qb = 256;
	static int rb;
	private int[] sb = new int[16];
	static int tb;
	static int ub;
	static int vb;
	static int wb;
	static int xb;
	static int yb;
	static ob zb;
	int[] Ab = new int[16];
	static int Bb;
	static int Cb;
	private int[] Db = new int[16];
	static int Eb;
	private int Fb;
	private int Gb;
	private long Hb;
	private long Ib;
	private boolean Jb;
	private ie Kb = new ie(this);
	
	private void a(int var1, int var2, int var3, int var4) {
		int var9 = client.anInt_wb;
		
		try {
			++M;
			this.b(86, 64, var1, var3);
			if ((this.mb[var1] & 2) != 0) {
				lf var5 = (lf) this.Kb.I.d(-83);
				if (var9 != 0 || var5 != null) {
					do {
						if (var5.t == var1 && var5.q < 0) {
							this.pb[var1][var5.s] = null;
							this.pb[var1][var3] = var5;
							int var12 = (var5.p * var5.u >> -8055188) + var5.N;
							var5.p = 4096;
							var5.N += var3 + -var5.s << 265295272;
							var5.u = -var5.N + var12;
							var5.s = var3;
							return;
						}
						
						var5 = (lf) this.Kb.I.e(-21824);
					} while (var5 != null);
				}
			}
			
			id var11 = (id) this.G.a((long) this.cb[var1], 22346);
			if (var11 != null) {
				oa var6 = var11.G[var3];
				if (var6 != null) {
					if (var2 != -19281) {
						lb = 117;
					}
					
					lf var7;
					label53:
					{
						var7 = new lf();
						var7.r = var11;
						var7.E = var6;
						var7.t = var1;
						var7.o = var11.H[var3];
						var7.G = var11.A[var3];
						var7.s = var3;
						var7.C = 1024 + var4 * var4 * var11.D * var11.I[var3] >> 570853451;
						var7.M = 255 & var11.J[var3];
						var7.N = (var3 << -1058541208) + -(32767 & var11.F[var3]);
						var7.R = 0;
						var7.J = 0;
						var7.Q = 0;
						var7.q = -1;
						var7.D = 0;
						if (~this.N[var1] != -1) {
							var7.L = td.a(var6, this.a((byte) 123, var7), 0, this.a(true, var7));
							this.a(-35, var7, var11.F[var3] < 0);
							if (var9 == 0) {
								break label53;
							}
						}
						
						var7.L = td.a(var6, this.a((byte) 99, var7), this.a((int) 2, var7), this.a(true, var7));
					}
					
					if (var11.F[var3] < 0) {
						var7.L.g(-1);
					}
					
					if (var7.G >= 0) {
						lf var8 = this.X[var1][var7.G];
						if (var8 != null && ~var8.q > -1) {
							this.pb[var1][var8.s] = null;
							var8.q = 0;
						}
						
						this.X[var1][var7.G] = var7;
					}
					
					this.Kb.I.a(0, var7);
					this.pb[var1][var3] = var7;
				}
			}
		} catch (RuntimeException var10) {
			throw bc.a(var10, "h.T(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	private void a(int var1, byte var2, int var3) {
		try {
			if (var2 <= 11) {
				this.a(-95, (int) -47, (byte) -60);
			}
			
			this.P[var3] = var1;
			++tb;
			this.Ab[var3] = (int) (Math.pow(2.0D, (double) var1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
		} catch (RuntimeException var5) {
			throw bc.a(var5, "h.DA(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	final synchronized boolean e(int var1) {
		try {
			if (var1 <= 124) {
				return false;
			} else {
				++Bb;
				return this.V.g();
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "h.EA(" + var1 + ')');
		}
	}
	
	static final int b(int var0, int var1, int var2) {
		try {
			++J;
			int var3 = 57 * var1 + var2;
			var3 ^= var3 << 1508653965;
			if (var0 != 1508653965) {
				j(-106);
			}
			
			int var4 = 1376312589 + (789221 + 15731 * var3 * var3) * var3 & Integer.MAX_VALUE;
			return (133807420 & var4) >> -79642253;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "h.CA(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}
	
	private int a(byte var1, lf var2) {
		try {
			++I;
			if (var1 < 55) {
				this.a(15, (byte) 46, (int) 70);
			}
			
			fi var4 = var2.o;
			int var3 = var2.N + (var2.p * var2.u >> 457985932);
			var3 += this.H[var2.t] * (-8192 + this.sb[var2.t]) >> 652537740;
			int var5;
			if (var4.o > 0 && (var4.j > 0 || ~this.U[var2.t] < -1)) {
				int var6 = var4.k << 244946369;
				var5 = var4.j << -1599148926;
				if (var6 > var2.z) {
					var5 = var2.z * var5 / var6;
				}
				
				var5 += this.U[var2.t] >> -1003193497;
				double var7 = Math.sin((double) (511 & var2.F) * 0.01227184630308513D);
				var3 += (int) ((double) var5 * var7);
			}
			
			var5 = (int) ((double) (256 * var2.E.q) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) ki.sampleRate + 0.5D);
			return var5 >= 1 ? var5 : 1;
		} catch (RuntimeException var9) {
			throw bc.a(var9, "h.NA(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	private int a(boolean var1, lf var2) {
		try {
			++vb;
			if (!var1) {
				this.a(true, 108, 69);
			}
			
			int var3 = this.v[var2.t];
			return ~var3 > -8193 ? var2.M * var3 - -32 >> -966725498 : -((-var3 + 16384) * (-var2.M + 128) + 32 >> 1671218118) + 16384;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "h.P(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	final boolean a(lf var1, byte var2) {
		try {
			if (var2 != 74) {
				this.e(100);
			}
			
			++wb;
			if (var1.L == null) {
				if (var1.q >= 0) {
					var1.c(var2 + 54);
					if (var1.G > 0 && this.X[var1.t][var1.G] == var1) {
						this.X[var1.t][var1.G] = null;
					}
				}
				
				return true;
			} else {
				return false;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "h.L(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	
	private void a(int var1, boolean var2, int var3, int var4) {
		try {
			if (var2) {
				b(-84, (int) -96, -6);
			}
			
			++S;
		} catch (RuntimeException var6) {
			throw bc.a(var6, "h.R(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	final synchronized void f(int var1) {
		int var4 = client.anInt_wb;
		
		try {
			int var3 = -63 % ((var1 - 74) / 45);
			id var2 = (id) this.G.b((byte) 117);
			if (var4 == 0 && var2 == null) {
				++E;
			} else {
				do {
					var2.c(128);
					var2 = (id) this.G.a((byte) -33);
				} while (var2 != null);
				
				++E;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "h.O(" + var1 + ')');
		}
	}
	
	private void b(int var1, int var2, int var3, int var4) {
		int var7 = client.anInt_wb;
		
		try {
			if (var1 <= 2) {
				lb = -24;
			}
			
			lf var5 = this.pb[var3][var4];
			++B;
			if (var5 != null) {
				this.pb[var3][var4] = null;
				if (~(this.mb[var3] & 2) == -1) {
					var5.q = 0;
				} else {
					lf var6 = (lf) this.Kb.I.a((byte) -9);
					if (var7 != 0 || var6 != null) {
						do {
							if (var5.t == var6.t && var6.q < 0 && var5 != var6) {
								var5.q = 0;
								return;
							}
							
							var6 = (lf) this.Kb.I.b((byte) -32);
						} while (var6 != null);
						
					}
				}
			}
		} catch (RuntimeException var8) {
			throw bc.a(var8, "h.F(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	final synchronized void d(int var1) {
		int var6 = client.anInt_wb;
		
		try {
			if (this.V.g()) {
				int var2 = this.V.g * this.R / ki.sampleRate;
				
				do {
					long var3 = (long) var1 * (long) var2 + this.Hb;
					if (~(-var3 + this.Ib) <= -1L) {
						this.Hb = var3;
						if (var6 == 0) {
							break;
						}
					}
					
					int var5 = (int) ((-1L + (long) var2 + -this.Hb + this.Ib) / (long) var2);
					var1 -= var5;
					this.Hb += (long) var5 * (long) var2;
					this.Kb.d(var5);
					this.g(15121);
				} while (this.V.g());
			}
			
			++xb;
			this.Kb.d(var1);
		} catch (RuntimeException var7) {
			throw bc.a(var7, "h.GA(" + var1 + ')');
		}
	}
	
	private void b(int var1, int var2) {
		int var4 = client.anInt_wb;
		
		try {
			++w;
			if (var1 >= 0) {
				this.C[var1] = 12800;
				this.v[var1] = 8192;
				this.kb[var1] = 16383;
				this.sb[var1] = 8192;
				this.U[var1] = 0;
				if (var2 < 113) {
					this.Ib = -78L;
				}
				
				this.jb[var1] = 8192;
				this.d(0, (int) var1);
				this.d(var1, (byte) -87);
				this.mb[var1] = 0;
				this.fb[var1] = 32767;
				this.H[var1] = 256;
				this.N[var1] = 0;
				this.a(8192, (byte) 13, (int) var1);
			} else {
				var1 = 0;
				if (var4 != 0) {
					this.b(var1, (int) 117);
					++var1;
				}
				
				while (~var1 > -17) {
					this.b(var1, (int) 117);
					++var1;
				}
				
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "h.W(" + var1 + ',' + var2 + ')');
		}
	}
	
	private void c(int var1, int var2) {
		int var8 = client.anInt_wb;
		
		try {
			++t;
			int var3 = var1 & 240;
			int var4;
			int var5;
			int var6;
			if (var3 == 128) {
				var4 = 15 & var1;
				var6 = var1 >> -722399984 & 127;
				var5 = (32722 & var1) >> -215199224;
				this.b(var2 + 722399990, var6, var4, var5);
			} else if (~var3 == -145) {
				var6 = (var1 & 8379503) >> 712369776;
				var4 = 15 & var1;
				var5 = var1 >> -82352664 & 127;
				if (var6 <= 0) {
					this.b(91, 64, var4, var5);
				} else {
					this.a(var4, -19281, var5, var6);
				}
			} else {
				if (var2 != -722399984) {
					j(35);
				}
				
				if (var3 == 160) {
					var4 = var1 & 15;
					var5 = (var1 & 32512) >> 469450792;
					var6 = 127 & var1 >> -1553511376;
					this.a(var4, false, var6, var5);
				} else if (var3 != 176) {
					if (var3 == 192) {
						var5 = (var1 & 32685) >> 344167528;
						var4 = 15 & var1;
						this.c(var5 + this.Db[var4], var4, -31918);
					} else if (~var3 == -209) {
						var4 = 15 & var1;
						var5 = 127 & var1 >> 23454024;
						this.d(var5, var4, 125);
					} else if (~var3 == -225) {
						var4 = var1 & 15;
						var5 = ((var1 & 8323208) >> -1129960823) - -(127 & var1 >> -927297496);
						this.b(var5, (byte) 9, var4);
					} else {
						var3 = 255 & var1;
						if (var3 == 255) {
							this.i(-17);
						}
					}
				} else {
					var5 = (32688 & var1) >> -2136456376;
					var4 = var1 & 15;
					var6 = (8337166 & var1) >> 1615594928;
					if (var5 == 0) {
						this.Db[var4] = bd.b(this.Db[var4], -2080769) - -(var6 << 1383603662);
					}
					
					if (~var5 == -33) {
						this.Db[var4] = bd.b(-16257, (int) this.Db[var4]) + (var6 << -330843033);
					}
					
					if (var5 == 1) {
						this.U[var4] = (var6 << -1960172697) + bd.b(this.U[var4], (int) -16257);
					}
					
					if (var5 == 33) {
						this.U[var4] = var6 + bd.b(this.U[var4], (int) -128);
					}
					
					if (~var5 == -6) {
						this.jb[var4] = bd.b(this.jb[var4], (int) -16257) - -(var6 << 1097451911);
					}
					
					if (~var5 == -38) {
						this.jb[var4] = bd.b(this.jb[var4], (int) -128) + var6;
					}
					
					if (~var5 == -8) {
						this.C[var4] = (var6 << 529727367) + bd.b(this.C[var4], (int) -16257);
					}
					
					if (var5 == 39) {
						this.C[var4] = bd.b(-128, (int) this.C[var4]) - -var6;
					}
					
					if (var5 == 10) {
						this.v[var4] = bd.b(this.v[var4], (int) -16257) - -(var6 << 1894458215);
					}
					
					if (~var5 == -43) {
						this.v[var4] = bd.b(-128, (int) this.v[var4]) + var6;
					}
					
					if (~var5 == -12) {
						this.kb[var4] = (var6 << -1555216665) + bd.b(this.kb[var4], (int) -16257);
					}
					
					if (~var5 == -44) {
						this.kb[var4] = bd.b(-128, (int) this.kb[var4]) - -var6;
					}
					
					if (~var5 == -65) {
						label155:
						{
							if (var6 >= 64) {
								this.mb[var4] = ff.b(this.mb[var4], 1);
								if (var8 == 0) {
									break label155;
								}
							}
							
							this.mb[var4] = bd.b(this.mb[var4], (int) -2);
						}
					}
					
					if (~var5 == -66) {
						label149:
						{
							if (var6 >= 64) {
								this.mb[var4] = ff.b(this.mb[var4], 2);
								if (var8 == 0) {
									break label149;
								}
							}
							
							this.d(var2 ^ -722399984, var4);
							this.mb[var4] = bd.b(this.mb[var4], (int) -3);
						}
					}
					
					if (var5 == 99) {
						this.fb[var4] = bd.b(this.fb[var4], (int) 127) - -(var6 << -1021683961);
					}
					
					if (var5 == 98) {
						this.fb[var4] = var6 + bd.b(this.fb[var4], (int) 16256);
					}
					
					if (var5 == 101) {
						this.fb[var4] = (var6 << 604538695) + bd.b(127, (int) this.fb[var4]) + 16384;
					}
					
					if (~var5 == -101) {
						this.fb[var4] = var6 + bd.b(16256, (int) this.fb[var4]) + 16384;
					}
					
					if (~var5 == -121) {
						this.c(var4, (byte) -98);
					}
					
					if (~var5 == -122) {
						this.b(var4, var2 + 722400103);
					}
					
					if (~var5 == -124) {
						this.b(var4, (byte) -47);
					}
					
					int var7;
					if (var5 == 6) {
						var7 = this.fb[var4];
						if (~var7 == -16385) {
							this.H[var4] = bd.b(-16257, (int) this.H[var4]) - -(var6 << 194082439);
						}
					}
					
					if (var5 == 38) {
						var7 = this.fb[var4];
						if (var7 == 16384) {
							this.H[var4] = bd.b(-128, (int) this.H[var4]) + var6;
						}
					}
					
					if (var5 == 16) {
						this.N[var4] = (var6 << 130471815) + bd.b(-16257, (int) this.N[var4]);
					}
					
					if (var5 == 48) {
						this.N[var4] = var6 + bd.b(-128, (int) this.N[var4]);
					}
					
					if (var5 == 81) {
						label127:
						{
							if (~var6 <= -65) {
								this.mb[var4] = ff.b(this.mb[var4], 4);
								if (var8 == 0) {
									break label127;
								}
							}
							
							this.d(var4, (byte) -110);
							this.mb[var4] = bd.b(this.mb[var4], (int) -5);
						}
					}
					
					if (var5 == 17) {
						this.a((this.P[var4] & -16257) - -(var6 << -417090489), (byte) 90, (int) var4);
					}
					
					if (var5 == 49) {
						this.a((this.P[var4] & -128) + var6, (byte) 57, (int) var4);
					}
					
				}
			}
		} catch (RuntimeException var9) {
			throw bc.a(var9, "h.G(" + var1 + ',' + var2 + ')');
		}
	}
	
	private void g(int var1) {
		int var7 = client.anInt_wb;
		
		try {
			++Z;
			int var2 = this.Gb;
			if (var1 == 15121) {
				label93:
				{
					long var4 = this.Ib;
					int var3 = this.Fb;
					int var6;
					if (var7 != 0) {
						this.V.a(var2);
						var6 = this.V.b(var2);
						if (~var6 == -2) {
							this.V.f();
							this.V.d(var2);
							if (this.V.c()) {
								if (!this.Jb || ~var3 == -1) {
									break label93;
								}
								
								this.V.a(var4);
								if (var7 != 0) {
									break label93;
								}
							}
							
							var2 = this.V.d();
							var3 = this.V.f[var2];
							var4 = this.V.e(var3);
							if (~var3 != ~this.Fb) {
								this.Gb = var2;
								this.Ib = var4;
								this.Fb = var3;
								return;
							}
						} else {
							if (~(128 & var6) != -1) {
								this.c(var6, var1 ^ -722389503);
							}
							
							this.V.f(var2);
							this.V.d(var2);
						}
					} else if (~var3 != ~this.Fb) {
						this.Gb = var2;
						this.Ib = var4;
						this.Fb = var3;
						return;
					}
					
					label92:
					while (true) {
						while (this.V.f[var2] == var3) {
							this.V.a(var2);
							var6 = this.V.b(var2);
							if (~var6 == -2) {
								this.V.f();
								this.V.d(var2);
								if (this.V.c()) {
									if (!this.Jb || ~var3 == -1) {
										break label92;
									}
									
									this.V.a(var4);
									if (var7 != 0) {
										break label92;
									}
								}
								
								var2 = this.V.d();
								var3 = this.V.f[var2];
								var4 = this.V.e(var3);
								if (~var3 != ~this.Fb) {
									this.Gb = var2;
									this.Ib = var4;
									this.Fb = var3;
									return;
								}
							} else {
								if (~(128 & var6) != -1) {
									this.c(var6, var1 ^ -722389503);
								}
								
								this.V.f(var2);
								this.V.d(var2);
							}
						}
						
						var2 = this.V.d();
						var3 = this.V.f[var2];
						var4 = this.V.e(var3);
						if (~var3 != ~this.Fb) {
							this.Gb = var2;
							this.Ib = var4;
							this.Fb = var3;
							return;
						}
					}
				}
				
				this.i(-17);
				this.V.a();
			}
		} catch (RuntimeException var8) {
			throw bc.a(var8, "h.N(" + var1 + ')');
		}
	}
	
	final synchronized void a(byte var1) {
		try {
			this.V.a();
			if (var1 != 64) {
				this.V = null;
			}
			
			++Q;
			this.i(var1 + -81);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "h.A(" + var1 + ')');
		}
	}
	
	private void b(int var1, byte var2, int var3) {
		try {
			if (var2 != 9) {
				this.Kb = null;
			}
			
			++F;
			this.sb[var3] = var1;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "h.OA(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	final synchronized void a(int[] var1, int var2, int var3) {
		int var8 = client.anInt_wb;
		
		try {
			++L;
			if (this.V.g()) {
				int var4 = this.V.g * this.R / ki.sampleRate;
				
				do {
					long var5 = (long) var3 * (long) var4 + this.Hb;
					if (~(this.Ib + -var5) <= -1L) {
						this.Hb = var5;
						if (var8 == 0) {
							break;
						}
					}
					
					int var7 = (int) (((long) var4 + -this.Hb + (this.Ib - 1L)) / (long) var4);
					this.Hb += (long) var7 * (long) var4;
					this.Kb.a(var1, var2, var7);
					var3 -= var7;
					this.g(15121);
					var2 += var7;
				} while (this.V.g());
			}
			
			this.Kb.a(var1, var2, var3);
		} catch (RuntimeException var9) {
			throw bc.a(var9, "h.I(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	final synchronized void b(byte var1) {
		int var4 = client.anInt_wb;
		
		try {
			id var2 = (id) this.G.b((byte) 117);
			if (var4 != 0) {/*
				var2.d(11071);
				var2 = (id) this.G.a((byte) -33);
			*/
			}
			
			while (var2 != null) {
				var2.d(11071);
				var2 = (id) this.G.a((byte) -33);
			}
			
			++eb;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "h.IA(" + var1 + ')');
		}
	}
	
	final synchronized sg c() {
		try {
			++K;
			return this.Kb;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "h.U(" + ')');
		}
	}
	
	final int h(int var1) {
		try {
			++D;
			int var2 = 4 % ((var1 - 48) / 61);
			return this.qb;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "h.MA(" + var1 + ')');
		}
	}
	
	private void d(int var1, int var2) {
		int var4 = client.anInt_wb;
		
		try {
			++s;
			if (var1 == 0) {
				if (~(this.mb[var2] & 2) != -1) {
					lf var3 = (lf) this.Kb.I.a((byte) -9);
					if (var4 != 0 || var3 != null) {
						do {
							if (var3.t == var2 && this.pb[var2][var3.s] == null && var3.q < 0) {
								var3.q = 0;
							}
							
							var3 = (lf) this.Kb.I.b((byte) 106);
						} while (var3 != null);
						
					}
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "h.Q(" + var1 + ',' + var2 + ')');
		}
	}
	
	final boolean a(int var1, lf var2, int var3, int[] var4, int var5) {
		int var11 = client.anInt_wb;
		
		try {
			var2.A = ki.sampleRate / 100;
			++u;
			if (~var2.q > -1 || var2.L != null && !var2.L.h()) {
				int var6 = var2.p;
				if (~var6 < -1) {
					var6 -= (int) (Math.pow(2.0D, 4.921259842519685E-4D * (double) this.jb[var2.t]) * 16.0D + 0.5D);
					if (var6 < 0) {
						var6 = 0;
					}
					
					var2.p = var6;
				}
				
				var2.L.j(this.a((byte) 119, var2));
				++var2.z;
				boolean var8 = false;
				fi var7 = var2.o;
				var2.F += var7.o;
				double var9 = 5.086263020833333E-6D * (double) ((var2.s + -60 << -902445304) - -(var2.u * var2.p >> 1279464268));
				if (~var7.c < -1) {
					label138:
					{
						if (var7.h > 0) {
							var2.J += (int) (0.5D + Math.pow(2.0D, (double) var7.h * var9) * 128.0D);
							if (var11 == 0) {
								break label138;
							}
						}
						
						var2.J += 128;
					}
					
					if (~(var2.J * var7.c) <= -819201) {
						var8 = true;
					}
				}
				
				if (var7.x != null) {
					label130:
					{
						if (var7.z > 0) {
							var2.R += (int) (128.0D * Math.pow(2.0D, (double) var7.z * var9) + 0.5D);
							if (var11 == 0) {
								break label130;
							}
						}
						
						var2.R += 128;
						if (var11 != 0) {
							var2.D += 2;
						}
					}
					
					while (~var2.D > ~(-2 + var7.x.length) && ~var2.R < ~(var7.x[var2.D - -2] << -938606328 & '\uff00')) {
						var2.D += 2;
					}
					
					if (~var2.D == ~(var7.x.length - 2) && var7.x[1 + var2.D] == 0) {
						var8 = true;
					}
				}
				
				if (var2.q >= 0 && var7.y != null && (1 & this.mb[var2.t]) == 0 && (~var2.G > -1 || var2 != this.X[var2.t][var2.G])) {
					label107:
					{
						if (var7.e <= 0) {
							var2.q += 128;
							if (var11 == 0) {
								break label107;
							}
						}
						
						var2.q += (int) (128.0D * Math.pow(2.0D, var9 * (double) var7.e) + 0.5D);
						if (var11 != 0) {
							var2.Q += 2;
						}
					}
					
					while (var7.y.length - 2 > var2.Q && var2.q > ('\uff00' & var7.y[var2.Q - -2] << 246478088)) {
						var2.Q += 2;
					}
					
					if (var2.Q == -2 + var7.y.length) {
						var8 = true;
					}
				}
				
				if (!var8) {
					var2.L.b(var2.A, this.a(var3, var2), this.a(true, var2));
					return false;
				} else {
					label92:
					{
						var2.L.i(var2.A);
						if (var4 == null) {
							var2.L.d(var5);
							if (var11 == 0) {
								break label92;
							}
						}
						
						var2.L.a(var4, var1, var5);
					}
					
					if (var2.L.k()) {
						this.Kb.K.b(var2.L);
					}
					
					var2.e(-92);
					if (~var2.q <= -1) {
						var2.c(128);
						if (var2.G > 0 && this.X[var2.t][var2.G] == var2) {
							this.X[var2.t][var2.G] = null;
						}
					}
					
					return true;
				}
			} else {
				var2.e(-92);
				var2.c(var3 + 126);
				if (~var2.G < -1 && this.X[var2.t][var2.G] == var2) {
					this.X[var2.t][var2.G] = null;
				}
				
				return true;
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "h.AA(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ')');
		}
	}
	
	private void c(int var1, int var2, int var3) {
		int var5 = client.anInt_wb;
		
		try {
			if (this.cb[var2] != var1) {
				this.cb[var2] = var1;
				int var4 = 0;
				if (var5 != 0 || ~var4 > -129) {
					do {
						this.X[var2][var4] = null;
						++var4;
					} while (~var4 > -129);
				}
			}
			
			++y;
			if (var3 != -31918) {
				this.a(29, -6, -121, 116);
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "h.KA(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	private void b(int var1, byte var2) {
		int var4 = client.anInt_wb;
		
		try {
			++Eb;
			if (var2 != -47) {
				this.G = null;
			}
			
			lf var3 = (lf) this.Kb.I.a((byte) -9);
			if (var4 != 0 || var3 != null) {
				do {
					if ((var1 < 0 || ~var1 == ~var3.t) && var3.q < 0) {
						this.pb[var3.t][var3.s] = null;
						var3.q = 0;
					}
					
					var3 = (lf) this.Kb.I.b((byte) -67);
				} while (var3 != null);
				
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "h.H(" + var1 + ',' + var2 + ')');
		}
	}
	
	private void i(int var1) {
		int var4 = client.anInt_wb;
		
		try {
			this.c(-1, (byte) -98);
			this.b(-1, (int) 122);
			int var2 = 0;
			while (~var2 > -17) {
				this.cb[var2] = this.hb[var2];
				++var2;
			}
			
			++W;
			if (var1 == -17) {
				int var3 = 0;
				if (var4 != 0 || ~var3 > -17) {
					do {
						this.Db[var3] = bd.b(this.hb[var3], (int) -128);
						++var3;
					} while (~var3 > -17);
					
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "h.E(" + var1 + ')');
		}
	}
	
	private int a(int var1, lf var2) {
		try {
			fi var3 = var2.o;
			int var4 = this.C[var2.t] * this.kb[var2.t] - -4096 >> 635291309;
			var4 = 16384 + var4 * var4 >> 1274559823;
			var4 = 16384 + var4 * var2.C >> 1166709935;
			++Y;
			var4 = 128 + this.qb * var4 >> -853869752;
			if (~var3.c < -1) {
				var4 = (int) ((double) var4 * Math.pow(0.5D, (double) var2.J * 1.953125E-5D * (double) var3.c) + 0.5D);
			}
			
			if (var1 != 2) {
				this.Ib = -88L;
			}
			
			int var5;
			int var6;
			int var7;
			int var8;
			if (var3.x != null) {
				var5 = var2.R;
				var6 = var3.x[var2.D + 1];
				if (~(var3.x.length + -2) < ~var2.D) {
					var7 = (255 & var3.x[var2.D]) << -456355544;
					var8 = (var3.x[var2.D + 2] & 255) << 1833500808;
					var6 += (-var6 + var3.x[3 + var2.D]) * (-var7 + var5) / (-var7 + var8);
				}
				
				var4 = 32 + var4 * var6 >> -2089352890;
			}
			
			if (var2.q > 0 && var3.y != null) {
				var5 = var2.q;
				var6 = var3.y[1 + var2.Q];
				if (~(-2 + var3.y.length) < ~var2.Q) {
					var7 = '\uff00' & var3.y[var2.Q] << 1132729480;
					var8 = (var3.y[2 + var2.Q] & 255) << -1076859704;
					var6 += (-var6 + var3.y[var2.Q + 3]) * (-var7 + var5) / (var8 + -var7);
				}
				
				var4 = 32 + var4 * var6 >> -1171945274;
			}
			
			return var4;
		} catch (RuntimeException var9) {
			throw bc.a(var9, "h.BA(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	final synchronized void a(boolean var1, int var2, int var3) {
		try {
			++yb;
			this.a(var2, (int) var3, (byte) 15);
			if (!var1) {
				this.pb = null;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "h.JA(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	final synchronized int b() {
		try {
			++O;
			return 0;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "h.FA(" + ')');
		}
	}
	
	private void c(int var1, byte var2) {
		int var4 = client.anInt_wb;
		
		try {
			++x;
			if (var2 == -98) {
				lf var3 = (lf) this.Kb.I.a((byte) -9);
				if (/*var4 != 0 || */var3 != null) {
					do {
						if (~var1 > -1 || ~var3.t == ~var1) {
							if (var3.L != null) {
								var3.L.i(ki.sampleRate / 100);
								if (var3.L.k()) {
									this.Kb.K.b(var3.L);
								}
								
								var3.e(-103);
							}
							
							if (~var3.q > -1) {
								this.pb[var3.t][var3.s] = null;
							}
							
							var3.c(128);
						}
						
						var3 = (lf) this.Kb.I.b((byte) 127);
					} while (var3 != null);
					
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "h.LA(" + var1 + ',' + var2 + ')');
		}
	}
	
	final synchronized boolean a(ui var1, oe var2, boolean var3, int var4, pe var5) {
		int var11 = client.anInt_wb;
		
		try {
			var1.a();
			boolean var6 = var3;
			int[] var7 = null;
			if (~var4 < -1) {
				var7 = new int[] {var4};
			}
			
			ci var8 = (ci) var1.p.b((byte) 117);
			if (var11 != 0) {
			}
			if (/*var11 == 0 && */var8 == null) {
				++ab;
				if (var3) {
					var1.b();
				}
				
				return var3;
			} else {
				do {
					int clientScriptId = (int) var8.clientScriptId;
					id var10 = (id) this.G.a((long) clientScriptId, 22346);
					if (var10 == null) {
						var10 = ei.a(-116, var5, clientScriptId);
						if (var10 == null) {
							var6 = false;
							if (var11 == 0) {/*
								var8 = (ci) var1.p.a((byte) -33);//
								continue;
							*/
							}
							
							//this.G.a(var10, (long) clientScriptId, var3);
						} else {
							this.G.a(var10, (long) clientScriptId, var3);
						}
					} else if (!var10.a(var8.o, -38, var2, var7)) {
						var6 = false;
					}
					
					var8 = (ci) var1.p.a((byte) -33);
				} while (var8 != null);
				
				++ab;
				if (var6) {
					var1.b();
				}
				
				return var6;
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "h.C(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ')');
		}
	}
	
	final void a(int var1, lf var2, boolean var3) {
		try {
			int var6;
			label27:
			{
				int var4 = var2.E.t.length;
				int var5 = 115 % ((73 - var1) / 33);
				if (var3 && var2.E.r) {
					int var7 = var4 + var4 + -var2.E.p;
					var6 = (int) ((long) var7 * (long) this.N[var2.t] >> -988611194);
					var4 <<= 8;
					if (~var4 < ~var6) {
						break label27;
					}
					
					var6 = -var6 + -1 + var4 + var4;
					var2.L.a(true);
					if (client.anInt_wb == 0) {
						break label27;
					}
				}
				
				var6 = (int) ((long) var4 * (long) this.N[var2.t] >> -311765306);
			}
			
			var2.L.e(var6);
			++bb;
		} catch (RuntimeException var8) {
			throw bc.a(var8, "h.HA(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}
	
	private void a(int var1, int var2, byte var3) {
		try {
			this.hb[var2] = var1;
			this.Db[var2] = bd.b(-128, (int) var1);
			if (var3 == 15) {
				this.c(var1, var2, -31918);
				++Cb;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "h.V(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	public static void j(int var0) {
		try {
			gb = null;
			zb = null;
			int var1 = 3 % ((var0 - 48) / 57);
			A = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "h.J(" + var0 + ')');
		}
	}
	
	final synchronized void a(ui var1, boolean var2, byte var3) {
		int var6 = client.anInt_wb;
		
		try {
			this.a((byte) 64);
			this.V.a(var1.o);
			++ub;
			this.Hb = 0L;
			this.Jb = var2;
			int var4 = this.V.e();
			int var5 = 0;
			if (var6 != 0) {/*
				this.V.a(var5);
				this.V.f(var5);
				this.V.d(var5);
				++var5;
			*/
			}
			
			while (var4 > var5) {
				this.V.a(var5);
				this.V.f(var5);
				this.V.d(var5);
				++var5;
			}
			
			this.Gb = this.V.d();
			this.Fb = this.V.f[this.Gb];
			if (var3 != 78) {
				this.b((byte) 76);
			}
			
			this.Ib = this.V.e(this.Fb);
		} catch (RuntimeException var7) {
			throw bc.a(var7, "h.D(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	final synchronized sg d() {
		try {
			++z;
			return null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "h.B(" + ')');
		}
	}
	
	final synchronized void e(int var1, int var2) {
		try {
			if (var1 > -3) {
				this.jb = null;
			}
			
			this.qb = var2;
			++T;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "h.S(" + var1 + ',' + var2 + ')');
		}
	}
	
	private void d(int var1, byte var2) {
		int var5 = client.anInt_wb;
		
		try {
			++rb;
			int var3 = -7 / ((var2 - -49) / 34);
			if ((4 & this.mb[var1]) != 0) {
				lf var4 = (lf) this.Kb.I.a((byte) -9);
				if (var5 != 0 || var4 != null) {
					do {
						if (var4.t == var1) {
							var4.P = 0;
						}
						
						var4 = (lf) this.Kb.I.b((byte) -104);
					} while (var4 != null);
					
				}
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "h.K(" + var1 + ',' + var2 + ')');
		}
	}
	
	private void d(int var1, int var2, int var3) {
		try {
			++db;
			if (var3 < 93) {
				this.H = null;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "h.M(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	public h() {
		try {
			this.G = new md(128);
			this.i(-17);
		} catch (RuntimeException var2) {
			throw bc.a(var2, "h.<init>(" + ')');
		}
	}
	
	static {
		zb = A;
		ib = 0;
		lb = 0;
	}
}
