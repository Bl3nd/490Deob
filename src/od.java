import java.awt.Image;

final class od extends af {
	
	static int R;
	private int[][] S;
	static int T;
	static ca cacheFile_19;
	static ob V = rf.a(40, "Musik)2Engine vorbereitet)3");
	static int W;
	static int X;
	static ob Y = rf.a(40, "null");
	static int Z;
	static Image ab;
	static int bb;
	static int cb;
	private int[] db = new int[257];
	static int eb;
	static int fb;
	static ob gb = rf.a(40, "Angreifen");
	
	final void a(int var1, int var2, og var3) {
		int var7 = client.anInt_wb;
		
		try {
			++R;
			if (~var1 == -1) {
				int var5 = var3.readUnsignedByte(255);
				if (var5 != 0) {
					this.c(27209, var5);
				} else {
					this.S = new int[var3.readUnsignedByte(255)][4];
					int var6 = 0;
					if (var7 != 0 || ~this.S.length < ~var6) {
						do {
							this.S[var6][0] = var3.readShort(75);
							this.S[var6][1] = var3.readUnsignedByte(255) << 4;
							this.S[var6][2] = var3.readUnsignedByte(255) << 4;
							this.S[var6][3] = var3.readUnsignedByte(255) << 4;
							++var6;
						} while (~this.S.length < ~var6);
						
					}
				}
			}
		} catch (RuntimeException var8) {
			throw bc.a(var8, "od.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	static fa a(int unused, pe cacheFile8, int id) {
		try {
			++X;
			if (!ba.a((byte) 98, cacheFile8, id)) {
				return null;
			} else {
				return lf.a(false);
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "od.C(" + unused + ',' + (cacheFile8 != null ? "{...}" : "null") + ',' + id + ')');
		}
	}
	
	static void b(byte var0) {
		try {
			++T;
			ki.p.b((int) 9946);
			if (var0 == 57) {
				qg.j.b((int) 9946);
				ue.jb.b((int) 9946);
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "od.H(" + var0 + ')');
		}
	}
	
	final int[][] b(int var1, byte var2) {
		int var10 = client.anInt_wb;
		
		try {
			++W;
			int[][] var3 = super.ve_s.a(var1, (byte) 45);
			int var4;
			if (super.ve_s.u) {
				int[] var5 = this.c(var1, 0, 57);
				int[] var6 = var3[0];
				int[] var7 = var3[1];
				int[] var8 = var3[2];
				int var9 = 0;
				if (var10 != 0 || var9 < lh.eb) {
					do {
						var4 = var5[var9] >> 4;
						if (var4 < 0) {
							var4 = 0;
						}
						
						if (~var4 < -257) {
							var4 = 256;
						}
						
						var4 = this.db[var4];
						var6[var9] = bd.b(var4 >> 12, (int) 4080);
						var7[var9] = bd.b(var4 >> 4, (int) 4080);
						var8[var9] = bd.b(var4, (int) 255) << 4;
						++var9;
					} while (var9 < lh.eb);
				}
			}
			
			var4 = -10 % ((-42 - var2) / 41);
			return var3;
		} catch (RuntimeException var11) {
			throw bc.a(var11, "od.G(" + var1 + ',' + var2 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, int var4) {
		int var6 = client.anInt_wb;
		
		try {
			int var5 = 0;
			if (var6 == 0 && ~var5 <= ~e.anInt_d) {
				++cb;
				if (var4 != 2) {
					a(-111, (pe) null, 12);
				}
			} else {
				do {
					if (var1 < df.v[var5] + l.o[var5] && var2 + var1 > df.v[var5] && var0 < be.f[var5] - -ki.r[var5] && be.f[var5] < var3 + var0) {
						ob.bb[var5] = true;
					}
					
					++var5;
				} while (~var5 > ~e.anInt_d);
				
				++cb;
				if (var4 != 2) {
					a(-111, (pe) null, 12);
				}
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "od.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	final void f(int var1) {
		try {
			if (this.S == null) {
				this.c(27209, 1);
			}
			
			if (var1 == 1) {
				this.d((byte) 120);
				++fb;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "od.L(" + var1 + ')');
		}
	}
	
	public static void c(byte var0) {
		try {
			Y = null;
			ab = null;
			cacheFile_19 = null;
			if (var0 == -56) {
				gb = null;
				V = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "od.D(" + var0 + ')');
		}
	}
	
	private void d(byte var1) {
		int var14 = client.anInt_wb;
		
		try {
			++Z;
			if (var1 < 32) {
				gb = null;
			}
			
			int var5 = this.S.length;
			if (~var5 < -1) {
				int var6 = 0;
				if (var14 != 0 || var6 < 257) {
					do {
						int var7 = 0;
						int var8 = var6 << 4;
						int var9 = 0;
						if (var14 != 0 || var5 > var9) {
							while (~var8 <= ~this.S[var9][0]) {
								++var7;
								++var9;
								if (var5 <= var9) {
									break;
								}
							}
						}
						
						int var2;
						int var3;
						int var4;
						label77:
						{
							int[] var10;
							if (~var7 > ~var5) {
								var10 = this.S[var7];
								if (var7 <= 0) {
									var3 = var10[2];
									var2 = var10[1];
									var4 = var10[3];
									if (var14 == 0) {
										break label77;
									}
								}
								
								int[] var11 = this.S[var7 + -1];
								int var12 = (var8 - var11[0] << 12) / (-var11[0] + var10[0]);
								int var13 = 4096 - var12;
								var3 = var13 * var11[2] + var12 * var10[2] >> 12;
								var4 = var10[3] * var12 + var11[3] * var13 >> 12;
								var2 = var13 * var11[1] + var10[1] * var12 >> 12;
								if (var14 == 0) {
									break label77;
								}
							}
							
							var10 = this.S[-1 + var5];
							var3 = var10[2];
							var4 = var10[3];
							var2 = var10[1];
						}
						
						var4 >>= 4;
						var2 >>= 4;
						var3 >>= 4;
						if (~var3 <= -1) {
							if (~var3 < -256) {
								var3 = 255;
								if (var14 != 0) {
									var3 = 0;
								}
							}
						} else {
							var3 = 0;
						}
						
						if (~var2 <= -1) {
							if (var2 > 255) {
								var2 = 255;
								if (var14 != 0) {
									var2 = 0;
								}
							}
						} else {
							var2 = 0;
						}
						
						label83:
						{
							if (var4 < 0) {
								var4 = 0;
								if (var14 == 0) {
									break label83;
								}
							}
							
							if (var4 > 255) {
								var4 = 255;
							}
						}
						
						this.db[var6] = ff.b(var4, ff.b(var2 << 16, var3 << 8));
						++var6;
					} while (var6 < 257);
					
				}
			}
		} catch (RuntimeException var15) {
			throw bc.a(var15, "od.I(" + var1 + ')');
		}
	}
	
	public od() {
		super(1, false);
	}
	
	private void c(int var1, int var2) {
		try {
			if (var1 != 27209) {
				this.c(37, -78);
			}
			
			++bb;
			if (var2 != 0) {
				if (~var2 != -2) {
					if (~var2 == -3) {
						this.S = new int[8][4];
						this.S[0][2] = 2602;
						this.S[0][3] = 2361;
						this.S[0][0] = 0;
						this.S[1][3] = 1558;
						this.S[2][3] = 1413;
						this.S[1][0] = 2867;
						this.S[0][1] = 2650;
						this.S[1][1] = 2313;
						this.S[2][1] = 2618;
						this.S[2][0] = 3072;
						this.S[3][3] = 947;
						this.S[3][0] = 3276;
						this.S[4][0] = 3481;
						this.S[1][2] = 1799;
						this.S[2][2] = 1734;
						this.S[4][3] = 722;
						this.S[5][0] = 3686;
						this.S[3][1] = 2296;
						this.S[3][2] = 1220;
						this.S[6][0] = 3891;
						this.S[5][3] = 1766;
						this.S[7][0] = 4096;
						this.S[6][3] = 915;
						this.S[4][1] = 2072;
						this.S[4][2] = 963;
						this.S[5][1] = 2730;
						this.S[5][2] = 2152;
						this.S[6][2] = 1060;
						this.S[7][2] = 1413;
						this.S[7][3] = 1140;
						this.S[6][1] = 2232;
						this.S[7][1] = 1686;
						return;
					}
					
					if (var2 == 3) {
						this.S = new int[7][4];
						this.S[0][3] = 4096;
						this.S[0][0] = 0;
						this.S[0][2] = 0;
						this.S[1][3] = 4096;
						this.S[1][0] = 663;
						this.S[2][3] = 0;
						this.S[1][2] = 4096;
						this.S[2][0] = 1363;
						this.S[3][0] = 2048;
						this.S[4][0] = 2727;
						this.S[3][3] = 0;
						this.S[0][1] = 0;
						this.S[1][1] = 0;
						this.S[5][0] = 3411;
						this.S[2][2] = 4096;
						this.S[3][2] = 4096;
						this.S[6][0] = 4096;
						this.S[4][2] = 0;
						this.S[2][1] = 0;
						this.S[4][3] = 0;
						this.S[3][1] = 4096;
						this.S[5][3] = 4096;
						this.S[6][3] = 4096;
						this.S[5][2] = 0;
						this.S[6][2] = 0;
						this.S[4][1] = 4096;
						this.S[5][1] = 4096;
						this.S[6][1] = 0;
						return;
					}
					
					if (~var2 == -5) {
						this.S = new int[6][4];
						this.S[0][2] = 0;
						this.S[1][2] = 0;
						this.S[0][0] = 0;
						this.S[1][0] = 1843;
						this.S[2][0] = 2457;
						this.S[3][0] = 2781;
						this.S[0][3] = 0;
						this.S[4][0] = 3481;
						this.S[0][1] = 0;
						this.S[1][1] = 0;
						this.S[1][3] = 1493;
						this.S[2][1] = 0;
						this.S[2][2] = 0;
						this.S[3][1] = 0;
						this.S[4][1] = 546;
						this.S[5][1] = 4096;
						this.S[5][0] = 4096;
						this.S[3][2] = 1124;
						this.S[4][2] = 3084;
						this.S[5][2] = 4096;
						this.S[2][3] = 2939;
						this.S[3][3] = 3565;
						this.S[4][3] = 4031;
						this.S[5][3] = 4096;
						return;
					}
					
					if (~var2 == -6) {
						this.S = new int[16][4];
						this.S[0][0] = 0;
						this.S[0][2] = 192;
						this.S[1][2] = 449;
						this.S[0][3] = 321;
						this.S[0][1] = 80;
						this.S[1][0] = 155;
						this.S[1][1] = 321;
						this.S[2][0] = 389;
						this.S[2][2] = 690;
						this.S[1][3] = 562;
						this.S[2][3] = 803;
						this.S[3][0] = 671;
						this.S[2][1] = 578;
						this.S[3][1] = 947;
						this.S[4][1] = 1285;
						this.S[3][2] = 995;
						this.S[3][3] = 1140;
						this.S[4][2] = 1397;
						this.S[4][3] = 1509;
						this.S[5][3] = 1413;
						this.S[5][1] = 1525;
						this.S[5][2] = 1429;
						this.S[4][0] = 897;
						this.S[6][2] = 1461;
						this.S[6][1] = 1734;
						this.S[6][3] = 1333;
						this.S[7][2] = 1525;
						this.S[7][1] = 1413;
						this.S[7][3] = 1702;
						this.S[8][3] = 2056;
						this.S[9][3] = 2666;
						this.S[10][3] = 3276;
						this.S[8][1] = 1108;
						this.S[8][2] = 1590;
						this.S[9][2] = 2056;
						this.S[5][0] = 1175;
						this.S[11][3] = 3228;
						this.S[12][3] = 3196;
						this.S[6][0] = 1368;
						this.S[7][0] = 1507;
						this.S[8][0] = 1736;
						this.S[9][1] = 1766;
						this.S[10][2] = 2586;
						this.S[13][3] = 3019;
						this.S[9][0] = 2088;
						this.S[10][1] = 2409;
						this.S[10][0] = 2355;
						this.S[11][1] = 3116;
						this.S[11][0] = 2691;
						this.S[12][1] = 3806;
						this.S[11][2] = 3148;
						this.S[12][2] = 3710;
						this.S[14][3] = 3228;
						this.S[15][3] = 2746;
						this.S[13][1] = 3437;
						this.S[14][1] = 3116;
						this.S[12][0] = 3031;
						this.S[15][1] = 2377;
						this.S[13][0] = 3522;
						this.S[14][0] = 3727;
						this.S[13][2] = 3421;
						this.S[14][2] = 3148;
						this.S[15][2] = 2505;
						this.S[15][0] = 4096;
						return;
					}
					
					if (~var2 != -7) {
						throw new RuntimeException("Invalid gradient preset");
					}
					
					if (client.anInt_wb == 0) {
						this.S = new int[4][4];
						this.S[0][1] = 0;
						this.S[0][3] = 0;
						this.S[1][1] = 4096;
						this.S[0][2] = 4096;
						this.S[1][3] = 0;
						this.S[1][2] = 4096;
						this.S[2][2] = 4096;
						this.S[2][3] = 0;
						this.S[2][1] = 4096;
						this.S[3][2] = 0;
						this.S[3][3] = 0;
						this.S[3][1] = 4096;
						this.S[0][0] = 2048;
						this.S[1][0] = 2867;
						this.S[2][0] = 3276;
						this.S[3][0] = 4096;
						return;
					}
				}
				
				this.S = new int[2][4];
				this.S[0][2] = 0;
				this.S[0][3] = 0;
				this.S[0][1] = 0;
				this.S[0][0] = 0;
				this.S[1][2] = 4096;
				this.S[1][1] = 4096;
				this.S[1][0] = 4096;
				this.S[1][3] = 4096;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "od.E(" + var1 + ',' + var2 + ')');
		}
	}
}
